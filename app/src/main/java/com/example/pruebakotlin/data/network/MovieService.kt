package com.example.pruebakotlin.data.network

import android.util.Log
import com.example.pruebakotlin.core.RetrofitHelper
import com.example.pruebakotlin.data.model.ImageModel
import com.example.pruebakotlin.data.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MovieService {

    private var retrofit: Retrofit = RetrofitHelper.getRetrofit()

    suspend fun getMovies(): List<MovieModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(MovieApiClient::class.java).getAllMovies()
            response.body()?.results ?: emptyList()
        }

    }

    suspend fun getImage(id: Int): ImageModel? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(MovieApiClient::class.java).getImage(id)
            response.body()?.backdrops?.get(0)

        }
    }
}