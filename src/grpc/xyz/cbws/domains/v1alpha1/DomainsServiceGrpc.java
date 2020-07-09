package xyz.cbws.domains.v1alpha1;

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
    comments = "Source: cbws/domains/v1alpha1/domains.proto")
public final class DomainsServiceGrpc {

  private DomainsServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.domains.v1alpha1.DomainsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.ListDomainsRequest,
      xyz.cbws.domains.v1alpha1.ListDomainsResponse> getListDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomains",
      requestType = xyz.cbws.domains.v1alpha1.ListDomainsRequest.class,
      responseType = xyz.cbws.domains.v1alpha1.ListDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.ListDomainsRequest,
      xyz.cbws.domains.v1alpha1.ListDomainsResponse> getListDomainsMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.ListDomainsRequest, xyz.cbws.domains.v1alpha1.ListDomainsResponse> getListDomainsMethod;
    if ((getListDomainsMethod = DomainsServiceGrpc.getListDomainsMethod) == null) {
      synchronized (DomainsServiceGrpc.class) {
        if ((getListDomainsMethod = DomainsServiceGrpc.getListDomainsMethod) == null) {
          DomainsServiceGrpc.getListDomainsMethod = getListDomainsMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.domains.v1alpha1.ListDomainsRequest, xyz.cbws.domains.v1alpha1.ListDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.domains.v1alpha1.ListDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.domains.v1alpha1.ListDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsServiceMethodDescriptorSupplier("ListDomains"))
              .build();
        }
      }
    }
    return getListDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.GetDomainRequest,
      xyz.cbws.domains.v1alpha1.Domain> getGetDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDomain",
      requestType = xyz.cbws.domains.v1alpha1.GetDomainRequest.class,
      responseType = xyz.cbws.domains.v1alpha1.Domain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.GetDomainRequest,
      xyz.cbws.domains.v1alpha1.Domain> getGetDomainMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.domains.v1alpha1.GetDomainRequest, xyz.cbws.domains.v1alpha1.Domain> getGetDomainMethod;
    if ((getGetDomainMethod = DomainsServiceGrpc.getGetDomainMethod) == null) {
      synchronized (DomainsServiceGrpc.class) {
        if ((getGetDomainMethod = DomainsServiceGrpc.getGetDomainMethod) == null) {
          DomainsServiceGrpc.getGetDomainMethod = getGetDomainMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.domains.v1alpha1.GetDomainRequest, xyz.cbws.domains.v1alpha1.Domain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.domains.v1alpha1.GetDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.domains.v1alpha1.Domain.getDefaultInstance()))
              .setSchemaDescriptor(new DomainsServiceMethodDescriptorSupplier("GetDomain"))
              .build();
        }
      }
    }
    return getGetDomainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsServiceStub>() {
        @java.lang.Override
        public DomainsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsServiceStub(channel, callOptions);
        }
      };
    return DomainsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsServiceBlockingStub>() {
        @java.lang.Override
        public DomainsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainsServiceFutureStub>() {
        @java.lang.Override
        public DomainsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainsServiceFutureStub(channel, callOptions);
        }
      };
    return DomainsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DomainsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listDomains(xyz.cbws.domains.v1alpha1.ListDomainsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.ListDomainsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDomainsMethod(), responseObserver);
    }

    /**
     */
    public void getDomain(xyz.cbws.domains.v1alpha1.GetDomainRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.Domain> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDomainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDomainsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.domains.v1alpha1.ListDomainsRequest,
                xyz.cbws.domains.v1alpha1.ListDomainsResponse>(
                  this, METHODID_LIST_DOMAINS)))
          .addMethod(
            getGetDomainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.domains.v1alpha1.GetDomainRequest,
                xyz.cbws.domains.v1alpha1.Domain>(
                  this, METHODID_GET_DOMAIN)))
          .build();
    }
  }

  /**
   */
  public static final class DomainsServiceStub extends io.grpc.stub.AbstractAsyncStub<DomainsServiceStub> {
    private DomainsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listDomains(xyz.cbws.domains.v1alpha1.ListDomainsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.ListDomainsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDomain(xyz.cbws.domains.v1alpha1.GetDomainRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.Domain> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DomainsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DomainsServiceBlockingStub> {
    private DomainsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public xyz.cbws.domains.v1alpha1.ListDomainsResponse listDomains(xyz.cbws.domains.v1alpha1.ListDomainsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDomainsMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.domains.v1alpha1.Domain getDomain(xyz.cbws.domains.v1alpha1.GetDomainRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDomainMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DomainsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DomainsServiceFutureStub> {
    private DomainsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.domains.v1alpha1.ListDomainsResponse> listDomains(
        xyz.cbws.domains.v1alpha1.ListDomainsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.domains.v1alpha1.Domain> getDomain(
        xyz.cbws.domains.v1alpha1.GetDomainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DOMAINS = 0;
  private static final int METHODID_GET_DOMAIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DomainsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DomainsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DOMAINS:
          serviceImpl.listDomains((xyz.cbws.domains.v1alpha1.ListDomainsRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.ListDomainsResponse>) responseObserver);
          break;
        case METHODID_GET_DOMAIN:
          serviceImpl.getDomain((xyz.cbws.domains.v1alpha1.GetDomainRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.domains.v1alpha1.Domain>) responseObserver);
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

  private static abstract class DomainsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return xyz.cbws.domains.v1alpha1.Domains.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainsService");
    }
  }

  private static final class DomainsServiceFileDescriptorSupplier
      extends DomainsServiceBaseDescriptorSupplier {
    DomainsServiceFileDescriptorSupplier() {}
  }

  private static final class DomainsServiceMethodDescriptorSupplier
      extends DomainsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DomainsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DomainsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainsServiceFileDescriptorSupplier())
              .addMethod(getListDomainsMethod())
              .addMethod(getGetDomainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
