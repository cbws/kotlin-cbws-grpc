package cloudbear.organizations.v1alpha1;

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
    comments = "Source: cloudbear/organizations/v1alpha1/organizations.proto")
public final class OrganizationsServiceGrpc {

  private OrganizationsServiceGrpc() {}

  public static final String SERVICE_NAME = "cloudbear.organizations.v1alpha1.OrganizationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest,
      cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> getListOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizations",
      requestType = cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest.class,
      responseType = cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest,
      cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> getListOrganizationsMethod() {
    io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest, cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> getListOrganizationsMethod;
    if ((getListOrganizationsMethod = OrganizationsServiceGrpc.getListOrganizationsMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListOrganizationsMethod = OrganizationsServiceGrpc.getListOrganizationsMethod) == null) {
          OrganizationsServiceGrpc.getListOrganizationsMethod = getListOrganizationsMethod =
              io.grpc.MethodDescriptor.<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest, cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListOrganizations"))
              .build();
        }
      }
    }
    return getListOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest,
      cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest.class,
      responseType = cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest,
      cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest, cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = OrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetOrganizationMethod = OrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest, cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub>() {
        @java.lang.Override
        public OrganizationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceStub(channel, callOptions);
        }
      };
    return OrganizationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub>() {
        @java.lang.Override
        public OrganizationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub>() {
        @java.lang.Override
        public OrganizationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrganizationsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listOrganizations(cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOrganizationsMethod(), responseObserver);
    }

    /**
     */
    public void getOrganization(cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListOrganizationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest,
                cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse>(
                  this, METHODID_LIST_ORGANIZATIONS)))
          .addMethod(
            getGetOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest,
                cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization>(
                  this, METHODID_GET_ORGANIZATION)))
          .build();
    }
  }

  /**
   */
  public static final class OrganizationsServiceStub extends io.grpc.stub.AbstractAsyncStub<OrganizationsServiceStub> {
    private OrganizationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listOrganizations(cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganization(cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrganizationsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrganizationsServiceBlockingStub> {
    private OrganizationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse listOrganizations(cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization getOrganization(cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrganizationsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrganizationsServiceFutureStub> {
    private OrganizationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse> listOrganizations(
        cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization> getOrganization(
        cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ORGANIZATIONS = 0;
  private static final int METHODID_GET_ORGANIZATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrganizationsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrganizationsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.Organizations.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((cloudbear.organizations.v1alpha1.Organizations.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.organizations.v1alpha1.OrganizationOuterClass.Organization>) responseObserver);
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

  private static abstract class OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloudbear.organizations.v1alpha1.Organizations.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationsService");
    }
  }

  private static final class OrganizationsServiceFileDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier {
    OrganizationsServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationsServiceMethodDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrganizationsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrganizationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationsServiceFileDescriptorSupplier())
              .addMethod(getListOrganizationsMethod())
              .addMethod(getGetOrganizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
