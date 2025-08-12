buildscript {
    ext {
        compose_version = '2024.02.00'
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}

plugins {
    id 'com.android.application' version '8.2.0' apply false
    id 'com.android.library' version '8.2.0' apply false
    id 'org.jetbrains.kotlin.android' version '1.9.22' apply false
    id 'com.google.dagger.hilt.android' version '2.48' apply false
}
