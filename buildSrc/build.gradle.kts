plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation("com.capra.plugins:greeting:1.0.0")
}