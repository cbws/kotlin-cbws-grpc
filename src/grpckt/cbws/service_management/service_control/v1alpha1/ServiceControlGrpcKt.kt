package cbws.service_management.service_control.v1alpha1

import cbws.service_management.service_control.v1alpha1.ServiceControlServiceGrpc.getServiceDescriptor
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
 * cbws.service_management.service_control.v1alpha1.ServiceControlService.
 */
object ServiceControlServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ServiceControlServiceGrpc.getServiceDescriptor()

  val checkMethod: MethodDescriptor<ServiceControl.CheckRequest, ServiceControl.CheckResponse>
    @JvmStatic
    get() = ServiceControlServiceGrpc.getCheckMethod()

  val reportMethod: MethodDescriptor<ServiceControl.ReportRequest, ServiceControl.ReportResponse>
    @JvmStatic
    get() = ServiceControlServiceGrpc.getReportMethod()

  /**
   * A stub for issuing RPCs to a(n)
   * cbws.service_management.service_control.v1alpha1.ServiceControlService service as suspending
   * coroutines.
   */
  @StubFor(ServiceControlServiceGrpc::class)
  class ServiceControlServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ServiceControlServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ServiceControlServiceCoroutineStub = ServiceControlServiceCoroutineStub(channel,
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
    suspend fun check(request: ServiceControl.CheckRequest): ServiceControl.CheckResponse =
        unaryRpc(
      channel,
      ServiceControlServiceGrpc.getCheckMethod(),
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
    suspend fun report(request: ServiceControl.ReportRequest): ServiceControl.ReportResponse =
        unaryRpc(
      channel,
      ServiceControlServiceGrpc.getReportMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the
   * cbws.service_management.service_control.v1alpha1.ServiceControlService service based on Kotlin
   * coroutines.
   */
  abstract class ServiceControlServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cbws.service_management.service_control.v1alpha1.ServiceControlService.Check.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun check(request: ServiceControl.CheckRequest): ServiceControl.CheckResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.service_control.v1alpha1.ServiceControlService.Check is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.service_management.service_control.v1alpha1.ServiceControlService.Report.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun report(request: ServiceControl.ReportRequest): ServiceControl.ReportResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.service_management.service_control.v1alpha1.ServiceControlService.Report is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceControlServiceGrpc.getCheckMethod(),
      implementation = ::check
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceControlServiceGrpc.getReportMethod(),
      implementation = ::report
    )).build()
  }
}
