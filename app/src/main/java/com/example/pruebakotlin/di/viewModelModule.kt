package com.example.pruebakotlin.di

import com.example.pruebakotlin.ui.viewmodel.MovieViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{ MovieViewModel(get()) }
}