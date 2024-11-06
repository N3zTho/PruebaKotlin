package com.example.pruebakotlin.di

import androidx.room.Room
import com.example.pruebakotlin.data.database.MovieDatabase
import com.example.pruebakotlin.data.database.dao.MovieDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

const val DATABASE_NAME = "moviedb"


fun provideDao(movieDataBase: MovieDatabase): MovieDao = movieDataBase.getMovieDao()

var roomModule = module {
    single {

        Room.databaseBuilder(
            androidApplication(),
            MovieDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    single {
        provideDao(get())
    }



}