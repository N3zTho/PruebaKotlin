package com.example.pruebakotlin.data.network

import com.example.pruebakotlin.core.RetrofitHelper
import com.example.pruebakotlin.data.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getMovies(): List<MovieModel> {

        return withContext(Dispatchers.IO) {
            val response = retrofit.create(MovieApiClient::class.java).getAllMovies()
            response.body()?.results ?: emptyList()
        }

    }
}