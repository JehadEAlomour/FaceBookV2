package com.example.facebookv2.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.facebookv2.data.PostAPI
import com.example.facebookv2.model.PostModel
import com.example.facebookv2.repostry.Repostory
import com.example.facebookv2.util.PostClint
import kotlinx.coroutines.launch

class PostViewModel(private val repostory: Repostory):ViewModel() {
    val PostMutabeldata:MutableLiveData<PostModel> = MutableLiveData()
    fun getPost(){
        viewModelScope.launch {
            val post=repostory.getPost()
            PostMutabeldata.value=post
        }
    }

}