package com.animeflow.data.mapper

import com.animeflow.data.local.entity.AnimeEntity
import com.animeflow.data.remote.dto.AnimeDto
import com.animeflow.domain.model.Anime

fun AnimeDto.toEntity(): AnimeEntity = AnimeEntity(
    id = id,
    title = title,
    description = description,
    posterUrl = posterUrl,
    bannerUrl = bannerUrl,
    rating = rating,
    genres = genres,
    status = status,
    episodes = episodes,
    year = year,
    studio = studio,
    score = score,
    popularity = popularity
)

fun AnimeEntity.toDomain(): Anime = Anime(
    id = id,
    title = title,
    description = description,
    posterUrl = posterUrl,
    bannerUrl = bannerUrl,
    rating = rating,
    genres = genres,
    status = status,
    episodes = episodes,
    year = year,
    studio = studio,
    score = score,
    popularity = popularity,
    isFavorite = isFavorite,
    inWatchlist = inWatchlist
)

fun AnimeDto.toDomain(): Anime = Anime(
    id = id,
    title = title,
    description = description,
    posterUrl = posterUrl,
    bannerUrl = bannerUrl,
    rating = rating,
    genres = genres,
    status = status,
    episodes = episodes,
    year = year,
    studio = studio,
    score = score,
    popularity = popularity
)
