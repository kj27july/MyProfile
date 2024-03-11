package com.skill.testatsynchrony.repositories

import android.util.Log
import com.skill.testatsynchrony.models.CatResponse
import com.skill.testatsynchrony.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.awaitResponse

class CatRepository {

    suspend fun getCats(page: Int): List<CatResponse> {
        val call = RetrofitClient.catApiService.getCats(page = page)
        return callEnqueue(call)
    }

    private suspend fun callEnqueue(call: Call<List<CatResponse>>): List<CatResponse> {
        return try {
            val response = call.awaitResponse()
            if (response.isSuccessful) {
                Log.d("Kajal", "callEnqueue: Success ")
                response.body() ?: emptyList()
            } else {
                Log.d("Kajal", "callEnqueue: Failed ")
                emptyList()
            }
        } catch (e: Exception) {
            Log.d("Kajal", "callEnqueue: Catch -e: $e ")
            emptyList()
        }
    }
}