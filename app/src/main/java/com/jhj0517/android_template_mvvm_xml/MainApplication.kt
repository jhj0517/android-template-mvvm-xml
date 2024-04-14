package com.jhj0517.android_template_mvvm_xml

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}