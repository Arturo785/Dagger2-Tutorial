package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

interface ApiService {

/*    private val TAG = "ApiService"

    fun authenticate(username: String, password: String): String {
        Log.d(TAG,"api service called")
        return "Token"
    }*/
    fun authenticate(username: String, password: String): String
}