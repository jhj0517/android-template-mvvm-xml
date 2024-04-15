# Android MVVM (XML) Template
Simple template for MVVM with XML (Activity & Fragment) in Android, without Compose.
# Architecture
![Flowcharts](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/c9c0de0a-9a3a-47ff-9f48-0999e39caa34)
# Overview
- Notices
    1. The INTERNET permission is enabled in the Manifest because there's a basic Retrofit2 usage.
    2. `BuildConfig` is enabled in `build.gradle` to securely use important variables, such as `BuildConfig.API_KEY`.
    3. Put important variables in `local.properties`. It'll be loaded in `build.gradle`.
- Core Versions
```toml
agp = "8.3.0"
kotlin = "1.9.0"
room = "2.6.1"
hilt = "2.51.1"
gson = "2.10.1"
retrofit2 = "2.11.0"
ksp = "1.9.0-1.0.13"
okhttpLogging = "4.12.0"
```

# Usage
1. git clone this repo
```commandline
git clone https://github.com/jhj0517/android-template-mvvm-xml.git
```
2. Modify git remote url with yours
```commandline
git remote set-url origin git@github.com:your_name/repo_name.git
```
3. Go to the **Project Files** tab in the File Tree view within Android Studio, not the **Android** or **Project** tab.
    - Refactor the organization name with yours
       ![organization](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/0846bd20-8214-4ae8-8227-441741f7a694)
    - Refactor the package name with yours
       ![package](https://github.com/jhj0517/android-template-mvvm-xml/assets/97279763/a28f8852-0968-4756-b990-0b681ed16feb)
4. Change the `namespace` and `applicationId` in the module-level `build.gradle`.
```gradle
android {
    namespace = "com.jhj0517.android_template_mvvm_xml" // Change
    defaultConfig {
        applicationId = "com.jhj0517.android_template_mvvm_xml" // Change
    }
}
```
5. Change the `rootProject.name` in the `settings.gradle`
```gradle
rootProject.name = "android-template-mvvm-xml" // Change
```
6. **Build** -> **Clean Project** -> **Rebuild Project**
7. You're now ready to start your new project.
