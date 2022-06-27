object Config {
    object AppConfig {
        const val applicationId = "io.ralph.clean_architecture_multi_module"
        const val minSdk = 23
        const val compileSdk = 31
        const val versionCode = 1
        const val versionName = "1.0"
        const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val jvmTarget = "11"
    }

    object Plugins {
        const val androidLibrary = "com.android.library"
        const val androidApplication = "com.android.application"
        const val kotlin = "kotlin"
        const val kotlinAndroid = "kotlin-android"
        const val javaLibrary = "java-library"
    }

    object Modules {
        const val domain = ":domain"
        const val data = ":data"
        const val presentation = ":presentation"
    }
}
