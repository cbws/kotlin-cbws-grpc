package cbws.vpn.v1alpha1;

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
    comments = "Source: cbws/vpn/v1alpha1/vpn.proto")
public final class VPNServiceGrpc {

  private VPNServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.vpn.v1alpha1.VPNService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListInstancesRequest,
      cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = cbws.vpn.v1alpha1.Vpn.ListInstancesRequest.class,
      responseType = cbws.vpn.v1alpha1.Vpn.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListInstancesRequest,
      cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListInstancesRequest, cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = VPNServiceGrpc.getListInstancesMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getListInstancesMethod = VPNServiceGrpc.getListInstancesMethod) == null) {
          VPNServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.ListInstancesRequest, cbws.vpn.v1alpha1.Vpn.ListInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.ListInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getGetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstance",
      requestType = cbws.vpn.v1alpha1.Vpn.GetInstanceRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getGetInstanceMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getGetInstanceMethod;
    if ((getGetInstanceMethod = VPNServiceGrpc.getGetInstanceMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getGetInstanceMethod = VPNServiceGrpc.getGetInstanceMethod) == null) {
          VPNServiceGrpc.getGetInstanceMethod = getGetInstanceMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.GetInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.GetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("GetInstance"))
              .build();
        }
      }
    }
    return getGetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getCreateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstance",
      requestType = cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getCreateInstanceMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getCreateInstanceMethod;
    if ((getCreateInstanceMethod = VPNServiceGrpc.getCreateInstanceMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getCreateInstanceMethod = VPNServiceGrpc.getCreateInstanceMethod) == null) {
          VPNServiceGrpc.getCreateInstanceMethod = getCreateInstanceMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("CreateInstance"))
              .build();
        }
      }
    }
    return getCreateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getUpdateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstance",
      requestType = cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getUpdateInstanceMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getUpdateInstanceMethod;
    if ((getUpdateInstanceMethod = VPNServiceGrpc.getUpdateInstanceMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getUpdateInstanceMethod = VPNServiceGrpc.getUpdateInstanceMethod) == null) {
          VPNServiceGrpc.getUpdateInstanceMethod = getUpdateInstanceMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("UpdateInstance"))
              .build();
        }
      }
    }
    return getUpdateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest,
      com.google.protobuf.Empty> getDeleteInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstance",
      requestType = cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest,
      com.google.protobuf.Empty> getDeleteInstanceMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest, com.google.protobuf.Empty> getDeleteInstanceMethod;
    if ((getDeleteInstanceMethod = VPNServiceGrpc.getDeleteInstanceMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getDeleteInstanceMethod = VPNServiceGrpc.getDeleteInstanceMethod) == null) {
          VPNServiceGrpc.getDeleteInstanceMethod = getDeleteInstanceMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("DeleteInstance"))
              .build();
        }
      }
    }
    return getDeleteInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListProfilesRequest,
      cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> getListProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProfiles",
      requestType = cbws.vpn.v1alpha1.Vpn.ListProfilesRequest.class,
      responseType = cbws.vpn.v1alpha1.Vpn.ListProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListProfilesRequest,
      cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> getListProfilesMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.ListProfilesRequest, cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> getListProfilesMethod;
    if ((getListProfilesMethod = VPNServiceGrpc.getListProfilesMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getListProfilesMethod = VPNServiceGrpc.getListProfilesMethod) == null) {
          VPNServiceGrpc.getListProfilesMethod = getListProfilesMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.ListProfilesRequest, cbws.vpn.v1alpha1.Vpn.ListProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.ListProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.ListProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("ListProfiles"))
              .build();
        }
      }
    }
    return getListProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = cbws.vpn.v1alpha1.Vpn.GetProfileRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Profile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getGetProfileMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.GetProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getGetProfileMethod;
    if ((getGetProfileMethod = VPNServiceGrpc.getGetProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getGetProfileMethod = VPNServiceGrpc.getGetProfileMethod) == null) {
          VPNServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.GetProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.GetProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Profile.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("GetProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfile",
      requestType = cbws.vpn.v1alpha1.Vpn.CreateProfileRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Profile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.CreateProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getCreateProfileMethod;
    if ((getCreateProfileMethod = VPNServiceGrpc.getCreateProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getCreateProfileMethod = VPNServiceGrpc.getCreateProfileMethod) == null) {
          VPNServiceGrpc.getCreateProfileMethod = getCreateProfileMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.CreateProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.CreateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Profile.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("CreateProfile"))
              .build();
        }
      }
    }
    return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest.class,
      responseType = cbws.vpn.v1alpha1.InstanceOuterClass.Profile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest,
      cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = VPNServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getUpdateProfileMethod = VPNServiceGrpc.getUpdateProfileMethod) == null) {
          VPNServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest, cbws.vpn.v1alpha1.InstanceOuterClass.Profile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.InstanceOuterClass.Profile.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("UpdateProfile"))
              .build();
        }
      }
    }
    return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest,
      com.google.protobuf.Empty> getDeleteProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProfile",
      requestType = cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest,
      com.google.protobuf.Empty> getDeleteProfileMethod() {
    io.grpc.MethodDescriptor<cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest, com.google.protobuf.Empty> getDeleteProfileMethod;
    if ((getDeleteProfileMethod = VPNServiceGrpc.getDeleteProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getDeleteProfileMethod = VPNServiceGrpc.getDeleteProfileMethod) == null) {
          VPNServiceGrpc.getDeleteProfileMethod = getDeleteProfileMethod =
              io.grpc.MethodDescriptor.<cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new VPNServiceMethodDescriptorSupplier("DeleteProfile"))
              .build();
        }
      }
    }
    return getDeleteProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VPNServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceStub>() {
        @java.lang.Override
        public VPNServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceStub(channel, callOptions);
        }
      };
    return VPNServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VPNServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceBlockingStub>() {
        @java.lang.Override
        public VPNServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceBlockingStub(channel, callOptions);
        }
      };
    return VPNServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VPNServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceFutureStub>() {
        @java.lang.Override
        public VPNServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceFutureStub(channel, callOptions);
        }
      };
    return VPNServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VPNServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listInstances(cbws.vpn.v1alpha1.Vpn.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     */
    public void getInstance(cbws.vpn.v1alpha1.Vpn.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInstanceMethod(), responseObserver);
    }

    /**
     */
    public void createInstance(cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInstanceMethod(), responseObserver);
    }

    /**
     */
    public void updateInstance(cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInstanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPN instance
     * </pre>
     */
    public void deleteInstance(cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInstanceMethod(), responseObserver);
    }

    /**
     */
    public void listProfiles(cbws.vpn.v1alpha1.Vpn.ListProfilesRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProfilesMethod(), responseObserver);
    }

    /**
     */
    public void getProfile(cbws.vpn.v1alpha1.Vpn.GetProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(cbws.vpn.v1alpha1.Vpn.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPN profile.
     * </pre>
     */
    public void deleteProfile(cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListInstancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.ListInstancesRequest,
                cbws.vpn.v1alpha1.Vpn.ListInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getGetInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.GetInstanceRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Instance>(
                  this, METHODID_GET_INSTANCE)))
          .addMethod(
            getCreateInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Instance>(
                  this, METHODID_CREATE_INSTANCE)))
          .addMethod(
            getUpdateInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Instance>(
                  this, METHODID_UPDATE_INSTANCE)))
          .addMethod(
            getDeleteInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INSTANCE)))
          .addMethod(
            getListProfilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.ListProfilesRequest,
                cbws.vpn.v1alpha1.Vpn.ListProfilesResponse>(
                  this, METHODID_LIST_PROFILES)))
          .addMethod(
            getGetProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.GetProfileRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Profile>(
                  this, METHODID_GET_PROFILE)))
          .addMethod(
            getCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.CreateProfileRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Profile>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest,
                cbws.vpn.v1alpha1.InstanceOuterClass.Profile>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getDeleteProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class VPNServiceStub extends io.grpc.stub.AbstractAsyncStub<VPNServiceStub> {
    private VPNServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceStub(channel, callOptions);
    }

    /**
     */
    public void listInstances(cbws.vpn.v1alpha1.Vpn.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInstance(cbws.vpn.v1alpha1.Vpn.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createInstance(cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInstance(cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPN instance
     * </pre>
     */
    public void deleteInstance(cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProfiles(cbws.vpn.v1alpha1.Vpn.ListProfilesRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfile(cbws.vpn.v1alpha1.Vpn.GetProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(cbws.vpn.v1alpha1.Vpn.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a VPN profile.
     * </pre>
     */
    public void deleteProfile(cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VPNServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VPNServiceBlockingStub> {
    private VPNServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cbws.vpn.v1alpha1.Vpn.ListInstancesResponse listInstances(cbws.vpn.v1alpha1.Vpn.ListInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Instance getInstance(cbws.vpn.v1alpha1.Vpn.GetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Instance createInstance(cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Instance updateInstance(cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInstanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a VPN instance
     * </pre>
     */
    public com.google.protobuf.Empty deleteInstance(cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.Vpn.ListProfilesResponse listProfiles(cbws.vpn.v1alpha1.Vpn.ListProfilesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Profile getProfile(cbws.vpn.v1alpha1.Vpn.GetProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Profile createProfile(cbws.vpn.v1alpha1.Vpn.CreateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbws.vpn.v1alpha1.InstanceOuterClass.Profile updateProfile(cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a VPN profile.
     * </pre>
     */
    public com.google.protobuf.Empty deleteProfile(cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VPNServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VPNServiceFutureStub> {
    private VPNServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.Vpn.ListInstancesResponse> listInstances(
        cbws.vpn.v1alpha1.Vpn.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> getInstance(
        cbws.vpn.v1alpha1.Vpn.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> createInstance(
        cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Instance> updateInstance(
        cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a VPN instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInstance(
        cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.Vpn.ListProfilesResponse> listProfiles(
        cbws.vpn.v1alpha1.Vpn.ListProfilesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> getProfile(
        cbws.vpn.v1alpha1.Vpn.GetProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> createProfile(
        cbws.vpn.v1alpha1.Vpn.CreateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.vpn.v1alpha1.InstanceOuterClass.Profile> updateProfile(
        cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a VPN profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProfile(
        cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_CREATE_INSTANCE = 2;
  private static final int METHODID_UPDATE_INSTANCE = 3;
  private static final int METHODID_DELETE_INSTANCE = 4;
  private static final int METHODID_LIST_PROFILES = 5;
  private static final int METHODID_GET_PROFILE = 6;
  private static final int METHODID_CREATE_PROFILE = 7;
  private static final int METHODID_UPDATE_PROFILE = 8;
  private static final int METHODID_DELETE_PROFILE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VPNServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VPNServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((cbws.vpn.v1alpha1.Vpn.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListInstancesResponse>) responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance((cbws.vpn.v1alpha1.Vpn.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance>) responseObserver);
          break;
        case METHODID_CREATE_INSTANCE:
          serviceImpl.createInstance((cbws.vpn.v1alpha1.Vpn.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance>) responseObserver);
          break;
        case METHODID_UPDATE_INSTANCE:
          serviceImpl.updateInstance((cbws.vpn.v1alpha1.Vpn.UpdateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Instance>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance((cbws.vpn.v1alpha1.Vpn.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_PROFILES:
          serviceImpl.listProfiles((cbws.vpn.v1alpha1.Vpn.ListProfilesRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.Vpn.ListProfilesResponse>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((cbws.vpn.v1alpha1.Vpn.GetProfileRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((cbws.vpn.v1alpha1.Vpn.CreateProfileRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((cbws.vpn.v1alpha1.Vpn.UpdateProfileRequest) request,
              (io.grpc.stub.StreamObserver<cbws.vpn.v1alpha1.InstanceOuterClass.Profile>) responseObserver);
          break;
        case METHODID_DELETE_PROFILE:
          serviceImpl.deleteProfile((cbws.vpn.v1alpha1.Vpn.DeleteProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class VPNServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VPNServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.vpn.v1alpha1.Vpn.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VPNService");
    }
  }

  private static final class VPNServiceFileDescriptorSupplier
      extends VPNServiceBaseDescriptorSupplier {
    VPNServiceFileDescriptorSupplier() {}
  }

  private static final class VPNServiceMethodDescriptorSupplier
      extends VPNServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VPNServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VPNServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VPNServiceFileDescriptorSupplier())
              .addMethod(getListInstancesMethod())
              .addMethod(getGetInstanceMethod())
              .addMethod(getCreateInstanceMethod())
              .addMethod(getUpdateInstanceMethod())
              .addMethod(getDeleteInstanceMethod())
              .addMethod(getListProfilesMethod())
              .addMethod(getGetProfileMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getDeleteProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
