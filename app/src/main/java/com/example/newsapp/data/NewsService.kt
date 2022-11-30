package com.example.newsapp.data

import com.example.newsapp.utils.Constants.Companion.ARI_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/everything")
//    Coroutines
    suspend fun getEverything(
        @Query("q")query: Query,
        @Query("page")page:Int = 1,
        @Query("apiKey")apiKey:String = ARI_KEY
    )

    //    Coroutines
    suspend fun getHeadLines(
        @Query("country")countryName: String = "ru",
        @Query("page")page:Int = 1,
        @Query("apiKey")apiKey:String = ARI_KEY
    )
}