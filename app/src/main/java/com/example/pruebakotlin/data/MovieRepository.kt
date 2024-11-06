package com.example.pruebakotlin.data

import com.example.pruebakotlin.data.model.MovieModel
import com.example.pruebakotlin.data.network.MovieService

class MovieRepository {

    private val api = MovieService()

    suspend fun getAllMovies():List<MovieModel> {
        val response = api.getMovies()
        //aqui va la db
        return response
    }
}