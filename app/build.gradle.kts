plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.trade.partnershop"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.trade.partnershop"
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
    //implementation(project(":feature:cart"))
    implementation(project(mapOf("path" to ":navigation")))
    implementation(project(mapOf("path" to ":feature:cart")))
    implementation(project(mapOf("path" to ":feature:profile")))
    implementation(project(mapOf("path" to ":feature:catalog")))
    implementation(project(mapOf("path" to ":feature:home")))
    implementation(project(mapOf("path" to ":feature:signin")))
    implementation(project(mapOf("path" to ":feature:signup")))
    implementation(project(mapOf("path" to ":feature:reset_password")))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val dagger_ver = "2.48.1"
    implementation ("com.google.dagger:dagger:$dagger_ver")
    implementation ("com.google.dagger:dagger-android:$dagger_ver")
    implementation ("com.google.dagger:dagger-android-support:$dagger_ver")
    kapt ("com.google.dagger:dagger-compiler:$dagger_ver")
    kapt ("com.google.dagger:dagger-android-processor:$dagger_ver")
}