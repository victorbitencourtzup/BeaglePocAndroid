package com.example.samplebeagle.app_settings

import android.app.Application
import com.example.samplebeagle.beagle_settings.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }

}