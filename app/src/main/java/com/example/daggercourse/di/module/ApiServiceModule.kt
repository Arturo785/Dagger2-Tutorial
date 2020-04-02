package com.example.daggercourse.di.module

import com.example.daggercourse.di.ApiService
import com.example.daggercourse.di.ApiServiceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides


//this is one form
/*
@Module
class ApiServiceModule {

    @Provides
    fun providesApiService(apiServiceImpl: ApiServiceImpl) : ApiService = ApiServiceImpl()

}*/

// this way only works with abstract class, supposedly works with better optimization
@Module
abstract class ApiServiceModule {

    @Binds
    abstract fun bindsApiService(apiServiceImpl: ApiServiceImpl) : ApiService

}
