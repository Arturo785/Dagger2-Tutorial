package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

class LoginManager @Inject constructor(val localStore: LocalStore, val apiService: ApiService) {
    private val TAG = "LoginManager"

    fun login(username : String, password : String){
        Log.d(TAG,"login called")
        val token = apiService.authenticate(username,password)
        localStore.saveUserToken(token)
    }


}