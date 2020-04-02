package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

class LocalStore @Inject constructor() {

    private val TAG = "LocalStore"

    fun saveUserToken(token: String) {
        Log.d(TAG,"save user called")

    }
}