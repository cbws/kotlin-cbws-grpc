package cbws.service_management.service_control.v1alpha1;

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
    comments = "Source: cbws/service_management/service_control/v1alpha1/service_control.proto")
public final class ServiceControlServiceGrpc {

  private ServiceControlServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.service_management.service_control.v1alpha1.ServiceControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest,
      cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest.class,
      responseType = cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest,
      cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest, cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> getCheckMethod;
    if ((getCheckMethod = ServiceControlServiceGrpc.getCheckMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getCheckMethod = ServiceControlServiceGrpc.getCheckMethod) == null) {
          ServiceControlServiceGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest, cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest,
      cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> getReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Report",
      requestType = cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest.class,
      responseType = cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest,
      cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> getReportMethod() {
    io.grpc.MethodDescriptor<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest, cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> getReportMethod;
    if ((getReportMethod = ServiceControlServiceGrpc.getReportMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getReportMethod = ServiceControlServiceGrpc.getReportMethod) == null) {
          ServiceControlServiceGrpc.getReportMethod = getReportMethod =
              io.grpc.MethodDescriptor.<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest, cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Report"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Report"))
              .build();
        }
      }
    }
    return getReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceStub>() {
        @java.lang.Override
        public ServiceControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceStub(channel, callOptions);
        }
      };
    return ServiceControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceBlockingStub>() {
        @java.lang.Override
        public ServiceControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceFutureStub>() {
        @java.lang.Override
        public ServiceControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServiceControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Checks an operation with Google Service Control to decide whether
     * the given operation should proceed. It should be called before the
     * operation is executed.
     * If feasible, the client should cache the check results and reuse them for
     * 60 seconds. In case of server errors, the client can rely on the cached
     * results for longer time.
     * NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the
     * size limit of 64KB.
     * This method requires the `servicemanagement.services.check` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public void check(cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reports operation results to Google Service Control, such as logs and
     * metrics. It should be called after an operation is completed.
     * If feasible, the client should aggregate reporting data for up to 5
     * seconds to reduce API traffic. Limiting aggregation to 5 seconds is to
     * reduce data loss during client crashes. Clients should carefully choose
     * the aggregation time window to avoid data loss risk more than 0.01%
     * for business and compliance reasons.
     * NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has
     * the size limit of 1MB.
     * This method requires the `servicemanagement.services.report` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public void report(cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest,
                cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest,
                cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse>(
                  this, METHODID_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceControlServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceControlServiceStub> {
    private ServiceControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks an operation with Google Service Control to decide whether
     * the given operation should proceed. It should be called before the
     * operation is executed.
     * If feasible, the client should cache the check results and reuse them for
     * 60 seconds. In case of server errors, the client can rely on the cached
     * results for longer time.
     * NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the
     * size limit of 64KB.
     * This method requires the `servicemanagement.services.check` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public void check(cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reports operation results to Google Service Control, such as logs and
     * metrics. It should be called after an operation is completed.
     * If feasible, the client should aggregate reporting data for up to 5
     * seconds to reduce API traffic. Limiting aggregation to 5 seconds is to
     * reduce data loss during client crashes. Clients should carefully choose
     * the aggregation time window to avoid data loss risk more than 0.01%
     * for business and compliance reasons.
     * NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has
     * the size limit of 1MB.
     * This method requires the `servicemanagement.services.report` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public void report(cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest request,
        io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceControlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceControlServiceBlockingStub> {
    private ServiceControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks an operation with Google Service Control to decide whether
     * the given operation should proceed. It should be called before the
     * operation is executed.
     * If feasible, the client should cache the check results and reuse them for
     * 60 seconds. In case of server errors, the client can rely on the cached
     * results for longer time.
     * NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the
     * size limit of 64KB.
     * This method requires the `servicemanagement.services.check` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse check(cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reports operation results to Google Service Control, such as logs and
     * metrics. It should be called after an operation is completed.
     * If feasible, the client should aggregate reporting data for up to 5
     * seconds to reduce API traffic. Limiting aggregation to 5 seconds is to
     * reduce data loss during client crashes. Clients should carefully choose
     * the aggregation time window to avoid data loss risk more than 0.01%
     * for business and compliance reasons.
     * NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has
     * the size limit of 1MB.
     * This method requires the `servicemanagement.services.report` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse report(cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceControlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceControlServiceFutureStub> {
    private ServiceControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks an operation with Google Service Control to decide whether
     * the given operation should proceed. It should be called before the
     * operation is executed.
     * If feasible, the client should cache the check results and reuse them for
     * 60 seconds. In case of server errors, the client can rely on the cached
     * results for longer time.
     * NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the
     * size limit of 64KB.
     * This method requires the `servicemanagement.services.check` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse> check(
        cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reports operation results to Google Service Control, such as logs and
     * metrics. It should be called after an operation is completed.
     * If feasible, the client should aggregate reporting data for up to 5
     * seconds to reduce API traffic. Limiting aggregation to 5 seconds is to
     * reduce data loss during client crashes. Clients should carefully choose
     * the aggregation time window to avoid data loss risk more than 0.01%
     * for business and compliance reasons.
     * NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has
     * the size limit of 1MB.
     * This method requires the `servicemanagement.services.report` permission
     * on the specified service. For more information, see
     * [Google Cloud IAM](https://cloud.google.com/iam).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse> report(
        cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_REPORT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((cbws.service_management.service_control.v1alpha1.ServiceControl.CheckRequest) request,
              (io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.CheckResponse>) responseObserver);
          break;
        case METHODID_REPORT:
          serviceImpl.report((cbws.service_management.service_control.v1alpha1.ServiceControl.ReportRequest) request,
              (io.grpc.stub.StreamObserver<cbws.service_management.service_control.v1alpha1.ServiceControl.ReportResponse>) responseObserver);
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

  private static abstract class ServiceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbws.service_management.service_control.v1alpha1.ServiceControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceControlService");
    }
  }

  private static final class ServiceControlServiceFileDescriptorSupplier
      extends ServiceControlServiceBaseDescriptorSupplier {
    ServiceControlServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceControlServiceMethodDescriptorSupplier
      extends ServiceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceControlServiceFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
