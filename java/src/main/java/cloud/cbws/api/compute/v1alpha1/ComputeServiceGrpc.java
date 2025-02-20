package cloud.cbws.api.compute.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages virtual machines, the machine types they run on and the images they
 * boot from.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ComputeServiceGrpc {

  private ComputeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cbws.compute.v1alpha1.ComputeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachinesRequest,
      cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> getListMachinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMachines",
      requestType = cloud.cbws.api.compute.v1alpha1.ListMachinesRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.ListMachinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachinesRequest,
      cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> getListMachinesMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachinesRequest, cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> getListMachinesMethod;
    if ((getListMachinesMethod = ComputeServiceGrpc.getListMachinesMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getListMachinesMethod = ComputeServiceGrpc.getListMachinesMethod) == null) {
          ComputeServiceGrpc.getListMachinesMethod = getListMachinesMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ListMachinesRequest, cloud.cbws.api.compute.v1alpha1.ListMachinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMachines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListMachinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListMachinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ListMachines"))
              .build();
        }
      }
    }
    return getListMachinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineRequest,
      cloud.cbws.api.compute.v1alpha1.Machine> getGetMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.GetMachineRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.Machine.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineRequest,
      cloud.cbws.api.compute.v1alpha1.Machine> getGetMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineRequest, cloud.cbws.api.compute.v1alpha1.Machine> getGetMachineMethod;
    if ((getGetMachineMethod = ComputeServiceGrpc.getGetMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getGetMachineMethod = ComputeServiceGrpc.getGetMachineMethod) == null) {
          ComputeServiceGrpc.getGetMachineMethod = getGetMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.GetMachineRequest, cloud.cbws.api.compute.v1alpha1.Machine>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.GetMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.Machine.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("GetMachine"))
              .build();
        }
      }
    }
    return getGetMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest,
      cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> getRequestMachineConsoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestMachineConsole",
      requestType = cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest,
      cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> getRequestMachineConsoleMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest, cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> getRequestMachineConsoleMethod;
    if ((getRequestMachineConsoleMethod = ComputeServiceGrpc.getRequestMachineConsoleMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getRequestMachineConsoleMethod = ComputeServiceGrpc.getRequestMachineConsoleMethod) == null) {
          ComputeServiceGrpc.getRequestMachineConsoleMethod = getRequestMachineConsoleMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest, cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestMachineConsole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("RequestMachineConsole"))
              .build();
        }
      }
    }
    return getRequestMachineConsoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.CreateMachineRequest,
      com.google.longrunning.Operation> getCreateMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.CreateMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.CreateMachineRequest,
      com.google.longrunning.Operation> getCreateMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.CreateMachineRequest, com.google.longrunning.Operation> getCreateMachineMethod;
    if ((getCreateMachineMethod = ComputeServiceGrpc.getCreateMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getCreateMachineMethod = ComputeServiceGrpc.getCreateMachineMethod) == null) {
          ComputeServiceGrpc.getCreateMachineMethod = getCreateMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.CreateMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.CreateMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("CreateMachine"))
              .build();
        }
      }
    }
    return getCreateMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StopMachineRequest,
      com.google.longrunning.Operation> getStopMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.StopMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StopMachineRequest,
      com.google.longrunning.Operation> getStopMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StopMachineRequest, com.google.longrunning.Operation> getStopMachineMethod;
    if ((getStopMachineMethod = ComputeServiceGrpc.getStopMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getStopMachineMethod = ComputeServiceGrpc.getStopMachineMethod) == null) {
          ComputeServiceGrpc.getStopMachineMethod = getStopMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.StopMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.StopMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("StopMachine"))
              .build();
        }
      }
    }
    return getStopMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StartMachineRequest,
      com.google.longrunning.Operation> getStartMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.StartMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StartMachineRequest,
      com.google.longrunning.Operation> getStartMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.StartMachineRequest, com.google.longrunning.Operation> getStartMachineMethod;
    if ((getStartMachineMethod = ComputeServiceGrpc.getStartMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getStartMachineMethod = ComputeServiceGrpc.getStartMachineMethod) == null) {
          ComputeServiceGrpc.getStartMachineMethod = getStartMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.StartMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.StartMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("StartMachine"))
              .build();
        }
      }
    }
    return getStartMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResetMachineRequest,
      com.google.longrunning.Operation> getResetMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.ResetMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResetMachineRequest,
      com.google.longrunning.Operation> getResetMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResetMachineRequest, com.google.longrunning.Operation> getResetMachineMethod;
    if ((getResetMachineMethod = ComputeServiceGrpc.getResetMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getResetMachineMethod = ComputeServiceGrpc.getResetMachineMethod) == null) {
          ComputeServiceGrpc.getResetMachineMethod = getResetMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ResetMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ResetMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ResetMachine"))
              .build();
        }
      }
    }
    return getResetMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest,
      com.google.longrunning.Operation> getReinstallMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReinstallMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest,
      com.google.longrunning.Operation> getReinstallMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest, com.google.longrunning.Operation> getReinstallMachineMethod;
    if ((getReinstallMachineMethod = ComputeServiceGrpc.getReinstallMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getReinstallMachineMethod = ComputeServiceGrpc.getReinstallMachineMethod) == null) {
          ComputeServiceGrpc.getReinstallMachineMethod = getReinstallMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReinstallMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ReinstallMachine"))
              .build();
        }
      }
    }
    return getReinstallMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest,
      com.google.longrunning.Operation> getResizeMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResizeMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest,
      com.google.longrunning.Operation> getResizeMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest, com.google.longrunning.Operation> getResizeMachineMethod;
    if ((getResizeMachineMethod = ComputeServiceGrpc.getResizeMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getResizeMachineMethod = ComputeServiceGrpc.getResizeMachineMethod) == null) {
          ComputeServiceGrpc.getResizeMachineMethod = getResizeMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResizeMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ResizeMachine"))
              .build();
        }
      }
    }
    return getResizeMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest,
      com.google.longrunning.Operation> getDeleteMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMachine",
      requestType = cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest,
      com.google.longrunning.Operation> getDeleteMachineMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest, com.google.longrunning.Operation> getDeleteMachineMethod;
    if ((getDeleteMachineMethod = ComputeServiceGrpc.getDeleteMachineMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getDeleteMachineMethod = ComputeServiceGrpc.getDeleteMachineMethod) == null) {
          ComputeServiceGrpc.getDeleteMachineMethod = getDeleteMachineMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("DeleteMachine"))
              .build();
        }
      }
    }
    return getDeleteMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest,
      cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> getListMachineTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMachineTypes",
      requestType = cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest,
      cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> getListMachineTypesMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest, cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> getListMachineTypesMethod;
    if ((getListMachineTypesMethod = ComputeServiceGrpc.getListMachineTypesMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getListMachineTypesMethod = ComputeServiceGrpc.getListMachineTypesMethod) == null) {
          ComputeServiceGrpc.getListMachineTypesMethod = getListMachineTypesMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest, cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMachineTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ListMachineTypes"))
              .build();
        }
      }
    }
    return getListMachineTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest,
      cloud.cbws.api.compute.v1alpha1.MachineType> getGetMachineTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMachineType",
      requestType = cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.MachineType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest,
      cloud.cbws.api.compute.v1alpha1.MachineType> getGetMachineTypeMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest, cloud.cbws.api.compute.v1alpha1.MachineType> getGetMachineTypeMethod;
    if ((getGetMachineTypeMethod = ComputeServiceGrpc.getGetMachineTypeMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getGetMachineTypeMethod = ComputeServiceGrpc.getGetMachineTypeMethod) == null) {
          ComputeServiceGrpc.getGetMachineTypeMethod = getGetMachineTypeMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest, cloud.cbws.api.compute.v1alpha1.MachineType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMachineType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.MachineType.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("GetMachineType"))
              .build();
        }
      }
    }
    return getGetMachineTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListImagesRequest,
      cloud.cbws.api.compute.v1alpha1.ListImagesResponse> getListImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImages",
      requestType = cloud.cbws.api.compute.v1alpha1.ListImagesRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.ListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListImagesRequest,
      cloud.cbws.api.compute.v1alpha1.ListImagesResponse> getListImagesMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.ListImagesRequest, cloud.cbws.api.compute.v1alpha1.ListImagesResponse> getListImagesMethod;
    if ((getListImagesMethod = ComputeServiceGrpc.getListImagesMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getListImagesMethod = ComputeServiceGrpc.getListImagesMethod) == null) {
          ComputeServiceGrpc.getListImagesMethod = getListImagesMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.ListImagesRequest, cloud.cbws.api.compute.v1alpha1.ListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.ListImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("ListImages"))
              .build();
        }
      }
    }
    return getListImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetImageRequest,
      cloud.cbws.api.compute.v1alpha1.Image> getGetImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImage",
      requestType = cloud.cbws.api.compute.v1alpha1.GetImageRequest.class,
      responseType = cloud.cbws.api.compute.v1alpha1.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetImageRequest,
      cloud.cbws.api.compute.v1alpha1.Image> getGetImageMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.compute.v1alpha1.GetImageRequest, cloud.cbws.api.compute.v1alpha1.Image> getGetImageMethod;
    if ((getGetImageMethod = ComputeServiceGrpc.getGetImageMethod) == null) {
      synchronized (ComputeServiceGrpc.class) {
        if ((getGetImageMethod = ComputeServiceGrpc.getGetImageMethod) == null) {
          ComputeServiceGrpc.getGetImageMethod = getGetImageMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.compute.v1alpha1.GetImageRequest, cloud.cbws.api.compute.v1alpha1.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.compute.v1alpha1.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeServiceMethodDescriptorSupplier("GetImage"))
              .build();
        }
      }
    }
    return getGetImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeServiceStub>() {
        @java.lang.Override
        public ComputeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeServiceStub(channel, callOptions);
        }
      };
    return ComputeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ComputeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeServiceBlockingV2Stub>() {
        @java.lang.Override
        public ComputeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ComputeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeServiceBlockingStub>() {
        @java.lang.Override
        public ComputeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeServiceBlockingStub(channel, callOptions);
        }
      };
    return ComputeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeServiceFutureStub>() {
        @java.lang.Override
        public ComputeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeServiceFutureStub(channel, callOptions);
        }
      };
    return ComputeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the machines in a project.
     * </pre>
     */
    default void listMachines(cloud.cbws.api.compute.v1alpha1.ListMachinesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMachinesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a machine.
     * </pre>
     */
    default void getMachine(cloud.cbws.api.compute.v1alpha1.GetMachineRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Machine> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a URL that opens the console of a running machine in a browser.
     * A stopped machine has no console.
     * </pre>
     */
    default void requestMachineConsole(cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMachineConsoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a machine and starts it.
     * </pre>
     */
    default void createMachine(cloud.cbws.api.compute.v1alpha1.CreateMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops a machine. The machine keeps its disk and can be started again.
     * </pre>
     */
    default void stopMachine(cloud.cbws.api.compute.v1alpha1.StopMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts a stopped machine.
     * </pre>
     */
    default void startMachine(cloud.cbws.api.compute.v1alpha1.StartMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Power-cycles a machine, like pressing its reset button. The operating
     * system is not shut down first.
     * </pre>
     */
    default void resetMachine(cloud.cbws.api.compute.v1alpha1.ResetMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replaces the operating system on a machine with a new image. The data on
     * the machine's disk is lost.
     * </pre>
     */
    default void reinstallMachine(cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReinstallMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes a machine to another machine type in the same zone. The machine
     * is turned off and on again.
     * </pre>
     */
    default void resizeMachine(cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResizeMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a machine and its disk.
     * </pre>
     */
    default void deleteMachine(cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the machine types offered in a zone, or in every zone.
     * </pre>
     */
    default void listMachineTypes(cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMachineTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a machine type.
     * </pre>
     */
    default void getMachineType(cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.MachineType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMachineTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the images in a project.
     * </pre>
     */
    default void listImages(cloud.cbws.api.compute.v1alpha1.ListImagesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an image.
     * </pre>
     */
    default void getImage(cloud.cbws.api.compute.v1alpha1.GetImageRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComputeService.
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public static abstract class ComputeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComputeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComputeService.
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public static final class ComputeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ComputeServiceStub> {
    private ComputeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the machines in a project.
     * </pre>
     */
    public void listMachines(cloud.cbws.api.compute.v1alpha1.ListMachinesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMachinesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a machine.
     * </pre>
     */
    public void getMachine(cloud.cbws.api.compute.v1alpha1.GetMachineRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Machine> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a URL that opens the console of a running machine in a browser.
     * A stopped machine has no console.
     * </pre>
     */
    public void requestMachineConsole(cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMachineConsoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a machine and starts it.
     * </pre>
     */
    public void createMachine(cloud.cbws.api.compute.v1alpha1.CreateMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops a machine. The machine keeps its disk and can be started again.
     * </pre>
     */
    public void stopMachine(cloud.cbws.api.compute.v1alpha1.StopMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a stopped machine.
     * </pre>
     */
    public void startMachine(cloud.cbws.api.compute.v1alpha1.StartMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Power-cycles a machine, like pressing its reset button. The operating
     * system is not shut down first.
     * </pre>
     */
    public void resetMachine(cloud.cbws.api.compute.v1alpha1.ResetMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replaces the operating system on a machine with a new image. The data on
     * the machine's disk is lost.
     * </pre>
     */
    public void reinstallMachine(cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReinstallMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes a machine to another machine type in the same zone. The machine
     * is turned off and on again.
     * </pre>
     */
    public void resizeMachine(cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResizeMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a machine and its disk.
     * </pre>
     */
    public void deleteMachine(cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the machine types offered in a zone, or in every zone.
     * </pre>
     */
    public void listMachineTypes(cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMachineTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a machine type.
     * </pre>
     */
    public void getMachineType(cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.MachineType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMachineTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the images in a project.
     * </pre>
     */
    public void listImages(cloud.cbws.api.compute.v1alpha1.ListImagesRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an image.
     * </pre>
     */
    public void getImage(cloud.cbws.api.compute.v1alpha1.GetImageRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComputeService.
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public static final class ComputeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ComputeServiceBlockingV2Stub> {
    private ComputeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the machines in a project.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListMachinesResponse listMachines(cloud.cbws.api.compute.v1alpha1.ListMachinesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListMachinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a machine.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.Machine getMachine(cloud.cbws.api.compute.v1alpha1.GetMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a URL that opens the console of a running machine in a browser.
     * A stopped machine has no console.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse requestMachineConsole(cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRequestMachineConsoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a machine and starts it.
     * </pre>
     */
    public com.google.longrunning.Operation createMachine(cloud.cbws.api.compute.v1alpha1.CreateMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops a machine. The machine keeps its disk and can be started again.
     * </pre>
     */
    public com.google.longrunning.Operation stopMachine(cloud.cbws.api.compute.v1alpha1.StopMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStopMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a stopped machine.
     * </pre>
     */
    public com.google.longrunning.Operation startMachine(cloud.cbws.api.compute.v1alpha1.StartMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStartMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Power-cycles a machine, like pressing its reset button. The operating
     * system is not shut down first.
     * </pre>
     */
    public com.google.longrunning.Operation resetMachine(cloud.cbws.api.compute.v1alpha1.ResetMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResetMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the operating system on a machine with a new image. The data on
     * the machine's disk is lost.
     * </pre>
     */
    public com.google.longrunning.Operation reinstallMachine(cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReinstallMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes a machine to another machine type in the same zone. The machine
     * is turned off and on again.
     * </pre>
     */
    public com.google.longrunning.Operation resizeMachine(cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResizeMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a machine and its disk.
     * </pre>
     */
    public com.google.longrunning.Operation deleteMachine(cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the machine types offered in a zone, or in every zone.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse listMachineTypes(cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListMachineTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a machine type.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.MachineType getMachineType(cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMachineTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the images in a project.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListImagesResponse listImages(cloud.cbws.api.compute.v1alpha1.ListImagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an image.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.Image getImage(cloud.cbws.api.compute.v1alpha1.GetImageRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ComputeService.
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public static final class ComputeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComputeServiceBlockingStub> {
    private ComputeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the machines in a project.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListMachinesResponse listMachines(cloud.cbws.api.compute.v1alpha1.ListMachinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMachinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a machine.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.Machine getMachine(cloud.cbws.api.compute.v1alpha1.GetMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a URL that opens the console of a running machine in a browser.
     * A stopped machine has no console.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse requestMachineConsole(cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMachineConsoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a machine and starts it.
     * </pre>
     */
    public com.google.longrunning.Operation createMachine(cloud.cbws.api.compute.v1alpha1.CreateMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops a machine. The machine keeps its disk and can be started again.
     * </pre>
     */
    public com.google.longrunning.Operation stopMachine(cloud.cbws.api.compute.v1alpha1.StopMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a stopped machine.
     * </pre>
     */
    public com.google.longrunning.Operation startMachine(cloud.cbws.api.compute.v1alpha1.StartMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Power-cycles a machine, like pressing its reset button. The operating
     * system is not shut down first.
     * </pre>
     */
    public com.google.longrunning.Operation resetMachine(cloud.cbws.api.compute.v1alpha1.ResetMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the operating system on a machine with a new image. The data on
     * the machine's disk is lost.
     * </pre>
     */
    public com.google.longrunning.Operation reinstallMachine(cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReinstallMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes a machine to another machine type in the same zone. The machine
     * is turned off and on again.
     * </pre>
     */
    public com.google.longrunning.Operation resizeMachine(cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResizeMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a machine and its disk.
     * </pre>
     */
    public com.google.longrunning.Operation deleteMachine(cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the machine types offered in a zone, or in every zone.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse listMachineTypes(cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMachineTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a machine type.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.MachineType getMachineType(cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMachineTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the images in a project.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.ListImagesResponse listImages(cloud.cbws.api.compute.v1alpha1.ListImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an image.
     * </pre>
     */
    public cloud.cbws.api.compute.v1alpha1.Image getImage(cloud.cbws.api.compute.v1alpha1.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComputeService.
   * <pre>
   * Manages virtual machines, the machine types they run on and the images they
   * boot from.
   * </pre>
   */
  public static final class ComputeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComputeServiceFutureStub> {
    private ComputeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the machines in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.ListMachinesResponse> listMachines(
        cloud.cbws.api.compute.v1alpha1.ListMachinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMachinesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.Machine> getMachine(
        cloud.cbws.api.compute.v1alpha1.GetMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a URL that opens the console of a running machine in a browser.
     * A stopped machine has no console.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse> requestMachineConsole(
        cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMachineConsoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a machine and starts it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createMachine(
        cloud.cbws.api.compute.v1alpha1.CreateMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops a machine. The machine keeps its disk and can be started again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> stopMachine(
        cloud.cbws.api.compute.v1alpha1.StopMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a stopped machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> startMachine(
        cloud.cbws.api.compute.v1alpha1.StartMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Power-cycles a machine, like pressing its reset button. The operating
     * system is not shut down first.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> resetMachine(
        cloud.cbws.api.compute.v1alpha1.ResetMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replaces the operating system on a machine with a new image. The data on
     * the machine's disk is lost.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> reinstallMachine(
        cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReinstallMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes a machine to another machine type in the same zone. The machine
     * is turned off and on again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> resizeMachine(
        cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResizeMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a machine and its disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteMachine(
        cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the machine types offered in a zone, or in every zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse> listMachineTypes(
        cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMachineTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a machine type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.MachineType> getMachineType(
        cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMachineTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the images in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.ListImagesResponse> listImages(
        cloud.cbws.api.compute.v1alpha1.ListImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.compute.v1alpha1.Image> getImage(
        cloud.cbws.api.compute.v1alpha1.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MACHINES = 0;
  private static final int METHODID_GET_MACHINE = 1;
  private static final int METHODID_REQUEST_MACHINE_CONSOLE = 2;
  private static final int METHODID_CREATE_MACHINE = 3;
  private static final int METHODID_STOP_MACHINE = 4;
  private static final int METHODID_START_MACHINE = 5;
  private static final int METHODID_RESET_MACHINE = 6;
  private static final int METHODID_REINSTALL_MACHINE = 7;
  private static final int METHODID_RESIZE_MACHINE = 8;
  private static final int METHODID_DELETE_MACHINE = 9;
  private static final int METHODID_LIST_MACHINE_TYPES = 10;
  private static final int METHODID_GET_MACHINE_TYPE = 11;
  private static final int METHODID_LIST_IMAGES = 12;
  private static final int METHODID_GET_IMAGE = 13;

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
        case METHODID_LIST_MACHINES:
          serviceImpl.listMachines((cloud.cbws.api.compute.v1alpha1.ListMachinesRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachinesResponse>) responseObserver);
          break;
        case METHODID_GET_MACHINE:
          serviceImpl.getMachine((cloud.cbws.api.compute.v1alpha1.GetMachineRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Machine>) responseObserver);
          break;
        case METHODID_REQUEST_MACHINE_CONSOLE:
          serviceImpl.requestMachineConsole((cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse>) responseObserver);
          break;
        case METHODID_CREATE_MACHINE:
          serviceImpl.createMachine((cloud.cbws.api.compute.v1alpha1.CreateMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_STOP_MACHINE:
          serviceImpl.stopMachine((cloud.cbws.api.compute.v1alpha1.StopMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_START_MACHINE:
          serviceImpl.startMachine((cloud.cbws.api.compute.v1alpha1.StartMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESET_MACHINE:
          serviceImpl.resetMachine((cloud.cbws.api.compute.v1alpha1.ResetMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_REINSTALL_MACHINE:
          serviceImpl.reinstallMachine((cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESIZE_MACHINE:
          serviceImpl.resizeMachine((cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_MACHINE:
          serviceImpl.deleteMachine((cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_MACHINE_TYPES:
          serviceImpl.listMachineTypes((cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse>) responseObserver);
          break;
        case METHODID_GET_MACHINE_TYPE:
          serviceImpl.getMachineType((cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.MachineType>) responseObserver);
          break;
        case METHODID_LIST_IMAGES:
          serviceImpl.listImages((cloud.cbws.api.compute.v1alpha1.ListImagesRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.ListImagesResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE:
          serviceImpl.getImage((cloud.cbws.api.compute.v1alpha1.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.compute.v1alpha1.Image>) responseObserver);
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
          getListMachinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ListMachinesRequest,
              cloud.cbws.api.compute.v1alpha1.ListMachinesResponse>(
                service, METHODID_LIST_MACHINES)))
        .addMethod(
          getGetMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.GetMachineRequest,
              cloud.cbws.api.compute.v1alpha1.Machine>(
                service, METHODID_GET_MACHINE)))
        .addMethod(
          getRequestMachineConsoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleRequest,
              cloud.cbws.api.compute.v1alpha1.RequestMachineConsoleResponse>(
                service, METHODID_REQUEST_MACHINE_CONSOLE)))
        .addMethod(
          getCreateMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.CreateMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_CREATE_MACHINE)))
        .addMethod(
          getStopMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.StopMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_STOP_MACHINE)))
        .addMethod(
          getStartMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.StartMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_START_MACHINE)))
        .addMethod(
          getResetMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ResetMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_RESET_MACHINE)))
        .addMethod(
          getReinstallMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ReinstallMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_REINSTALL_MACHINE)))
        .addMethod(
          getResizeMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ResizeMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_RESIZE_MACHINE)))
        .addMethod(
          getDeleteMachineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.DeleteMachineRequest,
              com.google.longrunning.Operation>(
                service, METHODID_DELETE_MACHINE)))
        .addMethod(
          getListMachineTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ListMachineTypesRequest,
              cloud.cbws.api.compute.v1alpha1.ListMachineTypesResponse>(
                service, METHODID_LIST_MACHINE_TYPES)))
        .addMethod(
          getGetMachineTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.GetMachineTypeRequest,
              cloud.cbws.api.compute.v1alpha1.MachineType>(
                service, METHODID_GET_MACHINE_TYPE)))
        .addMethod(
          getListImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.ListImagesRequest,
              cloud.cbws.api.compute.v1alpha1.ListImagesResponse>(
                service, METHODID_LIST_IMAGES)))
        .addMethod(
          getGetImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.compute.v1alpha1.GetImageRequest,
              cloud.cbws.api.compute.v1alpha1.Image>(
                service, METHODID_GET_IMAGE)))
        .build();
  }

  private static abstract class ComputeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.cbws.api.compute.v1alpha1.ComputeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputeService");
    }
  }

  private static final class ComputeServiceFileDescriptorSupplier
      extends ComputeServiceBaseDescriptorSupplier {
    ComputeServiceFileDescriptorSupplier() {}
  }

  private static final class ComputeServiceMethodDescriptorSupplier
      extends ComputeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ComputeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ComputeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputeServiceFileDescriptorSupplier())
              .addMethod(getListMachinesMethod())
              .addMethod(getGetMachineMethod())
              .addMethod(getRequestMachineConsoleMethod())
              .addMethod(getCreateMachineMethod())
              .addMethod(getStopMachineMethod())
              .addMethod(getStartMachineMethod())
              .addMethod(getResetMachineMethod())
              .addMethod(getReinstallMachineMethod())
              .addMethod(getResizeMachineMethod())
              .addMethod(getDeleteMachineMethod())
              .addMethod(getListMachineTypesMethod())
              .addMethod(getGetMachineTypeMethod())
              .addMethod(getListImagesMethod())
              .addMethod(getGetImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
