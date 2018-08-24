# Riftlin [![](https://jitpack.io/v/InsomniaKitten/Riftlin.svg)](https://jitpack.io/#InsomniaKitten/Riftlin)
##### Kotlin runtime libraries and utilities for Rift

Riftlin provides the runtime and libraries required for creating Rift mods in Kotlin.
To use this library in your environment, append the following to your Gradle build script:

```groovy
buildscript {
  repositories {
    maven { url = 'https://plugins.gradle.org/m2' }
  }
  dependencies {
    classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.61'
  }
}

apply plugin: 'kotlin'

repositories {
  maven { url = 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.InsomniaKitten:Riftlin:0.1.0'
}
```
