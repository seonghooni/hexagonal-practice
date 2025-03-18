plugins {
    id("org.springframework.boot")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    api(project(":board:api:readmodel"))
    api(project(":board:api:domain"))
    api(project(":board:api:exception")) // BoardCommandErrorCode

    implementation(project(":common")) // 원래는 없는게 맞는데.. IDE 이슈??
}
