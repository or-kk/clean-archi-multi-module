plugins {
    id(Config.Plugins.androidLibrary)
    id(Config.Plugins.kotlinAndroid)
    id(Config.Plugins.hiltAndroid)
    id(Config.Plugins.kotlinKapt)
}

android {
    compileSdk = Config.AppConfig.compileSdk

    defaultConfig {
        minSdk = Config.AppConfig.minSdk
        targetSdk = Config.AppConfig.compileSdk
    }
}

dependencies {
    implementation(project(Config.Modules.domain))

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
