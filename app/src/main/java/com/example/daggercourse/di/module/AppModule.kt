package com.example.daggercourse.di.module

import com.example.daggercourse.di.AppLogger
import dagger.Module
import dagger.Provides

@Module
class AppModule{
    var index = 0

    @Provides
    fun getAppLogger() : AppLogger{
        index++
        return AppLogger(index.toString())
    }
}