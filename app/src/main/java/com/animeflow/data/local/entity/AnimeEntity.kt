package com.animeflow.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "anime")
data class AnimeEntity(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val posterUrl: String,
    val bannerUrl: String,
    val rating: Float,
    val genres: List<String>,
    val status: String,
    val episodes: Int,
    val year: Int,
    val studio: String,
    val score: Float,
    val popularity: Int,
    val isFavorite: Boolean = false,
    val inWatchlist: Boolean = false
)
