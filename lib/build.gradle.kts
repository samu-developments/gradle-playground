plugins {
    id("library-conventions")
    id("HelloPlugin")
}

group = "com.capra"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.kotlinx.coroutines.core)
}
