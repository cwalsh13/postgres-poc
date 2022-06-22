import com.micropact.gradle.license.DefaultLicense

plugins {
    kotlin("jvm")
    kotlin("plugin.jpa")
    kotlin("plugin.serialization")
    kotlin("plugin.spring")
    id("org.springframework.boot") version "2.6.7"
}

group = "com.micropact.platform"

dependencyLocking {
    lockAllConfigurations()
}

dependencies {
    implementation(platform(libs.spring.boot.dependencies))
    implementation(libs.arrow.coroutines)
    implementation(libs.hibernate.validator)
    implementation(libs.jsonunit)
    implementation(libs.kotlin.jdk8)
    implementation(libs.kotlin.logging)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlinx.serialization)
    implementation(libs.spring.boot.actuator)
    implementation(libs.spring.boot.data.jpa)
    implementation(libs.spring.boot.validation)

    runtimeOnly(libs.postgresql)
}

tasks {
    compileKotlin {
        kotlinOptions.freeCompilerArgs = listOf(
            "-Xemit-jvm-type-annotations"
        )
    }
}
