plugins {
    id(Config.Plugins.androidLibrary)
    id(Config.Plugins.kotlinAndroid)
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

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidJunit)
    androidTestImplementation(Dependencies.espressoCore)
}
