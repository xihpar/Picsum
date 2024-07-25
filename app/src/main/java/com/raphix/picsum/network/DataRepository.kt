package com.raphix.picsum.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.raphix.picsum.model.PhotoModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DataRepository {
    private val apiService = RetrofitClient.instance

    fun getData(): LiveData<List<PhotoModel>> {
        val data = MutableLiveData<List<PhotoModel>>()
        apiService.getData().enqueue(object : Callback<List<PhotoModel>> {
            override fun onResponse(call: Call<List<PhotoModel>>, response: Response<List<PhotoModel>>) {
                if (response.isSuccessful) {
                    data.value = response.body()
                }
            }

            override fun onFailure(call: Call<List<PhotoModel>>, t: Throwable) {
                // Handle error
            }
        })
        return data
    }
}