plugins {
    kotlin("jvm") version "1.3.61"
    `maven-publish`
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

publishing {
    publications {
        create<MavenPublication>("default") {
            from(components["java"])
            // Include any other artifacts here, like javadocs
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/cbws/kotlin-cbws-grpc")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
