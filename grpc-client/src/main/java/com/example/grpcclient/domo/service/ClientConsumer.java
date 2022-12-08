package com.example.grpcclient.domo.service;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.example.grpcclient.domo.model.IdentityModel;
import com.example.grpcclient.domo.model.PersonInfoModel;
import com.example.grpcprotocol.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.example.grpcclient.domo.util.ParamUtils.*;

@Service
public class ClientConsumer {
    @GrpcClient("mygrpc-server")
    //xxxBlockingStub用于简单grpc、服务端流式grpc
    private FirstTestServiceGrpc.FirstTestServiceBlockingStub stub;

    @GrpcClient("mygrpc-server")
    //xxxServiceStub用于客户端流式grpc、双向流grpc
    private FirstTestServiceGrpc.FirstTestServiceStub stub1;

    //查询人员信息(简单grpc)
    public JSONObject queryInfo(PersonInfoModel customerListModel) {
        //构建请求参数
        QueryInfoRequest.Builder requestBuild = QueryInfoRequest.newBuilder();
        Optional.ofNullable(customerListModel.getId()).ifPresent(requestBuild::setId);
        Optional.ofNullable(customerListModel.getSchool()).ifPresent(requestBuild::setSchool);
        Optional.ofNullable(customerListModel.isBoy()).ifPresent(requestBuild::setIsBoy);
        List<IdentityModel> list = customerListModel.getPersonalInfos();
        if (null != list) {
            list.forEach((v) -> {
                personalInfo.Builder ryjblbBuilder = personalInfo.newBuilder()
                        .setIdentityNumber(getInt(v.getIdentityNumber()))
                        .setName(getString(v.getName()));
                requestBuild.addPersonalInfoRecords(ryjblbBuilder.build());
            });
        }
        Optional.ofNullable(customerListModel.getSchool()).ifPresent(requestBuild::setSchool);
        Map<String, String> map = new HashMap<>();
        map.put("父亲", "张明");
        map.put("母亲", "李梅");
        requestBuild.putAllFamilyInfo(map);

        //发送请求到服务端
        QueryInfoRequest request = requestBuild.build();
        QueryInfoResponse response = stub.queryInfo(request);

        //获取服务端返回的结果
        int id = response.getId();
        String name = response.getName();
        String uuid = response.getUuid();
        List<subjectMarks> recordsList = response.getRecordsList();
        Map<String, String> subjectTeachs = response.getSubjectTeachsMap();

        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name", name);
        json.put("uuid", uuid);
        JSONArray array = new JSONArray();
        recordsList.forEach(v -> {
            JSONObject j = new JSONObject();
            j.put("score", v.getScore());
            j.put("subjectName", v.getSubjectName());
            array.add(j);
        });

        json.put("subjectMarks", array);
        json.put("subjectTeachs", subjectTeachs);
        return json;
    }

    //查询数据(服务端流式grpc)
    public JSONObject querySomeData(int id) {
        //构建请求参数
        QuerySomeDataRequest.Builder requestBuild = QuerySomeDataRequest.newBuilder();
        requestBuild.setId(id);

        JSONObject json = new JSONObject();
        //流式服务端返回的多个结果要用迭代器接收
        Iterator<QuerySomeDataResponse> iteraResponse = stub.querySomeData(requestBuild.build());
        while (iteraResponse.hasNext()) {
            QuerySomeDataResponse response = iteraResponse.next();
            int id1 = response.getId();
            List<productInfo> recordsList = response.getRecordsList();
            JSONArray array = new JSONArray();
            recordsList.forEach(v -> {
                JSONObject j = new JSONObject();
                j.put("productId", v.getProductId());
                j.put("time", v.getTime());
                array.add(j);
            });
            json.put("productInfo", array);
            json.put("id", id1);
        }
        return json;
    }

    //发送书籍信息(客户端流式grpc)
    public JSONObject sendBooksInfo(int id) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        SendBooksInfoResponse.Builder resp = SendBooksInfoResponse.newBuilder();
        StreamObserver<SendBooksInfoResponse> responseStreamObserver = new StreamObserver<SendBooksInfoResponse>() {
            @Override
            public void onNext(SendBooksInfoResponse value) {
                resp.setCode(value.getCode());
                resp.setNote(value.getNote());
            }

            @Override
            public void onError(Throwable t) {
                resp.setCode(-1);
                resp.setNote(t.getMessage());
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        StreamObserver<SendBooksInfoRequest> sendBooksStreamObserver = stub1.sendBooksInfo(responseStreamObserver);
        for (int i = 1; i < 4; i++) {
            SendBooksInfoRequest.Builder req = SendBooksInfoRequest.newBuilder();
            Map<String, String> books = new HashMap<>();
            books.put("书籍", String.valueOf(i));
            books.put("作者", "张三" + i);
            req.putAllData(books);
            req.setId(id);
            //发送请求到服务端
            sendBooksStreamObserver.onNext(req.build());
        }
        //3次发送完成，结束发送
        sendBooksStreamObserver.onCompleted();

        try {
            //等待线程执行完服务端返回结果(超时时间为2秒)
            countDownLatch.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //获取结果
        SendBooksInfoResponse response = resp.build();
        JSONObject json = new JSONObject();
        json.put("code", response.getCode());
        json.put("note", response.getNote());
        return json;
    }

    //计算一到一万的和(双向流grpc)
    public JSONObject calculateSum(int id) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        CalculateSumResponse.Builder resp = CalculateSumResponse.newBuilder();
        List<Integer> sumList = new ArrayList<>();
        StreamObserver<CalculateSumResponse> responseStreamObserver = new StreamObserver<CalculateSumResponse>() {
            @Override
            public void onNext(CalculateSumResponse value) {
                //获取服务端每次返回的结果,把结果放入sumList
                resp.setCode(value.getCode());
                resp.setNote(value.getNote());
                resp.setSum(value.getSum());
                sumList.add(value.getSum());
                System.out.println("calculateSum sum:"+value.getSum());
            }

            @Override
            public void onError(Throwable t) {
                resp.setCode(-1);
                resp.setNote(t.getMessage());
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        };
        StreamObserver<CalculateSumRequest> calculateSumStreamObserver = stub1.calculateSum(responseStreamObserver);

        CalculateSumRequest.Builder req = CalculateSumRequest.newBuilder();
        req.setId(id);
        for (int i = 1; i <= 10000; i++) {
            req.addNumber(i);
            //每一千个数发送到服务端
            if (i % 1000 == 0) {
                //发送请求到服务端
                calculateSumStreamObserver.onNext(req.build());
                //发送完后清除那一千个数
                req.clearNumber();
            }
        }
        //发送完成，结束发送
        calculateSumStreamObserver.onCompleted();

        try {
            //等待线程执行完服务端返回结果(超时时间为2秒)
            countDownLatch.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //获取结果
        CalculateSumResponse response = resp.build();
        JSONObject json = new JSONObject();
        json.put("code", response.getCode());
        json.put("note", response.getNote());
        //计算sumList里的十个数得到一到一万的和
        json.put("sum",  sumList.stream().reduce(0, Integer::sum));
        return json;
    }
}
