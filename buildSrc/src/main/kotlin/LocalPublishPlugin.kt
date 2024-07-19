import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.register

class PublishOptions {
    var artifact: String? = null
}

open class LocalPublishingExtension(val project: Project) {
    fun conf(action: Action<PublishOptions>) {

        val options = PublishOptions()
        action.execute(options)

        project.configure<PublishingExtension> {
            publications {
                register<MavenPublication>("${options.artifact}") {
                    from(project.components["java"])

                    groupId = "com.capra"
                    artifactId = options.artifact!!
                    version = "1.0.0"
                }
            }
        }
    }
}

open class LocalPublishPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply("maven-publish")
        project.extensions.create("localPublish", LocalPublishingExtension::class)
    }
}
