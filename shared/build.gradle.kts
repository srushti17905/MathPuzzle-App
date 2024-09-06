plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here

            // for compose

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)

            // for navigation

            implementation(libs.navigator)
            implementation(libs.navigator.tabs)
            implementation(libs.navigator.transitions)

            // for resources


            implementation(compose.components.resources)
            
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.example.my_math_puzzle"
    compileSdk = 34
    defaultConfig {
        minSdk = 28
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
dependencies {
    implementation(libs.firebase.database.ktx)
    implementation(libs.cronet.embedded)
}

// for resources

compose.resources {
    publicResClass = true
    packageOfResClass = "com.example.my_shayari_app"
    generateResClass = always
}
