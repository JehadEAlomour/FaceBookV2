package com.example.facebookv2.repostry

import com.example.facebookv2.util.PostClint

class Repostory {
    suspend fun getPost()=PostClint.api.getPosts()
}