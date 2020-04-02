package com.example.daggercourse.di

import android.util.Log
import javax.inject.Inject

//simulating that we don't own the class
class LocalStore {

    private val TAG = "LocalStore"

    fun saveUserToken(token: String) {
        Log.d(TAG,"save user called")

    }
}