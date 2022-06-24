plugins {
    id(Config.Plugins.androidApplication)
    id(Config.Plugins.kotlinAndroid)
}

android {
    compileSdk = Config.AppConfig.compileSdk

    defaultConfig {
        applicationId = Config.AppConfig.applicationId
        minSdk = Config.AppConfig.minSdk
        targetSdk = Config.AppConfig.compileSdk
        versionCode = Config.AppConfig.versionCode
        versionName = Config.AppConfig.versionName
        testInstrumentationRunner = Config.AppConfig.testRunner
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            isDebuggable = true
            buildConfigField("String", "APP_RAW_NAME", """"clean_architecture_multi_module"""")
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.AppConfig.jvmTarget
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.material)
    implementation (Dependencies.constLayout)

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidJunit)
    androidTestImplementation(Dependencies.espressoCore)
}
