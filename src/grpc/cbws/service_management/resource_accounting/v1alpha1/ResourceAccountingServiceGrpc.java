package cbws.service_management.resource_accounting.v1alpha1;

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
 * <pre>
 * This service is meant to be used by service owners and can be used to report product usage for resource in a
 * consumer project.
 * Hostname: resourceaccounting.cbws.xyz
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: cbws/service_management/resource_accounting/v1alpha1/resource_accounting.proto")
public final class ResourceAccountingServiceGrpc {

  private ResourceAccountingServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest,
      cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest.class,
      responseType = cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest,
      cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> getListResourcesMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest, cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> getListResourcesMethod;
    if ((getListResourcesMethod = ResourceAccountingServiceGrpc.getListResourcesMethod) == null) {
      synchronized (ResourceAccountingServiceGrpc.class) {
        if ((getListResourcesMethod = ResourceAccountingServiceGrpc.getListResourcesMethod) == null) {
          ResourceAccountingServiceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest, cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceAccountingServiceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest,
      cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest.class,
      responseType = cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest,
      cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> getAccountMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest, cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> getAccountMethod;
    if ((getAccountMethod = ResourceAccountingServiceGrpc.getAccountMethod) == null) {
      synchronized (ResourceAccountingServiceGrpc.class) {
        if ((getAccountMethod = ResourceAccountingServiceGrpc.getAccountMethod) == null) {
          ResourceAccountingServiceGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest, cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceAccountingServiceMethodDescriptorSupplier("Account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceAccountingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceStub>() {
        @java.lang.Override
        public ResourceAccountingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceAccountingServiceStub(channel, callOptions);
        }
      };
    return ResourceAccountingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceAccountingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceBlockingStub>() {
        @java.lang.Override
        public ResourceAccountingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceAccountingServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceAccountingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceAccountingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceAccountingServiceFutureStub>() {
        @java.lang.Override
        public ResourceAccountingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceAccountingServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceAccountingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service is meant to be used by service owners and can be used to report product usage for resource in a
   * consumer project.
   * Hostname: resourceaccounting.cbws.xyz
   * </pre>
   */
  public static abstract class ResourceAccountingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Permission required: resourceaccounting.cbws.xyz/Resource/list
     * </pre>
     */
    public void listResources(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Account usage for a resource in a consumer project
     * Permission required: servicemanagement.cbws.xyz/Service/accountUsage
     * </pre>
     */
    public void account(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListResourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest,
                cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse>(
                  this, METHODID_LIST_RESOURCES)))
          .addMethod(
            getAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest,
                cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse>(
                  this, METHODID_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   * This service is meant to be used by service owners and can be used to report product usage for resource in a
   * consumer project.
   * Hostname: resourceaccounting.cbws.xyz
   * </pre>
   */
  public static final class ResourceAccountingServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceAccountingServiceStub> {
    private ResourceAccountingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceAccountingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceAccountingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Permission required: resourceaccounting.cbws.xyz/Resource/list
     * </pre>
     */
    public void listResources(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Account usage for a resource in a consumer project
     * Permission required: servicemanagement.cbws.xyz/Service/accountUsage
     * </pre>
     */
    public void account(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service is meant to be used by service owners and can be used to report product usage for resource in a
   * consumer project.
   * Hostname: resourceaccounting.cbws.xyz
   * </pre>
   */
  public static final class ResourceAccountingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceAccountingServiceBlockingStub> {
    private ResourceAccountingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceAccountingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceAccountingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Permission required: resourceaccounting.cbws.xyz/Resource/list
     * </pre>
     */
    public cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse listResources(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Account usage for a resource in a consumer project
     * Permission required: servicemanagement.cbws.xyz/Service/accountUsage
     * </pre>
     */
    public cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse account(cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service is meant to be used by service owners and can be used to report product usage for resource in a
   * consumer project.
   * Hostname: resourceaccounting.cbws.xyz
   * </pre>
   */
  public static final class ResourceAccountingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceAccountingServiceFutureStub> {
    private ResourceAccountingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceAccountingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceAccountingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Permission required: resourceaccounting.cbws.xyz/Resource/list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse> listResources(
        cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Account usage for a resource in a consumer project
     * Permission required: servicemanagement.cbws.xyz/Service/accountUsage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse> account(
        cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_RESOURCES = 0;
  private static final int METHODID_ACCOUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceAccountingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceAccountingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT:
          serviceImpl.account((cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountRequest) request,
              (io.grpc.stub.StreamObserver<cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.AccountResponse>) responseObserver);
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

  private static abstract class ResourceAccountingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceAccountingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.service_management.resource_accounting.v1alpha1.ResourceAccounting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceAccountingService");
    }
  }

  private static final class ResourceAccountingServiceFileDescriptorSupplier
      extends ResourceAccountingServiceBaseDescriptorSupplier {
    ResourceAccountingServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceAccountingServiceMethodDescriptorSupplier
      extends ResourceAccountingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceAccountingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceAccountingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceAccountingServiceFileDescriptorSupplier())
              .addMethod(getListResourcesMethod())
              .addMethod(getAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
