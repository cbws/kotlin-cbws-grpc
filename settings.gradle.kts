// The Java library, usable from any JVM language, and the Kotlin library that builds on it. Both
// are published under the group cloud.cbws.
rootProject.name = "kotlin-cbws-grpc"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include("cbws-api", "cbws-api-kotlin")
project(":cbws-api").projectDir = file("java")
project(":cbws-api-kotlin").projectDir = file("kotlin")
