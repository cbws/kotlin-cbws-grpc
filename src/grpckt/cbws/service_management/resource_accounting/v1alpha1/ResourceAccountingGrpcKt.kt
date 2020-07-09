package cbws.service_management.resource_accounting.v1alpha1

import cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingServiceGrpc.getServiceDescriptor
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

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService.
 */
object ResourceAccountingServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ResourceAccountingServiceGrpc.getServiceDescriptor()

  val listResourcesMethod: MethodDescriptor<ResourceAccounting.ListResourcesRequest,
      ResourceAccounting.ListResourcesResponse>
    @JvmStatic
    get() = ResourceAccountingServiceGrpc.getListResourcesMethod()

  val accountMethod: MethodDescriptor<ResourceAccounting.AccountRequest,
      ResourceAccounting.AccountResponse>
    @JvmStatic
    get() = ResourceAccountingServiceGrpc.getAccountMethod()

  /**
   * A stub for issuing RPCs to a(n)
   * cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService service as
   * suspending coroutines.
   */
  @StubFor(ResourceAccountingServiceGrpc::class)
  class ResourceAccountingServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ResourceAccountingServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ResourceAccountingServiceCoroutineStub = ResourceAccountingServiceCoroutineStub(channel,
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
    suspend fun listResources(request: ResourceAccounting.ListResourcesRequest):
        ResourceAccounting.ListResourcesResponse = unaryRpc(
      channel,
      ResourceAccountingServiceGrpc.getListResourcesMethod(),
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
    suspend fun account(request: ResourceAccounting.AccountRequest):
        ResourceAccounting.AccountResponse = unaryRpc(
      channel,
      ResourceAccountingServiceGrpc.getAccountMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the
   * cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService service based on
   * Kotlin coroutines.
   */
  abstract class ResourceAccountingServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService.ListResources.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listResources(request: ResourceAccounting.ListResourcesRequest):
        ResourceAccounting.ListResourcesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService.ListResources is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService.Account.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun account(request: ResourceAccounting.AccountRequest):
        ResourceAccounting.AccountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.resource_accounting.v1alpha1.ResourceAccountingService.Account is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ResourceAccountingServiceGrpc.getListResourcesMethod(),
      implementation = ::listResources
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ResourceAccountingServiceGrpc.getAccountMethod(),
      implementation = ::account
    )).build()
  }
}
