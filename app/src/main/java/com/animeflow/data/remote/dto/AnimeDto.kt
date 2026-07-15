package com.animeflow.data.remote.dto

import com.squareup.moshi.Json

data class AnimeDto(
    @Json(name = "id")
    val id: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "poster_url")
    val posterUrl: String,
    @Json(name = "banner_url")
    val bannerUrl: String,
    @Json(name = "rating")
    val rating: Float,
    @Json(name = "genres")
    val genres: List<String>,
    @Json(name = "status")
    val status: String,
    @Json(name = "episodes")
    val episodes: Int,
    @Json(name = "year")
    val year: Int,
    @Json(name = "studio")
    val studio: String,
    @Json(name = "score")
    val score: Float,
    @Json(name = "popularity")
    val popularity: Int
)
