package xyz.cbws.domains.v1alpha1

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
import xyz.cbws.domains.v1alpha1.DomainsServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * cbws.domains.v1alpha1.DomainsService.
 */
object DomainsServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = DomainsServiceGrpc.getServiceDescriptor()

  val listDomainsMethod: MethodDescriptor<ListDomainsRequest, ListDomainsResponse>
    @JvmStatic
    get() = DomainsServiceGrpc.getListDomainsMethod()

  val getDomainMethod: MethodDescriptor<GetDomainRequest, Domain>
    @JvmStatic
    get() = DomainsServiceGrpc.getGetDomainMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.domains.v1alpha1.DomainsService service as suspending
   * coroutines.
   */
  @StubFor(DomainsServiceGrpc::class)
  class DomainsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<DomainsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DomainsServiceCoroutineStub =
        DomainsServiceCoroutineStub(channel, callOptions)

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
    suspend fun listDomains(request: ListDomainsRequest): ListDomainsResponse = unaryRpc(
      channel,
      DomainsServiceGrpc.getListDomainsMethod(),
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
    suspend fun getDomain(request: GetDomainRequest): Domain = unaryRpc(
      channel,
      DomainsServiceGrpc.getGetDomainMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cbws.domains.v1alpha1.DomainsService service based on Kotlin
   * coroutines.
   */
  abstract class DomainsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.domains.v1alpha1.DomainsService.ListDomains.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listDomains(request: ListDomainsRequest): ListDomainsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.domains.v1alpha1.DomainsService.ListDomains is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.domains.v1alpha1.DomainsService.GetDomain.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getDomain(request: GetDomainRequest): Domain = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.domains.v1alpha1.DomainsService.GetDomain is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DomainsServiceGrpc.getListDomainsMethod(),
      implementation = ::listDomains
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DomainsServiceGrpc.getGetDomainMethod(),
      implementation = ::getDomain
    )).build()
  }
}
