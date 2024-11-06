package com.example.pruebakotlin.domain

import com.example.pruebakotlin.data.MovieRepository
import com.example.pruebakotlin.data.model.ImageModel


class GetMovieImageUseCase( private val respository : MovieRepository) {

    suspend operator fun invoke(id:Int):ImageModel? = respository.getImage(id)
}