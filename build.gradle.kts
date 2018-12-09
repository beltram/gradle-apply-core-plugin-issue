// THIS WORKS
//plugins {
//    java
//}
// THIS DOES NOT WORK
//apply {
//    plugin("java")
//}
// or
apply<JavaPlugin>()

pluginManager.takeIf { it.hasPlugin("java") }?.apply { println("I have java plugin") }
configurations.names.firstOrNull { it == "compile" }?.apply { println("I have $this configuration") }

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
        compile("com.google.guava:guava:26.0-jre")
}