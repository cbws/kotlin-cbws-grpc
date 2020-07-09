package cloudbear.accounts.v1alpha1;

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
    comments = "Source: cloudbear/accounts/v1alpha1/accounts.proto")
public final class AccountsServiceGrpc {

  private AccountsServiceGrpc() {}

  public static final String SERVICE_NAME = "cloudbear.accounts.v1alpha1.AccountsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest,
      cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> getWhoAmIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhoAmI",
      requestType = cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest.class,
      responseType = cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest,
      cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> getWhoAmIMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest, cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> getWhoAmIMethod;
    if ((getWhoAmIMethod = AccountsServiceGrpc.getWhoAmIMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getWhoAmIMethod = AccountsServiceGrpc.getWhoAmIMethod) == null) {
          AccountsServiceGrpc.getWhoAmIMethod = getWhoAmIMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest, cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhoAmI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("WhoAmI"))
              .build();
        }
      }
    }
    return getWhoAmIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest,
      cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> getGetPrincipalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrincipal",
      requestType = cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest.class,
      responseType = cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest,
      cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> getGetPrincipalMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest, cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> getGetPrincipalMethod;
    if ((getGetPrincipalMethod = AccountsServiceGrpc.getGetPrincipalMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getGetPrincipalMethod = AccountsServiceGrpc.getGetPrincipalMethod) == null) {
          AccountsServiceGrpc.getGetPrincipalMethod = getGetPrincipalMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest, cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrincipal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("GetPrincipal"))
              .build();
        }
      }
    }
    return getGetPrincipalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetUserRequest,
      cloudbear.accounts.v1alpha1.UserOuterClass.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = cloudbear.accounts.v1alpha1.Accounts.GetUserRequest.class,
      responseType = cloudbear.accounts.v1alpha1.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetUserRequest,
      cloudbear.accounts.v1alpha1.UserOuterClass.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetUserRequest, cloudbear.accounts.v1alpha1.UserOuterClass.User> getGetUserMethod;
    if ((getGetUserMethod = AccountsServiceGrpc.getGetUserMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getGetUserMethod = AccountsServiceGrpc.getGetUserMethod) == null) {
          AccountsServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.v1alpha1.Accounts.GetUserRequest, cloudbear.accounts.v1alpha1.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.Accounts.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest,
      cloudbear.accounts.v1alpha1.GroupOuterClass.Group> getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroup",
      requestType = cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest.class,
      responseType = cloudbear.accounts.v1alpha1.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest,
      cloudbear.accounts.v1alpha1.GroupOuterClass.Group> getGetGroupMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest, cloudbear.accounts.v1alpha1.GroupOuterClass.Group> getGetGroupMethod;
    if ((getGetGroupMethod = AccountsServiceGrpc.getGetGroupMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getGetGroupMethod = AccountsServiceGrpc.getGetGroupMethod) == null) {
          AccountsServiceGrpc.getGetGroupMethod = getGetGroupMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest, cloudbear.accounts.v1alpha1.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.GroupOuterClass.Group.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("GetGroup"))
              .build();
        }
      }
    }
    return getGetGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceStub>() {
        @java.lang.Override
        public AccountsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceStub(channel, callOptions);
        }
      };
    return AccountsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceBlockingStub>() {
        @java.lang.Override
        public AccountsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceFutureStub>() {
        @java.lang.Override
        public AccountsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceFutureStub(channel, callOptions);
        }
      };
    return AccountsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static abstract class AccountsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request your own principal
     * </pre>
     */
    public void whoAmI(cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhoAmIMethod(), responseObserver);
    }

    /**
     */
    public void getPrincipal(cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrincipalMethod(), responseObserver);
    }

    /**
     */
    public void getUser(cloudbear.accounts.v1alpha1.Accounts.GetUserRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.UserOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getGroup(cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.GroupOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWhoAmIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest,
                cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse>(
                  this, METHODID_WHO_AM_I)))
          .addMethod(
            getGetPrincipalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest,
                cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal>(
                  this, METHODID_GET_PRINCIPAL)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.v1alpha1.Accounts.GetUserRequest,
                cloudbear.accounts.v1alpha1.UserOuterClass.User>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest,
                cloudbear.accounts.v1alpha1.GroupOuterClass.Group>(
                  this, METHODID_GET_GROUP)))
          .build();
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountsServiceStub> {
    private AccountsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request your own principal
     * </pre>
     */
    public void whoAmI(cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWhoAmIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPrincipal(cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrincipalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(cloudbear.accounts.v1alpha1.Accounts.GetUserRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.UserOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroup(cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.GroupOuterClass.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsServiceBlockingStub> {
    private AccountsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request your own principal
     * </pre>
     */
    public cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse whoAmI(cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest request) {
      return blockingUnaryCall(
          getChannel(), getWhoAmIMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal getPrincipal(cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPrincipalMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.UserOuterClass.User getUser(cloudbear.accounts.v1alpha1.Accounts.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.GroupOuterClass.Group getGroup(cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsServiceFutureStub> {
    private AccountsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request your own principal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse> whoAmI(
        cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWhoAmIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal> getPrincipal(
        cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrincipalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.UserOuterClass.User> getUser(
        cloudbear.accounts.v1alpha1.Accounts.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.GroupOuterClass.Group> getGroup(
        cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WHO_AM_I = 0;
  private static final int METHODID_GET_PRINCIPAL = 1;
  private static final int METHODID_GET_USER = 2;
  private static final int METHODID_GET_GROUP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WHO_AM_I:
          serviceImpl.whoAmI((cloudbear.accounts.v1alpha1.Accounts.WhoAmIRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.Accounts.WhoAmIResponse>) responseObserver);
          break;
        case METHODID_GET_PRINCIPAL:
          serviceImpl.getPrincipal((cloudbear.accounts.v1alpha1.Accounts.GetPrincipalRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.PrincipalOuterClass.Principal>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((cloudbear.accounts.v1alpha1.Accounts.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((cloudbear.accounts.v1alpha1.Accounts.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.GroupOuterClass.Group>) responseObserver);
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

  private static abstract class AccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloudbear.accounts.v1alpha1.Accounts.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsService");
    }
  }

  private static final class AccountsServiceFileDescriptorSupplier
      extends AccountsServiceBaseDescriptorSupplier {
    AccountsServiceFileDescriptorSupplier() {}
  }

  private static final class AccountsServiceMethodDescriptorSupplier
      extends AccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsServiceFileDescriptorSupplier())
              .addMethod(getWhoAmIMethod())
              .addMethod(getGetPrincipalMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
