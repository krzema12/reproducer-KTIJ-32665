plugins {
    kotlin("multiplatform") version "2.1.0"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    // If you comment out `js { ... }`, the compiler error is also visible in the IDE.
    js {
        binaries.executable()
        browser()
    }
}
