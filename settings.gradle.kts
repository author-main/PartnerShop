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

rootProject.name = "PartnerShop"
include(":app")
include(":core")
include(":navigation")
include(":feature")
include(":feature:signin")
include(":feature:home")
include(":feature:catalog")
include(":feature:cart")
include(":feature:profile")
include(":core:common")
include(":core:common")
include(":feature:signup")
include(":feature:reset_password")
