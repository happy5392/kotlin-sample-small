plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-core:2.2.0")
    implementation("io.ktor:ktor-server-netty:2.2.0")
    implementation("ch.qos.logback:logback-classic:1.4.5")
    implementation("org.jetbrains.exposed:exposed-core:0.43.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.43.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.43.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
    implementation("com.google.guava:guava:32.1.2-jre")
    implementation("org.apache.commons:commons-lang3:3.13.0")
    implementation("io.github.microutils:kotlin-logging:3.0.5")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("io.mockk:mockk:1.13.5")
    testImplementation("org.assertj:assertj-core:3.24.0")
}

application {
    mainClass.set("com.example.main.ApplicationKt")
}

tasks.test {
    useJUnitPlatform()
}
