plugins {
    kotlin("jvm") version "1.9.23"
    id("org.springframework.boot") version "3.4.1"
    id("org.jetbrains.kotlin.plugin.spring") version "2.1.0"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "tri.test.propertynotmap"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation(kotlin("reflect"))
}

kotlin {
    jvmToolchain(21)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
}