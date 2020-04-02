package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

class ApiServiceImpl @Inject constructor() : ApiService {


    private val TAG = "ApiService"

    override fun authenticate(username: String, password: String): String {
        Log.d(TAG,"api service called from implementation")
        return "Token"
    }
}