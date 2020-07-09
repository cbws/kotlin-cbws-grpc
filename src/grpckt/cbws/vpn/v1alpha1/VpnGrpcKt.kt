package cbws.vpn.v1alpha1

import cbws.vpn.v1alpha1.VPNServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for cbws.vpn.v1alpha1.VPNService.
 */
object VPNServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = VPNServiceGrpc.getServiceDescriptor()

  val listInstancesMethod: MethodDescriptor<Vpn.ListInstancesRequest, Vpn.ListInstancesResponse>
    @JvmStatic
    get() = VPNServiceGrpc.getListInstancesMethod()

  val getInstanceMethod: MethodDescriptor<Vpn.GetInstanceRequest, InstanceOuterClass.Instance>
    @JvmStatic
    get() = VPNServiceGrpc.getGetInstanceMethod()

  val createInstanceMethod: MethodDescriptor<Vpn.CreateInstanceRequest, InstanceOuterClass.Instance>
    @JvmStatic
    get() = VPNServiceGrpc.getCreateInstanceMethod()

  val updateInstanceMethod: MethodDescriptor<Vpn.UpdateInstanceRequest, InstanceOuterClass.Instance>
    @JvmStatic
    get() = VPNServiceGrpc.getUpdateInstanceMethod()

  val deleteInstanceMethod: MethodDescriptor<Vpn.DeleteInstanceRequest, Empty>
    @JvmStatic
    get() = VPNServiceGrpc.getDeleteInstanceMethod()

  val listProfilesMethod: MethodDescriptor<Vpn.ListProfilesRequest, Vpn.ListProfilesResponse>
    @JvmStatic
    get() = VPNServiceGrpc.getListProfilesMethod()

  val getProfileMethod: MethodDescriptor<Vpn.GetProfileRequest, InstanceOuterClass.Profile>
    @JvmStatic
    get() = VPNServiceGrpc.getGetProfileMethod()

  val createProfileMethod: MethodDescriptor<Vpn.CreateProfileRequest, InstanceOuterClass.Profile>
    @JvmStatic
    get() = VPNServiceGrpc.getCreateProfileMethod()

  val updateProfileMethod: MethodDescriptor<Vpn.UpdateProfileRequest, InstanceOuterClass.Profile>
    @JvmStatic
    get() = VPNServiceGrpc.getUpdateProfileMethod()

  val deleteProfileMethod: MethodDescriptor<Vpn.DeleteProfileRequest, Empty>
    @JvmStatic
    get() = VPNServiceGrpc.getDeleteProfileMethod()

  /**
   * A stub for issuing RPCs to a(n) cbws.vpn.v1alpha1.VPNService service as suspending coroutines.
   */
  @StubFor(VPNServiceGrpc::class)
  class VPNServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<VPNServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): VPNServiceCoroutineStub =
        VPNServiceCoroutineStub(channel, callOptions)

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
    suspend fun listInstances(request: Vpn.ListInstancesRequest): Vpn.ListInstancesResponse =
        unaryRpc(
      channel,
      VPNServiceGrpc.getListInstancesMethod(),
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
    suspend fun getInstance(request: Vpn.GetInstanceRequest): InstanceOuterClass.Instance =
        unaryRpc(
      channel,
      VPNServiceGrpc.getGetInstanceMethod(),
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
    suspend fun createInstance(request: Vpn.CreateInstanceRequest): InstanceOuterClass.Instance =
        unaryRpc(
      channel,
      VPNServiceGrpc.getCreateInstanceMethod(),
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
    suspend fun updateInstance(request: Vpn.UpdateInstanceRequest): InstanceOuterClass.Instance =
        unaryRpc(
      channel,
      VPNServiceGrpc.getUpdateInstanceMethod(),
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
    suspend fun deleteInstance(request: Vpn.DeleteInstanceRequest): Empty = unaryRpc(
      channel,
      VPNServiceGrpc.getDeleteInstanceMethod(),
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
    suspend fun listProfiles(request: Vpn.ListProfilesRequest): Vpn.ListProfilesResponse = unaryRpc(
      channel,
      VPNServiceGrpc.getListProfilesMethod(),
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
    suspend fun getProfile(request: Vpn.GetProfileRequest): InstanceOuterClass.Profile = unaryRpc(
      channel,
      VPNServiceGrpc.getGetProfileMethod(),
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
    suspend fun createProfile(request: Vpn.CreateProfileRequest): InstanceOuterClass.Profile =
        unaryRpc(
      channel,
      VPNServiceGrpc.getCreateProfileMethod(),
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
    suspend fun updateProfile(request: Vpn.UpdateProfileRequest): InstanceOuterClass.Profile =
        unaryRpc(
      channel,
      VPNServiceGrpc.getUpdateProfileMethod(),
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
    suspend fun deleteProfile(request: Vpn.DeleteProfileRequest): Empty = unaryRpc(
      channel,
      VPNServiceGrpc.getDeleteProfileMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the cbws.vpn.v1alpha1.VPNService service based on Kotlin coroutines.
   */
  abstract class VPNServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.ListInstances.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listInstances(request: Vpn.ListInstancesRequest): Vpn.ListInstancesResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.ListInstances is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.GetInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getInstance(request: Vpn.GetInstanceRequest): InstanceOuterClass.Instance =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.GetInstance is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.CreateInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createInstance(request: Vpn.CreateInstanceRequest): InstanceOuterClass.Instance
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.CreateInstance is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.UpdateInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateInstance(request: Vpn.UpdateInstanceRequest): InstanceOuterClass.Instance
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.UpdateInstance is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.DeleteInstance.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteInstance(request: Vpn.DeleteInstanceRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.DeleteInstance is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.ListProfiles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listProfiles(request: Vpn.ListProfilesRequest): Vpn.ListProfilesResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.ListProfiles is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.GetProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProfile(request: Vpn.GetProfileRequest): InstanceOuterClass.Profile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.GetProfile is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.CreateProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createProfile(request: Vpn.CreateProfileRequest): InstanceOuterClass.Profile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.CreateProfile is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.UpdateProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateProfile(request: Vpn.UpdateProfileRequest): InstanceOuterClass.Profile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.UpdateProfile is unimplemented"))

    /**
     * Returns the response to an RPC for cbws.vpn.v1alpha1.VPNService.DeleteProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteProfile(request: Vpn.DeleteProfileRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method cbws.vpn.v1alpha1.VPNService.DeleteProfile is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getListInstancesMethod(),
      implementation = ::listInstances
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getGetInstanceMethod(),
      implementation = ::getInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getCreateInstanceMethod(),
      implementation = ::createInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getUpdateInstanceMethod(),
      implementation = ::updateInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getDeleteInstanceMethod(),
      implementation = ::deleteInstance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getListProfilesMethod(),
      implementation = ::listProfiles
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getGetProfileMethod(),
      implementation = ::getProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getCreateProfileMethod(),
      implementation = ::createProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getUpdateProfileMethod(),
      implementation = ::updateProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VPNServiceGrpc.getDeleteProfileMethod(),
      implementation = ::deleteProfile
    )).build()
  }
}
