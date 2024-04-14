# Android MVVM (XML) Template
Simple template for MVVM with XML (Activity & Fragment) in Android, without Compose.
# Architecture
![Flowcharts](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/c9c0de0a-9a3a-47ff-9f48-0999e39caa34)
# Usage
1. git clone this repo using
```commandline
git clone https://github.com/jhj0517/android-template-mvvm-xml.git
```
2. Go to the **Project Files** tab in the File Tree view within Android Studio.
    - Refactor the organization name with yours
       ![organization](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/0846bd20-8214-4ae8-8227-441741f7a694)
    - Refactor the package name with yours
       ![package](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/a28f8852-0968-4756-b990-0b681ed16feb)
3. Change the `namespace` and `applicationId` in the module-level `build.gradle`.
```gradle
android {
    namespace = "com.jhj0517.android_template_mvvm_xml" // Change
    defaultConfig {
        applicationId = "com.jhj0517.android_template_mvvm_xml" // Change
    }
}
```
4. Change the `rootProject.name` in the `settings.gradle`
```gradle
rootProject.name = "android-template-mvvm-xml" // Change
```
