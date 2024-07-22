plugins {
    java
    kotlin("jvm")
    id("com.capra.plugins.greeting")
}

repositories {
    mavenCentral()
}

java.toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.AMAZON
    }

tasks.test {
    useJUnitPlatform()
}