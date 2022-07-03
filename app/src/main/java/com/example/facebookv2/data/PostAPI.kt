package com.example.facebookv2.data

import android.telecom.Call
import com.example.facebookv2.model.PostModel
import retrofit2.http.GET

interface PostAPI {
    //method i will use
    @GET("posts")
    //fun get
   suspend fun getPosts():PostModel

}