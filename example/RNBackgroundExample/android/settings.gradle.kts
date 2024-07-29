import groovy.lang.Closure

include(":app")
includeBuild("../node_modules/react-native-gradle-plugin")

apply(from = "../node_modules/@react-native-community/cli-platform-android/native_modules.gradle")
val applyNativeModules: Closure<*> = extra.get("applyNativeModulesSettingsGradle") as Closure<*>
applyNativeModules(settings)


//if (settings.hasProperty("newArchEnabled") && settings.getProperty("newArchEnabled") == "true") {
//    include(":ReactAndroid")
//    project(":ReactAndroid").projectDir = file("../node_modules/react-native/ReactAndroid")
//    include(":ReactAndroid:hermes-engine")
//    project(":ReactAndroid:hermes-engine").projectDir = file("../node_modules/react-native/ReactAndroid/hermes-engine")
//}
rootProject.name = "RNBackgroundExample"