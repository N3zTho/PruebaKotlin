package com.example.pruebakotlin.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebakotlin.data.model.MovieModel
import com.example.pruebakotlin.domain.GetMoviesUseCase
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    val movieModel = MutableLiveData<MovieModel>()
    var getMoviesUseCase = GetMoviesUseCase()

    fun getMovies() {

    }

    fun onCreate() {
        viewModelScope.launch {
            val result = getMoviesUseCase()
            Log.i("movies",result.toString())
        }
    }
}