import org.gradle.kotlin.dsl.`java-library`

plugins {
    `java-library`
    id("common-conventions")
    id("custom-publish-conventions")
}

java {
    // Publish with sources, so consumers can inspect source code in jar
    withSourcesJar()
}
