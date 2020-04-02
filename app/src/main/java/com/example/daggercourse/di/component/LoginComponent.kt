package com.example.daggercourse.di.component

import com.example.daggercourse.MainActivity
import com.example.daggercourse.di.LoginManager
import com.example.daggercourse.di.module.LocalStoreModule
import dagger.Component


@Component(modules = [LocalStoreModule::class])
interface LoginComponent {
    //fun getLoginManager() : LoginManager
    fun inject(mainActivity: MainActivity)

}