package com.raphix.picsum.network

import com.raphix.picsum.model.PhotoModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiService {
    @GET("list")
    fun getData(): Call<List<PhotoModel>>
}
object RetrofitClient {
    private const val BASE_URL = "https://picsum.photos/v2/"

    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }
}