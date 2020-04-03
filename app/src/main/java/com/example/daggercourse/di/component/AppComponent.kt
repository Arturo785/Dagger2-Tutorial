package com.example.daggercourse.di.component

import com.example.daggercourse.di.AppLogger
import com.example.daggercourse.di.module.AppModule
import dagger.Component


@Component(modules = [AppModule::class])
interface AppComponent{

    fun getAppLogger(): AppLogger

}