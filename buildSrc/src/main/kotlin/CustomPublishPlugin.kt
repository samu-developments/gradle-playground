import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.register


/**
 * A plugin which wraps maven-publish plugin and creates an extension to configure it.
 */
open class CustomPublishPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply("maven-publish")
        project.extensions.create("customPublish", CustomPublishingExtension::class)
    }
}

class CustomPublishOptions {
    lateinit var artifact: String
}

open class CustomPublishingExtension(val project: Project) {
    /**
     * Configure publishing plugin as part of an extension, workaround for
     * using a normal plugin + extension where the plugin is applied before
     * the extension properties are set.
     * Read some more: https://blog.mbonnin.net/my-life-after-afterevaluate
     * Now we can apply this plugin, and run this function at a later stage.
     */
    fun conf(action: Action<CustomPublishOptions>) {
        // Create options and set properties
        val options = CustomPublishOptions().apply(action::execute)

        project.configure<PublishingExtension> {
            publications {
                register<MavenPublication>(options.artifact) {
                    from(project.components["java"])

                    groupId = project.group.toString()
                    artifactId = options.artifact
                    version = project.version.toString()
                }
            }
        }
    }
}
