package com.example.pruebakotlin.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("movie_table")
data class MovieEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id") val id: Int = 0,
    @ColumnInfo("idMovie") val idMovie: Int,
    @ColumnInfo("title") val title: String,
    @ColumnInfo("poster") val poster: String,
    @ColumnInfo("overview") val overview: String,
    @ColumnInfo("releaseDate") val releaseDate: String
)