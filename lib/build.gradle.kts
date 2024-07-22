plugins {
    id("library-conventions")
}

group = "no.capra"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.kotlinx.coroutines.core)
}

publish {
    conf {
        artifact = "capra-lib"
    }
}