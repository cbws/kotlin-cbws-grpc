package cbws.iam.service_backchannel.v1alpha1

import cbws.iam.policy.v1alpha1.PolicyOuterClass
import cbws.iam.policy.v1alpha1.RequestResponse
import cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelServiceGrpc.getServiceDescriptor
import com.google.protobuf.Empty
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
 * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.
 */
object IAMServiceBackchannelServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = IAMServiceBackchannelServiceGrpc.getServiceDescriptor()

  val checkPermissionsMethod: MethodDescriptor<ServiceBackchannel.CheckPermissionsRequest,
      ServiceBackchannel.CheckPermissionsResponse>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod()

  val lookupResourceAccessMethod: MethodDescriptor<ServiceBackchannel.LookupResourceAccessRequest,
      ServiceBackchannel.LookupResourceAccessResponse>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod()

  val setResourceParentMethod: MethodDescriptor<ServiceBackchannel.SetResourceParentRequest, Empty>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod()

  val getPolicyMethod: MethodDescriptor<RequestResponse.GetPolicyRequest, PolicyOuterClass.Policy>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getGetPolicyMethod()

  val setPolicyMethod: MethodDescriptor<RequestResponse.SetPolicyRequest, PolicyOuterClass.Policy>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getSetPolicyMethod()

  val testPermissionsMethod: MethodDescriptor<RequestResponse.TestPermissionsRequest,
      RequestResponse.TestPermissionsResponse>
    @JvmStatic
    get() = IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod()

  /**
   * A stub for issuing RPCs to a(n)
   * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService service as suspending
   * coroutines.
   */
  @StubFor(IAMServiceBackchannelServiceGrpc::class)
  class IAMServiceBackchannelServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<IAMServiceBackchannelServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        IAMServiceBackchannelServiceCoroutineStub =
        IAMServiceBackchannelServiceCoroutineStub(channel, callOptions)

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
    suspend fun checkPermissions(request: ServiceBackchannel.CheckPermissionsRequest):
        ServiceBackchannel.CheckPermissionsResponse = unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod(),
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
    suspend fun lookupResourceAccess(request: ServiceBackchannel.LookupResourceAccessRequest):
        ServiceBackchannel.LookupResourceAccessResponse = unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod(),
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
    suspend fun setResourceParent(request: ServiceBackchannel.SetResourceParentRequest): Empty =
        unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod(),
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
    suspend fun getPolicy(request: RequestResponse.GetPolicyRequest): PolicyOuterClass.Policy =
        unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getGetPolicyMethod(),
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
    suspend fun setPolicy(request: RequestResponse.SetPolicyRequest): PolicyOuterClass.Policy =
        unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getSetPolicyMethod(),
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
    suspend fun testPermissions(request: RequestResponse.TestPermissionsRequest):
        RequestResponse.TestPermissionsResponse = unaryRpc(
      channel,
      IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the
   * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService service based on Kotlin
   * coroutines.
   */
  abstract class IAMServiceBackchannelServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.CheckPermissions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun checkPermissions(request: ServiceBackchannel.CheckPermissionsRequest):
        ServiceBackchannel.CheckPermissionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.CheckPermissions is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.LookupResourceAccess.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun lookupResourceAccess(request: ServiceBackchannel.LookupResourceAccessRequest):
        ServiceBackchannel.LookupResourceAccessResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.LookupResourceAccess is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.SetResourceParent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun setResourceParent(request: ServiceBackchannel.SetResourceParentRequest): Empty
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.SetResourceParent is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.GetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getPolicy(request: RequestResponse.GetPolicyRequest): PolicyOuterClass.Policy =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.GetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.SetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun setPolicy(request: RequestResponse.SetPolicyRequest): PolicyOuterClass.Policy =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.SetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.TestPermissions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun testPermissions(request: RequestResponse.TestPermissionsRequest):
        RequestResponse.TestPermissionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.service_backchannel.v1alpha1.IAMServiceBackchannelService.TestPermissions is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getCheckPermissionsMethod(),
      implementation = ::checkPermissions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getLookupResourceAccessMethod(),
      implementation = ::lookupResourceAccess
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getSetResourceParentMethod(),
      implementation = ::setResourceParent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getGetPolicyMethod(),
      implementation = ::getPolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getSetPolicyMethod(),
      implementation = ::setPolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceBackchannelServiceGrpc.getTestPermissionsMethod(),
      implementation = ::testPermissions
    )).build()
  }
}
