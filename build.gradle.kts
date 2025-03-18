plugins {
	id("io.spring.dependency-management") version "1.1.7"
	id("org.springframework.boot") version "3.4.3" apply false
	id("java")
	id("java-library")
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(17))
	}
}


subprojects {
	apply(plugin = "java")
	apply(plugin = "java-library")
	apply(plugin = "io.spring.dependency-management")

	group = "multimodulePractice"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	configurations {
		compileOnly {
			extendsFrom(configurations.annotationProcessor.get())
		}
	}


	tasks.named<Test>("test") {
		useJUnitPlatform()
	}
}
