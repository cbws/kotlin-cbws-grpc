package xyz.cbws.projects.v1alpha1

import com.google.longrunning.Operation
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import xyz.cbws.iam.policy.v1alpha1.GetPolicyRequest
import xyz.cbws.iam.policy.v1alpha1.Policy
import xyz.cbws.iam.policy.v1alpha1.SetPolicyRequest
import xyz.cbws.iam.policy.v1alpha1.TestPermissionsRequest
import xyz.cbws.iam.policy.v1alpha1.TestPermissionsResponse
import xyz.cbws.projects.v1alpha1.ProjectsServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * cbws.projects.v1alpha1.ProjectsService.
 */
object ProjectsServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ProjectsServiceGrpc.getServiceDescriptor()

  val createProjectMethod: MethodDescriptor<CreateProjectRequest, Project>
    @JvmStatic
    get() = ProjectsServiceGrpc.getCreateProjectMethod()

  val listProjectsMethod: MethodDescriptor<ListProjectsRequest, ListProjectsResponse>
    @JvmStatic
    get() = ProjectsServiceGrpc.getListProjectsMethod()

  val getProjectMethod: MethodDescriptor<GetProjectRequest, Project>
    @JvmStatic
    get() = ProjectsServiceGrpc.getGetProjectMethod()

  val updateProjectMethod: MethodDescriptor<UpdateProjectRequest, Project>
    @JvmStatic
    get() = ProjectsServiceGrpc.getUpdateProjectMethod()

  val deleteProjectMethod: MethodDescriptor<DeleteProjectRequest, Operation>
    @JvmStatic
    get() = ProjectsServiceGrpc.getDeleteProjectMethod()

  val getPolicyMethod: MethodDescriptor<GetPolicyRequest, Policy>
    @JvmStatic
    get() = ProjectsServiceGrpc.getGetPolicyMethod()

  val setPolicyMethod: MethodDescriptor<SetPolicyRequest, Policy>
    @JvmStatic
    get() = ProjectsServiceGrpc.getSetPolicyMethod()

  val testPermissionsMethod: MethodDescriptor<TestPermissionsRequest, TestPermissionsResponse>
    @JvmStatic
    get() = ProjectsServiceGrpc.getTestPermissionsMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.projects.v1alpha1.ProjectsService service as suspending
   * coroutines.
   */
  @StubFor(ProjectsServiceGrpc::class)
  class ProjectsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ProjectsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProjectsServiceCoroutineStub =
        ProjectsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun createProject(request: CreateProjectRequest): Project = unaryRpc(
      channel,
      ProjectsServiceGrpc.getCreateProjectMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun listProjects(request: ListProjectsRequest): ListProjectsResponse = unaryRpc(
      channel,
      ProjectsServiceGrpc.getListProjectsMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getProject(request: GetProjectRequest): Project = unaryRpc(
      channel,
      ProjectsServiceGrpc.getGetProjectMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun updateProject(request: UpdateProjectRequest): Project = unaryRpc(
      channel,
      ProjectsServiceGrpc.getUpdateProjectMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun deleteProject(request: DeleteProjectRequest): Operation = unaryRpc(
      channel,
      ProjectsServiceGrpc.getDeleteProjectMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getPolicy(request: GetPolicyRequest): Policy = unaryRpc(
      channel,
      ProjectsServiceGrpc.getGetPolicyMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun setPolicy(request: SetPolicyRequest): Policy = unaryRpc(
      channel,
      ProjectsServiceGrpc.getSetPolicyMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun testPermissions(request: TestPermissionsRequest): TestPermissionsResponse =
        unaryRpc(
      channel,
      ProjectsServiceGrpc.getTestPermissionsMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cbws.projects.v1alpha1.ProjectsService service based on Kotlin
   * coroutines.
   */
  abstract class ProjectsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.CreateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createProject(request: CreateProjectRequest): Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.CreateProject is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.ListProjects.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listProjects(request: ListProjectsRequest): ListProjectsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.ListProjects is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.GetProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProject(request: GetProjectRequest): Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.GetProject is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.UpdateProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateProject(request: UpdateProjectRequest): Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.UpdateProject is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.DeleteProject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteProject(request: DeleteProjectRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.DeleteProject is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.GetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getPolicy(request: GetPolicyRequest): Policy = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.GetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.SetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun setPolicy(request: SetPolicyRequest): Policy = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.SetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.projects.v1alpha1.ProjectsService.TestPermissions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun testPermissions(request: TestPermissionsRequest): TestPermissionsResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.projects.v1alpha1.ProjectsService.TestPermissions is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getCreateProjectMethod(),
      implementation = ::createProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getListProjectsMethod(),
      implementation = ::listProjects
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getGetProjectMethod(),
      implementation = ::getProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getUpdateProjectMethod(),
      implementation = ::updateProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getDeleteProjectMethod(),
      implementation = ::deleteProject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getGetPolicyMethod(),
      implementation = ::getPolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getSetPolicyMethod(),
      implementation = ::setPolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectsServiceGrpc.getTestPermissionsMethod(),
      implementation = ::testPermissions
    )).build()
  }
}
