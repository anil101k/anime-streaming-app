package com.animeflow.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.animeflow.data.local.entity.AnimeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AnimeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnime(anime: AnimeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllAnime(animeList: List<AnimeEntity>)

    @Query("SELECT * FROM anime WHERE id = :id")
    suspend fun getAnimeById(id: String): AnimeEntity?

    @Query("SELECT * FROM anime ORDER BY popularity DESC LIMIT :limit")
    suspend fun getPopularAnime(limit: Int = 20): List<AnimeEntity>

    @Query("SELECT * FROM anime WHERE inWatchlist = 1")
    fun getWatchlist(): Flow<List<AnimeEntity>>

    @Query("UPDATE anime SET inWatchlist = 1 WHERE id = :animeId")
    suspend fun addToWatchlist(animeId: String)

    @Query("UPDATE anime SET inWatchlist = 0 WHERE id = :animeId")
    suspend fun removeFromWatchlist(animeId: String)

    @Query("DELETE FROM anime")
    suspend fun deleteAllAnime()
}
