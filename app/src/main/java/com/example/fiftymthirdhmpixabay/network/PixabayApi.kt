package com.example.fiftymthirdhmpixabay.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface PixabayApi {
    @GET("/api/")
    fun getImageByWord(
        @Query("key") key: String = "28283066-0ec69652eb612ae95db3e1a9a",
        @Query("q") keyword: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Call<PixabayModel>
}