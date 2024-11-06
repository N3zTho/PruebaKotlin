package com.example.pruebakotlin.di

import com.example.pruebakotlin.data.MovieRepository
import com.example.pruebakotlin.data.network.MovieService
import com.example.pruebakotlin.domain.GetMovieImageUseCase


import org.koin.dsl.module

val repositoryModule = module {

    fun provideService(): MovieService = MovieService()

    single {
        provideService()
    }

    factory { MovieRepository(get()) }

    single {
        GetMovieImageUseCase(get())
        GetMovieImageUseCase(get())
    }
}