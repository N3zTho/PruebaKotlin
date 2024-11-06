package com.example.pruebakotlin.data.model

import com.google.gson.annotations.SerializedName

data class MovieModel(
    val title: String,
    @SerializedName("poster_path") val poster: String,
    val overview: String,
    @SerializedName("release_date") val releaseDate: String
) {
}