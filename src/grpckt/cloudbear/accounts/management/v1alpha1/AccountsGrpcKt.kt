package cloudbear.accounts.management.v1alpha1

import cloudbear.accounts.management.v1alpha1.AccountsManagementServiceGrpc.getServiceDescriptor
import cloudbear.accounts.v1alpha1.ServiceAccountOuterClass
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
 * cloudbear.accounts.management.v1alpha1.AccountsManagementService.
 */
object AccountsManagementServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AccountsManagementServiceGrpc.getServiceDescriptor()

  val listServiceAccountsMethod: MethodDescriptor<Accounts.ListServiceAccountsRequest,
      Accounts.ListServiceAccountsResponse>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getListServiceAccountsMethod()

  val getServiceAccountMethod: MethodDescriptor<Accounts.GetServiceAccountRequest,
      ServiceAccountOuterClass.ServiceAccount>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getGetServiceAccountMethod()

  val createServiceAccountMethod: MethodDescriptor<Accounts.CreateServiceAccountRequest,
      ServiceAccountOuterClass.ServiceAccount>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getCreateServiceAccountMethod()

  val updateServiceAccountMethod: MethodDescriptor<Accounts.UpdateServiceAccountRequest,
      ServiceAccountOuterClass.ServiceAccount>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getUpdateServiceAccountMethod()

  val deleteServiceAccountMethod: MethodDescriptor<Accounts.DeleteServiceAccountRequest, Empty>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getDeleteServiceAccountMethod()

  val listServiceAccountKeysMethod: MethodDescriptor<Accounts.ListServiceAccountKeysRequest,
      Accounts.ListServiceAccountKeysResponse>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getListServiceAccountKeysMethod()

  val getServiceAccountKeyMethod: MethodDescriptor<Accounts.GetServiceAccountKeyRequest,
      ServiceAccountKeyOuterClass.ServiceAccountKey>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod()

  val createServiceAccountKeyMethod: MethodDescriptor<Accounts.CreateServiceAccountKeyRequest,
      ServiceAccountKeyOuterClass.ServiceAccountKey>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod()

  val deleteServiceAccountKeyMethod: MethodDescriptor<Accounts.DeleteServiceAccountKeyRequest,
      Empty>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod()

  val generateAccessTokenMethod: MethodDescriptor<Accounts.GenerateAccessTokenRequest,
      Accounts.GenerateAccessTokenResponse>
    @JvmStatic
    get() = AccountsManagementServiceGrpc.getGenerateAccessTokenMethod()

  /**
   * A stub for issuing RPCs to a(n)
   * cloudbear.accounts.management.v1alpha1.AccountsManagementService service as suspending coroutines.
   */
  @StubFor(AccountsManagementServiceGrpc::class)
  class AccountsManagementServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AccountsManagementServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AccountsManagementServiceCoroutineStub = AccountsManagementServiceCoroutineStub(channel,
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
    suspend fun listServiceAccounts(request: Accounts.ListServiceAccountsRequest):
        Accounts.ListServiceAccountsResponse = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getListServiceAccountsMethod(),
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
    suspend fun getServiceAccount(request: Accounts.GetServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getGetServiceAccountMethod(),
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
    suspend fun createServiceAccount(request: Accounts.CreateServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getCreateServiceAccountMethod(),
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
    suspend fun updateServiceAccount(request: Accounts.UpdateServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getUpdateServiceAccountMethod(),
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
    suspend fun deleteServiceAccount(request: Accounts.DeleteServiceAccountRequest): Empty =
        unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getDeleteServiceAccountMethod(),
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
    suspend fun listServiceAccountKeys(request: Accounts.ListServiceAccountKeysRequest):
        Accounts.ListServiceAccountKeysResponse = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getListServiceAccountKeysMethod(),
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
    suspend fun getServiceAccountKey(request: Accounts.GetServiceAccountKeyRequest):
        ServiceAccountKeyOuterClass.ServiceAccountKey = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod(),
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
    suspend fun createServiceAccountKey(request: Accounts.CreateServiceAccountKeyRequest):
        ServiceAccountKeyOuterClass.ServiceAccountKey = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod(),
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
    suspend fun deleteServiceAccountKey(request: Accounts.DeleteServiceAccountKeyRequest): Empty =
        unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod(),
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
    suspend fun generateAccessToken(request: Accounts.GenerateAccessTokenRequest):
        Accounts.GenerateAccessTokenResponse = unaryRpc(
      channel,
      AccountsManagementServiceGrpc.getGenerateAccessTokenMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cloudbear.accounts.management.v1alpha1.AccountsManagementService
   * service based on Kotlin coroutines.
   */
  abstract class AccountsManagementServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.ListServiceAccounts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listServiceAccounts(request: Accounts.ListServiceAccountsRequest):
        Accounts.ListServiceAccountsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.ListServiceAccounts is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.GetServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getServiceAccount(request: Accounts.GetServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.GetServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.CreateServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createServiceAccount(request: Accounts.CreateServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.CreateServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.UpdateServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateServiceAccount(request: Accounts.UpdateServiceAccountRequest):
        ServiceAccountOuterClass.ServiceAccount = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.UpdateServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.DeleteServiceAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteServiceAccount(request: Accounts.DeleteServiceAccountRequest): Empty =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.DeleteServiceAccount is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.ListServiceAccountKeys.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listServiceAccountKeys(request: Accounts.ListServiceAccountKeysRequest):
        Accounts.ListServiceAccountKeysResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.ListServiceAccountKeys is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.GetServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getServiceAccountKey(request: Accounts.GetServiceAccountKeyRequest):
        ServiceAccountKeyOuterClass.ServiceAccountKey = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.GetServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.CreateServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createServiceAccountKey(request: Accounts.CreateServiceAccountKeyRequest):
        ServiceAccountKeyOuterClass.ServiceAccountKey = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.CreateServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.DeleteServiceAccountKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteServiceAccountKey(request: Accounts.DeleteServiceAccountKeyRequest):
        Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.DeleteServiceAccountKey is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.management.v1alpha1.AccountsManagementService.GenerateAccessToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun generateAccessToken(request: Accounts.GenerateAccessTokenRequest):
        Accounts.GenerateAccessTokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.management.v1alpha1.AccountsManagementService.GenerateAccessToken is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getListServiceAccountsMethod(),
      implementation = ::listServiceAccounts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getGetServiceAccountMethod(),
      implementation = ::getServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getCreateServiceAccountMethod(),
      implementation = ::createServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getUpdateServiceAccountMethod(),
      implementation = ::updateServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getDeleteServiceAccountMethod(),
      implementation = ::deleteServiceAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getListServiceAccountKeysMethod(),
      implementation = ::listServiceAccountKeys
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getGetServiceAccountKeyMethod(),
      implementation = ::getServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getCreateServiceAccountKeyMethod(),
      implementation = ::createServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getDeleteServiceAccountKeyMethod(),
      implementation = ::deleteServiceAccountKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsManagementServiceGrpc.getGenerateAccessTokenMethod(),
      implementation = ::generateAccessToken
    )).build()
  }
}
