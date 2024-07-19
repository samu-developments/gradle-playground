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