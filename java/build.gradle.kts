// The messages and the gRPC clients, for any JVM language.
plugins {
    `java-library`
    `maven-publish`
}

// Java 8 is the oldest release protobuf-java and grpc-java support, and Android builds take it.
tasks.withType<JavaCompile>().configureEach {
    options.release.set(8)
}

// The generated code checks at class initialization that the protobuf runtime is at least the
// version of protoc that generated it, 4.30.2 for protoc 30.2. The gRPC version is the one of the
// grpc-java plugin.
dependencies {
    api("com.google.protobuf:protobuf-java:4.30.2")
    api("io.grpc:grpc-protobuf:1.78.0")
    api("io.grpc:grpc-stub:1.78.0")
    // google.api, google.rpc and google.longrunning, including the Java client of
    // google.longrunning.Operations.
    api("com.google.api.grpc:proto-google-common-protos:2.78.0")
    api("com.google.api.grpc:grpc-google-common-protos:2.78.0")
}
