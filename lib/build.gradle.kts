plugins {
    id("library-conventions")
    id("HelloPlugin")
    id("greeting-plugin")
}

group = "com.capra"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.kotlinx.coroutines.core)
}

greeting {
    nameProp = "Øyvind"
}
