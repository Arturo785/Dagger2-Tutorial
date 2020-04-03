package com.example.daggercourse

import android.app.Application
import android.util.Log
import com.example.daggercourse.di.component.DaggerAppComponent
import com.example.daggercourse.di.module.AppModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder().appModule(AppModule()).build()
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
    }
}