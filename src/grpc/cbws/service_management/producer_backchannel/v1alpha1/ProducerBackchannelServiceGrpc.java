package cbws.service_management.producer_backchannel.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: cbws/service_management/producer_backchannel/v1alpha1/producer_backchannel.proto")
public final class ProducerBackchannelServiceGrpc {

  private ProducerBackchannelServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest,
      com.google.longrunning.Operation> getBindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindService",
      requestType = cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest,
      com.google.longrunning.Operation> getBindServiceMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest, com.google.longrunning.Operation> getBindServiceMethod;
    if ((getBindServiceMethod = ProducerBackchannelServiceGrpc.getBindServiceMethod) == null) {
      synchronized (ProducerBackchannelServiceGrpc.class) {
        if ((getBindServiceMethod = ProducerBackchannelServiceGrpc.getBindServiceMethod) == null) {
          ProducerBackchannelServiceGrpc.getBindServiceMethod = getBindServiceMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerBackchannelServiceMethodDescriptorSupplier("BindService"))
              .build();
        }
      }
    }
    return getBindServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest,
      com.google.longrunning.Operation> getUnbindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindService",
      requestType = cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest,
      com.google.longrunning.Operation> getUnbindServiceMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest, com.google.longrunning.Operation> getUnbindServiceMethod;
    if ((getUnbindServiceMethod = ProducerBackchannelServiceGrpc.getUnbindServiceMethod) == null) {
      synchronized (ProducerBackchannelServiceGrpc.class) {
        if ((getUnbindServiceMethod = ProducerBackchannelServiceGrpc.getUnbindServiceMethod) == null) {
          ProducerBackchannelServiceGrpc.getUnbindServiceMethod = getUnbindServiceMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerBackchannelServiceMethodDescriptorSupplier("UnbindService"))
              .build();
        }
      }
    }
    return getUnbindServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProducerBackchannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceStub>() {
        @java.lang.Override
        public ProducerBackchannelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerBackchannelServiceStub(channel, callOptions);
        }
      };
    return ProducerBackchannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProducerBackchannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceBlockingStub>() {
        @java.lang.Override
        public ProducerBackchannelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerBackchannelServiceBlockingStub(channel, callOptions);
        }
      };
    return ProducerBackchannelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProducerBackchannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerBackchannelServiceFutureStub>() {
        @java.lang.Override
        public ProducerBackchannelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerBackchannelServiceFutureStub(channel, callOptions);
        }
      };
    return ProducerBackchannelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProducerBackchannelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getBindServiceMethod(), responseObserver);
    }

    /**
     */
    public void unbindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbindServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBindServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BIND_SERVICE)))
          .addMethod(
            getUnbindServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UNBIND_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class ProducerBackchannelServiceStub extends io.grpc.stub.AbstractAsyncStub<ProducerBackchannelServiceStub> {
    private ProducerBackchannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerBackchannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerBackchannelServiceStub(channel, callOptions);
    }

    /**
     */
    public void bindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unbindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbindServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProducerBackchannelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProducerBackchannelServiceBlockingStub> {
    private ProducerBackchannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerBackchannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerBackchannelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.longrunning.Operation bindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBindServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation unbindService(cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbindServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProducerBackchannelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProducerBackchannelServiceFutureStub> {
    private ProducerBackchannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerBackchannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerBackchannelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> bindService(
        cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> unbindService(
        cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbindServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BIND_SERVICE = 0;
  private static final int METHODID_UNBIND_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProducerBackchannelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProducerBackchannelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BIND_SERVICE:
          serviceImpl.bindService((cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.BindServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UNBIND_SERVICE:
          serviceImpl.unbindService((cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.UnbindServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProducerBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProducerBackchannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.service_management.producer_backchannel.v1alpha1.ProducerBackchannel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProducerBackchannelService");
    }
  }

  private static final class ProducerBackchannelServiceFileDescriptorSupplier
      extends ProducerBackchannelServiceBaseDescriptorSupplier {
    ProducerBackchannelServiceFileDescriptorSupplier() {}
  }

  private static final class ProducerBackchannelServiceMethodDescriptorSupplier
      extends ProducerBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProducerBackchannelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProducerBackchannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProducerBackchannelServiceFileDescriptorSupplier())
              .addMethod(getBindServiceMethod())
              .addMethod(getUnbindServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
