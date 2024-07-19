plugins {
    java
    kotlin("jvm")
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