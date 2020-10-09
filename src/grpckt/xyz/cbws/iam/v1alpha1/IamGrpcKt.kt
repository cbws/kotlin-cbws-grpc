package xyz.cbws.iam.v1alpha1

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
import xyz.cbws.iam.policy.v1alpha1.GetPolicyRequest
import xyz.cbws.iam.policy.v1alpha1.Policy
import xyz.cbws.iam.policy.v1alpha1.SetPolicyRequest
import xyz.cbws.iam.v1alpha1.IAMServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for cbws.iam.v1alpha1.IAMService.
 */
object IAMServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = IAMServiceGrpc.getServiceDescriptor()

  val listServiceAccountsMethod: MethodDescriptor<ListServiceAccountsRequest,
      ListServiceAccountsResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getListServiceAccountsMethod()

  val getServiceAccountMethod: MethodDescriptor<GetServiceAccountRequest, ServiceAccount>
    @JvmStatic
    get() = IAMServiceGrpc.getGetServiceAccountMethod()

  val createServiceAccountMethod: MethodDescriptor<CreateServiceAccountRequest, ServiceAccount>
    @JvmStatic
    get() = IAMServiceGrpc.getCreateServiceAccountMethod()

  val updateServiceAccountMethod: MethodDescriptor<UpdateServiceAccountRequest, ServiceAccount>
    @JvmStatic
    get() = IAMServiceGrpc.getUpdateServiceAccountMethod()

  val deleteServiceAccountMethod: MethodDescriptor<DeleteServiceAccountRequest, Empty>
    @JvmStatic
    get() = IAMServiceGrpc.getDeleteServiceAccountMethod()

  val generateAccessTokenMethod: MethodDescriptor<GenerateAccessTokenRequest,
      GenerateAccessTokenResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getGenerateAccessTokenMethod()

  val listServiceAccountKeysMethod: MethodDescriptor<ListServiceAccountKeysRequest,
      ListServiceAccountKeysResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getListServiceAccountKeysMethod()

  val getServiceAccountKeyMethod: MethodDescriptor<GetServiceAccountKeyRequest, ServiceAccountKey>
    @JvmStatic
    get() = IAMServiceGrpc.getGetServiceAccountKeyMethod()

  val createServiceAccountKeyMethod: MethodDescriptor<CreateServiceAccountKeyRequest,
      ServiceAccountKey>
    @JvmStatic
    get() = IAMServiceGrpc.getCreateServiceAccountKeyMethod()

  val deleteServiceAccountKeyMethod: MethodDescriptor<DeleteServiceAccountKeyRequest, Empty>
    @JvmStatic
    get() = IAMServiceGrpc.getDeleteServiceAccountKeyMethod()

  val getPolicyMethod: MethodDescriptor<GetPolicyRequest, Policy>
    @JvmStatic
    get() = IAMServiceGrpc.getGetPolicyMethod()

  val setPolicyMethod: MethodDescriptor<SetPolicyRequest, Policy>
    @JvmStatic
    get() = IAMServiceGrpc.getSetPolicyMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.iam.v1alpha1.IAMService service as suspending coroutines.
   */
  @StubFor(IAMServiceGrpc::class)
  class IAMServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<IAMServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IAMServiceCoroutineStub =
        IAMServiceCoroutineStub(channel, callOptions)

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
    suspend fun listServiceAccounts(request: ListServiceAccountsRequest):
        ListServiceAccountsResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getListServiceAccountsMethod(),
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
    suspend fun getServiceAccount(request: GetServiceAccountRequest): ServiceAccount = unaryRpc(
      channel,
      IAMServiceGrpc.getGetServiceAccountMethod(),
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
    suspend fun createServiceAccount(request: CreateServiceAccountRequest): ServiceAccount =
        unaryRpc(
      channel,
      IAMServiceGrpc.getCreateServiceAccountMethod(),
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
    suspend fun updateServiceAccount(request: UpdateServiceAccountRequest): ServiceAccount =
        unaryRpc(
      channel,
      IAMServiceGrpc.getUpdateServiceAccountMethod(),
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
    suspend fun deleteServiceAccount(request: DeleteServiceAccountRequest): Empty = unaryRpc(
      channel,
      IAMServiceGrpc.getDeleteServiceAccountMethod(),
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
    suspend fun generateAccessToken(request: GenerateAccessTokenRequest):
        GenerateAccessTokenResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getGenerateAccessTokenMethod(),
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
    suspend fun listServiceAccountKeys(request: ListServiceAccountKeysRequest):
        ListServiceAccountKeysResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getListServiceAccountKeysMethod(),
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
    suspend fun getServiceAccountKey(request: GetServiceAccountKeyRequest): ServiceAccountKey =
        unaryRpc(
      channel,
      IAMServiceGrpc.getGetServiceAccountKeyMethod(),
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
    suspend fun createServiceAccountKey(request: CreateServiceAccountKeyRequest): ServiceAccountKey
        = unaryRpc(
      channel,
      IAMServiceGrpc.getCreateServiceAccountKeyMethod(),
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
    suspend fun deleteServiceAccountKey(request: DeleteServiceAccountKeyRequest): Empty = unaryRpc(
      channel,
      IAMServiceGrpc.getDeleteServiceAccountKeyMethod(),
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
      IAMServiceGrpc.getGetPolicyMethod(),
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
      IAMServiceGrpc.getSetPolicyMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cbws.iam.v1alpha1.IAMService service based on Kotlin coroutines.
   */
  abstract class IAMServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.ListServiceAccounts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listServiceAccounts(request: ListServiceAccountsRequest):
        ListServiceAccountsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.ListServiceAccounts is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getServiceAccount(request: GetServiceAccountRequest): ServiceAccount = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.CreateServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createServiceAccount(request: CreateServiceAccountRequest): ServiceAccount =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.CreateServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.UpdateServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateServiceAccount(request: UpdateServiceAccountRequest): ServiceAccount =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.UpdateServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.DeleteServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteServiceAccount(request: DeleteServiceAccountRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.DeleteServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GenerateAccessToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun generateAccessToken(request: GenerateAccessTokenRequest):
        GenerateAccessTokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GenerateAccessToken is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.ListServiceAccountKeys.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listServiceAccountKeys(request: ListServiceAccountKeysRequest):
        ListServiceAccountKeysResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.ListServiceAccountKeys is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getServiceAccountKey(request: GetServiceAccountKeyRequest): ServiceAccountKey =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.CreateServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createServiceAccountKey(request: CreateServiceAccountKeyRequest):
        ServiceAccountKey = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.CreateServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.DeleteServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteServiceAccountKey(request: DeleteServiceAccountKeyRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.DeleteServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetPolicy.
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
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.SetPolicy.
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
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.SetPolicy is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getListServiceAccountsMethod(),
      implementation = ::listServiceAccounts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getGetServiceAccountMethod(),
      implementation = ::getServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getCreateServiceAccountMethod(),
      implementation = ::createServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getUpdateServiceAccountMethod(),
      implementation = ::updateServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getDeleteServiceAccountMethod(),
      implementation = ::deleteServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getGenerateAccessTokenMethod(),
      implementation = ::generateAccessToken
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getListServiceAccountKeysMethod(),
      implementation = ::listServiceAccountKeys
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getGetServiceAccountKeyMethod(),
      implementation = ::getServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getCreateServiceAccountKeyMethod(),
      implementation = ::createServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getDeleteServiceAccountKeyMethod(),
      implementation = ::deleteServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getGetPolicyMethod(),
      implementation = ::getPolicy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IAMServiceGrpc.getSetPolicyMethod(),
      implementation = ::setPolicy
    )).build()
  }
}
