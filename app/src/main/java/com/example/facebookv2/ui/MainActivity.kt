package com.example.facebookv2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.facebookv2.databinding.ActivityMainBinding
import com.example.facebookv2.repostry.Repostory

private lateinit var viewModel: PostViewModel
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val repostory = Repostory()
        val viewModelFactory = MainViewModelFactory(repostory)
        viewModel = ViewModelProvider(this, viewModelFactory).get(PostViewModel::class.java)
        viewModel.getPost()
        viewModel.PostMutabeldata.observe(this, Observer { respon->
            Log.d("respon",respon.userId.toString())
        })
    }
}