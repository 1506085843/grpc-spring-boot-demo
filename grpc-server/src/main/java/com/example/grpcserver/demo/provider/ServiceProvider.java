package com.example.grpcserver.demo.provider;


import com.example.grpcprotocol.*;
import com.example.grpcserver.demo.model.SubjectMarksModel;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.*;

@GrpcService
public class ServiceProvider extends FirstTestServiceGrpc.FirstTestServiceImplBase {

    @Override
    //查询人员信息(简单grpc)
    public void queryInfo(QueryInfoRequest request, StreamObserver<QueryInfoResponse> responseObserver) {
        //获取从客户端传来的id、school、isboy、personalInfoRecordsList
        int id = request.getId();
        String school = request.getSchool();
        boolean isBoy = request.getIsBoy();
        List<personalInfo> personalInfoRecordsList = request.getPersonalInfoRecordsList();
        System.out.println("queryInfoDemo id:" + id + ",school:" + school + ",isBoy:" + isBoy);

        //构造要返回到客户端的数据
        QueryInfoResponse.Builder responseBuild = QueryInfoResponse.newBuilder();
        responseBuild.setId(id);
        responseBuild.setName("张三");
        String uuid = UUID.randomUUID().toString().replace("-", "");
        responseBuild.setUuid(uuid);

        List<SubjectMarksModel> list = new ArrayList<>();
        list.add(new SubjectMarksModel("小明", 98.5));
        list.add(new SubjectMarksModel("小王", 90.5));
        list.forEach((v) -> {
            subjectMarks record = subjectMarks.newBuilder()
                    .setScore(v.getScore())
                    .setSubjectName(v.getSubjectName())
                    .build();
            responseBuild.addRecords(record);
        });

        Map<String, String> map = new HashMap<>();
        map.put("语文", "王刚");
        map.put("数学", "李磊");
        map.put("英语", "刘墨");
        responseBuild.putAllSubjectTeachs(map);

        //把数据返回客户端
        responseObserver.onNext(responseBuild.build());
        responseObserver.onCompleted();
    }

    @Override
    //查询数据(服务端流式grpc)
    public void querySomeData(QuerySomeDataRequest request, StreamObserver<QuerySomeDataResponse> responseObserver) {
        int id = request.getId();
        System.out.println("querySomeData id:" + id);

        QuerySomeDataResponse.Builder builder = QuerySomeDataResponse.newBuilder();
        for (int i = 1; i < 4; i++) {
            productInfo.Builder productInfoBuild = productInfo.newBuilder();
            productInfoBuild.setProductId(1000 + i);
            productInfoBuild.setTime(String.valueOf(System.currentTimeMillis() / 1000));
            builder.setId(i)
                    .addRecords(productInfoBuild)
                    .build();
            responseObserver.onNext(builder.build());
        }
        responseObserver.onCompleted();
    }

    @Override
    //发送书籍信息(客户端流式grpc)
    public StreamObserver<SendBooksInfoRequest> sendBooksInfo(StreamObserver<SendBooksInfoResponse> responseObserver) {
        List<Map<String, String>> datas = new ArrayList<>();
        return new StreamObserver<SendBooksInfoRequest>() {
            @Override
            public void onNext(SendBooksInfoRequest request) {
                //接收客户端每一次发送来的数据放到datas
                datas.add(request.getDataMap());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                //当客户端数据发送完毕后调用此方法，返回客户端数据
                SendBooksInfoResponse.Builder response = SendBooksInfoResponse.newBuilder();
                try {
                    System.out.println("sendBooksInfo:" + datas);
                    response.setCode(1);
                    response.setNote("成功");
                } catch (Exception e) {
                    e.printStackTrace();
                    responseObserver.onError(new StatusException(Status.INTERNAL));
                    return;
                }
                SendBooksInfoResponse resp = response.build();
                //返回客户端
                responseObserver.onNext(resp);
                responseObserver.onCompleted();
            }
        };
    }


    @Override
    //计算一到一万的和(双向流grpc)
    public StreamObserver<CalculateSumRequest> calculateSum(StreamObserver<CalculateSumResponse> responseObserver) {
        return new StreamObserver<CalculateSumRequest>() {
            @Override
            public void onNext(CalculateSumRequest request) {
                //接收客户端每一次发送来的1000个数，求和后返回给客户端
                int id = request.getId();
                List<Integer> numberList = request.getNumberList();
                int sum = numberList.stream().reduce(0, Integer::sum);
                System.out.println("calculateSum sum:" + sum);
                CalculateSumResponse calculateSumResponse = CalculateSumResponse.newBuilder()
                        .setCode(1)
                        .setNote("成功")
                        .setSum(sum)
                        .build();
                responseObserver.onNext(calculateSumResponse);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                //当客户端数据发送完毕后调用此方法，返回客户端
                CalculateSumResponse.Builder response = CalculateSumResponse.newBuilder();
                response.setCode(1);
                response.setNote("成功");
                //返回客户端
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }
        };
    }

}
