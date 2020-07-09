package cloudbear.accounts.identity.v1alpha1

import cloudbear.accounts.identity.v1alpha1.AccountsIdentityServiceGrpc.getServiceDescriptor
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
 * cloudbear.accounts.identity.v1alpha1.AccountsIdentityService.
 */
object AccountsIdentityServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AccountsIdentityServiceGrpc.getServiceDescriptor()

  val listUserGroupsMethod: MethodDescriptor<Accounts.ListUserGroupsRequest,
      Accounts.ListUserGroupsResponse>
    @JvmStatic
    get() = AccountsIdentityServiceGrpc.getListUserGroupsMethod()

  val listPrincipalsMethod: MethodDescriptor<Accounts.ListPrincipalsRequest,
      Accounts.ListPrincipalsResponse>
    @JvmStatic
    get() = AccountsIdentityServiceGrpc.getListPrincipalsMethod()

  /**
   * A stub for issuing RPCs to a(n) cloudbear.accounts.identity.v1alpha1.AccountsIdentityService
   * service as suspending coroutines.
   */
  @StubFor(AccountsIdentityServiceGrpc::class)
  class AccountsIdentityServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AccountsIdentityServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AccountsIdentityServiceCoroutineStub = AccountsIdentityServiceCoroutineStub(channel,
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
    suspend fun listUserGroups(request: Accounts.ListUserGroupsRequest):
        Accounts.ListUserGroupsResponse = unaryRpc(
      channel,
      AccountsIdentityServiceGrpc.getListUserGroupsMethod(),
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
    suspend fun listPrincipals(request: Accounts.ListPrincipalsRequest):
        Accounts.ListPrincipalsResponse = unaryRpc(
      channel,
      AccountsIdentityServiceGrpc.getListPrincipalsMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cloudbear.accounts.identity.v1alpha1.AccountsIdentityService
   * service based on Kotlin coroutines.
   */
  abstract class AccountsIdentityServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.identity.v1alpha1.AccountsIdentityService.ListUserGroups.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listUserGroups(request: Accounts.ListUserGroupsRequest):
        Accounts.ListUserGroupsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.identity.v1alpha1.AccountsIdentityService.ListUserGroups is unimplemented"))

    /**
     * Returns the response to an RPC for
     * cloudbear.accounts.identity.v1alpha1.AccountsIdentityService.ListPrincipals.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listPrincipals(request: Accounts.ListPrincipalsRequest):
        Accounts.ListPrincipalsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.identity.v1alpha1.AccountsIdentityService.ListPrincipals is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsIdentityServiceGrpc.getListUserGroupsMethod(),
      implementation = ::listUserGroups
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsIdentityServiceGrpc.getListPrincipalsMethod(),
      implementation = ::listPrincipals
    )).build()
  }
}
