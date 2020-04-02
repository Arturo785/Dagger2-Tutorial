package com.example.daggercourse.di.component

import com.example.daggercourse.MainActivity
import com.example.daggercourse.di.LoginManager
import dagger.Component


@Component
interface LoginComponent {
    //fun getLoginManager() : LoginManager
    fun inject(mainActivity: MainActivity)

}