package no.capra

import org.gradle.api.Plugin
import org.gradle.api.Project

class Greeting : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("hi") {
            doLast {
                println("Hi from the GreetingScriptPlugin")
            }
        }
    }
}