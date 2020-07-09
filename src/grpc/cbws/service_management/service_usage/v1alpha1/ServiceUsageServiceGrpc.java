package cbws.service_management.service_usage.v1alpha1;

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
    comments = "Source: cbws/service_management/service_usage/v1alpha1/service_management.proto")
public final class ServiceUsageServiceGrpc {

  private ServiceUsageServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.service_management.service_usage.v1alpha1.ServiceUsageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest,
      cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest.class,
      responseType = cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest,
      cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> getListServicesMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest, cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = ServiceUsageServiceGrpc.getListServicesMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getListServicesMethod = ServiceUsageServiceGrpc.getListServicesMethod) == null) {
          ServiceUsageServiceGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest, cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceUsageServiceMethodDescriptorSupplier("ListServices"))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest,
      com.google.longrunning.Operation> getEnableServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableService",
      requestType = cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest,
      com.google.longrunning.Operation> getEnableServiceMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest, com.google.longrunning.Operation> getEnableServiceMethod;
    if ((getEnableServiceMethod = ServiceUsageServiceGrpc.getEnableServiceMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getEnableServiceMethod = ServiceUsageServiceGrpc.getEnableServiceMethod) == null) {
          ServiceUsageServiceGrpc.getEnableServiceMethod = getEnableServiceMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceUsageServiceMethodDescriptorSupplier("EnableService"))
              .build();
        }
      }
    }
    return getEnableServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest,
      com.google.longrunning.Operation> getDisableServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableService",
      requestType = cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest,
      com.google.longrunning.Operation> getDisableServiceMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest, com.google.longrunning.Operation> getDisableServiceMethod;
    if ((getDisableServiceMethod = ServiceUsageServiceGrpc.getDisableServiceMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getDisableServiceMethod = ServiceUsageServiceGrpc.getDisableServiceMethod) == null) {
          ServiceUsageServiceGrpc.getDisableServiceMethod = getDisableServiceMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceUsageServiceMethodDescriptorSupplier("DisableService"))
              .build();
        }
      }
    }
    return getDisableServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceUsageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceStub>() {
        @java.lang.Override
        public ServiceUsageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceUsageServiceStub(channel, callOptions);
        }
      };
    return ServiceUsageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceUsageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceBlockingStub>() {
        @java.lang.Override
        public ServiceUsageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceUsageServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceUsageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceUsageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceFutureStub>() {
        @java.lang.Override
        public ServiceUsageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceUsageServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceUsageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServiceUsageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public void listServices(cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public void enableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables a service for a project, so it can no longer be
     * be used for the project. It prevents accidental usage that may cause
     * unexpected billing charges or security leaks.
     * Operation&lt;response: DisableServiceResponse&gt;
     * </pre>
     */
    public void disableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListServicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest,
                cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse>(
                  this, METHODID_LIST_SERVICES)))
          .addMethod(
            getEnableServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_ENABLE_SERVICE)))
          .addMethod(
            getDisableServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DISABLE_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceUsageServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceUsageServiceStub> {
    private ServiceUsageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceUsageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceUsageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public void listServices(cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public void enableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables a service for a project, so it can no longer be
     * be used for the project. It prevents accidental usage that may cause
     * unexpected billing charges or security leaks.
     * Operation&lt;response: DisableServiceResponse&gt;
     * </pre>
     */
    public void disableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceUsageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceUsageServiceBlockingStub> {
    private ServiceUsageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceUsageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceUsageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse listServices(cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public com.google.longrunning.Operation enableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnableServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a service for a project, so it can no longer be
     * be used for the project. It prevents accidental usage that may cause
     * unexpected billing charges or security leaks.
     * Operation&lt;response: DisableServiceResponse&gt;
     * </pre>
     */
    public com.google.longrunning.Operation disableService(cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisableServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceUsageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceUsageServiceFutureStub> {
    private ServiceUsageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceUsageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceUsageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse> listServices(
        cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables a service for a project, so it can be used
     * for the project.
     * Operation&lt;response: EnableServiceResponse&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> enableService(
        cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables a service for a project, so it can no longer be
     * be used for the project. It prevents accidental usage that may cause
     * unexpected billing charges or security leaks.
     * Operation&lt;response: DisableServiceResponse&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> disableService(
        cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICES = 0;
  private static final int METHODID_ENABLE_SERVICE = 1;
  private static final int METHODID_DISABLE_SERVICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceUsageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceUsageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<cbws.service_management.service_usage.v1alpha1.ServiceManagement.ListServicesResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SERVICE:
          serviceImpl.enableService((cbws.service_management.service_usage.v1alpha1.ServiceManagement.EnableServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DISABLE_SERVICE:
          serviceImpl.disableService((cbws.service_management.service_usage.v1alpha1.ServiceManagement.DisableServiceRequest) request,
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

  private static abstract class ServiceUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceUsageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.service_management.service_usage.v1alpha1.ServiceManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceUsageService");
    }
  }

  private static final class ServiceUsageServiceFileDescriptorSupplier
      extends ServiceUsageServiceBaseDescriptorSupplier {
    ServiceUsageServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceUsageServiceMethodDescriptorSupplier
      extends ServiceUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceUsageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceUsageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceUsageServiceFileDescriptorSupplier())
              .addMethod(getListServicesMethod())
              .addMethod(getEnableServiceMethod())
              .addMethod(getDisableServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
