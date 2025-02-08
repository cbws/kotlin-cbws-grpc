package cloud.cbws.api.iam.v1alpha1

import cloud.cbws.api.iam.policy.v1alpha1.GetPolicyRequest
import cloud.cbws.api.iam.policy.v1alpha1.Policy
import cloud.cbws.api.iam.policy.v1alpha1.SetPolicyRequest
import cloud.cbws.api.iam.v1alpha1.IAMServiceGrpc.getServiceDescriptor
import com.google.protobuf.Empty
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
 * Holder for Kotlin coroutine-based client and server APIs for cbws.iam.v1alpha1.IAMService.
 */
public object IAMServiceGrpcKt {
  public const val SERVICE_NAME: String = IAMServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listServiceAccountsMethod:
      MethodDescriptor<ListServiceAccountsRequest, ListServiceAccountsResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getListServiceAccountsMethod()

  public val getServiceAccountMethod: MethodDescriptor<GetServiceAccountRequest, ServiceAccount>
    @JvmStatic
    get() = IAMServiceGrpc.getGetServiceAccountMethod()

  public val createServiceAccountMethod:
      MethodDescriptor<CreateServiceAccountRequest, ServiceAccount>
    @JvmStatic
    get() = IAMServiceGrpc.getCreateServiceAccountMethod()

  public val deleteServiceAccountMethod: MethodDescriptor<DeleteServiceAccountRequest, Empty>
    @JvmStatic
    get() = IAMServiceGrpc.getDeleteServiceAccountMethod()

  public val generateAccessTokenMethod:
      MethodDescriptor<GenerateAccessTokenRequest, GenerateAccessTokenResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getGenerateAccessTokenMethod()

  public val listServiceAccountKeysMethod:
      MethodDescriptor<ListServiceAccountKeysRequest, ListServiceAccountKeysResponse>
    @JvmStatic
    get() = IAMServiceGrpc.getListServiceAccountKeysMethod()

  public val getServiceAccountKeyMethod:
      MethodDescriptor<GetServiceAccountKeyRequest, ServiceAccountKey>
    @JvmStatic
    get() = IAMServiceGrpc.getGetServiceAccountKeyMethod()

  public val createServiceAccountKeyMethod:
      MethodDescriptor<CreateServiceAccountKeyRequest, ServiceAccountKey>
    @JvmStatic
    get() = IAMServiceGrpc.getCreateServiceAccountKeyMethod()

  public val deleteServiceAccountKeyMethod: MethodDescriptor<DeleteServiceAccountKeyRequest, Empty>
    @JvmStatic
    get() = IAMServiceGrpc.getDeleteServiceAccountKeyMethod()

  public val getPolicyMethod: MethodDescriptor<GetPolicyRequest, Policy>
    @JvmStatic
    get() = IAMServiceGrpc.getGetPolicyMethod()

  public val setPolicyMethod: MethodDescriptor<SetPolicyRequest, Policy>
    @JvmStatic
    get() = IAMServiceGrpc.getSetPolicyMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.iam.v1alpha1.IAMService service as suspending coroutines.
   */
  @StubFor(IAMServiceGrpc::class)
  public class IAMServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IAMServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IAMServiceCoroutineStub = IAMServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listServiceAccounts(request: ListServiceAccountsRequest, headers: Metadata = Metadata()): ListServiceAccountsResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getListServiceAccountsMethod(),
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
    public suspend fun getServiceAccount(request: GetServiceAccountRequest, headers: Metadata = Metadata()): ServiceAccount = unaryRpc(
      channel,
      IAMServiceGrpc.getGetServiceAccountMethod(),
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
    public suspend fun createServiceAccount(request: CreateServiceAccountRequest, headers: Metadata = Metadata()): ServiceAccount = unaryRpc(
      channel,
      IAMServiceGrpc.getCreateServiceAccountMethod(),
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
    public suspend fun deleteServiceAccount(request: DeleteServiceAccountRequest, headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      IAMServiceGrpc.getDeleteServiceAccountMethod(),
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
    public suspend fun generateAccessToken(request: GenerateAccessTokenRequest, headers: Metadata = Metadata()): GenerateAccessTokenResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getGenerateAccessTokenMethod(),
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
    public suspend fun listServiceAccountKeys(request: ListServiceAccountKeysRequest, headers: Metadata = Metadata()): ListServiceAccountKeysResponse = unaryRpc(
      channel,
      IAMServiceGrpc.getListServiceAccountKeysMethod(),
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
    public suspend fun getServiceAccountKey(request: GetServiceAccountKeyRequest, headers: Metadata = Metadata()): ServiceAccountKey = unaryRpc(
      channel,
      IAMServiceGrpc.getGetServiceAccountKeyMethod(),
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
    public suspend fun createServiceAccountKey(request: CreateServiceAccountKeyRequest, headers: Metadata = Metadata()): ServiceAccountKey = unaryRpc(
      channel,
      IAMServiceGrpc.getCreateServiceAccountKeyMethod(),
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
    public suspend fun deleteServiceAccountKey(request: DeleteServiceAccountKeyRequest, headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      IAMServiceGrpc.getDeleteServiceAccountKeyMethod(),
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
    public suspend fun getPolicy(request: GetPolicyRequest, headers: Metadata = Metadata()): Policy = unaryRpc(
      channel,
      IAMServiceGrpc.getGetPolicyMethod(),
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
    public suspend fun setPolicy(request: SetPolicyRequest, headers: Metadata = Metadata()): Policy = unaryRpc(
      channel,
      IAMServiceGrpc.getSetPolicyMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the cbws.iam.v1alpha1.IAMService service based on Kotlin coroutines.
   */
  public abstract class IAMServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.ListServiceAccounts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listServiceAccounts(request: ListServiceAccountsRequest): ListServiceAccountsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.ListServiceAccounts is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getServiceAccount(request: GetServiceAccountRequest): ServiceAccount = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.CreateServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createServiceAccount(request: CreateServiceAccountRequest): ServiceAccount = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.CreateServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.DeleteServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteServiceAccount(request: DeleteServiceAccountRequest): Empty = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.DeleteServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GenerateAccessToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun generateAccessToken(request: GenerateAccessTokenRequest): GenerateAccessTokenResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GenerateAccessToken is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.ListServiceAccountKeys.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listServiceAccountKeys(request: ListServiceAccountKeysRequest): ListServiceAccountKeysResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.ListServiceAccountKeys is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getServiceAccountKey(request: GetServiceAccountKeyRequest): ServiceAccountKey = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.CreateServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createServiceAccountKey(request: CreateServiceAccountKeyRequest): ServiceAccountKey = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.CreateServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.DeleteServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteServiceAccountKey(request: DeleteServiceAccountKeyRequest): Empty = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.DeleteServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.GetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPolicy(request: GetPolicyRequest): Policy = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.GetPolicy is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.iam.v1alpha1.IAMService.SetPolicy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setPolicy(request: SetPolicyRequest): Policy = throw StatusException(UNIMPLEMENTED.withDescription("Method cbws.iam.v1alpha1.IAMService.SetPolicy is unimplemented"))

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
