plugins {
    id(Config.Plugins.androidLibrary)
    id(Config.Plugins.kotlinAndroid)
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
    implementation(Dependencies.kotlinStdlib)
    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesServices)

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidJunit)
    androidTestImplementation(Dependencies.espressoCore)
}
