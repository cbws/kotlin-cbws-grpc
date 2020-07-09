package cloudbear.accounts.v1alpha1

import cloudbear.accounts.v1alpha1.AccountsServiceGrpc.getServiceDescriptor
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
 * cloudbear.accounts.v1alpha1.AccountsService.
 */
object AccountsServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AccountsServiceGrpc.getServiceDescriptor()

  val whoAmIMethod: MethodDescriptor<Accounts.WhoAmIRequest, Accounts.WhoAmIResponse>
    @JvmStatic
    get() = AccountsServiceGrpc.getWhoAmIMethod()

  val getPrincipalMethod: MethodDescriptor<Accounts.GetPrincipalRequest,
      PrincipalOuterClass.Principal>
    @JvmStatic
    get() = AccountsServiceGrpc.getGetPrincipalMethod()

  val getUserMethod: MethodDescriptor<Accounts.GetUserRequest, UserOuterClass.User>
    @JvmStatic
    get() = AccountsServiceGrpc.getGetUserMethod()

  val getGroupMethod: MethodDescriptor<Accounts.GetGroupRequest, GroupOuterClass.Group>
    @JvmStatic
    get() = AccountsServiceGrpc.getGetGroupMethod()

  /**
   * A stub for issuing RPCs to a(n) cloudbear.accounts.v1alpha1.AccountsService service as
   * suspending coroutines.
   */
  @StubFor(AccountsServiceGrpc::class)
  class AccountsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AccountsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AccountsServiceCoroutineStub =
        AccountsServiceCoroutineStub(channel, callOptions)

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
    suspend fun whoAmI(request: Accounts.WhoAmIRequest): Accounts.WhoAmIResponse = unaryRpc(
      channel,
      AccountsServiceGrpc.getWhoAmIMethod(),
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
    suspend fun getPrincipal(request: Accounts.GetPrincipalRequest): PrincipalOuterClass.Principal =
        unaryRpc(
      channel,
      AccountsServiceGrpc.getGetPrincipalMethod(),
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
    suspend fun getUser(request: Accounts.GetUserRequest): UserOuterClass.User = unaryRpc(
      channel,
      AccountsServiceGrpc.getGetUserMethod(),
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
    suspend fun getGroup(request: Accounts.GetGroupRequest): GroupOuterClass.Group = unaryRpc(
      channel,
      AccountsServiceGrpc.getGetGroupMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cloudbear.accounts.v1alpha1.AccountsService service based on
   * Kotlin coroutines.
   */
  abstract class AccountsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cloudbear.accounts.v1alpha1.AccountsService.WhoAmI.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun whoAmI(request: Accounts.WhoAmIRequest): Accounts.WhoAmIResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.v1alpha1.AccountsService.WhoAmI is unimplemented"))

    /**
     * Returns the response to an RPC for cloudbear.accounts.v1alpha1.AccountsService.GetPrincipal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getPrincipal(request: Accounts.GetPrincipalRequest):
        PrincipalOuterClass.Principal = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.v1alpha1.AccountsService.GetPrincipal is unimplemented"))

    /**
     * Returns the response to an RPC for cloudbear.accounts.v1alpha1.AccountsService.GetUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getUser(request: Accounts.GetUserRequest): UserOuterClass.User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.v1alpha1.AccountsService.GetUser is unimplemented"))

    /**
     * Returns the response to an RPC for cloudbear.accounts.v1alpha1.AccountsService.GetGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getGroup(request: Accounts.GetGroupRequest): GroupOuterClass.Group = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cloudbear.accounts.v1alpha1.AccountsService.GetGroup is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsServiceGrpc.getWhoAmIMethod(),
      implementation = ::whoAmI
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsServiceGrpc.getGetPrincipalMethod(),
      implementation = ::getPrincipal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsServiceGrpc.getGetUserMethod(),
      implementation = ::getUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountsServiceGrpc.getGetGroupMethod(),
      implementation = ::getGroup
    )).build()
  }
}
