plugins {
    kotlin("jvm") version "1.7.0"
    kotlin("plugin.jpa") version "1.7.0"
    kotlin("plugin.serialization") version "1.7.0"
    kotlin("plugin.spring") version "1.7.0"
    id("org.springframework.boot") version "2.6.7"
}

repositories {
    mavenCentral()
}

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
