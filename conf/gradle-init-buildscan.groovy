initscript {
    repositories {
        maven { url 'https://plugins.gradle.org/m2' }
    }

    dependencies {
        classpath 'com.gradle:build-scan-plugin:1.1.1'
    }
}

rootProject {
    apply plugin: com.gradle.scan.plugin.BuildScanPlugin

    buildScan {
        licenseAgreementUrl = 'https://gradle.com/terms-of-service'
        licenseAgree = 'yes'
    }
}
