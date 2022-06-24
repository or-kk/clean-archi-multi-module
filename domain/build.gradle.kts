plugins {
    id(Config.Plugins.javaLibrary)
    id(Config.Plugins.kotlin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(Dependencies.kotlinStdlib)
    implementation(Dependencies.javaInject)
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutines)
}
