package com.example.pruebakotlin

import android.app.Application
import com.example.pruebakotlin.di.repositoryModule
import com.example.pruebakotlin.di.roomModule
import com.example.pruebakotlin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@CustomApplication)
            modules(roomModule, repositoryModule, viewModelModule)
        }
    }
}