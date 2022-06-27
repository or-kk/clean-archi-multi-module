plugins {
    id(Config.Plugins.androidApplication)
    id(Config.Plugins.kotlinAndroid)
    id(Config.Plugins.hiltAndroid)
    id(Config.Plugins.kotlinKapt)
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

            manifestPlaceholders["appName"] = "@string/app_name_debug"
            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"
            manifestPlaceholders["appRoundIcon"] = "@mipmap/ic_launcher_round"
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

            manifestPlaceholders["appName"] = "@string/app_name"
            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"
            manifestPlaceholders["appRoundIcon"] = "@mipmap/ic_launcher_round"
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
    implementation(project(Config.Modules.data))
    implementation(project(Config.Modules.domain))
    implementation(project(Config.Modules.presentation))

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constLayout)

    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidJunit)
    androidTestImplementation(Dependencies.espressoCore)
}
