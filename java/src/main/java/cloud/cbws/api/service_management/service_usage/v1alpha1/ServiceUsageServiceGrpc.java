package cloud.cbws.api.service_management.service_usage.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Lists, enables and disables the CBWS services of a project.
 * A service must be enabled in a project before its API can be used for the
 * project's resources.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceUsageServiceGrpc {

  private ServiceUsageServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cbws.service_management.service_usage.v1alpha1.ServiceUsageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest,
      cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest.class,
      responseType = cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest,
      cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> getListServicesMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest, cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = ServiceUsageServiceGrpc.getListServicesMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getListServicesMethod = ServiceUsageServiceGrpc.getListServicesMethod) == null) {
          ServiceUsageServiceGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest, cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceUsageServiceMethodDescriptorSupplier("ListServices"))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest,
      com.google.longrunning.Operation> getEnableServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableService",
      requestType = cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest,
      com.google.longrunning.Operation> getEnableServiceMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest, com.google.longrunning.Operation> getEnableServiceMethod;
    if ((getEnableServiceMethod = ServiceUsageServiceGrpc.getEnableServiceMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getEnableServiceMethod = ServiceUsageServiceGrpc.getEnableServiceMethod) == null) {
          ServiceUsageServiceGrpc.getEnableServiceMethod = getEnableServiceMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceUsageServiceMethodDescriptorSupplier("EnableService"))
              .build();
        }
      }
    }
    return getEnableServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest,
      com.google.longrunning.Operation> getDisableServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableService",
      requestType = cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest,
      com.google.longrunning.Operation> getDisableServiceMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest, com.google.longrunning.Operation> getDisableServiceMethod;
    if ((getDisableServiceMethod = ServiceUsageServiceGrpc.getDisableServiceMethod) == null) {
      synchronized (ServiceUsageServiceGrpc.class) {
        if ((getDisableServiceMethod = ServiceUsageServiceGrpc.getDisableServiceMethod) == null) {
          ServiceUsageServiceGrpc.getDisableServiceMethod = getDisableServiceMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServiceUsageServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceUsageServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServiceUsageServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceUsageServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServiceUsageServiceBlockingV2Stub.newStub(factory, channel);
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
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the services of a project. Requires
     * `serviceusage.cbws.xyz/Service/list` on the project.
     * The list holds every service that is enabled in the project, and every
     * service the caller has `servicemanagement.cbws.xyz/Service/bind` on,
     * with its state. So the list can differ between callers.
     * </pre>
     */
    default void listServices(cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables a service in a project, together with the services it depends
     * on. Requires `serviceusage.cbws.xyz/Service/enable` on the project, and
     * `servicemanagement.cbws.xyz/Service/bind` on the service and on each of
     * its dependencies. A service that does not exist, or that the caller
     * lacks `bind` on, fails with NOT_FOUND.
     * Enabling a service that is already enabled succeeds and changes
     * nothing. If enabling a dependency fails, the services this call enabled
     * are disabled again.
     * The returned operation is already done.
     * </pre>
     */
    default void enableService(cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables a service in a project, so that it can no longer be used
     * there. Requires `serviceusage.cbws.xyz/Service/disable` on the project,
     * and `servicemanagement.cbws.xyz/Service/bind` on the service.
     * Disabling a service that is not enabled succeeds and changes nothing.
     * See
     * [disable_dependent_services][cbws.service_management.service_usage.v1alpha1.DisableServiceRequest.disable_dependent_services]
     * for services that depend on it.
     * The returned operation is already done.
     * </pre>
     */
    default void disableService(cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceUsageService.
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public static abstract class ServiceUsageServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceUsageServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceUsageService.
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public static final class ServiceUsageServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceUsageServiceStub> {
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
     * Lists the services of a project. Requires
     * `serviceusage.cbws.xyz/Service/list` on the project.
     * The list holds every service that is enabled in the project, and every
     * service the caller has `servicemanagement.cbws.xyz/Service/bind` on,
     * with its state. So the list can differ between callers.
     * </pre>
     */
    public void listServices(cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables a service in a project, together with the services it depends
     * on. Requires `serviceusage.cbws.xyz/Service/enable` on the project, and
     * `servicemanagement.cbws.xyz/Service/bind` on the service and on each of
     * its dependencies. A service that does not exist, or that the caller
     * lacks `bind` on, fails with NOT_FOUND.
     * Enabling a service that is already enabled succeeds and changes
     * nothing. If enabling a dependency fails, the services this call enabled
     * are disabled again.
     * The returned operation is already done.
     * </pre>
     */
    public void enableService(cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables a service in a project, so that it can no longer be used
     * there. Requires `serviceusage.cbws.xyz/Service/disable` on the project,
     * and `servicemanagement.cbws.xyz/Service/bind` on the service.
     * Disabling a service that is not enabled succeeds and changes nothing.
     * See
     * [disable_dependent_services][cbws.service_management.service_usage.v1alpha1.DisableServiceRequest.disable_dependent_services]
     * for services that depend on it.
     * The returned operation is already done.
     * </pre>
     */
    public void disableService(cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceUsageService.
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public static final class ServiceUsageServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServiceUsageServiceBlockingV2Stub> {
    private ServiceUsageServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceUsageServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceUsageServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the services of a project. Requires
     * `serviceusage.cbws.xyz/Service/list` on the project.
     * The list holds every service that is enabled in the project, and every
     * service the caller has `servicemanagement.cbws.xyz/Service/bind` on,
     * with its state. So the list can differ between callers.
     * </pre>
     */
    public cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse listServices(cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables a service in a project, together with the services it depends
     * on. Requires `serviceusage.cbws.xyz/Service/enable` on the project, and
     * `servicemanagement.cbws.xyz/Service/bind` on the service and on each of
     * its dependencies. A service that does not exist, or that the caller
     * lacks `bind` on, fails with NOT_FOUND.
     * Enabling a service that is already enabled succeeds and changes
     * nothing. If enabling a dependency fails, the services this call enabled
     * are disabled again.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.longrunning.Operation enableService(cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getEnableServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a service in a project, so that it can no longer be used
     * there. Requires `serviceusage.cbws.xyz/Service/disable` on the project,
     * and `servicemanagement.cbws.xyz/Service/bind` on the service.
     * Disabling a service that is not enabled succeeds and changes nothing.
     * See
     * [disable_dependent_services][cbws.service_management.service_usage.v1alpha1.DisableServiceRequest.disable_dependent_services]
     * for services that depend on it.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.longrunning.Operation disableService(cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDisableServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServiceUsageService.
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public static final class ServiceUsageServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceUsageServiceBlockingStub> {
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
     * Lists the services of a project. Requires
     * `serviceusage.cbws.xyz/Service/list` on the project.
     * The list holds every service that is enabled in the project, and every
     * service the caller has `servicemanagement.cbws.xyz/Service/bind` on,
     * with its state. So the list can differ between callers.
     * </pre>
     */
    public cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse listServices(cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables a service in a project, together with the services it depends
     * on. Requires `serviceusage.cbws.xyz/Service/enable` on the project, and
     * `servicemanagement.cbws.xyz/Service/bind` on the service and on each of
     * its dependencies. A service that does not exist, or that the caller
     * lacks `bind` on, fails with NOT_FOUND.
     * Enabling a service that is already enabled succeeds and changes
     * nothing. If enabling a dependency fails, the services this call enabled
     * are disabled again.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.longrunning.Operation enableService(cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a service in a project, so that it can no longer be used
     * there. Requires `serviceusage.cbws.xyz/Service/disable` on the project,
     * and `servicemanagement.cbws.xyz/Service/bind` on the service.
     * Disabling a service that is not enabled succeeds and changes nothing.
     * See
     * [disable_dependent_services][cbws.service_management.service_usage.v1alpha1.DisableServiceRequest.disable_dependent_services]
     * for services that depend on it.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.longrunning.Operation disableService(cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceUsageService.
   * <pre>
   * Lists, enables and disables the CBWS services of a project.
   * A service must be enabled in a project before its API can be used for the
   * project's resources.
   * </pre>
   */
  public static final class ServiceUsageServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceUsageServiceFutureStub> {
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
     * Lists the services of a project. Requires
     * `serviceusage.cbws.xyz/Service/list` on the project.
     * The list holds every service that is enabled in the project, and every
     * service the caller has `servicemanagement.cbws.xyz/Service/bind` on,
     * with its state. So the list can differ between callers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse> listServices(
        cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables a service in a project, together with the services it depends
     * on. Requires `serviceusage.cbws.xyz/Service/enable` on the project, and
     * `servicemanagement.cbws.xyz/Service/bind` on the service and on each of
     * its dependencies. A service that does not exist, or that the caller
     * lacks `bind` on, fails with NOT_FOUND.
     * Enabling a service that is already enabled succeeds and changes
     * nothing. If enabling a dependency fails, the services this call enabled
     * are disabled again.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> enableService(
        cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables a service in a project, so that it can no longer be used
     * there. Requires `serviceusage.cbws.xyz/Service/disable` on the project,
     * and `servicemanagement.cbws.xyz/Service/bind` on the service.
     * Disabling a service that is not enabled succeeds and changes nothing.
     * See
     * [disable_dependent_services][cbws.service_management.service_usage.v1alpha1.DisableServiceRequest.disable_dependent_services]
     * for services that depend on it.
     * The returned operation is already done.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> disableService(
        cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SERVICE:
          serviceImpl.enableService((cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DISABLE_SERVICE:
          serviceImpl.disableService((cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest) request,
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListServicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesRequest,
              cloud.cbws.api.service_management.service_usage.v1alpha1.ListServicesResponse>(
                service, METHODID_LIST_SERVICES)))
        .addMethod(
          getEnableServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.service_management.service_usage.v1alpha1.EnableServiceRequest,
              com.google.longrunning.Operation>(
                service, METHODID_ENABLE_SERVICE)))
        .addMethod(
          getDisableServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.service_management.service_usage.v1alpha1.DisableServiceRequest,
              com.google.longrunning.Operation>(
                service, METHODID_DISABLE_SERVICE)))
        .build();
  }

  private static abstract class ServiceUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceUsageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.cbws.api.service_management.service_usage.v1alpha1.ServiceManagementProto.getDescriptor();
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
    private final java.lang.String methodName;

    ServiceUsageServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
