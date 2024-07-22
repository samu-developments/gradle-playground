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
        create("greeting") {
            id = "no.capra.plugins.greeting"
            implementationClass = "no.capra.Greeting"
        }
    }
}
