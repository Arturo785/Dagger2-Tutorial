package com.example.daggercourse.di.module

import com.example.daggercourse.di.AppLogger
import com.example.daggercourse.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule{
    var index = 0

    @Provides// does not recreates and the index stays at 1 because is made only once
    @AppScope
    fun getAppLogger() : AppLogger{
        index++
        return AppLogger(index.toString())
    }
}