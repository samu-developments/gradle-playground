import gradle.kotlin.dsl.accessors._7fbf647f525c0b2fa279b9b076b8b9df.build

interface GreetingTaskExtension {
    val nameProp: Property<String>
}

// Create the extension
val greetingExtension = extensions.create<GreetingTaskExtension>("greeting")

// Register the task and give it the input
val greeting = tasks.register<GreetingTask>("greetingTask") {
    greetingName.convention(greetingExtension.nameProp)
}

greetingExtension.nameProp.convention(project.name)

// Make task run on a lifecycle task
tasks.build {
    dependsOn(greeting)
}
