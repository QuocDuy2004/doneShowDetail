plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.quocduy"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.quocduy"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation ("com.squareup.picasso:picasso:2.71828")

    implementation ("org.mindrot:jbcrypt:0.4")
    implementation("com.android.volley:volley:1.2.1")

//    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("me.relex:circleindicator:2.1.6")
//    implementation ("com.github.bumptech.glide:glide:4.12.0")

    implementation ("com.google.android.flexbox:flexbox:3.0.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("com.google.android.gms:play-services-tflite-acceleration-service:16.0.0-beta01")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}