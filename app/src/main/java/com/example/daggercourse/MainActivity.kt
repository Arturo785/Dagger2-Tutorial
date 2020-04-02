package com.example.daggercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggercourse.di.ApiService
import com.example.daggercourse.di.LocalStore
import com.example.daggercourse.di.LoginManager
import com.example.daggercourse.di.component.DaggerLoginComponent

class MainActivity : AppCompatActivity() {

    private lateinit var loginManager: LoginManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginComponent = DaggerLoginComponent.create()
        loginManager = loginComponent.getLoginManager()

        loginManager.login("test","test")

    }
}
