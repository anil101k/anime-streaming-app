package com.animeflow.domain.repository

import com.animeflow.domain.model.Anime
import com.animeflow.domain.util.Result
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    suspend fun getAnimeList(page: Int, pageSize: Int): Result<List<Anime>>
    suspend fun getAnimeById(id: String): Result<Anime>
    suspend fun searchAnime(query: String, page: Int): Result<List<Anime>>
    suspend fun getRecommendations(userId: String): Result<List<Anime>>
    suspend fun getAnimeByGenre(genre: String, page: Int): Result<List<Anime>>
    fun getWatchlist(): Flow<List<Anime>>
    suspend fun addToWatchlist(animeId: String): Result<Unit>
    suspend fun removeFromWatchlist(animeId: String): Result<Unit>
}
