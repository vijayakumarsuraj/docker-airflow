plugins {
    java
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.apache.hive:hive-jdbc:3.1.2")
}

tasks.shadowJar {
    archiveBaseName.set("hive-jdbc")

    isZip64 = true
}
