package com.example.newsapp.remote

import com.example.newsapp.model.ArticleResponse
import com.example.newsapp.model.SourcesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsWebServices {

    @GET("v2/top-headlines/sources")
    fun getNewsSources(@Query("apiKey") apiKey:String
                       ,@Query("category") category:String): Call<SourcesResponse>
    @GET("v2/everything")
    fun getNews(@Query("apiKey") apiKey:String
                ,@Query("sources") sources:String):Call<ArticleResponse>
}
