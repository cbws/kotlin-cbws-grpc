plugins {
    kotlin("jvm") version "2.4.21" apply false
}

// The version is the tag of the commit without its v, passed as -Pversion.
subprojects {
    group = "cloud.cbws"

    // Each library is published with its sources to GitHub Packages. The credentials come from
    // GitHubPackagesUsername and GitHubPackagesPassword, which only the release workflow sets.
    plugins.withId("maven-publish") {
        configure<JavaPluginExtension> {
            withSourcesJar()
        }
        configure<PublishingExtension> {
            publications {
                create<MavenPublication>("maven") {
                    from(components["java"])
                }
            }
            repositories {
                maven {
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/cbws/kotlin-cbws-grpc")
                    credentials(PasswordCredentials::class)
                }
            }
        }
    }
}
