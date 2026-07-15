package com.animeflow.domain.model

data class Anime(
    val id: String,
    val title: String,
    val description: String,
    val posterUrl: String,
    val bannerUrl: String,
    val rating: Float,
    val genres: List<String>,
    val status: String, // AIRING, COMPLETED, NOT_AIRED
    val episodes: Int,
    val year: Int,
    val studio: String,
    val score: Float,
    val popularity: Int,
    val isFavorite: Boolean = false,
    val inWatchlist: Boolean = false
)
