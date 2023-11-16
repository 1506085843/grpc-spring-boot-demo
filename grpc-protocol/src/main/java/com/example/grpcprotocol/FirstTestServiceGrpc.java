package com.example.grpcprotocol;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: grpcprotocol/firstTest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FirstTestServiceGrpc {

  private FirstTestServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcprotocol.FirstTestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpcprotocol.QueryInfoRequest,
      com.example.grpcprotocol.QueryInfoResponse> getQueryInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryInfo",
      requestType = com.example.grpcprotocol.QueryInfoRequest.class,
      responseType = com.example.grpcprotocol.QueryInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpcprotocol.QueryInfoRequest,
      com.example.grpcprotocol.QueryInfoResponse> getQueryInfoMethod() {
    io.grpc.MethodDescriptor<com.example.grpcprotocol.QueryInfoRequest, com.example.grpcprotocol.QueryInfoResponse> getQueryInfoMethod;
    if ((getQueryInfoMethod = FirstTestServiceGrpc.getQueryInfoMethod) == null) {
      synchronized (FirstTestServiceGrpc.class) {
        if ((getQueryInfoMethod = FirstTestServiceGrpc.getQueryInfoMethod) == null) {
          FirstTestServiceGrpc.getQueryInfoMethod = getQueryInfoMethod =
              io.grpc.MethodDescriptor.<com.example.grpcprotocol.QueryInfoRequest, com.example.grpcprotocol.QueryInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.QueryInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.QueryInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FirstTestServiceMethodDescriptorSupplier("QueryInfo"))
              .build();
        }
      }
    }
    return getQueryInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpcprotocol.QuerySomeDataRequest,
      com.example.grpcprotocol.QuerySomeDataResponse> getQuerySomeDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySomeData",
      requestType = com.example.grpcprotocol.QuerySomeDataRequest.class,
      responseType = com.example.grpcprotocol.QuerySomeDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpcprotocol.QuerySomeDataRequest,
      com.example.grpcprotocol.QuerySomeDataResponse> getQuerySomeDataMethod() {
    io.grpc.MethodDescriptor<com.example.grpcprotocol.QuerySomeDataRequest, com.example.grpcprotocol.QuerySomeDataResponse> getQuerySomeDataMethod;
    if ((getQuerySomeDataMethod = FirstTestServiceGrpc.getQuerySomeDataMethod) == null) {
      synchronized (FirstTestServiceGrpc.class) {
        if ((getQuerySomeDataMethod = FirstTestServiceGrpc.getQuerySomeDataMethod) == null) {
          FirstTestServiceGrpc.getQuerySomeDataMethod = getQuerySomeDataMethod =
              io.grpc.MethodDescriptor.<com.example.grpcprotocol.QuerySomeDataRequest, com.example.grpcprotocol.QuerySomeDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySomeData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.QuerySomeDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.QuerySomeDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FirstTestServiceMethodDescriptorSupplier("QuerySomeData"))
              .build();
        }
      }
    }
    return getQuerySomeDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpcprotocol.SendBooksInfoRequest,
      com.example.grpcprotocol.SendBooksInfoResponse> getSendBooksInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendBooksInfo",
      requestType = com.example.grpcprotocol.SendBooksInfoRequest.class,
      responseType = com.example.grpcprotocol.SendBooksInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpcprotocol.SendBooksInfoRequest,
      com.example.grpcprotocol.SendBooksInfoResponse> getSendBooksInfoMethod() {
    io.grpc.MethodDescriptor<com.example.grpcprotocol.SendBooksInfoRequest, com.example.grpcprotocol.SendBooksInfoResponse> getSendBooksInfoMethod;
    if ((getSendBooksInfoMethod = FirstTestServiceGrpc.getSendBooksInfoMethod) == null) {
      synchronized (FirstTestServiceGrpc.class) {
        if ((getSendBooksInfoMethod = FirstTestServiceGrpc.getSendBooksInfoMethod) == null) {
          FirstTestServiceGrpc.getSendBooksInfoMethod = getSendBooksInfoMethod =
              io.grpc.MethodDescriptor.<com.example.grpcprotocol.SendBooksInfoRequest, com.example.grpcprotocol.SendBooksInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendBooksInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.SendBooksInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.SendBooksInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FirstTestServiceMethodDescriptorSupplier("SendBooksInfo"))
              .build();
        }
      }
    }
    return getSendBooksInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpcprotocol.CalculateSumRequest,
      com.example.grpcprotocol.CalculateSumResponse> getCalculateSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateSum",
      requestType = com.example.grpcprotocol.CalculateSumRequest.class,
      responseType = com.example.grpcprotocol.CalculateSumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpcprotocol.CalculateSumRequest,
      com.example.grpcprotocol.CalculateSumResponse> getCalculateSumMethod() {
    io.grpc.MethodDescriptor<com.example.grpcprotocol.CalculateSumRequest, com.example.grpcprotocol.CalculateSumResponse> getCalculateSumMethod;
    if ((getCalculateSumMethod = FirstTestServiceGrpc.getCalculateSumMethod) == null) {
      synchronized (FirstTestServiceGrpc.class) {
        if ((getCalculateSumMethod = FirstTestServiceGrpc.getCalculateSumMethod) == null) {
          FirstTestServiceGrpc.getCalculateSumMethod = getCalculateSumMethod =
              io.grpc.MethodDescriptor.<com.example.grpcprotocol.CalculateSumRequest, com.example.grpcprotocol.CalculateSumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.CalculateSumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcprotocol.CalculateSumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FirstTestServiceMethodDescriptorSupplier("CalculateSum"))
              .build();
        }
      }
    }
    return getCalculateSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FirstTestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceStub>() {
        @java.lang.Override
        public FirstTestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirstTestServiceStub(channel, callOptions);
        }
      };
    return FirstTestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FirstTestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceBlockingStub>() {
        @java.lang.Override
        public FirstTestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirstTestServiceBlockingStub(channel, callOptions);
        }
      };
    return FirstTestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FirstTestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirstTestServiceFutureStub>() {
        @java.lang.Override
        public FirstTestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirstTestServiceFutureStub(channel, callOptions);
        }
      };
    return FirstTestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FirstTestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *简单grpc
     * </pre>
     */
    public void queryInfo(com.example.grpcprotocol.QueryInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.QueryInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *服务端流式grpc
     * </pre>
     */
    public void querySomeData(com.example.grpcprotocol.QuerySomeDataRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.QuerySomeDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySomeDataMethod(), responseObserver);
    }

    /**
     * <pre>
     *客户端流式grpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpcprotocol.SendBooksInfoRequest> sendBooksInfo(
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.SendBooksInfoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendBooksInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *双向流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpcprotocol.CalculateSumRequest> calculateSum(
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.CalculateSumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCalculateSumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpcprotocol.QueryInfoRequest,
                com.example.grpcprotocol.QueryInfoResponse>(
                  this, METHODID_QUERY_INFO)))
          .addMethod(
            getQuerySomeDataMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpcprotocol.QuerySomeDataRequest,
                com.example.grpcprotocol.QuerySomeDataResponse>(
                  this, METHODID_QUERY_SOME_DATA)))
          .addMethod(
            getSendBooksInfoMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpcprotocol.SendBooksInfoRequest,
                com.example.grpcprotocol.SendBooksInfoResponse>(
                  this, METHODID_SEND_BOOKS_INFO)))
          .addMethod(
            getCalculateSumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpcprotocol.CalculateSumRequest,
                com.example.grpcprotocol.CalculateSumResponse>(
                  this, METHODID_CALCULATE_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class FirstTestServiceStub extends io.grpc.stub.AbstractAsyncStub<FirstTestServiceStub> {
    private FirstTestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirstTestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirstTestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单grpc
     * </pre>
     */
    public void queryInfo(com.example.grpcprotocol.QueryInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.QueryInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *服务端流式grpc
     * </pre>
     */
    public void querySomeData(com.example.grpcprotocol.QuerySomeDataRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.QuerySomeDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getQuerySomeDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *客户端流式grpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpcprotocol.SendBooksInfoRequest> sendBooksInfo(
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.SendBooksInfoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendBooksInfoMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *双向流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpcprotocol.CalculateSumRequest> calculateSum(
        io.grpc.stub.StreamObserver<com.example.grpcprotocol.CalculateSumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCalculateSumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FirstTestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FirstTestServiceBlockingStub> {
    private FirstTestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirstTestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirstTestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单grpc
     * </pre>
     */
    public com.example.grpcprotocol.QueryInfoResponse queryInfo(com.example.grpcprotocol.QueryInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *服务端流式grpc
     * </pre>
     */
    public java.util.Iterator<com.example.grpcprotocol.QuerySomeDataResponse> querySomeData(
        com.example.grpcprotocol.QuerySomeDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getQuerySomeDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FirstTestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FirstTestServiceFutureStub> {
    private FirstTestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirstTestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirstTestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单grpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpcprotocol.QueryInfoResponse> queryInfo(
        com.example.grpcprotocol.QueryInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_INFO = 0;
  private static final int METHODID_QUERY_SOME_DATA = 1;
  private static final int METHODID_SEND_BOOKS_INFO = 2;
  private static final int METHODID_CALCULATE_SUM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FirstTestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FirstTestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_INFO:
          serviceImpl.queryInfo((com.example.grpcprotocol.QueryInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpcprotocol.QueryInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_SOME_DATA:
          serviceImpl.querySomeData((com.example.grpcprotocol.QuerySomeDataRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpcprotocol.QuerySomeDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_BOOKS_INFO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendBooksInfo(
              (io.grpc.stub.StreamObserver<com.example.grpcprotocol.SendBooksInfoResponse>) responseObserver);
        case METHODID_CALCULATE_SUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateSum(
              (io.grpc.stub.StreamObserver<com.example.grpcprotocol.CalculateSumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FirstTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FirstTestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpcprotocol.FirstTestServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FirstTestService");
    }
  }

  private static final class FirstTestServiceFileDescriptorSupplier
      extends FirstTestServiceBaseDescriptorSupplier {
    FirstTestServiceFileDescriptorSupplier() {}
  }

  private static final class FirstTestServiceMethodDescriptorSupplier
      extends FirstTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FirstTestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FirstTestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FirstTestServiceFileDescriptorSupplier())
              .addMethod(getQueryInfoMethod())
              .addMethod(getQuerySomeDataMethod())
              .addMethod(getSendBooksInfoMethod())
              .addMethod(getCalculateSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
