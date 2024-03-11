package com.skill.testatsynchrony.network

import com.skill.testatsynchrony.models.CatResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApiService {

    @GET("images/search")
    fun getCats(
        @Query("limit") limit: Int = 50,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "live_CceIM0sZV2xM6POKa0rVadZ4p8GJv9v0qlXIieAcQmU3b7nUhqP50uP2o3b95jj6"
    ): Call<List<CatResponse>>
}