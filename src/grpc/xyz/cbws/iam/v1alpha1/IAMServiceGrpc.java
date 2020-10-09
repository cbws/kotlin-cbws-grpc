package xyz.cbws.iam.v1alpha1;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: cbws/iam/v1alpha1/iam.proto")
public final class IAMServiceGrpc {

  private IAMServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.iam.v1alpha1.IAMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest,
      xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccounts",
      requestType = xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest,
      xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest, xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod;
    if ((getListServiceAccountsMethod = IAMServiceGrpc.getListServiceAccountsMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getListServiceAccountsMethod = IAMServiceGrpc.getListServiceAccountsMethod) == null) {
          IAMServiceGrpc.getListServiceAccountsMethod = getListServiceAccountsMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest, xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("ListServiceAccounts"))
              .build();
        }
      }
    }
    return getListServiceAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccount",
      requestType = xyz.cbws.iam.v1alpha1.GetServiceAccountRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod;
    if ((getGetServiceAccountMethod = IAMServiceGrpc.getGetServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetServiceAccountMethod = IAMServiceGrpc.getGetServiceAccountMethod) == null) {
          IAMServiceGrpc.getGetServiceAccountMethod = getGetServiceAccountMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.GetServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.GetServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetServiceAccount"))
              .build();
        }
      }
    }
    return getGetServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccount",
      requestType = xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod;
    if ((getCreateServiceAccountMethod = IAMServiceGrpc.getCreateServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getCreateServiceAccountMethod = IAMServiceGrpc.getCreateServiceAccountMethod) == null) {
          IAMServiceGrpc.getCreateServiceAccountMethod = getCreateServiceAccountMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("CreateServiceAccount"))
              .build();
        }
      }
    }
    return getCreateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getUpdateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceAccount",
      requestType = xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccount> getUpdateServiceAccountMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount> getUpdateServiceAccountMethod;
    if ((getUpdateServiceAccountMethod = IAMServiceGrpc.getUpdateServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getUpdateServiceAccountMethod = IAMServiceGrpc.getUpdateServiceAccountMethod) == null) {
          IAMServiceGrpc.getUpdateServiceAccountMethod = getUpdateServiceAccountMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest, xyz.cbws.iam.v1alpha1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("UpdateServiceAccount"))
              .build();
        }
      }
    }
    return getUpdateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccount",
      requestType = xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest, com.google.protobuf.Empty> getDeleteServiceAccountMethod;
    if ((getDeleteServiceAccountMethod = IAMServiceGrpc.getDeleteServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getDeleteServiceAccountMethod = IAMServiceGrpc.getDeleteServiceAccountMethod) == null) {
          IAMServiceGrpc.getDeleteServiceAccountMethod = getDeleteServiceAccountMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("DeleteServiceAccount"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest,
      xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAccessToken",
      requestType = xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest,
      xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest, xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;
    if ((getGenerateAccessTokenMethod = IAMServiceGrpc.getGenerateAccessTokenMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGenerateAccessTokenMethod = IAMServiceGrpc.getGenerateAccessTokenMethod) == null) {
          IAMServiceGrpc.getGenerateAccessTokenMethod = getGenerateAccessTokenMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest, xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GenerateAccessToken"))
              .build();
        }
      }
    }
    return getGenerateAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest,
      xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccountKeys",
      requestType = xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest,
      xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest, xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;
    if ((getListServiceAccountKeysMethod = IAMServiceGrpc.getListServiceAccountKeysMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getListServiceAccountKeysMethod = IAMServiceGrpc.getListServiceAccountKeysMethod) == null) {
          IAMServiceGrpc.getListServiceAccountKeysMethod = getListServiceAccountKeysMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest, xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccountKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("ListServiceAccountKeys"))
              .build();
        }
      }
    }
    return getListServiceAccountKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountKey",
      requestType = xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest, xyz.cbws.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod;
    if ((getGetServiceAccountKeyMethod = IAMServiceGrpc.getGetServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetServiceAccountKeyMethod = IAMServiceGrpc.getGetServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getGetServiceAccountKeyMethod = getGetServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest, xyz.cbws.iam.v1alpha1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetServiceAccountKey"))
              .build();
        }
      }
    }
    return getGetServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccountKey",
      requestType = xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest.class,
      responseType = xyz.cbws.iam.v1alpha1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest,
      xyz.cbws.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest, xyz.cbws.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod;
    if ((getCreateServiceAccountKeyMethod = IAMServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getCreateServiceAccountKeyMethod = IAMServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getCreateServiceAccountKeyMethod = getCreateServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest, xyz.cbws.iam.v1alpha1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("CreateServiceAccountKey"))
              .build();
        }
      }
    }
    return getCreateServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountKey",
      requestType = xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;
    if ((getDeleteServiceAccountKeyMethod = IAMServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getDeleteServiceAccountKeyMethod = IAMServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getDeleteServiceAccountKeyMethod = getDeleteServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("DeleteServiceAccountKey"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest,
      cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest.class,
      responseType = cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest,
      cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = IAMServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetPolicyMethod = IAMServiceGrpc.getGetPolicyMethod) == null) {
          IAMServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest,
      cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getSetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPolicy",
      requestType = cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest.class,
      responseType = cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest,
      cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getSetPolicyMethod() {
    io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getSetPolicyMethod;
    if ((getSetPolicyMethod = IAMServiceGrpc.getSetPolicyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getSetPolicyMethod = IAMServiceGrpc.getSetPolicyMethod) == null) {
          IAMServiceGrpc.getSetPolicyMethod = getSetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("SetPolicy"))
              .build();
        }
      }
    }
    return getSetPolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceStub>() {
        @java.lang.Override
        public IAMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceStub(channel, callOptions);
        }
      };
    return IAMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingStub>() {
        @java.lang.Override
        public IAMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBlockingStub(channel, callOptions);
        }
      };
    return IAMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IAMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceFutureStub>() {
        @java.lang.Override
        public IAMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceFutureStub(channel, callOptions);
        }
      };
    return IAMServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class IAMServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listServiceAccounts(xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceAccountsMethod(), responseObserver);
    }

    /**
     */
    public void getServiceAccount(xyz.cbws.iam.v1alpha1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceAccountMethod(), responseObserver);
    }

    /**
     */
    public void createServiceAccount(xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateServiceAccount(xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public void generateAccessToken(xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAccessTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListServiceAccountKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. It returns the Cloud IAM
     * policy that reflects what members have access to the service account.
     * This method does not return what resources the service account has access
     * to. To see if a service account has access to a resource, call the
     * `getIamPolicy` method on the target resource. For example, to view grants
     * for a project, call the
     * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
     * method.
     * </pre>
     */
    public void getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. Use it to grant members
     * access to the service account, such as when they need to impersonate it.
     * This method does not grant the service account access to other resources,
     * such as projects. To grant a service account access to resources, include
     * the service account in the Cloud IAM policy for the desired resource, then
     * call the appropriate `setIamPolicy` method on the target resource. For
     * example, to grant a service account access to a project, call the
     * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
     * method.
     * </pre>
     */
    public void setPolicy(cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPolicyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListServiceAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest,
                xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNTS)))
          .addMethod(
            getGetServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.GetServiceAccountRequest,
                xyz.cbws.iam.v1alpha1.ServiceAccount>(
                  this, METHODID_GET_SERVICE_ACCOUNT)))
          .addMethod(
            getCreateServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest,
                xyz.cbws.iam.v1alpha1.ServiceAccount>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT)))
          .addMethod(
            getUpdateServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest,
                xyz.cbws.iam.v1alpha1.ServiceAccount>(
                  this, METHODID_UPDATE_SERVICE_ACCOUNT)))
          .addMethod(
            getDeleteServiceAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT)))
          .addMethod(
            getGenerateAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest,
                xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse>(
                  this, METHODID_GENERATE_ACCESS_TOKEN)))
          .addMethod(
            getListServiceAccountKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest,
                xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNT_KEYS)))
          .addMethod(
            getGetServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest,
                xyz.cbws.iam.v1alpha1.ServiceAccountKey>(
                  this, METHODID_GET_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getCreateServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest,
                xyz.cbws.iam.v1alpha1.ServiceAccountKey>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getDeleteServiceAccountKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            getGetPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest,
                cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>(
                  this, METHODID_GET_POLICY)))
          .addMethod(
            getSetPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest,
                cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>(
                  this, METHODID_SET_POLICY)))
          .build();
    }
  }

  /**
   */
  public static final class IAMServiceStub extends io.grpc.stub.AbstractAsyncStub<IAMServiceStub> {
    private IAMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceStub(channel, callOptions);
    }

    /**
     */
    public void listServiceAccounts(xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServiceAccount(xyz.cbws.iam.v1alpha1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createServiceAccount(xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServiceAccount(xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public void generateAccessToken(xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. It returns the Cloud IAM
     * policy that reflects what members have access to the service account.
     * This method does not return what resources the service account has access
     * to. To see if a service account has access to a resource, call the
     * `getIamPolicy` method on the target resource. For example, to view grants
     * for a project, call the
     * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
     * method.
     * </pre>
     */
    public void getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. Use it to grant members
     * access to the service account, such as when they need to impersonate it.
     * This method does not grant the service account access to other resources,
     * such as projects. To grant a service account access to resources, include
     * the service account in the Cloud IAM policy for the desired resource, then
     * call the appropriate `setIamPolicy` method on the target resource. For
     * example, to grant a service account access to a project, call the
     * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
     * method.
     * </pre>
     */
    public void setPolicy(cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IAMServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IAMServiceBlockingStub> {
    private IAMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse listServiceAccounts(xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.iam.v1alpha1.ServiceAccount getServiceAccount(xyz.cbws.iam.v1alpha1.GetServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.iam.v1alpha1.ServiceAccount createServiceAccount(xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.iam.v1alpha1.ServiceAccount updateServiceAccount(xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse generateAccessToken(xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse listServiceAccountKeys(xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListServiceAccountKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public xyz.cbws.iam.v1alpha1.ServiceAccountKey getServiceAccountKey(xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public xyz.cbws.iam.v1alpha1.ServiceAccountKey createServiceAccountKey(xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. It returns the Cloud IAM
     * policy that reflects what members have access to the service account.
     * This method does not return what resources the service account has access
     * to. To see if a service account has access to a resource, call the
     * `getIamPolicy` method on the target resource. For example, to view grants
     * for a project, call the
     * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
     * method.
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. Use it to grant members
     * access to the service account, such as when they need to impersonate it.
     * This method does not grant the service account access to other resources,
     * such as projects. To grant a service account access to resources, include
     * the service account in the Cloud IAM policy for the desired resource, then
     * call the appropriate `setIamPolicy` method on the target resource. For
     * example, to grant a service account access to a project, call the
     * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
     * method.
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy setPolicy(cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IAMServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IAMServiceFutureStub> {
    private IAMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse> listServiceAccounts(
        xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ServiceAccount> getServiceAccount(
        xyz.cbws.iam.v1alpha1.GetServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ServiceAccount> createServiceAccount(
        xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ServiceAccount> updateServiceAccount(
        xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccount(
        xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse> generateAccessToken(
        xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse> listServiceAccountKeys(
        xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ServiceAccountKey> getServiceAccountKey(
        xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.iam.v1alpha1.ServiceAccountKey> createServiceAccountKey(
        xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccountKey(
        xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. It returns the Cloud IAM
     * policy that reflects what members have access to the service account.
     * This method does not return what resources the service account has access
     * to. To see if a service account has access to a resource, call the
     * `getIamPolicy` method on the target resource. For example, to view grants
     * for a project, call the
     * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
     * method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getPolicy(
        cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the Cloud IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Note: Service accounts are both
     * [resources and
     * identities](/iam/docs/service-accounts#service_account_permissions). This
     * method treats the service account as a resource. Use it to grant members
     * access to the service account, such as when they need to impersonate it.
     * This method does not grant the service account access to other resources,
     * such as projects. To grant a service account access to resources, include
     * the service account in the Cloud IAM policy for the desired resource, then
     * call the appropriate `setIamPolicy` method on the target resource. For
     * example, to grant a service account access to a project, call the
     * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
     * method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> setPolicy(
        cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 0;
  private static final int METHODID_GET_SERVICE_ACCOUNT = 1;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 2;
  private static final int METHODID_UPDATE_SERVICE_ACCOUNT = 3;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 4;
  private static final int METHODID_GENERATE_ACCESS_TOKEN = 5;
  private static final int METHODID_LIST_SERVICE_ACCOUNT_KEYS = 6;
  private static final int METHODID_GET_SERVICE_ACCOUNT_KEY = 7;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_KEY = 8;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_KEY = 9;
  private static final int METHODID_GET_POLICY = 10;
  private static final int METHODID_SET_POLICY = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAMServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IAMServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((xyz.cbws.iam.v1alpha1.ListServiceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((xyz.cbws.iam.v1alpha1.GetServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((xyz.cbws.iam.v1alpha1.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_ACCOUNT:
          serviceImpl.updateServiceAccount((xyz.cbws.iam.v1alpha1.UpdateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccount>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((xyz.cbws.iam.v1alpha1.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_ACCESS_TOKEN:
          serviceImpl.generateAccessToken((xyz.cbws.iam.v1alpha1.GenerateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.GenerateAccessTokenResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNT_KEYS:
          serviceImpl.listServiceAccountKeys((xyz.cbws.iam.v1alpha1.ListServiceAccountKeysRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ListServiceAccountKeysResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_KEY:
          serviceImpl.getServiceAccountKey((xyz.cbws.iam.v1alpha1.GetServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_KEY:
          serviceImpl.createServiceAccountKey((xyz.cbws.iam.v1alpha1.CreateServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.iam.v1alpha1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_KEY:
          serviceImpl.deleteServiceAccountKey((xyz.cbws.iam.v1alpha1.DeleteServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>) responseObserver);
          break;
        case METHODID_SET_POLICY:
          serviceImpl.setPolicy((cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>) responseObserver);
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

  private static abstract class IAMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IAMServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return xyz.cbws.iam.v1alpha1.Iam.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IAMService");
    }
  }

  private static final class IAMServiceFileDescriptorSupplier
      extends IAMServiceBaseDescriptorSupplier {
    IAMServiceFileDescriptorSupplier() {}
  }

  private static final class IAMServiceMethodDescriptorSupplier
      extends IAMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IAMServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IAMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IAMServiceFileDescriptorSupplier())
              .addMethod(getListServiceAccountsMethod())
              .addMethod(getGetServiceAccountMethod())
              .addMethod(getCreateServiceAccountMethod())
              .addMethod(getUpdateServiceAccountMethod())
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getGenerateAccessTokenMethod())
              .addMethod(getListServiceAccountKeysMethod())
              .addMethod(getGetServiceAccountKeyMethod())
              .addMethod(getCreateServiceAccountKeyMethod())
              .addMethod(getDeleteServiceAccountKeyMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getSetPolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
