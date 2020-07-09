package xyz.cbws.projects.v1alpha1;

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
    comments = "Source: cbws/projects/v1alpha1/projects.proto")
public final class ProjectsServiceGrpc {

  private ProjectsServiceGrpc() {}

  public static final String SERVICE_NAME = "cbws.projects.v1alpha1.ProjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.CreateProjectRequest,
      xyz.cbws.projects.v1alpha1.Project> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = xyz.cbws.projects.v1alpha1.CreateProjectRequest.class,
      responseType = xyz.cbws.projects.v1alpha1.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.CreateProjectRequest,
      xyz.cbws.projects.v1alpha1.Project> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.CreateProjectRequest, xyz.cbws.projects.v1alpha1.Project> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectsServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectsServiceGrpc.getCreateProjectMethod) == null) {
          ProjectsServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.projects.v1alpha1.CreateProjectRequest, xyz.cbws.projects.v1alpha1.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.ListProjectsRequest,
      xyz.cbws.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = xyz.cbws.projects.v1alpha1.ListProjectsRequest.class,
      responseType = xyz.cbws.projects.v1alpha1.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.ListProjectsRequest,
      xyz.cbws.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.ListProjectsRequest, xyz.cbws.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod;
    if ((getListProjectsMethod = ProjectsServiceGrpc.getListProjectsMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getListProjectsMethod = ProjectsServiceGrpc.getListProjectsMethod) == null) {
          ProjectsServiceGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.projects.v1alpha1.ListProjectsRequest, xyz.cbws.projects.v1alpha1.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.GetProjectRequest,
      xyz.cbws.projects.v1alpha1.Project> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = xyz.cbws.projects.v1alpha1.GetProjectRequest.class,
      responseType = xyz.cbws.projects.v1alpha1.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.GetProjectRequest,
      xyz.cbws.projects.v1alpha1.Project> getGetProjectMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.GetProjectRequest, xyz.cbws.projects.v1alpha1.Project> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectsServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectsServiceGrpc.getGetProjectMethod) == null) {
          ProjectsServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.projects.v1alpha1.GetProjectRequest, xyz.cbws.projects.v1alpha1.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.DeleteProjectRequest,
      com.google.longrunning.Operation> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProject",
      requestType = xyz.cbws.projects.v1alpha1.DeleteProjectRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.DeleteProjectRequest,
      com.google.longrunning.Operation> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<xyz.cbws.projects.v1alpha1.DeleteProjectRequest, com.google.longrunning.Operation> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectsServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectsServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectsServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<xyz.cbws.projects.v1alpha1.DeleteProjectRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xyz.cbws.projects.v1alpha1.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("DeleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
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
    if ((getGetPolicyMethod = ProjectsServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getGetPolicyMethod = ProjectsServiceGrpc.getGetPolicyMethod) == null) {
          ProjectsServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("GetPolicy"))
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
    if ((getSetPolicyMethod = ProjectsServiceGrpc.getSetPolicyMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getSetPolicyMethod = ProjectsServiceGrpc.getSetPolicyMethod) == null) {
          ProjectsServiceGrpc.getSetPolicyMethod = getSetPolicyMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest, cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("SetPolicy"))
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
    if ((getTestPermissionsMethod = ProjectsServiceGrpc.getTestPermissionsMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getTestPermissionsMethod = ProjectsServiceGrpc.getTestPermissionsMethod) == null) {
          ProjectsServiceGrpc.getTestPermissionsMethod = getTestPermissionsMethod =
              io.grpc.MethodDescriptor.<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest, cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("TestPermissions"))
              .build();
        }
      }
    }
    return getTestPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceStub>() {
        @java.lang.Override
        public ProjectsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsServiceStub(channel, callOptions);
        }
      };
    return ProjectsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceBlockingStub>() {
        @java.lang.Override
        public ProjectsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceFutureStub>() {
        @java.lang.Override
        public ProjectsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProjectsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a project, requires the projects.cbws.xyz/Project/create permission on the organization.
     * The principal creating a project will get the owner role on the project.
     * </pre>
     */
    public void createProject(xyz.cbws.projects.v1alpha1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all projects you have access to
     * Requires the projects.cbws.xyz/Project/get permission on the project
     * </pre>
     */
    public void listProjects(xyz.cbws.projects.v1alpha1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.ListProjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     */
    public void getProject(xyz.cbws.projects.v1alpha1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     */
    public void deleteProject(xyz.cbws.projects.v1alpha1.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a Project.
     * </pre>
     */
    public void getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a Project.
     * </pre>
     */
    public void setPolicy(cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a Project.
     * </pre>
     */
    public void testPermissions(cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.projects.v1alpha1.CreateProjectRequest,
                xyz.cbws.projects.v1alpha1.Project>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getListProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.projects.v1alpha1.ListProjectsRequest,
                xyz.cbws.projects.v1alpha1.ListProjectsResponse>(
                  this, METHODID_LIST_PROJECTS)))
          .addMethod(
            getGetProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.projects.v1alpha1.GetProjectRequest,
                xyz.cbws.projects.v1alpha1.Project>(
                  this, METHODID_GET_PROJECT)))
          .addMethod(
            getDeleteProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                xyz.cbws.projects.v1alpha1.DeleteProjectRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_PROJECT)))
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
  public static final class ProjectsServiceStub extends io.grpc.stub.AbstractAsyncStub<ProjectsServiceStub> {
    private ProjectsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a project, requires the projects.cbws.xyz/Project/create permission on the organization.
     * The principal creating a project will get the owner role on the project.
     * </pre>
     */
    public void createProject(xyz.cbws.projects.v1alpha1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all projects you have access to
     * Requires the projects.cbws.xyz/Project/get permission on the project
     * </pre>
     */
    public void listProjects(xyz.cbws.projects.v1alpha1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.ListProjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProject(xyz.cbws.projects.v1alpha1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProject(xyz.cbws.projects.v1alpha1.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a Project.
     * </pre>
     */
    public void getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a Project.
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
     * for a Project.
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
  public static final class ProjectsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectsServiceBlockingStub> {
    private ProjectsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a project, requires the projects.cbws.xyz/Project/create permission on the organization.
     * The principal creating a project will get the owner role on the project.
     * </pre>
     */
    public xyz.cbws.projects.v1alpha1.Project createProject(xyz.cbws.projects.v1alpha1.CreateProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all projects you have access to
     * Requires the projects.cbws.xyz/Project/get permission on the project
     * </pre>
     */
    public xyz.cbws.projects.v1alpha1.ListProjectsResponse listProjects(xyz.cbws.projects.v1alpha1.ListProjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public xyz.cbws.projects.v1alpha1.Project getProject(xyz.cbws.projects.v1alpha1.GetProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation deleteProject(xyz.cbws.projects.v1alpha1.DeleteProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a Project.
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy getPolicy(cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a Project.
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy setPolicy(cbws.iam.policy.v1alpha1.RequestResponse.SetPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a Project.
     * </pre>
     */
    public cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse testPermissions(cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectsServiceFutureStub> {
    private ProjectsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a project, requires the projects.cbws.xyz/Project/create permission on the organization.
     * The principal creating a project will get the owner role on the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.projects.v1alpha1.Project> createProject(
        xyz.cbws.projects.v1alpha1.CreateProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all projects you have access to
     * Requires the projects.cbws.xyz/Project/get permission on the project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.projects.v1alpha1.ListProjectsResponse> listProjects(
        xyz.cbws.projects.v1alpha1.ListProjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<xyz.cbws.projects.v1alpha1.Project> getProject(
        xyz.cbws.projects.v1alpha1.GetProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteProject(
        xyz.cbws.projects.v1alpha1.DeleteProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a Project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.policy.v1alpha1.PolicyOuterClass.Policy> getPolicy(
        cbws.iam.policy.v1alpha1.RequestResponse.GetPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a Project.
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
     * for a Project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsResponse> testPermissions(
        cbws.iam.policy.v1alpha1.RequestResponse.TestPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_LIST_PROJECTS = 1;
  private static final int METHODID_GET_PROJECT = 2;
  private static final int METHODID_DELETE_PROJECT = 3;
  private static final int METHODID_GET_POLICY = 4;
  private static final int METHODID_SET_POLICY = 5;
  private static final int METHODID_TEST_PERMISSIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((xyz.cbws.projects.v1alpha1.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project>) responseObserver);
          break;
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((xyz.cbws.projects.v1alpha1.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((xyz.cbws.projects.v1alpha1.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<xyz.cbws.projects.v1alpha1.Project>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((xyz.cbws.projects.v1alpha1.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static abstract class ProjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return xyz.cbws.projects.v1alpha1.Projects.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectsService");
    }
  }

  private static final class ProjectsServiceFileDescriptorSupplier
      extends ProjectsServiceBaseDescriptorSupplier {
    ProjectsServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectsServiceMethodDescriptorSupplier
      extends ProjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectsServiceFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getListProjectsMethod())
              .addMethod(getGetProjectMethod())
              .addMethod(getDeleteProjectMethod())
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
