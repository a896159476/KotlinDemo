package com.eshuix.kotlindemo

import android.app.Application

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}