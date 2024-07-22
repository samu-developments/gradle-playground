plugins {
    id("com.gradle.plugin-publish") version "1.2.1"
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

group = "com.capra.plugins"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("greeting") {
            id = "com.capra.plugins.greeting"
            implementationClass = "com.capra.Greeting"
        }
    }
}

