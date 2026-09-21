package cloud.cbws.api.vpc.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages VPCs, the private networks and subnets inside them, and ports on
 * those networks.
 * Every call that changes something needs an `Idempotency-Key` request
 * header that holds a UUID. Send the same key again to retry a call safely:
 * the retry returns the operation of the first call instead of repeating the
 * change. A call without the header fails with INVALID_ARGUMENT.
 * Those calls return a `google.longrunning.Operation`. The work is done
 * before the call returns, so the operation is always already done. The
 * operation can be read again from the `google.longrunning.Operations`
 * service on the same host.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class VpcServiceGrpc {

  private VpcServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cbws.vpc.v1alpha1.VpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest,
      cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> getListVpcsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVpcs",
      requestType = cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest,
      cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> getListVpcsMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest, cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> getListVpcsMethod;
    if ((getListVpcsMethod = VpcServiceGrpc.getListVpcsMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getListVpcsMethod = VpcServiceGrpc.getListVpcsMethod) == null) {
          VpcServiceGrpc.getListVpcsMethod = getListVpcsMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest, cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVpcs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("ListVpcs"))
              .build();
        }
      }
    }
    return getListVpcsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetVpcRequest,
      cloud.cbws.api.vpc.v1alpha1.Vpc> getGetVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVpc",
      requestType = cloud.cbws.api.vpc.v1alpha1.GetVpcRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.Vpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetVpcRequest,
      cloud.cbws.api.vpc.v1alpha1.Vpc> getGetVpcMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetVpcRequest, cloud.cbws.api.vpc.v1alpha1.Vpc> getGetVpcMethod;
    if ((getGetVpcMethod = VpcServiceGrpc.getGetVpcMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getGetVpcMethod = VpcServiceGrpc.getGetVpcMethod) == null) {
          VpcServiceGrpc.getGetVpcMethod = getGetVpcMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.GetVpcRequest, cloud.cbws.api.vpc.v1alpha1.Vpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.GetVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.Vpc.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("GetVpc"))
              .build();
        }
      }
    }
    return getGetVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest,
      com.google.longrunning.Operation> getDeleteVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVpc",
      requestType = cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest,
      com.google.longrunning.Operation> getDeleteVpcMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest, com.google.longrunning.Operation> getDeleteVpcMethod;
    if ((getDeleteVpcMethod = VpcServiceGrpc.getDeleteVpcMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getDeleteVpcMethod = VpcServiceGrpc.getDeleteVpcMethod) == null) {
          VpcServiceGrpc.getDeleteVpcMethod = getDeleteVpcMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("DeleteVpc"))
              .build();
        }
      }
    }
    return getDeleteVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest,
      cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> getListPrivateNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPrivateNetworks",
      requestType = cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest,
      cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> getListPrivateNetworksMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest, cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> getListPrivateNetworksMethod;
    if ((getListPrivateNetworksMethod = VpcServiceGrpc.getListPrivateNetworksMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getListPrivateNetworksMethod = VpcServiceGrpc.getListPrivateNetworksMethod) == null) {
          VpcServiceGrpc.getListPrivateNetworksMethod = getListPrivateNetworksMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest, cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPrivateNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("ListPrivateNetworks"))
              .build();
        }
      }
    }
    return getListPrivateNetworksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest,
      cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> getGetPrivateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrivateNetwork",
      requestType = cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.PrivateNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest,
      cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> getGetPrivateNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest, cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> getGetPrivateNetworkMethod;
    if ((getGetPrivateNetworkMethod = VpcServiceGrpc.getGetPrivateNetworkMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getGetPrivateNetworkMethod = VpcServiceGrpc.getGetPrivateNetworkMethod) == null) {
          VpcServiceGrpc.getGetPrivateNetworkMethod = getGetPrivateNetworkMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest, cloud.cbws.api.vpc.v1alpha1.PrivateNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrivateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.PrivateNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("GetPrivateNetwork"))
              .build();
        }
      }
    }
    return getGetPrivateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest,
      com.google.longrunning.Operation> getDeletePrivateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePrivateNetwork",
      requestType = cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest,
      com.google.longrunning.Operation> getDeletePrivateNetworkMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest, com.google.longrunning.Operation> getDeletePrivateNetworkMethod;
    if ((getDeletePrivateNetworkMethod = VpcServiceGrpc.getDeletePrivateNetworkMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getDeletePrivateNetworkMethod = VpcServiceGrpc.getDeletePrivateNetworkMethod) == null) {
          VpcServiceGrpc.getDeletePrivateNetworkMethod = getDeletePrivateNetworkMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePrivateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("DeletePrivateNetwork"))
              .build();
        }
      }
    }
    return getDeletePrivateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest,
      cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> getListSubnetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubnets",
      requestType = cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest,
      cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> getListSubnetsMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest, cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> getListSubnetsMethod;
    if ((getListSubnetsMethod = VpcServiceGrpc.getListSubnetsMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getListSubnetsMethod = VpcServiceGrpc.getListSubnetsMethod) == null) {
          VpcServiceGrpc.getListSubnetsMethod = getListSubnetsMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest, cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubnets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("ListSubnets"))
              .build();
        }
      }
    }
    return getListSubnetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest,
      cloud.cbws.api.vpc.v1alpha1.Subnet> getGetSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubnet",
      requestType = cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest.class,
      responseType = cloud.cbws.api.vpc.v1alpha1.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest,
      cloud.cbws.api.vpc.v1alpha1.Subnet> getGetSubnetMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest, cloud.cbws.api.vpc.v1alpha1.Subnet> getGetSubnetMethod;
    if ((getGetSubnetMethod = VpcServiceGrpc.getGetSubnetMethod) == null) {
      synchronized (VpcServiceGrpc.class) {
        if ((getGetSubnetMethod = VpcServiceGrpc.getGetSubnetMethod) == null) {
          VpcServiceGrpc.getGetSubnetMethod = getGetSubnetMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest, cloud.cbws.api.vpc.v1alpha1.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.vpc.v1alpha1.Subnet.getDefaultInstance()))
              .setSchemaDescriptor(new VpcServiceMethodDescriptorSupplier("GetSubnet"))
              .build();
        }
      }
    }
    return getGetSubnetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VpcServiceStub>() {
        @java.lang.Override
        public VpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VpcServiceStub(channel, callOptions);
        }
      };
    return VpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VpcServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VpcServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VpcServiceBlockingV2Stub>() {
        @java.lang.Override
        public VpcServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VpcServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return VpcServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VpcServiceBlockingStub>() {
        @java.lang.Override
        public VpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VpcServiceBlockingStub(channel, callOptions);
        }
      };
    return VpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VpcServiceFutureStub>() {
        @java.lang.Override
        public VpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VpcServiceFutureStub(channel, callOptions);
        }
      };
    return VpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the VPCs of a project. Requires `vpc.cbws.cloud/Vpc/list` on the
     * project.
     * </pre>
     */
    default void listVpcs(cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVpcsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a VPC. Requires `vpc.cbws.cloud/Vpc/get` on the VPC.
     * </pre>
     */
    default void getVpc(cloud.cbws.api.vpc.v1alpha1.GetVpcRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPC. Requires `vpc.cbws.cloud/Vpc/delete` on the VPC.
     * A VPC that still has private networks cannot be deleted: the call fails
     * with FAILED_PRECONDITION and names them. Delete them first.
     * </pre>
     */
    default void deleteVpc(cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the private networks of a VPC. Requires
     * `vpc.cbws.cloud/PrivateNetwork/list` on the VPC.
     * </pre>
     */
    default void listPrivateNetworks(cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPrivateNetworksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a private network. Requires `vpc.cbws.cloud/PrivateNetwork/get` on
     * the private network.
     * </pre>
     */
    default void getPrivateNetwork(cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPrivateNetworkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a private network. Requires
     * `vpc.cbws.cloud/PrivateNetwork/delete` on the private network.
     * </pre>
     */
    default void deletePrivateNetwork(cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePrivateNetworkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the subnets of a private network. Requires
     * `vpc.cbws.cloud/Subnet/list` on the private network.
     * </pre>
     */
    default void listSubnets(cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubnetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a subnet. Requires `vpc.cbws.cloud/Subnet/get` on the subnet.
     * </pre>
     */
    default void getSubnet(cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubnetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VpcService.
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public static abstract class VpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VpcService.
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public static final class VpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VpcServiceStub> {
    private VpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the VPCs of a project. Requires `vpc.cbws.cloud/Vpc/list` on the
     * project.
     * </pre>
     */
    public void listVpcs(cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVpcsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a VPC. Requires `vpc.cbws.cloud/Vpc/get` on the VPC.
     * </pre>
     */
    public void getVpc(cloud.cbws.api.vpc.v1alpha1.GetVpcRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPC. Requires `vpc.cbws.cloud/Vpc/delete` on the VPC.
     * A VPC that still has private networks cannot be deleted: the call fails
     * with FAILED_PRECONDITION and names them. Delete them first.
     * </pre>
     */
    public void deleteVpc(cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the private networks of a VPC. Requires
     * `vpc.cbws.cloud/PrivateNetwork/list` on the VPC.
     * </pre>
     */
    public void listPrivateNetworks(cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPrivateNetworksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a private network. Requires `vpc.cbws.cloud/PrivateNetwork/get` on
     * the private network.
     * </pre>
     */
    public void getPrivateNetwork(cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPrivateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a private network. Requires
     * `vpc.cbws.cloud/PrivateNetwork/delete` on the private network.
     * </pre>
     */
    public void deletePrivateNetwork(cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePrivateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the subnets of a private network. Requires
     * `vpc.cbws.cloud/Subnet/list` on the private network.
     * </pre>
     */
    public void listSubnets(cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a subnet. Requires `vpc.cbws.cloud/Subnet/get` on the subnet.
     * </pre>
     */
    public void getSubnet(cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubnetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VpcService.
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public static final class VpcServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VpcServiceBlockingV2Stub> {
    private VpcServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VpcServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the VPCs of a project. Requires `vpc.cbws.cloud/Vpc/list` on the
     * project.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse listVpcs(cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListVpcsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a VPC. Requires `vpc.cbws.cloud/Vpc/get` on the VPC.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.Vpc getVpc(cloud.cbws.api.vpc.v1alpha1.GetVpcRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a VPC. Requires `vpc.cbws.cloud/Vpc/delete` on the VPC.
     * A VPC that still has private networks cannot be deleted: the call fails
     * with FAILED_PRECONDITION and names them. Delete them first.
     * </pre>
     */
    public com.google.longrunning.Operation deleteVpc(cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the private networks of a VPC. Requires
     * `vpc.cbws.cloud/PrivateNetwork/list` on the VPC.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse listPrivateNetworks(cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListPrivateNetworksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a private network. Requires `vpc.cbws.cloud/PrivateNetwork/get` on
     * the private network.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.PrivateNetwork getPrivateNetwork(cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPrivateNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a private network. Requires
     * `vpc.cbws.cloud/PrivateNetwork/delete` on the private network.
     * </pre>
     */
    public com.google.longrunning.Operation deletePrivateNetwork(cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeletePrivateNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the subnets of a private network. Requires
     * `vpc.cbws.cloud/Subnet/list` on the private network.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse listSubnets(cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSubnetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a subnet. Requires `vpc.cbws.cloud/Subnet/get` on the subnet.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.Subnet getSubnet(cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSubnetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service VpcService.
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public static final class VpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VpcServiceBlockingStub> {
    private VpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the VPCs of a project. Requires `vpc.cbws.cloud/Vpc/list` on the
     * project.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse listVpcs(cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVpcsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a VPC. Requires `vpc.cbws.cloud/Vpc/get` on the VPC.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.Vpc getVpc(cloud.cbws.api.vpc.v1alpha1.GetVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a VPC. Requires `vpc.cbws.cloud/Vpc/delete` on the VPC.
     * A VPC that still has private networks cannot be deleted: the call fails
     * with FAILED_PRECONDITION and names them. Delete them first.
     * </pre>
     */
    public com.google.longrunning.Operation deleteVpc(cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the private networks of a VPC. Requires
     * `vpc.cbws.cloud/PrivateNetwork/list` on the VPC.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse listPrivateNetworks(cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPrivateNetworksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a private network. Requires `vpc.cbws.cloud/PrivateNetwork/get` on
     * the private network.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.PrivateNetwork getPrivateNetwork(cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPrivateNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a private network. Requires
     * `vpc.cbws.cloud/PrivateNetwork/delete` on the private network.
     * </pre>
     */
    public com.google.longrunning.Operation deletePrivateNetwork(cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePrivateNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the subnets of a private network. Requires
     * `vpc.cbws.cloud/Subnet/list` on the private network.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse listSubnets(cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubnetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a subnet. Requires `vpc.cbws.cloud/Subnet/get` on the subnet.
     * </pre>
     */
    public cloud.cbws.api.vpc.v1alpha1.Subnet getSubnet(cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubnetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VpcService.
   * <pre>
   * Manages VPCs, the private networks and subnets inside them, and ports on
   * those networks.
   * Every call that changes something needs an `Idempotency-Key` request
   * header that holds a UUID. Send the same key again to retry a call safely:
   * the retry returns the operation of the first call instead of repeating the
   * change. A call without the header fails with INVALID_ARGUMENT.
   * Those calls return a `google.longrunning.Operation`. The work is done
   * before the call returns, so the operation is always already done. The
   * operation can be read again from the `google.longrunning.Operations`
   * service on the same host.
   * </pre>
   */
  public static final class VpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VpcServiceFutureStub> {
    private VpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the VPCs of a project. Requires `vpc.cbws.cloud/Vpc/list` on the
     * project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse> listVpcs(
        cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVpcsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a VPC. Requires `vpc.cbws.cloud/Vpc/get` on the VPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.Vpc> getVpc(
        cloud.cbws.api.vpc.v1alpha1.GetVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a VPC. Requires `vpc.cbws.cloud/Vpc/delete` on the VPC.
     * A VPC that still has private networks cannot be deleted: the call fails
     * with FAILED_PRECONDITION and names them. Delete them first.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteVpc(
        cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the private networks of a VPC. Requires
     * `vpc.cbws.cloud/PrivateNetwork/list` on the VPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse> listPrivateNetworks(
        cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPrivateNetworksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a private network. Requires `vpc.cbws.cloud/PrivateNetwork/get` on
     * the private network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.PrivateNetwork> getPrivateNetwork(
        cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPrivateNetworkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a private network. Requires
     * `vpc.cbws.cloud/PrivateNetwork/delete` on the private network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deletePrivateNetwork(
        cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePrivateNetworkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the subnets of a private network. Requires
     * `vpc.cbws.cloud/Subnet/list` on the private network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse> listSubnets(
        cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a subnet. Requires `vpc.cbws.cloud/Subnet/get` on the subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.vpc.v1alpha1.Subnet> getSubnet(
        cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubnetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_VPCS = 0;
  private static final int METHODID_GET_VPC = 1;
  private static final int METHODID_DELETE_VPC = 2;
  private static final int METHODID_LIST_PRIVATE_NETWORKS = 3;
  private static final int METHODID_GET_PRIVATE_NETWORK = 4;
  private static final int METHODID_DELETE_PRIVATE_NETWORK = 5;
  private static final int METHODID_LIST_SUBNETS = 6;
  private static final int METHODID_GET_SUBNET = 7;

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
        case METHODID_LIST_VPCS:
          serviceImpl.listVpcs((cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse>) responseObserver);
          break;
        case METHODID_GET_VPC:
          serviceImpl.getVpc((cloud.cbws.api.vpc.v1alpha1.GetVpcRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Vpc>) responseObserver);
          break;
        case METHODID_DELETE_VPC:
          serviceImpl.deleteVpc((cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_PRIVATE_NETWORKS:
          serviceImpl.listPrivateNetworks((cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse>) responseObserver);
          break;
        case METHODID_GET_PRIVATE_NETWORK:
          serviceImpl.getPrivateNetwork((cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.PrivateNetwork>) responseObserver);
          break;
        case METHODID_DELETE_PRIVATE_NETWORK:
          serviceImpl.deletePrivateNetwork((cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_SUBNETS:
          serviceImpl.listSubnets((cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse>) responseObserver);
          break;
        case METHODID_GET_SUBNET:
          serviceImpl.getSubnet((cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.vpc.v1alpha1.Subnet>) responseObserver);
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
          getListVpcsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.ListVpcsRequest,
              cloud.cbws.api.vpc.v1alpha1.ListVpcsResponse>(
                service, METHODID_LIST_VPCS)))
        .addMethod(
          getGetVpcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.GetVpcRequest,
              cloud.cbws.api.vpc.v1alpha1.Vpc>(
                service, METHODID_GET_VPC)))
        .addMethod(
          getDeleteVpcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.DeleteVpcRequest,
              com.google.longrunning.Operation>(
                service, METHODID_DELETE_VPC)))
        .addMethod(
          getListPrivateNetworksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksRequest,
              cloud.cbws.api.vpc.v1alpha1.ListPrivateNetworksResponse>(
                service, METHODID_LIST_PRIVATE_NETWORKS)))
        .addMethod(
          getGetPrivateNetworkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.GetPrivateNetworkRequest,
              cloud.cbws.api.vpc.v1alpha1.PrivateNetwork>(
                service, METHODID_GET_PRIVATE_NETWORK)))
        .addMethod(
          getDeletePrivateNetworkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.DeletePrivateNetworkRequest,
              com.google.longrunning.Operation>(
                service, METHODID_DELETE_PRIVATE_NETWORK)))
        .addMethod(
          getListSubnetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.ListSubnetsRequest,
              cloud.cbws.api.vpc.v1alpha1.ListSubnetsResponse>(
                service, METHODID_LIST_SUBNETS)))
        .addMethod(
          getGetSubnetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.vpc.v1alpha1.GetSubnetRequest,
              cloud.cbws.api.vpc.v1alpha1.Subnet>(
                service, METHODID_GET_SUBNET)))
        .build();
  }

  private static abstract class VpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.cbws.api.vpc.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VpcService");
    }
  }

  private static final class VpcServiceFileDescriptorSupplier
      extends VpcServiceBaseDescriptorSupplier {
    VpcServiceFileDescriptorSupplier() {}
  }

  private static final class VpcServiceMethodDescriptorSupplier
      extends VpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VpcServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VpcServiceFileDescriptorSupplier())
              .addMethod(getListVpcsMethod())
              .addMethod(getGetVpcMethod())
              .addMethod(getDeleteVpcMethod())
              .addMethod(getListPrivateNetworksMethod())
              .addMethod(getGetPrivateNetworkMethod())
              .addMethod(getDeletePrivateNetworkMethod())
              .addMethod(getListSubnetsMethod())
              .addMethod(getGetSubnetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
