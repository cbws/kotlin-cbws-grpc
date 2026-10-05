package cloud.cbws.api.iam.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages service accounts and their keys, and issues credentials for them.
 * A service account is an identity for a workload rather than a person. It
 * belongs to a project, and is named by its email address, such as
 * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IAMServiceGrpc {

  private IAMServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cbws.iam.v1alpha1.IAMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest,
      cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccounts",
      requestType = cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest,
      cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest, cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> getListServiceAccountsMethod;
    if ((getListServiceAccountsMethod = IAMServiceGrpc.getListServiceAccountsMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getListServiceAccountsMethod = IAMServiceGrpc.getListServiceAccountsMethod) == null) {
          IAMServiceGrpc.getListServiceAccountsMethod = getListServiceAccountsMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest, cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("ListServiceAccounts"))
              .build();
        }
      }
    }
    return getListServiceAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccount",
      requestType = cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccount> getGetServiceAccountMethod;
    if ((getGetServiceAccountMethod = IAMServiceGrpc.getGetServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetServiceAccountMethod = IAMServiceGrpc.getGetServiceAccountMethod) == null) {
          IAMServiceGrpc.getGetServiceAccountMethod = getGetServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetServiceAccount"))
              .build();
        }
      }
    }
    return getGetServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccount",
      requestType = cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccount> getCreateServiceAccountMethod;
    if ((getCreateServiceAccountMethod = IAMServiceGrpc.getCreateServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getCreateServiceAccountMethod = IAMServiceGrpc.getCreateServiceAccountMethod) == null) {
          IAMServiceGrpc.getCreateServiceAccountMethod = getCreateServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("CreateServiceAccount"))
              .build();
        }
      }
    }
    return getCreateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccount",
      requestType = cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest, com.google.protobuf.Empty> getDeleteServiceAccountMethod;
    if ((getDeleteServiceAccountMethod = IAMServiceGrpc.getDeleteServiceAccountMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getDeleteServiceAccountMethod = IAMServiceGrpc.getDeleteServiceAccountMethod) == null) {
          IAMServiceGrpc.getDeleteServiceAccountMethod = getDeleteServiceAccountMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("DeleteServiceAccount"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest,
      cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAccessToken",
      requestType = cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest,
      cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest, cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;
    if ((getGenerateAccessTokenMethod = IAMServiceGrpc.getGenerateAccessTokenMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGenerateAccessTokenMethod = IAMServiceGrpc.getGenerateAccessTokenMethod) == null) {
          IAMServiceGrpc.getGenerateAccessTokenMethod = getGenerateAccessTokenMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest, cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GenerateAccessToken"))
              .build();
        }
      }
    }
    return getGenerateAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignJwtRequest,
      cloud.cbws.api.iam.v1alpha1.SignJwtResponse> getSignJwtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignJwt",
      requestType = cloud.cbws.api.iam.v1alpha1.SignJwtRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.SignJwtResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignJwtRequest,
      cloud.cbws.api.iam.v1alpha1.SignJwtResponse> getSignJwtMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignJwtRequest, cloud.cbws.api.iam.v1alpha1.SignJwtResponse> getSignJwtMethod;
    if ((getSignJwtMethod = IAMServiceGrpc.getSignJwtMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getSignJwtMethod = IAMServiceGrpc.getSignJwtMethod) == null) {
          IAMServiceGrpc.getSignJwtMethod = getSignJwtMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.SignJwtRequest, cloud.cbws.api.iam.v1alpha1.SignJwtResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignJwt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.SignJwtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.SignJwtResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("SignJwt"))
              .build();
        }
      }
    }
    return getSignJwtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignBlobRequest,
      cloud.cbws.api.iam.v1alpha1.SignBlobResponse> getSignBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignBlob",
      requestType = cloud.cbws.api.iam.v1alpha1.SignBlobRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.SignBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignBlobRequest,
      cloud.cbws.api.iam.v1alpha1.SignBlobResponse> getSignBlobMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.SignBlobRequest, cloud.cbws.api.iam.v1alpha1.SignBlobResponse> getSignBlobMethod;
    if ((getSignBlobMethod = IAMServiceGrpc.getSignBlobMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getSignBlobMethod = IAMServiceGrpc.getSignBlobMethod) == null) {
          IAMServiceGrpc.getSignBlobMethod = getSignBlobMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.SignBlobRequest, cloud.cbws.api.iam.v1alpha1.SignBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.SignBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.SignBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("SignBlob"))
              .build();
        }
      }
    }
    return getSignBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest,
      cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccountKeys",
      requestType = cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest,
      cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest, cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;
    if ((getListServiceAccountKeysMethod = IAMServiceGrpc.getListServiceAccountKeysMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getListServiceAccountKeysMethod = IAMServiceGrpc.getListServiceAccountKeysMethod) == null) {
          IAMServiceGrpc.getListServiceAccountKeysMethod = getListServiceAccountKeysMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest, cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccountKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("ListServiceAccountKeys"))
              .build();
        }
      }
    }
    return getListServiceAccountKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountKey",
      requestType = cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getGetServiceAccountKeyMethod;
    if ((getGetServiceAccountKeyMethod = IAMServiceGrpc.getGetServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetServiceAccountKeyMethod = IAMServiceGrpc.getGetServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getGetServiceAccountKeyMethod = getGetServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetServiceAccountKey"))
              .build();
        }
      }
    }
    return getGetServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccountKey",
      requestType = cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest.class,
      responseType = cloud.cbws.api.iam.v1alpha1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest,
      cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getCreateServiceAccountKeyMethod;
    if ((getCreateServiceAccountKeyMethod = IAMServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getCreateServiceAccountKeyMethod = IAMServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getCreateServiceAccountKeyMethod = getCreateServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest, cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("CreateServiceAccountKey"))
              .build();
        }
      }
    }
    return getCreateServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountKey",
      requestType = cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;
    if ((getDeleteServiceAccountKeyMethod = IAMServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getDeleteServiceAccountKeyMethod = IAMServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
          IAMServiceGrpc.getDeleteServiceAccountKeyMethod = getDeleteServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("DeleteServiceAccountKey"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest,
      cloud.cbws.api.iam.policy.v1alpha1.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest.class,
      responseType = cloud.cbws.api.iam.policy.v1alpha1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest,
      cloud.cbws.api.iam.policy.v1alpha1.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = IAMServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetPolicyMethod = IAMServiceGrpc.getGetPolicyMethod) == null) {
          IAMServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest,
      cloud.cbws.api.iam.policy.v1alpha1.Policy> getSetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPolicy",
      requestType = cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest.class,
      responseType = cloud.cbws.api.iam.policy.v1alpha1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest,
      cloud.cbws.api.iam.policy.v1alpha1.Policy> getSetPolicyMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy> getSetPolicyMethod;
    if ((getSetPolicyMethod = IAMServiceGrpc.getSetPolicyMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getSetPolicyMethod = IAMServiceGrpc.getSetPolicyMethod) == null) {
          IAMServiceGrpc.getSetPolicyMethod = getSetPolicyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.Policy.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IAMServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingV2Stub>() {
        @java.lang.Override
        public IAMServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IAMServiceBlockingV2Stub.newStub(factory, channel);
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
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the service accounts of a project. Requires
     * `iam.cbws.xyz/ServiceAccount/list` on the project.
     * </pre>
     */
    default void listServiceAccounts(cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServiceAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a service account. Requires `iam.cbws.xyz/ServiceAccount/get` on
     * the service account.
     * </pre>
     */
    default void getServiceAccount(cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a service account in a project and returns it. Requires
     * `iam.cbws.xyz/ServiceAccount/create` on the project.
     * The new account gets a system-managed key straight away, so it can
     * sign and get access tokens without a user-managed key.
     * </pre>
     */
    default void createServiceAccount(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a service account and all of its keys. Requires
     * `iam.cbws.xyz/ServiceAccount/delete` on the service account.
     * Role bindings that name the account on other resources are not
     * removed. Remove them from those resources' policies.
     * </pre>
     */
    default void deleteServiceAccount(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account, valid for
     * one hour. Requires `iam.cbws.xyz/ServiceAccount/generateAccessToken` on
     * the service account.
     * </pre>
     */
    default void generateAccessToken(cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAccessTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signs a JWT with one of the service account's system-managed keys, so
     * that it verifies against the account's published key set. Requires
     * `iam.cbws.xyz/ServiceAccount/signJwt` on the service account.
     * The JWT header is `{"alg":"RS256","kid":"&lt;key_id&gt;","typ":"JWT"}`. The
     * call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    default void signJwt(cloud.cbws.api.iam.v1alpha1.SignJwtRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignJwtResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignJwtMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signs a blob with one of the service account's system-managed keys.
     * Requires `iam.cbws.xyz/ServiceAccount/signBlob` on the service account.
     * The call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    default void signBlob(cloud.cbws.api.iam.v1alpha1.SignBlobRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignBlobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the keys of a service account, newest first. Requires
     * `iam.cbws.xyz/ServiceAccountKey/list` on the service account.
     * A key is listed once its validity has started. The listed keys carry
     * no key material. Use
     * [GetServiceAccountKey][cbws.iam.v1alpha1.IAMService.GetServiceAccountKey]
     * for a key's public key.
     * </pre>
     */
    default void listServiceAccountKeys(cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServiceAccountKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a service account key with its public key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/get` on the key.
     * </pre>
     */
    default void getServiceAccountKey(cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a user-managed key for a service account and returns it with
     * its private key. Requires `iam.cbws.xyz/ServiceAccountKey/create` on
     * the service account.
     * The private key is returned only in this response. CBWS does not keep
     * it, so store it safely: it lets anyone who holds it act as the service
     * account.
     * </pre>
     */
    default void createServiceAccountKey(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a user-managed service account key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/delete` on the key. System-managed keys
     * cannot be deleted.
     * </pre>
     */
    default void deleteServiceAccountKey(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/getIAMPolicy` on the service account.
     * The policy says who has access to the service account as a resource,
     * such as who may get tokens for it. It does not say what the service
     * account itself has access to. That is in the policies of the resources
     * it is granted on.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    default void getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/setIAMPolicy` on the service account.
     * Use it to grant access to the service account as a resource, such as
     * the right to get tokens for it. To grant the service account access to
     * another resource, such as a project, set the policy of that resource.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    default void setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPolicyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IAMService.
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public static abstract class IAMServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IAMServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IAMService.
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public static final class IAMServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IAMServiceStub> {
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
     * <pre>
     * Lists the service accounts of a project. Requires
     * `iam.cbws.xyz/ServiceAccount/list` on the project.
     * </pre>
     */
    public void listServiceAccounts(cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a service account. Requires `iam.cbws.xyz/ServiceAccount/get` on
     * the service account.
     * </pre>
     */
    public void getServiceAccount(cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a service account in a project and returns it. Requires
     * `iam.cbws.xyz/ServiceAccount/create` on the project.
     * The new account gets a system-managed key straight away, so it can
     * sign and get access tokens without a user-managed key.
     * </pre>
     */
    public void createServiceAccount(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a service account and all of its keys. Requires
     * `iam.cbws.xyz/ServiceAccount/delete` on the service account.
     * Role bindings that name the account on other resources are not
     * removed. Remove them from those resources' policies.
     * </pre>
     */
    public void deleteServiceAccount(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account, valid for
     * one hour. Requires `iam.cbws.xyz/ServiceAccount/generateAccessToken` on
     * the service account.
     * </pre>
     */
    public void generateAccessToken(cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signs a JWT with one of the service account's system-managed keys, so
     * that it verifies against the account's published key set. Requires
     * `iam.cbws.xyz/ServiceAccount/signJwt` on the service account.
     * The JWT header is `{"alg":"RS256","kid":"&lt;key_id&gt;","typ":"JWT"}`. The
     * call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public void signJwt(cloud.cbws.api.iam.v1alpha1.SignJwtRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignJwtResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignJwtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signs a blob with one of the service account's system-managed keys.
     * Requires `iam.cbws.xyz/ServiceAccount/signBlob` on the service account.
     * The call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public void signBlob(cloud.cbws.api.iam.v1alpha1.SignBlobRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignBlobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the keys of a service account, newest first. Requires
     * `iam.cbws.xyz/ServiceAccountKey/list` on the service account.
     * A key is listed once its validity has started. The listed keys carry
     * no key material. Use
     * [GetServiceAccountKey][cbws.iam.v1alpha1.IAMService.GetServiceAccountKey]
     * for a key's public key.
     * </pre>
     */
    public void listServiceAccountKeys(cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a service account key with its public key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/get` on the key.
     * </pre>
     */
    public void getServiceAccountKey(cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a user-managed key for a service account and returns it with
     * its private key. Requires `iam.cbws.xyz/ServiceAccountKey/create` on
     * the service account.
     * The private key is returned only in this response. CBWS does not keep
     * it, so store it safely: it lets anyone who holds it act as the service
     * account.
     * </pre>
     */
    public void createServiceAccountKey(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a user-managed service account key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/delete` on the key. System-managed keys
     * cannot be deleted.
     * </pre>
     */
    public void deleteServiceAccountKey(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/getIAMPolicy` on the service account.
     * The policy says who has access to the service account as a resource,
     * such as who may get tokens for it. It does not say what the service
     * account itself has access to. That is in the policies of the resources
     * it is granted on.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public void getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/setIAMPolicy` on the service account.
     * Use it to grant access to the service account as a resource, such as
     * the right to get tokens for it. To grant the service account access to
     * another resource, such as a project, set the policy of that resource.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public void setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IAMService.
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public static final class IAMServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IAMServiceBlockingV2Stub> {
    private IAMServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the service accounts of a project. Requires
     * `iam.cbws.xyz/ServiceAccount/list` on the project.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse listServiceAccounts(cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a service account. Requires `iam.cbws.xyz/ServiceAccount/get` on
     * the service account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccount getServiceAccount(cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a service account in a project and returns it. Requires
     * `iam.cbws.xyz/ServiceAccount/create` on the project.
     * The new account gets a system-managed key straight away, so it can
     * sign and get access tokens without a user-managed key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccount createServiceAccount(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a service account and all of its keys. Requires
     * `iam.cbws.xyz/ServiceAccount/delete` on the service account.
     * Role bindings that name the account on other resources are not
     * removed. Remove them from those resources' policies.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account, valid for
     * one hour. Requires `iam.cbws.xyz/ServiceAccount/generateAccessToken` on
     * the service account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse generateAccessToken(cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs a JWT with one of the service account's system-managed keys, so
     * that it verifies against the account's published key set. Requires
     * `iam.cbws.xyz/ServiceAccount/signJwt` on the service account.
     * The JWT header is `{"alg":"RS256","kid":"&lt;key_id&gt;","typ":"JWT"}`. The
     * call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.SignJwtResponse signJwt(cloud.cbws.api.iam.v1alpha1.SignJwtRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSignJwtMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs a blob with one of the service account's system-managed keys.
     * Requires `iam.cbws.xyz/ServiceAccount/signBlob` on the service account.
     * The call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.SignBlobResponse signBlob(cloud.cbws.api.iam.v1alpha1.SignBlobRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSignBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the keys of a service account, newest first. Requires
     * `iam.cbws.xyz/ServiceAccountKey/list` on the service account.
     * A key is listed once its validity has started. The listed keys carry
     * no key material. Use
     * [GetServiceAccountKey][cbws.iam.v1alpha1.IAMService.GetServiceAccountKey]
     * for a key's public key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse listServiceAccountKeys(cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListServiceAccountKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a service account key with its public key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/get` on the key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccountKey getServiceAccountKey(cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a user-managed key for a service account and returns it with
     * its private key. Requires `iam.cbws.xyz/ServiceAccountKey/create` on
     * the service account.
     * The private key is returned only in this response. CBWS does not keep
     * it, so store it safely: it lets anyone who holds it act as the service
     * account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccountKey createServiceAccountKey(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a user-managed service account key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/delete` on the key. System-managed keys
     * cannot be deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/getIAMPolicy` on the service account.
     * The policy says who has access to the service account as a resource,
     * such as who may get tokens for it. It does not say what the service
     * account itself has access to. That is in the policies of the resources
     * it is granted on.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/setIAMPolicy` on the service account.
     * Use it to grant access to the service account as a resource, such as
     * the right to get tokens for it. To grant the service account access to
     * another resource, such as a project, set the policy of that resource.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IAMService.
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public static final class IAMServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IAMServiceBlockingStub> {
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
     * <pre>
     * Lists the service accounts of a project. Requires
     * `iam.cbws.xyz/ServiceAccount/list` on the project.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse listServiceAccounts(cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a service account. Requires `iam.cbws.xyz/ServiceAccount/get` on
     * the service account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccount getServiceAccount(cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a service account in a project and returns it. Requires
     * `iam.cbws.xyz/ServiceAccount/create` on the project.
     * The new account gets a system-managed key straight away, so it can
     * sign and get access tokens without a user-managed key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccount createServiceAccount(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a service account and all of its keys. Requires
     * `iam.cbws.xyz/ServiceAccount/delete` on the service account.
     * Role bindings that name the account on other resources are not
     * removed. Remove them from those resources' policies.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account, valid for
     * one hour. Requires `iam.cbws.xyz/ServiceAccount/generateAccessToken` on
     * the service account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse generateAccessToken(cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs a JWT with one of the service account's system-managed keys, so
     * that it verifies against the account's published key set. Requires
     * `iam.cbws.xyz/ServiceAccount/signJwt` on the service account.
     * The JWT header is `{"alg":"RS256","kid":"&lt;key_id&gt;","typ":"JWT"}`. The
     * call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.SignJwtResponse signJwt(cloud.cbws.api.iam.v1alpha1.SignJwtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignJwtMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs a blob with one of the service account's system-managed keys.
     * Requires `iam.cbws.xyz/ServiceAccount/signBlob` on the service account.
     * The call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.SignBlobResponse signBlob(cloud.cbws.api.iam.v1alpha1.SignBlobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the keys of a service account, newest first. Requires
     * `iam.cbws.xyz/ServiceAccountKey/list` on the service account.
     * A key is listed once its validity has started. The listed keys carry
     * no key material. Use
     * [GetServiceAccountKey][cbws.iam.v1alpha1.IAMService.GetServiceAccountKey]
     * for a key's public key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse listServiceAccountKeys(cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServiceAccountKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a service account key with its public key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/get` on the key.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccountKey getServiceAccountKey(cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a user-managed key for a service account and returns it with
     * its private key. Requires `iam.cbws.xyz/ServiceAccountKey/create` on
     * the service account.
     * The private key is returned only in this response. CBWS does not keep
     * it, so store it safely: it lets anyone who holds it act as the service
     * account.
     * </pre>
     */
    public cloud.cbws.api.iam.v1alpha1.ServiceAccountKey createServiceAccountKey(cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a user-managed service account key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/delete` on the key. System-managed keys
     * cannot be deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/getIAMPolicy` on the service account.
     * The policy says who has access to the service account as a resource,
     * such as who may get tokens for it. It does not say what the service
     * account itself has access to. That is in the policies of the resources
     * it is granted on.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/setIAMPolicy` on the service account.
     * Use it to grant access to the service account as a resource, such as
     * the right to get tokens for it. To grant the service account access to
     * another resource, such as a project, set the policy of that resource.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IAMService.
   * <pre>
   * Manages service accounts and their keys, and issues credentials for them.
   * A service account is an identity for a workload rather than a person. It
   * belongs to a project, and is named by its email address, such as
   * `projects/my-project/serviceAccounts/my-app&#64;my-project.iam-sa.cbws.xyz`.
   * </pre>
   */
  public static final class IAMServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IAMServiceFutureStub> {
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
     * <pre>
     * Lists the service accounts of a project. Requires
     * `iam.cbws.xyz/ServiceAccount/list` on the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse> listServiceAccounts(
        cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a service account. Requires `iam.cbws.xyz/ServiceAccount/get` on
     * the service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ServiceAccount> getServiceAccount(
        cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a service account in a project and returns it. Requires
     * `iam.cbws.xyz/ServiceAccount/create` on the project.
     * The new account gets a system-managed key straight away, so it can
     * sign and get access tokens without a user-managed key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ServiceAccount> createServiceAccount(
        cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a service account and all of its keys. Requires
     * `iam.cbws.xyz/ServiceAccount/delete` on the service account.
     * Role bindings that name the account on other resources are not
     * removed. Remove them from those resources' policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccount(
        cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an OAuth 2.0 access token for a service account, valid for
     * one hour. Requires `iam.cbws.xyz/ServiceAccount/generateAccessToken` on
     * the service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse> generateAccessToken(
        cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signs a JWT with one of the service account's system-managed keys, so
     * that it verifies against the account's published key set. Requires
     * `iam.cbws.xyz/ServiceAccount/signJwt` on the service account.
     * The JWT header is `{"alg":"RS256","kid":"&lt;key_id&gt;","typ":"JWT"}`. The
     * call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.SignJwtResponse> signJwt(
        cloud.cbws.api.iam.v1alpha1.SignJwtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignJwtMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signs a blob with one of the service account's system-managed keys.
     * Requires `iam.cbws.xyz/ServiceAccount/signBlob` on the service account.
     * The call fails with FAILED_PRECONDITION when the account has no
     * system-managed key that stays valid for at least another hour.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.SignBlobResponse> signBlob(
        cloud.cbws.api.iam.v1alpha1.SignBlobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignBlobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the keys of a service account, newest first. Requires
     * `iam.cbws.xyz/ServiceAccountKey/list` on the service account.
     * A key is listed once its validity has started. The listed keys carry
     * no key material. Use
     * [GetServiceAccountKey][cbws.iam.v1alpha1.IAMService.GetServiceAccountKey]
     * for a key's public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse> listServiceAccountKeys(
        cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a service account key with its public key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/get` on the key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> getServiceAccountKey(
        cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a user-managed key for a service account and returns it with
     * its private key. Requires `iam.cbws.xyz/ServiceAccountKey/create` on
     * the service account.
     * The private key is returned only in this response. CBWS does not keep
     * it, so store it safely: it lets anyone who holds it act as the service
     * account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey> createServiceAccountKey(
        cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a user-managed service account key. Requires
     * `iam.cbws.xyz/ServiceAccountKey/delete` on the key. System-managed keys
     * cannot be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccountKey(
        cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/getIAMPolicy` on the service account.
     * The policy says who has access to the service account as a resource,
     * such as who may get tokens for it. It does not say what the service
     * account itself has access to. That is in the policies of the resources
     * it is granted on.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.policy.v1alpha1.Policy> getPolicy(
        cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a service account. Requires
     * `iam.cbws.xyz/ServiceAccount/setIAMPolicy` on the service account.
     * Use it to grant access to the service account as a resource, such as
     * the right to get tokens for it. To grant the service account access to
     * another resource, such as a project, set the policy of that resource.
     * The `resource` is the service account's resource name,
     * `projects/{project}/serviceAccounts/{email}`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.policy.v1alpha1.Policy> setPolicy(
        cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 0;
  private static final int METHODID_GET_SERVICE_ACCOUNT = 1;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 2;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 3;
  private static final int METHODID_GENERATE_ACCESS_TOKEN = 4;
  private static final int METHODID_SIGN_JWT = 5;
  private static final int METHODID_SIGN_BLOB = 6;
  private static final int METHODID_LIST_SERVICE_ACCOUNT_KEYS = 7;
  private static final int METHODID_GET_SERVICE_ACCOUNT_KEY = 8;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_KEY = 9;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_KEY = 10;
  private static final int METHODID_GET_POLICY = 11;
  private static final int METHODID_SET_POLICY = 12;

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
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccount>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_ACCESS_TOKEN:
          serviceImpl.generateAccessToken((cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse>) responseObserver);
          break;
        case METHODID_SIGN_JWT:
          serviceImpl.signJwt((cloud.cbws.api.iam.v1alpha1.SignJwtRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignJwtResponse>) responseObserver);
          break;
        case METHODID_SIGN_BLOB:
          serviceImpl.signBlob((cloud.cbws.api.iam.v1alpha1.SignBlobRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.SignBlobResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNT_KEYS:
          serviceImpl.listServiceAccountKeys((cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_KEY:
          serviceImpl.getServiceAccountKey((cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_KEY:
          serviceImpl.createServiceAccountKey((cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_KEY:
          serviceImpl.deleteServiceAccountKey((cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy>) responseObserver);
          break;
        case METHODID_SET_POLICY:
          serviceImpl.setPolicy((cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy>) responseObserver);
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
          getListServiceAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.ListServiceAccountsRequest,
              cloud.cbws.api.iam.v1alpha1.ListServiceAccountsResponse>(
                service, METHODID_LIST_SERVICE_ACCOUNTS)))
        .addMethod(
          getGetServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.GetServiceAccountRequest,
              cloud.cbws.api.iam.v1alpha1.ServiceAccount>(
                service, METHODID_GET_SERVICE_ACCOUNT)))
        .addMethod(
          getCreateServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.CreateServiceAccountRequest,
              cloud.cbws.api.iam.v1alpha1.ServiceAccount>(
                service, METHODID_CREATE_SERVICE_ACCOUNT)))
        .addMethod(
          getDeleteServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SERVICE_ACCOUNT)))
        .addMethod(
          getGenerateAccessTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenRequest,
              cloud.cbws.api.iam.v1alpha1.GenerateAccessTokenResponse>(
                service, METHODID_GENERATE_ACCESS_TOKEN)))
        .addMethod(
          getSignJwtMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.SignJwtRequest,
              cloud.cbws.api.iam.v1alpha1.SignJwtResponse>(
                service, METHODID_SIGN_JWT)))
        .addMethod(
          getSignBlobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.SignBlobRequest,
              cloud.cbws.api.iam.v1alpha1.SignBlobResponse>(
                service, METHODID_SIGN_BLOB)))
        .addMethod(
          getListServiceAccountKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysRequest,
              cloud.cbws.api.iam.v1alpha1.ListServiceAccountKeysResponse>(
                service, METHODID_LIST_SERVICE_ACCOUNT_KEYS)))
        .addMethod(
          getGetServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.GetServiceAccountKeyRequest,
              cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>(
                service, METHODID_GET_SERVICE_ACCOUNT_KEY)))
        .addMethod(
          getCreateServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.CreateServiceAccountKeyRequest,
              cloud.cbws.api.iam.v1alpha1.ServiceAccountKey>(
                service, METHODID_CREATE_SERVICE_ACCOUNT_KEY)))
        .addMethod(
          getDeleteServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.v1alpha1.DeleteServiceAccountKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SERVICE_ACCOUNT_KEY)))
        .addMethod(
          getGetPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest,
              cloud.cbws.api.iam.policy.v1alpha1.Policy>(
                service, METHODID_GET_POLICY)))
        .addMethod(
          getSetPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest,
              cloud.cbws.api.iam.policy.v1alpha1.Policy>(
                service, METHODID_SET_POLICY)))
        .build();
  }

  private static abstract class IAMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IAMServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.cbws.api.iam.v1alpha1.IamProto.getDescriptor();
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
    private final java.lang.String methodName;

    IAMServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getGenerateAccessTokenMethod())
              .addMethod(getSignJwtMethod())
              .addMethod(getSignBlobMethod())
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
