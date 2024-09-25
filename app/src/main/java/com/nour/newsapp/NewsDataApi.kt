package com.nour.newsapp
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsDataApi{
    @GET("latest")
    suspend fun getLatestNews(
        @Query("country") country: String = "dz",
        @Query("apikey") apiKey: String = "pub_5419540f31c800e98d983ea8f8f8b895b4c79"
    ): Response<NewsResponse>
}