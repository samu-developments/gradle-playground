plugins {
    alias(libs.plugins.kotlin)
    `java-library`
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
    implementation(libs.kotlinx.coroutines)
}

java {
    // Publish with sources, so consumers can inspect source code in jar
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}