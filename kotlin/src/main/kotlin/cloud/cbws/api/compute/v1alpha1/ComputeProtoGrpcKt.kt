package cloud.cbws.api.compute.v1alpha1

import cloud.cbws.api.compute.v1alpha1.ComputeServiceGrpc.getServiceDescriptor
import com.google.longrunning.Operation
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for cbws.compute.v1alpha1.ComputeService.
 */
public object ComputeServiceGrpcKt {
  public const val SERVICE_NAME: String = ComputeServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listMachinesMethod: MethodDescriptor<ListMachinesRequest, ListMachinesResponse>
    @JvmStatic
    get() = ComputeServiceGrpc.getListMachinesMethod()

  public val getMachineMethod: MethodDescriptor<GetMachineRequest, Machine>
    @JvmStatic
    get() = ComputeServiceGrpc.getGetMachineMethod()

  public val requestMachineConsoleMethod:
      MethodDescriptor<RequestMachineConsoleRequest, RequestMachineConsoleResponse>
    @JvmStatic
    get() = ComputeServiceGrpc.getRequestMachineConsoleMethod()

  public val createMachineMethod: MethodDescriptor<CreateMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getCreateMachineMethod()

  public val stopMachineMethod: MethodDescriptor<StopMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getStopMachineMethod()

  public val startMachineMethod: MethodDescriptor<StartMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getStartMachineMethod()

  public val resetMachineMethod: MethodDescriptor<ResetMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getResetMachineMethod()

  public val reinstallMachineMethod: MethodDescriptor<ReinstallMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getReinstallMachineMethod()

  public val resizeMachineMethod: MethodDescriptor<ResizeMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getResizeMachineMethod()

  public val deleteMachineMethod: MethodDescriptor<DeleteMachineRequest, Operation>
    @JvmStatic
    get() = ComputeServiceGrpc.getDeleteMachineMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.compute.v1alpha1.ComputeService service as suspending coroutines.
   */
  @StubFor(ComputeServiceGrpc::class)
  public class ComputeServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ComputeServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ComputeServiceCoroutineStub = ComputeServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listMachines(request: ListMachinesRequest, headers: Metadata = Metadata()): ListMachinesResponse = unaryRpc(
      channel,
      ComputeServiceGrpc.getListMachinesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMachine(request: GetMachineRequest, headers: Metadata = Metadata()): Machine = unaryRpc(
      channel,
      ComputeServiceGrpc.getGetMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun requestMachineConsole(request: RequestMachineConsoleRequest, headers: Metadata = Metadata()): RequestMachineConsoleResponse = unaryRpc(
      channel,
      ComputeServiceGrpc.getRequestMachineConsoleMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createMachine(request: CreateMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getCreateMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun stopMachine(request: StopMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getStopMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun startMachine(request: StartMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getStartMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun resetMachine(request: ResetMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getResetMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reinstallMachine(request: ReinstallMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getReinstallMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun resizeMachine(request: ResizeMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getResizeMachineMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteMachine(request: DeleteMachineRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ComputeServiceGrpc.getDeleteMachineMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the cbws.compute.v1alpha1.ComputeService service based on Kotlin coroutines.
   */
  public abstract class ComputeServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.ListMachines.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listMachines(request: ListMachinesRequest): ListMachinesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.ListMachines is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.GetMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMachine(request: GetMachineRequest): Machine = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.GetMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.RequestMachineConsole.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun requestMachineConsole(request: RequestMachineConsoleRequest): RequestMachineConsoleResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.RequestMachineConsole is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.CreateMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createMachine(request: CreateMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.CreateMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.StopMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopMachine(request: StopMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.StopMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.StartMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startMachine(request: StartMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.StartMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.ResetMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun resetMachine(request: ResetMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.ResetMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.ReinstallMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reinstallMachine(request: ReinstallMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.ReinstallMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.ResizeMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun resizeMachine(request: ResizeMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.ResizeMachine is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.compute.v1alpha1.ComputeService.DeleteMachine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteMachine(request: DeleteMachineRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.compute.v1alpha1.ComputeService.DeleteMachine is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getListMachinesMethod(),
      implementation = ::listMachines
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getGetMachineMethod(),
      implementation = ::getMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getRequestMachineConsoleMethod(),
      implementation = ::requestMachineConsole
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getCreateMachineMethod(),
      implementation = ::createMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getStopMachineMethod(),
      implementation = ::stopMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getStartMachineMethod(),
      implementation = ::startMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getResetMachineMethod(),
      implementation = ::resetMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getReinstallMachineMethod(),
      implementation = ::reinstallMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getResizeMachineMethod(),
      implementation = ::resizeMachine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComputeServiceGrpc.getDeleteMachineMethod(),
      implementation = ::deleteMachine
    )).build()
  }
}
