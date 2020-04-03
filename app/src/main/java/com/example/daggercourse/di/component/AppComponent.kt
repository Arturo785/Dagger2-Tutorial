package com.example.daggercourse.di.component

import com.example.daggercourse.di.AppLogger
import com.example.daggercourse.di.module.AppModule
import com.example.daggercourse.di.scope.AppScope
import dagger.Component


@AppScope
@Component(modules = [AppModule::class])
interface AppComponent{

    fun getAppLogger(): AppLogger

}