plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    java
    application
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")

    implementation(project(":core"))
    implementation(project(":board:application"))
    implementation(project(":board:driven:RDB"))
    implementation(project(":board:driving:web"))
}

application {
    mainClass.set("multimodulePractice.Main")
}

tasks.jar {
    enabled = false
}

tasks.bootJar {
    enabled = true
}