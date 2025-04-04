plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "vn.phatbee.tuan10_uploadimages_websocket"
    compileSdk = 34

    defaultConfig {
        applicationId = "vn.phatbee.tuan10_uploadimages_websocket"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // Network & Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    //Gson
    implementation (libs.gson)
    //load ảnh với Glide
    implementation (libs.glide)
    annotationProcessor (libs.compiler)

}