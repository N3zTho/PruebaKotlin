package com.example.pruebakotlin.data

import com.example.pruebakotlin.data.model.ImageModel
import com.example.pruebakotlin.data.model.MovieModel
import com.example.pruebakotlin.data.network.MovieService

class MovieRepository(private val api:MovieService) {


    suspend fun getAllMovies(): List<MovieModel> {
        val response = api.getMovies().map { movie ->
            movie.poster = "https://image.tmdb.org/t/p/w500${movie.poster}"
            movie

        }

        //aqui va la db
        return response
    }

    suspend fun getImage(id: Int): ImageModel? {
        val imageResponse = api.getImage(id) ?: return null

        return ImageModel(
            imageResponse.height,
            "https://image.tmdb.org/t/p/w500${imageResponse.image}",
            imageResponse.width
        )

    }
}