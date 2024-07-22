package com.capra

import org.gradle.api.Plugin
import org.gradle.api.Project

class Greeting : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("hi") {
            it.doLast {
                println("Hi from the GreetingScriptPlugin")
            }
        }
    }
}