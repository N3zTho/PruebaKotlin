package com.example.pruebakotlin.core

import android.util.Log
import com.example.pruebakotlin.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit(): Retrofit {

        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->

                val request = chain.request().newBuilder()
                    .addHeader("Accept", "application/json")
                    .addHeader("Authorization", "Bearer ${BuildConfig.TOKEN_API}")
                    .build()

                val response = chain.proceed(request)


                response
            }
            .build()


        return Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
}