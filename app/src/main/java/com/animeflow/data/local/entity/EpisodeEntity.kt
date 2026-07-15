package com.animeflow.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "episodes")
data class EpisodeEntity(
    @PrimaryKey
    val id: String,
    val animeId: String,
    val episodeNumber: Int,
    val title: String,
    val description: String,
    val thumbnailUrl: String,
    val videoUrl: String,
    val duration: Long,
    val airDate: String,
    val isWatched: Boolean = false,
    val watchedProgress: Long = 0
)
