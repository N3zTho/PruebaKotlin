package com.example.pruebakotlin.data.network

import com.example.pruebakotlin.data.model.responses.DiscoverMoviesResponse
import com.example.pruebakotlin.data.model.responses.ImageMovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieApiClient {

    @GET("discover/movie")
    suspend fun getAllMovies(): Response<DiscoverMoviesResponse>

    @GET("movie/{movie_id}/images")
    suspend fun getImage(@Path("movie_id") movieId:Int ): Response<ImageMovieResponse>
}