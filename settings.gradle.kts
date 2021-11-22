rootProject.name = "web-flow-service-server"

include("web-flow-service-models", "web-flow-service-server")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}
