pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// The name of your project as it appears in the build logs
rootProject.name = "TK-XTREAM-Player-Pro"

// Tells Gradle to look for the code inside the 'app' folder
include(":app")
