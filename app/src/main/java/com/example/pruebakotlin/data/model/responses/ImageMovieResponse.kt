package com.example.pruebakotlin.data.model.responses

import com.example.pruebakotlin.data.model.ImageModel
import com.google.gson.annotations.SerializedName

data class ImageMovieResponse(@SerializedName("backdrops") val backdrops: List<ImageModel>)