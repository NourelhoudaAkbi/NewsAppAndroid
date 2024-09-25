package com.nour.newsapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl("https://newsdata.io/api/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val newsApi by lazy {
            retrofit.create(NewsDataApi::class.java)
        }
    }
}