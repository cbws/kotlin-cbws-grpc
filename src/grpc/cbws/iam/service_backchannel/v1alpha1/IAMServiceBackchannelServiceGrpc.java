package cbws.iam.service_backchannel.v1alpha1;

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
    comments = "Source: cbws/iam/service_backchannel/v1alpha1/service_backchannel.proto")
public final class IAMServiceBackchannelServiceGrpc {

  private IAMServiceBackchannelServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest,
      cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> getCheckPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermissions",
      requestType = cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest.class,
      responseType = cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest,
      cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> getCheckPermissionsMethod() {
    io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest, cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> getCheckPermissionsMethod;
    if ((getCheckPermissionsMethod = IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getCheckPermissionsMethod = IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod = getCheckPermissionsMethod =
              io.grpc.MethodDescriptor.<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest, cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("CheckPermissions"))
              .build();
        }
      }
    }
    return getCheckPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest,
      cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> getLookupResourceAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupResourceAccess",
      requestType = cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest.class,
      responseType = cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest,
      cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> getLookupResourceAccessMethod() {
    io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest, cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> getLookupResourceAccessMethod;
    if ((getLookupResourceAccessMethod = IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getLookupResourceAccessMethod = IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod = getLookupResourceAccessMethod =
              io.grpc.MethodDescriptor.<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest, cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupResourceAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("LookupResourceAccess"))
              .build();
        }
      }
    }
    return getLookupResourceAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest,
      com.google.protobuf.Empty> getSetResourceParentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetResourceParent",
      requestType = cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest,
      com.google.protobuf.Empty> getSetResourceParentMethod() {
    io.grpc.MethodDescriptor<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest, com.google.protobuf.Empty> getSetResourceParentMethod;
    if ((getSetResourceParentMethod = IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getSetResourceParentMethod = IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod = getSetResourceParentMethod =
              io.grpc.MethodDescriptor.<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetResourceParent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("SetResourceParent"))
              .build();
        }
      }
    }
    return getSetResourceParentMethod;
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
    if ((getGetPolicyMethod = IAMServiceBackchannelServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getGetPolicyMethod = IAMServiceBackchannelServiceGrpc.getGetPolicyMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("GetPolicy"))
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
    if ((getSetPolicyMethod = IAMServiceBackchannelServiceGrpc.getSetPolicyMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getSetPolicyMethod = IAMServiceBackchannelServiceGrpc.getSetPolicyMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getSetPolicyMethod = getSetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("SetPolicy"))
              .build();
        }
      }
    }
    return getSetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest,
      cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> getTestPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestPermissions",
      requestType = cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest.class,
      responseType = cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest,
      cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> getTestPermissionsMethod() {
    io.grpc.MethodDescriptor<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest, cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> getTestPermissionsMethod;
    if ((getTestPermissionsMethod = IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod) == null) {
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        if ((getTestPermissionsMethod = IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod) == null) {
          IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod = getTestPermissionsMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest, cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IAMServiceBackchannelServiceMethodDescriptorSupplier("TestPermissions"))
              .build();
        }
      }
    }
    return getTestPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAMServiceBackchannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceStub>() {
        @java.lang.Override
        public IAMServiceBackchannelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBackchannelServiceStub(channel, callOptions);
        }
      };
    return IAMServiceBackchannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAMServiceBackchannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceBlockingStub>() {
        @java.lang.Override
        public IAMServiceBackchannelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBackchannelServiceBlockingStub(channel, callOptions);
        }
      };
    return IAMServiceBackchannelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IAMServiceBackchannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBackchannelServiceFutureStub>() {
        @java.lang.Override
        public IAMServiceBackchannelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBackchannelServiceFutureStub(channel, callOptions);
        }
      };
    return IAMServiceBackchannelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class IAMServiceBackchannelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Check if particular X has permission Y on resource Z
     * Example: Does user have project create access on organization
     * </pre>
     */
    public void checkPermissions(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lookup which resources principal X has Y permission on
     * </pre>
     */
    public void lookupResourceAccess(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupResourceAccessMethod(), responseObserver);
    }

    /**
     */
    public void setResourceParent(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetResourceParentMethod(), responseObserver);
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

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void testPermissions(cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest,
                cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse>(
                  this, METHODID_CHECK_PERMISSIONS)))
          .addMethod(
            getLookupResourceAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest,
                cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse>(
                  this, METHODID_LOOKUP_RESOURCE_ACCESS)))
          .addMethod(
            getSetResourceParentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_RESOURCE_PARENT)))
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
          .addMethod(
            getTestPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest,
                cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse>(
                  this, METHODID_TEST_PERMISSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class IAMServiceBackchannelServiceStub extends io.grpc.stub.AbstractAsyncStub<IAMServiceBackchannelServiceStub> {
    private IAMServiceBackchannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBackchannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBackchannelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Check if particular X has permission Y on resource Z
     * Example: Does user have project create access on organization
     * </pre>
     */
    public void checkPermissions(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lookup which resources principal X has Y permission on
     * </pre>
     */
    public void lookupResourceAccess(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupResourceAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setResourceParent(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetResourceParentMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void testPermissions(cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IAMServiceBackchannelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IAMServiceBackchannelServiceBlockingStub> {
    private IAMServiceBackchannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBackchannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBackchannelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Check if particular X has permission Y on resource Z
     * Example: Does user have project create access on organization
     * </pre>
     */
    public cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse checkPermissions(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lookup which resources principal X has Y permission on
     * </pre>
     */
    public cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse lookupResourceAccess(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupResourceAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setResourceParent(cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetResourceParentMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse testPermissions(cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IAMServiceBackchannelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IAMServiceBackchannelServiceFutureStub> {
    private IAMServiceBackchannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBackchannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBackchannelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Check if particular X has permission Y on resource Z
     * Example: Does user have project create access on organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse> checkPermissions(
        cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lookup which resources principal X has Y permission on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse> lookupResourceAccess(
        cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupResourceAccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setResourceParent(
        cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetResourceParentMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> testPermissions(
        cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_PERMISSIONS = 0;
  private static final int METHODID_LOOKUP_RESOURCE_ACCESS = 1;
  private static final int METHODID_SET_RESOURCE_PARENT = 2;
  private static final int METHODID_GET_POLICY = 3;
  private static final int METHODID_SET_POLICY = 4;
  private static final int METHODID_TEST_PERMISSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAMServiceBackchannelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IAMServiceBackchannelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_PERMISSIONS:
          serviceImpl.checkPermissions((cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.CheckPermissionsResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_RESOURCE_ACCESS:
          serviceImpl.lookupResourceAccess((cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessRequest) request,
              (io.grpc.stub.StreamObserver<cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.LookupResourceAccessResponse>) responseObserver);
          break;
        case METHODID_SET_RESOURCE_PARENT:
          serviceImpl.setResourceParent((cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.SetResourceParentRequest) request,
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
        case METHODID_TEST_PERMISSIONS:
          serviceImpl.testPermissions((cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse>) responseObserver);
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

  private static abstract class IAMServiceBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IAMServiceBackchannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.iam.service_backchannel.v1alpha1.ServiceBackchannel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IAMServiceBackchannelService");
    }
  }

  private static final class IAMServiceBackchannelServiceFileDescriptorSupplier
      extends IAMServiceBackchannelServiceBaseDescriptorSupplier {
    IAMServiceBackchannelServiceFileDescriptorSupplier() {}
  }

  private static final class IAMServiceBackchannelServiceMethodDescriptorSupplier
      extends IAMServiceBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IAMServiceBackchannelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IAMServiceBackchannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IAMServiceBackchannelServiceFileDescriptorSupplier())
              .addMethod(getCheckPermissionsMethod())
              .addMethod(getLookupResourceAccessMethod())
              .addMethod(getSetResourceParentMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getSetPolicyMethod())
              .addMethod(getTestPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
