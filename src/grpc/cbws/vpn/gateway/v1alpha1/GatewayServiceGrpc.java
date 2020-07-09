package cbws.vpn.gateway.v1alpha1;

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
    comments = "Source: cbws/vpn/gateway/v1alpha1/gateway.proto")
public final class GatewayServiceGrpc {

  private GatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.vpn.gateway.v1alpha1.GatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest,
      cbws.vpn.gateway.v1alpha1.Gateway.Configuration> getGetConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfiguration",
      requestType = cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest.class,
      responseType = cbws.vpn.gateway.v1alpha1.Gateway.Configuration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest,
      cbws.vpn.gateway.v1alpha1.Gateway.Configuration> getGetConfigurationMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest, cbws.vpn.gateway.v1alpha1.Gateway.Configuration> getGetConfigurationMethod;
    if ((getGetConfigurationMethod = GatewayServiceGrpc.getGetConfigurationMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGetConfigurationMethod = GatewayServiceGrpc.getGetConfigurationMethod) == null) {
          GatewayServiceGrpc.getGetConfigurationMethod = getGetConfigurationMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest, cbws.vpn.gateway.v1alpha1.Gateway.Configuration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.gateway.v1alpha1.Gateway.Configuration.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("GetConfiguration"))
              .build();
        }
      }
    }
    return getGetConfigurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub>() {
        @java.lang.Override
        public GatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceStub(channel, callOptions);
        }
      };
    return GatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub>() {
        @java.lang.Override
        public GatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return GatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub>() {
        @java.lang.Override
        public GatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceFutureStub(channel, callOptions);
        }
      };
    return GatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GatewayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getConfiguration(cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.gateway.v1alpha1.Gateway.Configuration> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConfigurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest,
                cbws.vpn.gateway.v1alpha1.Gateway.Configuration>(
                  this, METHODID_GET_CONFIGURATION)))
          .build();
    }
  }

  /**
   */
  public static final class GatewayServiceStub extends io.grpc.stub.AbstractAsyncStub<GatewayServiceStub> {
    private GatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceStub(channel, callOptions);
    }

    /**
     */
    public void getConfiguration(cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.gateway.v1alpha1.Gateway.Configuration> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GatewayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GatewayServiceBlockingStub> {
    private GatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cbws.vpn.gateway.v1alpha1.Gateway.Configuration getConfiguration(cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GatewayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GatewayServiceFutureStub> {
    private GatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.gateway.v1alpha1.Gateway.Configuration> getConfiguration(
        cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONFIGURATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONFIGURATION:
          serviceImpl.getConfiguration((cbws.vpn.gateway.v1alpha1.Gateway.GetConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.gateway.v1alpha1.Gateway.Configuration>) responseObserver);
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

  private static abstract class GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.vpn.gateway.v1alpha1.Gateway.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GatewayService");
    }
  }

  private static final class GatewayServiceFileDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier {
    GatewayServiceFileDescriptorSupplier() {}
  }

  private static final class GatewayServiceMethodDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayServiceFileDescriptorSupplier())
              .addMethod(getGetConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
