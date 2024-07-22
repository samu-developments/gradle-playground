import org.gradle.kotlin.dsl.`java-library`

plugins {
    `java-library`
    id("common-conventions")
    id("no.capra.plugins.publish")
}

java {
    // Publish with sources, so consumers can inspect source code in jar
    withSourcesJar()
}
