plugins {
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.2.1"
}

group = "com.capra.plugins"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("greetingBinaryPlugin") {
            id = "com.capra.greeting"
            implementationClass = "com.capra.GreetingPlugin"
        }
    }
}
