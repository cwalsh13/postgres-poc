pluginManagement {
    val devUser: String by settings
    val devPassword: String by settings

    repositories {
        maven("http://mpdv-atldkh-03.micropactcorp.com/repository/gradle-public") {
            isAllowInsecureProtocol = true
            credentials {
                username = devUser
                password = devPassword
            }
        }
    }
}

plugins {
    id("com.micropact.gradle.kotlin.settings") version "8.11.0"
}

rootProject.name = "postgres-poc"
