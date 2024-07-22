plugins {
    kotlin("jvm")
    `kotlin-dsl`
    alias(libs.plugins.gradle.plugin.publish)
}

repositories {
    mavenCentral()
}

group = "no.capra.plugins"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("publish") {
            id = "no.capra.plugins.publish"
            implementationClass = "no.capra.Publish"
        }
    }
}
