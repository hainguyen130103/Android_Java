buildscript {
    dependencies {
        // classpath(libs.google.services)
        classpath("com.android.tools.build:gradle:8.4.0")
        classpath("com.google.gms:google-services:4.4.2")
        // classpath("com.android.tools.build:gradle:8.0.2")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}


// Thêm phần này
allprojects {
    repositories {
       google()
        mavenCentral()
    }
}
