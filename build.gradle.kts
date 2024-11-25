plugins {
    id("java")
    id("io.qameta.allure") version "2.12.0"
    jacoco
    id("org.sonarqube") version "6.0.0.5145"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}