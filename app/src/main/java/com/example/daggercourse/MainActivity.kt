package com.example.daggercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggercourse.di.ApiService
import com.example.daggercourse.di.Config
import com.example.daggercourse.di.LocalStore
import com.example.daggercourse.di.LoginManager
import com.example.daggercourse.di.component.DaggerLoginComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //field injection is useful when using 3rd party classes and things without constructor
    // like activities
    @Inject
    lateinit var loginManager: LoginManager

    @Inject
    lateinit var config: Config

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginComponent = DaggerLoginComponent.create()
        loginComponent.inject(this)
        loginManager.login("test","test")
        loginManager.eneableCache(config)

    }
}
