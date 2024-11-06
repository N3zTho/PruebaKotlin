package com.example.pruebakotlin.data.network

import com.example.pruebakotlin.data.model.responses.DiscoverMoviesResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieApiClient {

    @GET("discover/movie")
    suspend fun getAllMovies(): Response<DiscoverMoviesResponse>
}