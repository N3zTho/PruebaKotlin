package com.example.pruebakotlin.data.model

import com.google.gson.annotations.SerializedName

data class ImageModel(
    val height: Int,
    @SerializedName("file_path") val image: String,
    val width: Int
)
