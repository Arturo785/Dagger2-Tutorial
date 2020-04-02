package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

class Config @Inject constructor() {
    var isCacheEnabled = false
    private val TAG = "Config"

    fun eneableCache(loginManager: LoginManager){
        isCacheEnabled = true
        Log.d(TAG,"enable cache called")
    }
}