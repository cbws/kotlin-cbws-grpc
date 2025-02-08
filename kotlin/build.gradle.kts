// The Kotlin message builders and coroutine clients, on top of the Java library.
plugins {
    kotlin("jvm")
    `maven-publish`
}

// Java 17, the oldest release grpc-kotlin-stub supports.
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

// protobuf-kotlin follows protobuf-java, and grpc-kotlin-stub is the version of the grpc-kotlin
// plugin.
dependencies {
    api(project(":cbws-api"))
    api("com.google.protobuf:protobuf-kotlin:4.30.2")
    api("io.grpc:grpc-kotlin-stub:1.5.0")
}
