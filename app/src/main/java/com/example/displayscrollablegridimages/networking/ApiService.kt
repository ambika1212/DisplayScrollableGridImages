package com.example.displayscrollablegridimages.networking

import com.example.displayscrollablegridimages.model.MyImageResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/photos/random")
    fun getImages(
        @Query("client_id") key: String = ApiConfig.API_KEY,
        @Query("count") count: Int = 10
    ): Call<List<MyImageResponse>>

}