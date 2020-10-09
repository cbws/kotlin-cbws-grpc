package xyz.cbws.virtual_machines.v1alpha1

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
import xyz.cbws.virtual_machines.v1alpha1.VirtualMachinesServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * cbws.virtual_machines.v1alpha1.VirtualMachinesService.
 */
object VirtualMachinesServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = VirtualMachinesServiceGrpc.getServiceDescriptor()

  val listInstancesMethod: MethodDescriptor<ListInstancesRequest, ListInstancesResponse>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getListInstancesMethod()

  val getInstanceMethod: MethodDescriptor<GetInstanceRequest, Instance>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getGetInstanceMethod()

  val createInstanceMethod: MethodDescriptor<CreateInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getCreateInstanceMethod()

  val stopInstanceMethod: MethodDescriptor<StopInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getStopInstanceMethod()

  val startInstanceMethod: MethodDescriptor<StartInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getStartInstanceMethod()

  val resetInstanceMethod: MethodDescriptor<ResetInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getResetInstanceMethod()

  val updateInstanceMethod: MethodDescriptor<UpdateInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getUpdateInstanceMethod()

  val deleteInstanceMethod: MethodDescriptor<DeleteInstanceRequest, Operation>
    @JvmStatic
    get() = VirtualMachinesServiceGrpc.getDeleteInstanceMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.virtual_machines.v1alpha1.VirtualMachinesService service
   * as suspending coroutines.
   */
  @StubFor(VirtualMachinesServiceGrpc::class)
  class VirtualMachinesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<VirtualMachinesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        VirtualMachinesServiceCoroutineStub = VirtualMachinesServiceCoroutineStub(channel,
        callOptions)

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
    suspend fun listInstances(request: ListInstancesRequest): ListInstancesResponse = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getListInstancesMethod(),
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
    suspend fun getInstance(request: GetInstanceRequest): Instance = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getGetInstanceMethod(),
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
    suspend fun createInstance(request: CreateInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getCreateInstanceMethod(),
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
    suspend fun stopInstance(request: StopInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getStopInstanceMethod(),
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
    suspend fun startInstance(request: StartInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getStartInstanceMethod(),
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
    suspend fun resetInstance(request: ResetInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getResetInstanceMethod(),
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
    suspend fun updateInstance(request: UpdateInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getUpdateInstanceMethod(),
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
    suspend fun deleteInstance(request: DeleteInstanceRequest): Operation = unaryRpc(
      channel,
      VirtualMachinesServiceGrpc.getDeleteInstanceMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cbws.virtual_machines.v1alpha1.VirtualMachinesService service
   * based on Kotlin coroutines.
   */
  abstract class VirtualMachinesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.ListInstances.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listInstances(request: ListInstancesRequest): ListInstancesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.ListInstances is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.GetInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getInstance(request: GetInstanceRequest): Instance = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.GetInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.CreateInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createInstance(request: CreateInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.CreateInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.StopInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun stopInstance(request: StopInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.StopInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.StartInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun startInstance(request: StartInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.StartInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.ResetInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun resetInstance(request: ResetInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.ResetInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.UpdateInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateInstance(request: UpdateInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.UpdateInstance is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.virtual_machines.v1alpha1.VirtualMachinesService.DeleteInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteInstance(request: DeleteInstanceRequest): Operation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.virtual_machines.v1alpha1.VirtualMachinesService.DeleteInstance is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getListInstancesMethod(),
      implementation = ::listInstances
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getGetInstanceMethod(),
      implementation = ::getInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getCreateInstanceMethod(),
      implementation = ::createInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getStopInstanceMethod(),
      implementation = ::stopInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getStartInstanceMethod(),
      implementation = ::startInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getResetInstanceMethod(),
      implementation = ::resetInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getUpdateInstanceMethod(),
      implementation = ::updateInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VirtualMachinesServiceGrpc.getDeleteInstanceMethod(),
      implementation = ::deleteInstance
    )).build()
  }
}
