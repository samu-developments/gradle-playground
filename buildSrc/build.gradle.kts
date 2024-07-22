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
    implementation(libs.capra.plugins.greeting)
    implementation(libs.capra.plugins.publish)
}