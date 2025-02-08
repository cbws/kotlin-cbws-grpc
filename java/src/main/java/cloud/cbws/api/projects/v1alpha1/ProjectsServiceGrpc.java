package cloud.cbws.api.projects.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages projects and their IAM policies.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectsServiceGrpc {

  private ProjectsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cbws.projects.v1alpha1.ProjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.CreateProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = cloud.cbws.api.projects.v1alpha1.CreateProjectRequest.class,
      responseType = cloud.cbws.api.projects.v1alpha1.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.CreateProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.CreateProjectRequest, cloud.cbws.api.projects.v1alpha1.Project> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectsServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectsServiceGrpc.getCreateProjectMethod) == null) {
          ProjectsServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.projects.v1alpha1.CreateProjectRequest, cloud.cbws.api.projects.v1alpha1.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.ListProjectsRequest,
      cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = cloud.cbws.api.projects.v1alpha1.ListProjectsRequest.class,
      responseType = cloud.cbws.api.projects.v1alpha1.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.ListProjectsRequest,
      cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.ListProjectsRequest, cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> getListProjectsMethod;
    if ((getListProjectsMethod = ProjectsServiceGrpc.getListProjectsMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getListProjectsMethod = ProjectsServiceGrpc.getListProjectsMethod) == null) {
          ProjectsServiceGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.projects.v1alpha1.ListProjectsRequest, cloud.cbws.api.projects.v1alpha1.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.GetProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = cloud.cbws.api.projects.v1alpha1.GetProjectRequest.class,
      responseType = cloud.cbws.api.projects.v1alpha1.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.GetProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getGetProjectMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.GetProjectRequest, cloud.cbws.api.projects.v1alpha1.Project> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectsServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectsServiceGrpc.getGetProjectMethod) == null) {
          ProjectsServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.projects.v1alpha1.GetProjectRequest, cloud.cbws.api.projects.v1alpha1.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getUpdateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProject",
      requestType = cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest.class,
      responseType = cloud.cbws.api.projects.v1alpha1.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest,
      cloud.cbws.api.projects.v1alpha1.Project> getUpdateProjectMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest, cloud.cbws.api.projects.v1alpha1.Project> getUpdateProjectMethod;
    if ((getUpdateProjectMethod = ProjectsServiceGrpc.getUpdateProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getUpdateProjectMethod = ProjectsServiceGrpc.getUpdateProjectMethod) == null) {
          ProjectsServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest, cloud.cbws.api.projects.v1alpha1.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("UpdateProject"))
              .build();
        }
      }
    }
    return getUpdateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest,
      com.google.longrunning.Operation> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProject",
      requestType = cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest,
      com.google.longrunning.Operation> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest, com.google.longrunning.Operation> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectsServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectsServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectsServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("DeleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
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
    if ((getGetPolicyMethod = ProjectsServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getGetPolicyMethod = ProjectsServiceGrpc.getGetPolicyMethod) == null) {
          ProjectsServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("GetPolicy"))
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
    if ((getSetPolicyMethod = ProjectsServiceGrpc.getSetPolicyMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getSetPolicyMethod = ProjectsServiceGrpc.getSetPolicyMethod) == null) {
          ProjectsServiceGrpc.getSetPolicyMethod = getSetPolicyMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest, cloud.cbws.api.iam.policy.v1alpha1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsServiceMethodDescriptorSupplier("SetPolicy"))
              .build();
        }
      }
    }
    return getSetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest,
      cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> getTestPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestPermissions",
      requestType = cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest.class,
      responseType = cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest,
      cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> getTestPermissionsMethod() {
    io.grpc.MethodDescriptor<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest, cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> getTestPermissionsMethod;
    if ((getTestPermissionsMethod = ProjectsServiceGrpc.getTestPermissionsMethod) == null) {
      synchronized (ProjectsServiceGrpc.class) {
        if ((getTestPermissionsMethod = ProjectsServiceGrpc.getTestPermissionsMethod) == null) {
          ProjectsServiceGrpc.getTestPermissionsMethod = getTestPermissionsMethod =
              io.grpc.MethodDescriptor.<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest, cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProjectsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProjectsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProjectsServiceBlockingV2Stub.newStub(factory, channel);
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
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a project in an organization and returns it. Requires
     * `projects.cbws.xyz/Project/create` on the organization.
     * The new project's IAM policy has two bindings: the caller gets the
     * `roles/owner` role, and a CBWS support principal gets the
     * `roles/tech-support` role, so that CBWS support can help with the
     * project. Both show in
     * [GetPolicy][cbws.projects.v1alpha1.ProjectsService.GetPolicy].
     * </pre>
     */
    default void createProject(cloud.cbws.api.projects.v1alpha1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the projects the caller has `projects.cbws.xyz/Project/get` on,
     * either on the project itself or on its organization.
     * </pre>
     */
    default void listProjects(cloud.cbws.api.projects.v1alpha1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a project. Requires `projects.cbws.xyz/Project/get` on the
     * project.
     * </pre>
     */
    default void getProject(cloud.cbws.api.projects.v1alpha1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a project and returns it. Requires
     * `projects.cbws.xyz/Project/update` on the project. Only the display
     * name can be changed.
     * </pre>
     */
    default void updateProject(cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a project. Requires `projects.cbws.xyz/Project/delete` on the
     * project.
     * A project that still has services enabled cannot be deleted: the call
     * fails with FAILED_PRECONDITION. Disable every service first.
     * The returned operation is already done, and its response is empty.
     * </pre>
     */
    default void deleteProject(cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/getIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * A new project's policy holds a `roles/tech-support` binding for a CBWS
     * support principal, which
     * [CreateProject][cbws.projects.v1alpha1.ProjectsService.CreateProject]
     * adds. Setting a policy without that binding removes CBWS support's
     * access to the project.
     * </pre>
     */
    default void getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/setIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * </pre>
     */
    default void setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns which of the given permissions the caller has on a project. The
     * `resource` is the project's resource name, such as
     * `projects/my-project`.
     * </pre>
     */
    default void testPermissions(cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectsService.
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public static abstract class ProjectsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectsService.
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public static final class ProjectsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectsServiceStub> {
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
     * Creates a project in an organization and returns it. Requires
     * `projects.cbws.xyz/Project/create` on the organization.
     * The new project's IAM policy has two bindings: the caller gets the
     * `roles/owner` role, and a CBWS support principal gets the
     * `roles/tech-support` role, so that CBWS support can help with the
     * project. Both show in
     * [GetPolicy][cbws.projects.v1alpha1.ProjectsService.GetPolicy].
     * </pre>
     */
    public void createProject(cloud.cbws.api.projects.v1alpha1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the projects the caller has `projects.cbws.xyz/Project/get` on,
     * either on the project itself or on its organization.
     * </pre>
     */
    public void listProjects(cloud.cbws.api.projects.v1alpha1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a project. Requires `projects.cbws.xyz/Project/get` on the
     * project.
     * </pre>
     */
    public void getProject(cloud.cbws.api.projects.v1alpha1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a project and returns it. Requires
     * `projects.cbws.xyz/Project/update` on the project. Only the display
     * name can be changed.
     * </pre>
     */
    public void updateProject(cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a project. Requires `projects.cbws.xyz/Project/delete` on the
     * project.
     * A project that still has services enabled cannot be deleted: the call
     * fails with FAILED_PRECONDITION. Disable every service first.
     * The returned operation is already done, and its response is empty.
     * </pre>
     */
    public void deleteProject(cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/getIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * A new project's policy holds a `roles/tech-support` binding for a CBWS
     * support principal, which
     * [CreateProject][cbws.projects.v1alpha1.ProjectsService.CreateProject]
     * adds. Setting a policy without that binding removes CBWS support's
     * access to the project.
     * </pre>
     */
    public void getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/setIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * </pre>
     */
    public void setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns which of the given permissions the caller has on a project. The
     * `resource` is the project's resource name, such as
     * `projects/my-project`.
     * </pre>
     */
    public void testPermissions(cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectsService.
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public static final class ProjectsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProjectsServiceBlockingV2Stub> {
    private ProjectsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in an organization and returns it. Requires
     * `projects.cbws.xyz/Project/create` on the organization.
     * The new project's IAM policy has two bindings: the caller gets the
     * `roles/owner` role, and a CBWS support principal gets the
     * `roles/tech-support` role, so that CBWS support can help with the
     * project. Both show in
     * [GetPolicy][cbws.projects.v1alpha1.ProjectsService.GetPolicy].
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project createProject(cloud.cbws.api.projects.v1alpha1.CreateProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the projects the caller has `projects.cbws.xyz/Project/get` on,
     * either on the project itself or on its organization.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.ListProjectsResponse listProjects(cloud.cbws.api.projects.v1alpha1.ListProjectsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a project. Requires `projects.cbws.xyz/Project/get` on the
     * project.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project getProject(cloud.cbws.api.projects.v1alpha1.GetProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a project and returns it. Requires
     * `projects.cbws.xyz/Project/update` on the project. Only the display
     * name can be changed.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project updateProject(cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a project. Requires `projects.cbws.xyz/Project/delete` on the
     * project.
     * A project that still has services enabled cannot be deleted: the call
     * fails with FAILED_PRECONDITION. Disable every service first.
     * The returned operation is already done, and its response is empty.
     * </pre>
     */
    public com.google.longrunning.Operation deleteProject(cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/getIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * A new project's policy holds a `roles/tech-support` binding for a CBWS
     * support principal, which
     * [CreateProject][cbws.projects.v1alpha1.ProjectsService.CreateProject]
     * adds. Setting a policy without that binding removes CBWS support's
     * access to the project.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/setIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns which of the given permissions the caller has on a project. The
     * `resource` is the project's resource name, such as
     * `projects/my-project`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse testPermissions(cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProjectsService.
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public static final class ProjectsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectsServiceBlockingStub> {
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
     * Creates a project in an organization and returns it. Requires
     * `projects.cbws.xyz/Project/create` on the organization.
     * The new project's IAM policy has two bindings: the caller gets the
     * `roles/owner` role, and a CBWS support principal gets the
     * `roles/tech-support` role, so that CBWS support can help with the
     * project. Both show in
     * [GetPolicy][cbws.projects.v1alpha1.ProjectsService.GetPolicy].
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project createProject(cloud.cbws.api.projects.v1alpha1.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the projects the caller has `projects.cbws.xyz/Project/get` on,
     * either on the project itself or on its organization.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.ListProjectsResponse listProjects(cloud.cbws.api.projects.v1alpha1.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a project. Requires `projects.cbws.xyz/Project/get` on the
     * project.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project getProject(cloud.cbws.api.projects.v1alpha1.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a project and returns it. Requires
     * `projects.cbws.xyz/Project/update` on the project. Only the display
     * name can be changed.
     * </pre>
     */
    public cloud.cbws.api.projects.v1alpha1.Project updateProject(cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a project. Requires `projects.cbws.xyz/Project/delete` on the
     * project.
     * A project that still has services enabled cannot be deleted: the call
     * fails with FAILED_PRECONDITION. Disable every service first.
     * The returned operation is already done, and its response is empty.
     * </pre>
     */
    public com.google.longrunning.Operation deleteProject(cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/getIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * A new project's policy holds a `roles/tech-support` binding for a CBWS
     * support principal, which
     * [CreateProject][cbws.projects.v1alpha1.ProjectsService.CreateProject]
     * adds. Setting a policy without that binding removes CBWS support's
     * access to the project.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy getPolicy(cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/setIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.Policy setPolicy(cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns which of the given permissions the caller has on a project. The
     * `resource` is the project's resource name, such as
     * `projects/my-project`.
     * </pre>
     */
    public cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse testPermissions(cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectsService.
   * <pre>
   * Manages projects and their IAM policies.
   * </pre>
   */
  public static final class ProjectsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectsServiceFutureStub> {
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
     * Creates a project in an organization and returns it. Requires
     * `projects.cbws.xyz/Project/create` on the organization.
     * The new project's IAM policy has two bindings: the caller gets the
     * `roles/owner` role, and a CBWS support principal gets the
     * `roles/tech-support` role, so that CBWS support can help with the
     * project. Both show in
     * [GetPolicy][cbws.projects.v1alpha1.ProjectsService.GetPolicy].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.projects.v1alpha1.Project> createProject(
        cloud.cbws.api.projects.v1alpha1.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the projects the caller has `projects.cbws.xyz/Project/get` on,
     * either on the project itself or on its organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.projects.v1alpha1.ListProjectsResponse> listProjects(
        cloud.cbws.api.projects.v1alpha1.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a project. Requires `projects.cbws.xyz/Project/get` on the
     * project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.projects.v1alpha1.Project> getProject(
        cloud.cbws.api.projects.v1alpha1.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a project and returns it. Requires
     * `projects.cbws.xyz/Project/update` on the project. Only the display
     * name can be changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.projects.v1alpha1.Project> updateProject(
        cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a project. Requires `projects.cbws.xyz/Project/delete` on the
     * project.
     * A project that still has services enabled cannot be deleted: the call
     * fails with FAILED_PRECONDITION. Disable every service first.
     * The returned operation is already done, and its response is empty.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteProject(
        cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/getIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * A new project's policy holds a `roles/tech-support` binding for a CBWS
     * support principal, which
     * [CreateProject][cbws.projects.v1alpha1.ProjectsService.CreateProject]
     * adds. Setting a policy without that binding removes CBWS support's
     * access to the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.policy.v1alpha1.Policy> getPolicy(
        cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replaces the IAM policy of a project. Requires
     * `projects.cbws.xyz/Project/setIAMPolicy` on the project. The `resource`
     * is the project's resource name, such as `projects/my-project`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.policy.v1alpha1.Policy> setPolicy(
        cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns which of the given permissions the caller has on a project. The
     * `resource` is the project's resource name, such as
     * `projects/my-project`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse> testPermissions(
        cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_LIST_PROJECTS = 1;
  private static final int METHODID_GET_PROJECT = 2;
  private static final int METHODID_UPDATE_PROJECT = 3;
  private static final int METHODID_DELETE_PROJECT = 4;
  private static final int METHODID_GET_POLICY = 5;
  private static final int METHODID_SET_POLICY = 6;
  private static final int METHODID_TEST_PERMISSIONS = 7;

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
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((cloud.cbws.api.projects.v1alpha1.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project>) responseObserver);
          break;
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((cloud.cbws.api.projects.v1alpha1.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((cloud.cbws.api.projects.v1alpha1.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT:
          serviceImpl.updateProject((cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.projects.v1alpha1.Project>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy>) responseObserver);
          break;
        case METHODID_SET_POLICY:
          serviceImpl.setPolicy((cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.Policy>) responseObserver);
          break;
        case METHODID_TEST_PERMISSIONS:
          serviceImpl.testPermissions((cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse>) responseObserver);
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
          getCreateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.projects.v1alpha1.CreateProjectRequest,
              cloud.cbws.api.projects.v1alpha1.Project>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getListProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.projects.v1alpha1.ListProjectsRequest,
              cloud.cbws.api.projects.v1alpha1.ListProjectsResponse>(
                service, METHODID_LIST_PROJECTS)))
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.projects.v1alpha1.GetProjectRequest,
              cloud.cbws.api.projects.v1alpha1.Project>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getUpdateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.projects.v1alpha1.UpdateProjectRequest,
              cloud.cbws.api.projects.v1alpha1.Project>(
                service, METHODID_UPDATE_PROJECT)))
        .addMethod(
          getDeleteProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.projects.v1alpha1.DeleteProjectRequest,
              com.google.longrunning.Operation>(
                service, METHODID_DELETE_PROJECT)))
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
        .addMethod(
          getTestPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsRequest,
              cloud.cbws.api.iam.policy.v1alpha1.TestPermissionsResponse>(
                service, METHODID_TEST_PERMISSIONS)))
        .build();
  }

  private static abstract class ProjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloud.cbws.api.projects.v1alpha1.ProjectsProto.getDescriptor();
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
    private final java.lang.String methodName;

    ProjectsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getUpdateProjectMethod())
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
