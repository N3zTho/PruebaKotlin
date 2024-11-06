package com.example.pruebakotlin.domain.model

import com.example.pruebakotlin.data.model.MovieModel

data class MovieItem(
    val id: Int,
    val title: String,
    val poster: String,
    val overview: String,
    val releaseDate: String
)

fun MovieModel.toDomain() = MovieItem(id, title, poster, overview, releaseDate)

