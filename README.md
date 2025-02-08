# Generated Java and Kotlin gRPC libraries for CBWS

This repository contains the Java and Kotlin libraries for the public CBWS APIs: the messages and the gRPC clients. A process generates them from the definitions in [cbws/protobufs](https://github.com/cbws/protobufs). Do not change the generated files by hand.

## Libraries

| Library | Contents | Java release |
|---|---|---|
| `cloud.cbws:cbws-api` | The messages and the gRPC clients. Use it from Java, Kotlin, Scala or any other JVM language. | 8 or later |
| `cloud.cbws:cbws-api-kotlin` | The Kotlin message builders and the coroutine gRPC clients. It includes `cbws-api`. | 17 or later |

Each API version is a package, for example `cloud.cbws.api.vpc.v1alpha1`.

The libraries use the full protobuf runtime, `protobuf-java`. Do not use them together with `protobuf-javalite`.

## Installation

To add the Java library to a Gradle project, add this dependency:

```kotlin
implementation("cloud.cbws:cbws-api:VERSION")
```

To add the Kotlin library, add this dependency:

```kotlin
implementation("cloud.cbws:cbws-api-kotlin:VERSION")
```

Also add a gRPC transport, for example `io.grpc:grpc-netty-shaded` for a server application or `io.grpc:grpc-okhttp` for Android.

The libraries are published to GitHub Packages. Add this repository to your project. GitHub Packages needs a GitHub token with the `read:packages` scope, also for public packages:

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/cbws/kotlin-cbws-grpc")
        credentials {
            username = "GITHUB_USER"
            password = "GITHUB_TOKEN"
        }
    }
}
```

## Versions

The tags of this repository have the same version numbers as the tags of [cbws/protobufs](https://github.com/cbws/protobufs). Each commit names the commit of cbws/protobufs it was generated from.

## License

The libraries are available under the Apache License, Version 2.0. Refer to the `LICENSE` file.
