package cloudbear.accounts.management.v1alpha1;

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
    comments = "Source: cloudbear/accounts/management/v1alpha1/accounts.proto")
public final class AccountsManagementServiceGrpc {

  private AccountsManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "cloudbear.accounts.management.v1alpha1.AccountsManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> getListServiceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccounts",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest.class,
      responseType = cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> getListServiceAccountsMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest, cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> getListServiceAccountsMethod;
    if ((getListServiceAccountsMethod = AccountsManagementServiceGrpc.getListServiceAccountsMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getListServiceAccountsMethod = AccountsManagementServiceGrpc.getListServiceAccountsMethod) == null) {
          AccountsManagementServiceGrpc.getListServiceAccountsMethod = getListServiceAccountsMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest, cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("ListServiceAccounts"))
              .build();
        }
      }
    }
    return getListServiceAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getGetServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccount",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest.class,
      responseType = cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getGetServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getGetServiceAccountMethod;
    if ((getGetServiceAccountMethod = AccountsManagementServiceGrpc.getGetServiceAccountMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getGetServiceAccountMethod = AccountsManagementServiceGrpc.getGetServiceAccountMethod) == null) {
          AccountsManagementServiceGrpc.getGetServiceAccountMethod = getGetServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("GetServiceAccount"))
              .build();
        }
      }
    }
    return getGetServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getCreateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccount",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest.class,
      responseType = cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getCreateServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getCreateServiceAccountMethod;
    if ((getCreateServiceAccountMethod = AccountsManagementServiceGrpc.getCreateServiceAccountMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getCreateServiceAccountMethod = AccountsManagementServiceGrpc.getCreateServiceAccountMethod) == null) {
          AccountsManagementServiceGrpc.getCreateServiceAccountMethod = getCreateServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("CreateServiceAccount"))
              .build();
        }
      }
    }
    return getCreateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getUpdateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceAccount",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest.class,
      responseType = cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest,
      cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getUpdateServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getUpdateServiceAccountMethod;
    if ((getUpdateServiceAccountMethod = AccountsManagementServiceGrpc.getUpdateServiceAccountMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getUpdateServiceAccountMethod = AccountsManagementServiceGrpc.getUpdateServiceAccountMethod) == null) {
          AccountsManagementServiceGrpc.getUpdateServiceAccountMethod = getUpdateServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest, cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("UpdateServiceAccount"))
              .build();
        }
      }
    }
    return getUpdateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccount",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest, com.google.protobuf.Empty> getDeleteServiceAccountMethod;
    if ((getDeleteServiceAccountMethod = AccountsManagementServiceGrpc.getDeleteServiceAccountMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getDeleteServiceAccountMethod = AccountsManagementServiceGrpc.getDeleteServiceAccountMethod) == null) {
          AccountsManagementServiceGrpc.getDeleteServiceAccountMethod = getDeleteServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("DeleteServiceAccount"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccountKeys",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest.class,
      responseType = cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest, cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;
    if ((getListServiceAccountKeysMethod = AccountsManagementServiceGrpc.getListServiceAccountKeysMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getListServiceAccountKeysMethod = AccountsManagementServiceGrpc.getListServiceAccountKeysMethod) == null) {
          AccountsManagementServiceGrpc.getListServiceAccountKeysMethod = getListServiceAccountKeysMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest, cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccountKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("ListServiceAccountKeys"))
              .build();
        }
      }
    }
    return getListServiceAccountKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest,
      cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getGetServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountKey",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest.class,
      responseType = cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest,
      cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getGetServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest, cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getGetServiceAccountKeyMethod;
    if ((getGetServiceAccountKeyMethod = AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getGetServiceAccountKeyMethod = AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod) == null) {
          AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod = getGetServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest, cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("GetServiceAccountKey"))
              .build();
        }
      }
    }
    return getGetServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest,
      cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getCreateServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccountKey",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest.class,
      responseType = cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest,
      cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getCreateServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest, cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getCreateServiceAccountKeyMethod;
    if ((getCreateServiceAccountKeyMethod = AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getCreateServiceAccountKeyMethod = AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
          AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod = getCreateServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest, cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("CreateServiceAccountKey"))
              .build();
        }
      }
    }
    return getCreateServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountKey",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;
    if ((getDeleteServiceAccountKeyMethod = AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getDeleteServiceAccountKeyMethod = AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
          AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod = getDeleteServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("DeleteServiceAccountKey"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAccessToken",
      requestType = cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest.class,
      responseType = cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest,
      cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> getGenerateAccessTokenMethod() {
    io.grpc.MethodDescriptor<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest, cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;
    if ((getGenerateAccessTokenMethod = AccountsManagementServiceGrpc.getGenerateAccessTokenMethod) == null) {
      synchronized (AccountsManagementServiceGrpc.class) {
        if ((getGenerateAccessTokenMethod = AccountsManagementServiceGrpc.getGenerateAccessTokenMethod) == null) {
          AccountsManagementServiceGrpc.getGenerateAccessTokenMethod = getGenerateAccessTokenMethod =
              io.grpc.MethodDescriptor.<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest, cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsManagementServiceMethodDescriptorSupplier("GenerateAccessToken"))
              .build();
        }
      }
    }
    return getGenerateAccessTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceStub>() {
        @java.lang.Override
        public AccountsManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsManagementServiceStub(channel, callOptions);
        }
      };
    return AccountsManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceBlockingStub>() {
        @java.lang.Override
        public AccountsManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountsManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsManagementServiceFutureStub>() {
        @java.lang.Override
        public AccountsManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsManagementServiceFutureStub(channel, callOptions);
        }
      };
    return AccountsManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static abstract class AccountsManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listServiceAccounts(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceAccountsMethod(), responseObserver);
    }

    /**
     */
    public void getServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceAccountMethod(), responseObserver);
    }

    /**
     */
    public void createServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceAccountKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public void generateAccessToken(cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAccessTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListServiceAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest,
                cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNTS)))
          .addMethod(
            getGetServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest,
                cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>(
                  this, METHODID_GET_SERVICE_ACCOUNT)))
          .addMethod(
            getCreateServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest,
                cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT)))
          .addMethod(
            getUpdateServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest,
                cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>(
                  this, METHODID_UPDATE_SERVICE_ACCOUNT)))
          .addMethod(
            getDeleteServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT)))
          .addMethod(
            getListServiceAccountKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest,
                cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNT_KEYS)))
          .addMethod(
            getGetServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest,
                cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>(
                  this, METHODID_GET_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getCreateServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest,
                cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getDeleteServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getGenerateAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest,
                cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse>(
                  this, METHODID_GENERATE_ACCESS_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsManagementServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountsManagementServiceStub> {
    private AccountsManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void listServiceAccounts(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public void generateAccessToken(cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsManagementServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsManagementServiceBlockingStub> {
    private AccountsManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse listServiceAccounts(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount getServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount createServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount updateServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse listServiceAccountKeys(cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListServiceAccountKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey getServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey createServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse generateAccessToken(cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateAccessTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The accounts service
   * </pre>
   */
  public static final class AccountsManagementServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsManagementServiceFutureStub> {
    private AccountsManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse> listServiceAccounts(
        cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> getServiceAccount(
        cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> createServiceAccount(
        cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount> updateServiceAccount(
        cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccount(
        cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse> listServiceAccountKeys(
        cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> getServiceAccountKey(
        cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey> createServiceAccountKey(
        cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccountKey(
        cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse> generateAccessToken(
        cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 0;
  private static final int METHODID_GET_SERVICE_ACCOUNT = 1;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 2;
  private static final int METHODID_UPDATE_SERVICE_ACCOUNT = 3;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 4;
  private static final int METHODID_LIST_SERVICE_ACCOUNT_KEYS = 5;
  private static final int METHODID_GET_SERVICE_ACCOUNT_KEY = 6;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_KEY = 7;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_KEY = 8;
  private static final int METHODID_GENERATE_ACCESS_TOKEN = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountsManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_ACCOUNT:
          serviceImpl.updateServiceAccount((cloudbear.accounts.management.v1alpha1.Accounts.UpdateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.v1alpha1.ServiceAccountOuterClass.ServiceAccount>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNT_KEYS:
          serviceImpl.listServiceAccountKeys((cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.ListServiceAccountKeysResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_KEY:
          serviceImpl.getServiceAccountKey((cloudbear.accounts.management.v1alpha1.Accounts.GetServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_KEY:
          serviceImpl.createServiceAccountKey((cloudbear.accounts.management.v1alpha1.Accounts.CreateServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.ServiceAccountKeyOuterClass.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_KEY:
          serviceImpl.deleteServiceAccountKey((cloudbear.accounts.management.v1alpha1.Accounts.DeleteServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_ACCESS_TOKEN:
          serviceImpl.generateAccessToken((cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<cloudbear.accounts.management.v1alpha1.Accounts.GenerateAccessTokenResponse>) responseObserver);
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

  private static abstract class AccountsManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloudbear.accounts.management.v1alpha1.Accounts.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsManagementService");
    }
  }

  private static final class AccountsManagementServiceFileDescriptorSupplier
      extends AccountsManagementServiceBaseDescriptorSupplier {
    AccountsManagementServiceFileDescriptorSupplier() {}
  }

  private static final class AccountsManagementServiceMethodDescriptorSupplier
      extends AccountsManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsManagementServiceFileDescriptorSupplier())
              .addMethod(getListServiceAccountsMethod())
              .addMethod(getGetServiceAccountMethod())
              .addMethod(getCreateServiceAccountMethod())
              .addMethod(getUpdateServiceAccountMethod())
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getListServiceAccountKeysMethod())
              .addMethod(getGetServiceAccountKeyMethod())
              .addMethod(getCreateServiceAccountKeyMethod())
              .addMethod(getDeleteServiceAccountKeyMethod())
              .addMethod(getGenerateAccessTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
