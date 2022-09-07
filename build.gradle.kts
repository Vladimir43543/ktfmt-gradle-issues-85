buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    extra.apply {
        set("kotlinVersion", "1.5.31")
    }
    dependencies {

        val kotlinVersion = rootProject.extra.get("kotlinVersion") as String
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    }
}

plugins {
    idea
    jacoco
    val kotlinVersion = "1.5.31"
    kotlin("jvm").version(kotlinVersion)
    kotlin("kapt").version(kotlinVersion)
    id("com.ncorti.ktfmt.gradle") version "0.9.0" apply false
}


dependencies {
    implementation(kotlin("stdlib"))
}


allprojects {
    repositories {
        mavenCentral()
    }
}
