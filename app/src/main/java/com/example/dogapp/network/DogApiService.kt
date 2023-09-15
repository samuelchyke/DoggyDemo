package com.example.dogapp.network

import com.example.dogapp.data.Dogs
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface DogApiService {

    @GET("search")
    suspend fun searchImages(
        @Header("x-api-key") authKey:String= apikey,
        @Query("format") format: String = "json",
        @Query("limit") limit: Int = 50
    ): Response<Dogs>

    companion object {
        val apikey = "live_IpBrujWvJ0KYQmHQ3lshbXIuDisxZQ0fZZTlW1bM6razGYgK92IORhndIev6RGDo"
    }
}