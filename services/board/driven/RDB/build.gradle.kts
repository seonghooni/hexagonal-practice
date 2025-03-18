plugins {
    id("org.springframework.boot")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation(project(":common")) // 이게 있으면 안되는데.. IDE 이슈..?

    api(project(":core"))
    api(project(":board:application"))
    api(project(":board:driven:entity"))

    // querydsl
    implementation("com.querydsl:querydsl-jpa:5.0.0")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
}
