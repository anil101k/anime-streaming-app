package com.animeflow.data.remote

import com.animeflow.data.remote.dto.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun getAnimeList(
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): List<AnimeDto>

    @GET("anime/{id}")
    suspend fun getAnimeById(@Path("id") id: String): AnimeDto

    @GET("anime/search")
    suspend fun searchAnime(
        @Query("q") query: String,
        @Query("page") page: Int
    ): List<AnimeDto>

    @GET("anime/recommendations")
    suspend fun getRecommendations(
        @Query("user_id") userId: String
    ): List<AnimeDto>

    @GET("anime/genre/{genre}")
    suspend fun getAnimeByGenre(
        @Path("genre") genre: String,
        @Query("page") page: Int
    ): List<AnimeDto>
}
