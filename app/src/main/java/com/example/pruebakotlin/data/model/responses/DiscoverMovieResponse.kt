package com.example.pruebakotlin.data.model.responses

import com.example.pruebakotlin.data.model.MovieModel
import com.google.gson.annotations.SerializedName

data class DiscoverMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieModel>,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results") val totalResults: Int,
)