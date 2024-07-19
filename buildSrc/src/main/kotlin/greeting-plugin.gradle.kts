import gradle.kotlin.dsl.accessors._7fbf647f525c0b2fa279b9b076b8b9df.build

interface GreetingTaskExtension {
    val nameProp: Property<String>
}

// Create the extension
val greetingExtension = extensions.create<GreetingTaskExtension>("greeting")

// Set a default value
greetingExtension.nameProp.convention(project.name)

// Register the task and give it the input
val greeting = tasks.register<GreetingTask>("greetingTask") {
    greetingName.set(greetingExtension.nameProp)
}

// Make task run on a lifecycle task
tasks.build {
    dependsOn(greeting)
}
