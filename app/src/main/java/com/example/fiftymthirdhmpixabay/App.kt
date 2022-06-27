package com.example.fiftymthirdhmpixabay

import android.app.Application
import com.example.fiftymthirdhmpixabay.network.PixabayApi
import com.example.fiftymthirdhmpixabay.network.RetrofitService

class App : Application() {

    companion object {
        lateinit var api: PixabayApi
    }
    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.api
    }
}