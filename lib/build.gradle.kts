plugins {
    kotlin("jvm") version "2.0.0"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.AMAZON
    }
}

group = "com.capra"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

java {
    // Publish with sources, so consumers can inspect source code in jar
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}