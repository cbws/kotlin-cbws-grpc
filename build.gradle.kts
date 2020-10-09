plugins {
    kotlin("jvm") version "1.3.61" 
}

sourceSets.main {
    java.srcDirs("src/grpc", "src/grpckt", "src/java")
}

repositories {
    jcenter() 
}

dependencies {
    implementation(kotlin("stdlib")) 
    api("com.google.api:gax-grpc:1.57.1") {
        exclude("com.google.protobuf", "protobuf-java")
    }
    implementation("com.google.protobuf:protobuf-java-util:3.12.0") {
        exclude("com.google.api.grpc", "proto-google-common-protos")
    }
    api("io.grpc:grpc-kotlin-stub:0.2.0") {
        exclude("io.grpc", "grpc-protobuf")
    }
}
