package com.animeflow.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.animeflow.data.local.entity.EpisodeEntity

@Dao
interface EpisodeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEpisode(episode: EpisodeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllEpisodes(episodes: List<EpisodeEntity>)

    @Query("SELECT * FROM episodes WHERE animeId = :animeId ORDER BY episodeNumber ASC")
    suspend fun getEpisodesByAnimeId(animeId: String): List<EpisodeEntity>

    @Query("SELECT * FROM episodes WHERE id = :episodeId")
    suspend fun getEpisodeById(episodeId: String): EpisodeEntity?

    @Query("UPDATE episodes SET isWatched = 1 WHERE id = :episodeId")
    suspend fun markAsWatched(episodeId: String)

    @Query("UPDATE episodes SET watchedProgress = :progress WHERE id = :episodeId")
    suspend fun updateWatchProgress(episodeId: String, progress: Long)
}
