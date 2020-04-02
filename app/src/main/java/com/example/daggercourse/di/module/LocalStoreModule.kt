package com.example.daggercourse.di.module

import com.example.daggercourse.di.LocalStore
import dagger.Module
import dagger.Provides


@Module
class LocalStoreModule{

    //simulating that we don't own the class
    @Provides
    fun provideLocalStore() = LocalStore()


}