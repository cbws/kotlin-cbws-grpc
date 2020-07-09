package cloudbear.accounts.identity.v1alpha1;

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
 * The accounts service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: cloudbear/accounts/identity/v1alpha1/accounts.proto")
public final class AccountsIdentityServiceGrpc {

  private AccountsIdentityServiceGrpc() {}

  public static final String SERVICE_NAME = "cloudbear.accounts.identity.v1alpha1.AccountsIdentityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest,
      cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> getListUserGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserGroups",
      requestType = cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest.class,
      responseType = cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest,
      cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> getListUserGroupsMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest, cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> getListUserGroupsMethod;
    if ((getListUserGroupsMethod = AccountsIdentityServiceGrpc.getListUserGroupsMethod) == null) {
      synchronized (AccountsIdentityServiceGrpc.class) {
        if ((getListUserGroupsMethod = AccountsIdentityServiceGrpc.getListUserGroupsMethod) == null) {
          AccountsIdentityServiceGrpc.getListUserGroupsMethod = getListUserGroupsMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest, cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsIdentityServiceMethodDescriptorSupplier("ListUserGroups"))
              .build();
        }
      }
    }
    return getListUserGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest,
      cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> getListPrincipalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPrincipals",
      requestType = cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest.class,
      responseType = cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest,
      cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> getListPrincipalsMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest, cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> getListPrincipalsMethod;
    if ((getListPrincipalsMethod = AccountsIdentityServiceGrpc.getListPrincipalsMethod) == null) {
      synchronized (AccountsIdentityServiceGrpc.class) {
        if ((getListPrincipalsMethod = AccountsIdentityServiceGrpc.getListPrincipalsMethod) == null) {
          AccountsIdentityServiceGrpc.getListPrincipalsMethod = getListPrincipalsMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest, cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPrincipals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsIdentityServiceMethodDescriptorSupplier("ListPrincipals"))
              .build();
        }
      }
    }
    return getListPrincipalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsIdentityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceStub>() {
        @java.lang.Override
        public AccountsIdentityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsIdentityServiceStub(channel, callOptions);
        }
      };
    return AccountsIdentityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsIdentityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceBlockingStub>() {
        @java.lang.Override
        public AccountsIdentityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsIdentityServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountsIdentityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsIdentityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsIdentityServiceFutureStub>() {
        @java.lang.Override
        public AccountsIdentityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsIdentityServiceFutureStub(channel, callOptions);
        }
      };
    return AccountsIdentityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static abstract class AccountsIdentityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUserGroups(cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserGroupsMethod(), responseObserver);
    }

    /**
     */
    public void listPrincipals(cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPrincipalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUserGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest,
                cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse>(
                  this, METHODID_LIST_USER_GROUPS)))
          .addMethod(
            getListPrincipalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest,
                cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse>(
                  this, METHODID_LIST_PRINCIPALS)))
          .build();
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsIdentityServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountsIdentityServiceStub> {
    private AccountsIdentityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsIdentityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsIdentityServiceStub(channel, callOptions);
    }

    /**
     */
    public void listUserGroups(cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPrincipals(cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPrincipalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsIdentityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsIdentityServiceBlockingStub> {
    private AccountsIdentityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsIdentityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsIdentityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse listUserGroups(cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse listPrincipals(cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPrincipalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsIdentityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsIdentityServiceFutureStub> {
    private AccountsIdentityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsIdentityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsIdentityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse> listUserGroups(
        cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse> listPrincipals(
        cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPrincipalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USER_GROUPS = 0;
  private static final int METHODID_LIST_PRINCIPALS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountsIdentityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsIdentityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USER_GROUPS:
          serviceImpl.listUserGroups((cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListUserGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_PRINCIPALS:
          serviceImpl.listPrincipals((cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.identity.v1alpha1.Accounts.ListPrincipalsResponse>) responseObserver);
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

  private static abstract class AccountsIdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsIdentityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloudbear.accounts.identity.v1alpha1.Accounts.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsIdentityService");
    }
  }

  private static final class AccountsIdentityServiceFileDescriptorSupplier
      extends AccountsIdentityServiceBaseDescriptorSupplier {
    AccountsIdentityServiceFileDescriptorSupplier() {}
  }

  private static final class AccountsIdentityServiceMethodDescriptorSupplier
      extends AccountsIdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsIdentityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsIdentityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsIdentityServiceFileDescriptorSupplier())
              .addMethod(getListUserGroupsMethod())
              .addMethod(getListPrincipalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
