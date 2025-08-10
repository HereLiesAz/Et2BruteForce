// Top-level build file where you can add configuration options common to all sub-projects/modules.
// The versions for these plugins are now managed by the version catalog in gradle/libs.versions.toml
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}