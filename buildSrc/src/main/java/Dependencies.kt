object Dependencies {
    object Classpath {
        const val androidApplication = "com.android.application"
        const val kotlinAndroid = "kotlin-android"
        const val androidGradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    }

    // AndroidX
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constLayout = "androidx.constraintlayout:constraintlayout:${Versions.constLayout}"

    // kotlin
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}"

    // Java
    const val javaInject = "javax.inject:javax.inject:${Versions.javaInject}"

    // Google
    const val material = "com.google.android.material:material:${Versions.material}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
