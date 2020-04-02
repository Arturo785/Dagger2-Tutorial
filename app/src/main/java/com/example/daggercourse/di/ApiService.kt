package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor(){

    private val TAG = "ApiService"

    fun authenticate(username: String, password: String): String {
        Log.d(TAG,"api service called")
        return "Token"
    }


}