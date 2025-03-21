plugins {
    id("org.springframework.boot")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    api(project(":core"))
//    implementation(project(":common"))
    implementation(project(":board:api:domain"))
    implementation(project(":board:api:exception"))
    implementation(project(":board:api:readmodel"))

    // lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // mapstruct
    implementation("org.mapstruct:mapstruct:1.6.3")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.6.3")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")

    // querydsl
    implementation("com.querydsl:querydsl-jpa:5.0.0")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0")

}
