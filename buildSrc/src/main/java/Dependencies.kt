object Dependencies {
    object Classpath {
        const val androidApplication = "com.android.application"
        const val kotlinAndroid = "kotlin-android"
        const val androidGradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    // AndroidX
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constLayout = "androidx.constraintlayout:constraintlayout:${Versions.constLayout}"

    // Google
    const val material = "com.google.android.material:material:${Versions.material}"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
