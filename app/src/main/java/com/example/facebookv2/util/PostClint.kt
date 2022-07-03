package com.example.facebookv2.util

import com.example.facebookv2.data.PostAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostClint {
    private var BASE_URL="https://jsonplaceholder.typicode.com/"
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api:PostAPI by
            lazy {
                retrofit.create(PostAPI::class.java)
            }
}