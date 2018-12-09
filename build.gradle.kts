// THIS WORKS
//plugins {
//    java
//}

// THIS DOES NOT WORK
apply {
    plugin("java")
}
// or
//apply<JavaPlugin>()

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:26.0-jre")
}