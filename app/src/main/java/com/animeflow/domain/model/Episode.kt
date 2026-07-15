package com.animeflow.domain.model

data class Episode(
    val id: String,
    val animeId: String,
    val episodeNumber: Int,
    val title: String,
    val description: String,
    val thumbnailUrl: String,
    val videoUrl: String,
    val duration: Long, // in milliseconds
    val airDate: String,
    val isWatched: Boolean = false,
    val watchedProgress: Long = 0 // in milliseconds
)
