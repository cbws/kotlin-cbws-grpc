package xyz.cbws.virtual_machines.v1alpha1;

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
    comments = "Source: cbws/virtual_machines/v1alpha1/vm.proto")
public final class VirtualMachinesServiceGrpc {

  private VirtualMachinesServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.virtual_machines.v1alpha1.VirtualMachinesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest,
      xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest.class,
      responseType = xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest,
      xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest, xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = VirtualMachinesServiceGrpc.getListInstancesMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getListInstancesMethod = VirtualMachinesServiceGrpc.getListInstancesMethod) == null) {
          VirtualMachinesServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest, xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest,
      xyz.cbws.virtual_machines.v1alpha1.Instance> getGetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest.class,
      responseType = xyz.cbws.virtual_machines.v1alpha1.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest,
      xyz.cbws.virtual_machines.v1alpha1.Instance> getGetInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest, xyz.cbws.virtual_machines.v1alpha1.Instance> getGetInstanceMethod;
    if ((getGetInstanceMethod = VirtualMachinesServiceGrpc.getGetInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getGetInstanceMethod = VirtualMachinesServiceGrpc.getGetInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getGetInstanceMethod = getGetInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest, xyz.cbws.virtual_machines.v1alpha1.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("GetInstance"))
              .build();
        }
      }
    }
    return getGetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest,
      com.google.longrunning.Operation> getCreateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest,
      com.google.longrunning.Operation> getCreateInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest, com.google.longrunning.Operation> getCreateInstanceMethod;
    if ((getCreateInstanceMethod = VirtualMachinesServiceGrpc.getCreateInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getCreateInstanceMethod = VirtualMachinesServiceGrpc.getCreateInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getCreateInstanceMethod = getCreateInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("CreateInstance"))
              .build();
        }
      }
    }
    return getCreateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest,
      com.google.longrunning.Operation> getStopInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest,
      com.google.longrunning.Operation> getStopInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest, com.google.longrunning.Operation> getStopInstanceMethod;
    if ((getStopInstanceMethod = VirtualMachinesServiceGrpc.getStopInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getStopInstanceMethod = VirtualMachinesServiceGrpc.getStopInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getStopInstanceMethod = getStopInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("StopInstance"))
              .build();
        }
      }
    }
    return getStopInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest,
      com.google.longrunning.Operation> getStartInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest,
      com.google.longrunning.Operation> getStartInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest, com.google.longrunning.Operation> getStartInstanceMethod;
    if ((getStartInstanceMethod = VirtualMachinesServiceGrpc.getStartInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getStartInstanceMethod = VirtualMachinesServiceGrpc.getStartInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getStartInstanceMethod = getStartInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("StartInstance"))
              .build();
        }
      }
    }
    return getStartInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest,
      com.google.longrunning.Operation> getResetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest,
      com.google.longrunning.Operation> getResetInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest, com.google.longrunning.Operation> getResetInstanceMethod;
    if ((getResetInstanceMethod = VirtualMachinesServiceGrpc.getResetInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getResetInstanceMethod = VirtualMachinesServiceGrpc.getResetInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getResetInstanceMethod = getResetInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("ResetInstance"))
              .build();
        }
      }
    }
    return getResetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest,
      com.google.longrunning.Operation> getUpdateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest,
      com.google.longrunning.Operation> getUpdateInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest, com.google.longrunning.Operation> getUpdateInstanceMethod;
    if ((getUpdateInstanceMethod = VirtualMachinesServiceGrpc.getUpdateInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getUpdateInstanceMethod = VirtualMachinesServiceGrpc.getUpdateInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getUpdateInstanceMethod = getUpdateInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("UpdateInstance"))
              .build();
        }
      }
    }
    return getUpdateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest,
      com.google.longrunning.Operation> getDeleteInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstance",
      requestType = xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest,
      com.google.longrunning.Operation> getDeleteInstanceMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest, com.google.longrunning.Operation> getDeleteInstanceMethod;
    if ((getDeleteInstanceMethod = VirtualMachinesServiceGrpc.getDeleteInstanceMethod) == null) {
      synchronized (VirtualMachinesServiceGrpc.class) {
        if ((getDeleteInstanceMethod = VirtualMachinesServiceGrpc.getDeleteInstanceMethod) == null) {
          VirtualMachinesServiceGrpc.getDeleteInstanceMethod = getDeleteInstanceMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VirtualMachinesServiceMethodDescriptorSupplier("DeleteInstance"))
              .build();
        }
      }
    }
    return getDeleteInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VirtualMachinesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceStub>() {
        @java.lang.Override
        public VirtualMachinesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirtualMachinesServiceStub(channel, callOptions);
        }
      };
    return VirtualMachinesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VirtualMachinesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceBlockingStub>() {
        @java.lang.Override
        public VirtualMachinesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirtualMachinesServiceBlockingStub(channel, callOptions);
        }
      };
    return VirtualMachinesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VirtualMachinesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirtualMachinesServiceFutureStub>() {
        @java.lang.Override
        public VirtualMachinesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirtualMachinesServiceFutureStub(channel, callOptions);
        }
      };
    return VirtualMachinesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VirtualMachinesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listInstances(xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     */
    public void getInstance(xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInstanceMethod(), responseObserver);
    }

    /**
     */
    public void createInstance(xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInstanceMethod(), responseObserver);
    }

    /**
     */
    public void stopInstance(xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopInstanceMethod(), responseObserver);
    }

    /**
     */
    public void startInstance(xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartInstanceMethod(), responseObserver);
    }

    /**
     */
    public void resetInstance(xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getResetInstanceMethod(), responseObserver);
    }

    /**
     */
    public void updateInstance(xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInstanceMethod(), responseObserver);
    }

    /**
     */
    public void deleteInstance(xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListInstancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest,
                xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getGetInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest,
                xyz.cbws.virtual_machines.v1alpha1.Instance>(
                  this, METHODID_GET_INSTANCE)))
          .addMethod(
            getCreateInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_INSTANCE)))
          .addMethod(
            getStopInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_STOP_INSTANCE)))
          .addMethod(
            getStartInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_START_INSTANCE)))
          .addMethod(
            getResetInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RESET_INSTANCE)))
          .addMethod(
            getUpdateInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_INSTANCE)))
          .addMethod(
            getDeleteInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_INSTANCE)))
          .build();
    }
  }

  /**
   */
  public static final class VirtualMachinesServiceStub extends io.grpc.stub.AbstractAsyncStub<VirtualMachinesServiceStub> {
    private VirtualMachinesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualMachinesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirtualMachinesServiceStub(channel, callOptions);
    }

    /**
     */
    public void listInstances(xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInstance(xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createInstance(xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopInstance(xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startInstance(xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetInstance(xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInstance(xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteInstance(xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VirtualMachinesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VirtualMachinesServiceBlockingStub> {
    private VirtualMachinesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualMachinesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirtualMachinesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse listInstances(xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.virtual_machines.v1alpha1.Instance getInstance(xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation createInstance(xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation stopInstance(xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation startInstance(xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation resetInstance(xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation updateInstance(xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation deleteInstance(xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VirtualMachinesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VirtualMachinesServiceFutureStub> {
    private VirtualMachinesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualMachinesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirtualMachinesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse> listInstances(
        xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.virtual_machines.v1alpha1.Instance> getInstance(
        xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createInstance(
        xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> stopInstance(
        xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> startInstance(
        xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> resetInstance(
        xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateInstance(
        xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteInstance(
        xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_CREATE_INSTANCE = 2;
  private static final int METHODID_STOP_INSTANCE = 3;
  private static final int METHODID_START_INSTANCE = 4;
  private static final int METHODID_RESET_INSTANCE = 5;
  private static final int METHODID_UPDATE_INSTANCE = 6;
  private static final int METHODID_DELETE_INSTANCE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VirtualMachinesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VirtualMachinesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((xyz.cbws.virtual_machines.v1alpha1.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.ListInstancesResponse>) responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance((xyz.cbws.virtual_machines.v1alpha1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.virtual_machines.v1alpha1.Instance>) responseObserver);
          break;
        case METHODID_CREATE_INSTANCE:
          serviceImpl.createInstance((xyz.cbws.virtual_machines.v1alpha1.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_STOP_INSTANCE:
          serviceImpl.stopInstance((xyz.cbws.virtual_machines.v1alpha1.StopInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_START_INSTANCE:
          serviceImpl.startInstance((xyz.cbws.virtual_machines.v1alpha1.StartInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESET_INSTANCE:
          serviceImpl.resetInstance((xyz.cbws.virtual_machines.v1alpha1.ResetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_INSTANCE:
          serviceImpl.updateInstance((xyz.cbws.virtual_machines.v1alpha1.UpdateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance((xyz.cbws.virtual_machines.v1alpha1.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static abstract class VirtualMachinesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VirtualMachinesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return xyz.cbws.virtual_machines.v1alpha1.Vm.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VirtualMachinesService");
    }
  }

  private static final class VirtualMachinesServiceFileDescriptorSupplier
      extends VirtualMachinesServiceBaseDescriptorSupplier {
    VirtualMachinesServiceFileDescriptorSupplier() {}
  }

  private static final class VirtualMachinesServiceMethodDescriptorSupplier
      extends VirtualMachinesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VirtualMachinesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VirtualMachinesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VirtualMachinesServiceFileDescriptorSupplier())
              .addMethod(getListInstancesMethod())
              .addMethod(getGetInstanceMethod())
              .addMethod(getCreateInstanceMethod())
              .addMethod(getStopInstanceMethod())
              .addMethod(getStartInstanceMethod())
              .addMethod(getResetInstanceMethod())
              .addMethod(getUpdateInstanceMethod())
              .addMethod(getDeleteInstanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
