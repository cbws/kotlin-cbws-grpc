package cloud.cbws.api.service_management.service_usage.v1alpha1

import cloud.cbws.api.service_management.service_usage.v1alpha1.ServiceUsageServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for cbws.service_management.service_usage.v1alpha1.ServiceUsageService.
 */
public object ServiceUsageServiceGrpcKt {
  public const val SERVICE_NAME: String = ServiceUsageServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listServicesMethod: MethodDescriptor<ListServicesRequest, ListServicesResponse>
    @JvmStatic
    get() = ServiceUsageServiceGrpc.getListServicesMethod()

  public val enableServiceMethod: MethodDescriptor<EnableServiceRequest, Operation>
    @JvmStatic
    get() = ServiceUsageServiceGrpc.getEnableServiceMethod()

  public val disableServiceMethod: MethodDescriptor<DisableServiceRequest, Operation>
    @JvmStatic
    get() = ServiceUsageServiceGrpc.getDisableServiceMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.service_management.service_usage.v1alpha1.ServiceUsageService service as suspending coroutines.
   */
  @StubFor(ServiceUsageServiceGrpc::class)
  public class ServiceUsageServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ServiceUsageServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ServiceUsageServiceCoroutineStub = ServiceUsageServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listServices(request: ListServicesRequest, headers: Metadata = Metadata()): ListServicesResponse = unaryRpc(
      channel,
      ServiceUsageServiceGrpc.getListServicesMethod(),
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
    public suspend fun enableService(request: EnableServiceRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ServiceUsageServiceGrpc.getEnableServiceMethod(),
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
    public suspend fun disableService(request: DisableServiceRequest, headers: Metadata = Metadata()): Operation = unaryRpc(
      channel,
      ServiceUsageServiceGrpc.getDisableServiceMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the cbws.service_management.service_usage.v1alpha1.ServiceUsageService service based on Kotlin coroutines.
   */
  public abstract class ServiceUsageServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.service_management.service_usage.v1alpha1.ServiceUsageService.ListServices.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listServices(request: ListServicesRequest): ListServicesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.service_usage.v1alpha1.ServiceUsageService.ListServices is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.service_management.service_usage.v1alpha1.ServiceUsageService.EnableService.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun enableService(request: EnableServiceRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.service_usage.v1alpha1.ServiceUsageService.EnableService is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.service_management.service_usage.v1alpha1.ServiceUsageService.DisableService.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun disableService(request: DisableServiceRequest): Operation = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.service_usage.v1alpha1.ServiceUsageService.DisableService is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceUsageServiceGrpc.getListServicesMethod(),
      implementation = ::listServices
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceUsageServiceGrpc.getEnableServiceMethod(),
      implementation = ::enableService
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceUsageServiceGrpc.getDisableServiceMethod(),
      implementation = ::disableService
    )).build()
  }
}
