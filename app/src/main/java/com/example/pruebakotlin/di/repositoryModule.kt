package com.example.pruebakotlin.di

import com.example.pruebakotlin.data.MovieRepository
import com.example.pruebakotlin.data.network.MovieService


import org.koin.dsl.module

val repositoryModule = module {

    single {
        MovieService()
    }

    single { MovieRepository(get()) }

}