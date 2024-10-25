pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Ensure settings handles repositories
    repositories {
        google() // Google's repository for Android dependencies
        mavenCentral() // Maven Central for other libraries
    }
}

rootProject.name = "YourProjectName" // Replace with your project name
include(":app")