import gradle.kotlin.dsl.accessors._7fbf647f525c0b2fa279b9b076b8b9df.build
import org.gradle.api.provider.Property

interface GreetingTaskExtension {
    val nameProp: Property<String>
}

val greetingExtension = extensions.create<GreetingTaskExtension>("greeting")

val greeting = tasks.register<GreetingTask>("greetingTask") {
    greetingName.convention(greetingExtension.nameProp)
}

tasks.build {
    dependsOn(greeting)
}