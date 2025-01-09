plugins {
    kotlin("multiplatform") version "2.1.0"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js {
        binaries.executable()
        browser()
    }
}
