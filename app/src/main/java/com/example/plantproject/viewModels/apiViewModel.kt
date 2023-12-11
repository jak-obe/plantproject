package com.example.plantproject.viewModels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.plantproject.API.newapi
import com.example.plantproject.data.PlantData
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class apiViewModel(private val yourApiService: newapi) : ViewModel() {




    fun postDataWithoutPhoto(plantData: PlantData) {
        val call = yourApiService.postDataWithoutPhoto(plantData)

        call.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                if (response.isSuccessful) {
                    // Handle successful response
                    val yourResponse = response.body()
                    Log.d("plancik", yourResponse.toString())
                    // Do something with the response
                } else {
                    // Handle error response
                    Log.d("plancik", "else")

                    // You can check response.code(), response.message(), etc.
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                // Handle network failure here
                Log.d("plancik", "fail")

            }
        })
    }

}