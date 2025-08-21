package cloud.cbws.api.vpc.v1alpha1

import cloud.cbws.api.vpc.v1alpha1.VpcServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for cbws.vpc.v1alpha1.VpcService.
 */
public object VpcServiceGrpcKt {
  public const val SERVICE_NAME: String = VpcServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listVpcsMethod: MethodDescriptor<ListVpcsRequest, ListVpcsResponse>
    @JvmStatic
    get() = VpcServiceGrpc.getListVpcsMethod()

  public val getVpcMethod: MethodDescriptor<GetVpcRequest, Vpc>
    @JvmStatic
    get() = VpcServiceGrpc.getGetVpcMethod()

  public val deleteVpcMethod: MethodDescriptor<DeleteVpcRequest, Operation>
    @JvmStatic
    get() = VpcServiceGrpc.getDeleteVpcMethod()

  public val listPrivateNetworksMethod:
      MethodDescriptor<ListPrivateNetworksRequest, ListPrivateNetworksResponse>
    @JvmStatic
    get() = VpcServiceGrpc.getListPrivateNetworksMethod()

  public val getPrivateNetworkMethod: MethodDescriptor<GetPrivateNetworkRequest, PrivateNetwork>
    @JvmStatic
    get() = VpcServiceGrpc.getGetPrivateNetworkMethod()

  public val deletePrivateNetworkMethod: MethodDescriptor<DeletePrivateNetworkRequest, Operation>
    @JvmStatic
    get() = VpcServiceGrpc.getDeletePrivateNetworkMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.vpc.v1alpha1.VpcService service as suspending coroutines.
   */
  @StubFor(VpcServiceGrpc::class)
  public class VpcServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<VpcServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): VpcServiceCoroutineStub = VpcServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listVpcs(request: ListVpcsRequest, headers: Metadata = Metadata()): ListVpcsResponse = unaryRpc(
      channel,
      VpcServiceGrpc.getListVpcsMethod(),
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
    public suspend fun getVpc(request: GetVpcRequest, headers: Metadata = Metadata()): Vpc = unaryRpc(
      channel,
      VpcServiceGrpc.getGetVpcMethod(),
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
    public suspend fun deleteVpc(request: DeleteVpcRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      VpcServiceGrpc.getDeleteVpcMethod(),
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
    public suspend fun listPrivateNetworks(request: ListPrivateNetworksRequest, headers: Metadata = Metadata()): ListPrivateNetworksResponse = unaryRpc(
      channel,
      VpcServiceGrpc.getListPrivateNetworksMethod(),
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
    public suspend fun getPrivateNetwork(request: GetPrivateNetworkRequest, headers: Metadata = Metadata()): PrivateNetwork = unaryRpc(
      channel,
      VpcServiceGrpc.getGetPrivateNetworkMethod(),
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
    public suspend fun deletePrivateNetwork(request: DeletePrivateNetworkRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      VpcServiceGrpc.getDeletePrivateNetworkMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the cbws.vpc.v1alpha1.VpcService service based on Kotlin coroutines.
   */
  public abstract class VpcServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.ListVpcs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listVpcs(request: ListVpcsRequest): ListVpcsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.ListVpcs is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.GetVpc.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getVpc(request: GetVpcRequest): Vpc = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.GetVpc is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.DeleteVpc.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteVpc(request: DeleteVpcRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.DeleteVpc is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.ListPrivateNetworks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listPrivateNetworks(request: ListPrivateNetworksRequest): ListPrivateNetworksResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.ListPrivateNetworks is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.GetPrivateNetwork.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPrivateNetwork(request: GetPrivateNetworkRequest): PrivateNetwork = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.GetPrivateNetwork is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpc.v1alpha1.VpcService.DeletePrivateNetwork.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deletePrivateNetwork(request: DeletePrivateNetworkRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpc.v1alpha1.VpcService.DeletePrivateNetwork is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getListVpcsMethod(),
      implementation = ::listVpcs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getGetVpcMethod(),
      implementation = ::getVpc
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getDeleteVpcMethod(),
      implementation = ::deleteVpc
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getListPrivateNetworksMethod(),
      implementation = ::listPrivateNetworks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getGetPrivateNetworkMethod(),
      implementation = ::getPrivateNetwork
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VpcServiceGrpc.getDeletePrivateNetworkMethod(),
      implementation = ::deletePrivateNetwork
    )).build()
  }
}
