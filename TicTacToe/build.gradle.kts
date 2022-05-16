
val kotlinVersion = "1.6.10"
val serializationVersion = "1.3.2"
val ktorVersion = "1.6.7"
val logbackVersion = "1.2.10"
val reactVersion = "17.0.2-pre.299-kotlin-1.6.10"

plugins {
    kotlin("multiplatform") version "1.6.21"
    application
}

group = "DanielAdamZoltan"
version = "1.5"

repositories {
    jcenter()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

kotlin {


    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
                implementation("io.ktor:ktor-client-core:$ktorVersion")
           }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("io.ktor:ktor-serialization:$ktorVersion")
                implementation("io.ktor:ktor-server-core:$ktorVersion")
                implementation("io.ktor:ktor-server-netty:$ktorVersion")
                implementation("io.ktor:ktor-html-builder:$ktorVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2")
                implementation("org.jetbrains.exposed:exposed-core:0.38.2")
                implementation("org.jetbrains.exposed:exposed-dao:0.38.2")
                implementation("org.jetbrains.exposed:exposed-jdbc:0.38.2")
                implementation("org.jetbrains.exposed:exposed-java-time:0.38.2")
                implementation("mysql:mysql-connector-java:8.0.29")

                implementation("ch.qos.logback:logback-classic:$logbackVersion")


            }
        }
        val jvmTest by getting
        val jsMain by getting {
            dependencies {
                //Original
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.290-kotlin-1.6.10")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.290-kotlin-1.6.10")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-css:17.0.2-pre.298-kotlin-1.6.10")

                //Added
                implementation("io.ktor:ktor-client-js:$ktorVersion")
                implementation("io.ktor:ktor-client-json:$ktorVersion")
                implementation("io.ktor:ktor-client-serialization:$ktorVersion")
            }
        }
        val jsTest by getting
    }
}


application {
    mainClass.set("DanielAdamZoltan.ServerKt")

}

tasks.named<Copy>("jvmProcessResources") {
    val jsBrowserDistribution = tasks.named("jsBrowserDistribution")
    from(jsBrowserDistribution)
}

tasks.named<JavaExec>("run") {
    dependsOn(tasks.named<Jar>("jvmJar"))
    classpath(tasks.named<Jar>("jvmJar"))
}

//  Added

//tasks.getByName<Jar>("jvmJar") {
//    val taskName = if (project.hasProperty("isProduction")
//        || project.gradle.startParameter.taskNames.contains("installDist")
//    ) {
//        "jsBrowserProductionWebpack"
//    } else {
//        "jsBrowserDevelopmentWebpack"
//    }
//    val webpackTask = tasks.getByName<org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack>(taskName)
//    dependsOn(webpackTask) // make sure JS gets compiled first
//    from(File(webpackTask.destinationDirectory, webpackTask.outputFileName)) // bring output file along into the JAR
//}
//
//tasks {
//    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//        kotlinOptions {
//            jvmTarget = "1.8"
//        }
//    }
//}