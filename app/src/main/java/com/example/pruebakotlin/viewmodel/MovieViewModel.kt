package com.example.pruebakotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pruebakotlin.model.MovieModel

class MovieViewModel : ViewModel() {

    val movieModel = MutableLiveData<MovieModel>()

    fun getMovies() {

    }
}