package com.example.pruebakotlin.domain

import com.example.pruebakotlin.data.MovieRepository
import com.example.pruebakotlin.data.model.MovieModel

class GetMoviesUseCase( private val respository : MovieRepository) {

    suspend operator fun invoke(): List<MovieModel> = respository.getAllMovies()

}