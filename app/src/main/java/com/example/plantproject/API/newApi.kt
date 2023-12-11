package com.example.plantproject.API

import com.example.plantproject.data.PlantData
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Path

interface newapi {
    @PUT("http://localhost:8080/api/v1/plants")
    fun wysylanie_pliku_promostal(
        @Path("nr_zlecenia") nr_zlecenia: String,
        @Path("nazwa_pliku") nazwa_pliku: String,
        @Header("Authorization") authorization: String,
        @Header("Content-Type") contentType: String,
        @Body requestBody: RequestBody
    ): Call<ResponseBody>




    @Multipart
    @POST("http://localhost:8080/api/v1/plants")
    fun uploadImageWithPlantData(
        @Part image: MultipartBody.Part,
        @PartMap plantData: Map<String, @JvmSuppressWildcards RequestBody>
    ): Call<ResponseBody>

    @POST("/your_endpoint")
    fun postDataWithoutPhoto(@Body plantData: PlantData): Call<ResponseBody>


    // Add other methods for different types of requests as needed




}