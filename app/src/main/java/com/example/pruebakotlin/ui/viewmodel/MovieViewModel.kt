package com.example.pruebakotlin.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebakotlin.data.model.MovieModel
import com.example.pruebakotlin.domain.GetMovieImageUseCase
import com.example.pruebakotlin.domain.GetMoviesUseCase
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    val movieModel = MutableLiveData<MovieModel>()
    var getMoviesUseCase = GetMoviesUseCase()
    var getMovieImageUseCase = GetMovieImageUseCase()


    fun getAllMovies() {
        viewModelScope.launch {
            val result = getMoviesUseCase()
            Log.i("MOVIES", result.toString())
        }
    }

    fun getMovieImage(id:Int) {
        viewModelScope.launch {
            val result = getMovieImageUseCase(id)
            Log.i("IMAGE", result?.image ?: "Sin imagen")
        }
    }
}