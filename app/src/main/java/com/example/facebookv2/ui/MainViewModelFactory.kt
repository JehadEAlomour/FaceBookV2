package com.example.facebookv2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.facebookv2.repostry.Repostory

class MainViewModelFactory(repostory: Repostory) :
    ViewModelProvider.Factory {
    private val repostory = repostory
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PostViewModel(repostory) as T
    }
}
