package com.skill.testatsynchrony.retrofit

import com.skill.testatsynchrony.network.CatApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://api.thecatapi.com/v1/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val catApiService: CatApiService by lazy {
        retrofit.create(CatApiService::class.java)
    }
}