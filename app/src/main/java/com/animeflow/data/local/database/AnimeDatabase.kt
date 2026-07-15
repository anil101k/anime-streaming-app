package com.animeflow.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.animeflow.data.local.entity.AnimeEntity
import com.animeflow.data.local.entity.EpisodeEntity

@Database(
    entities = [AnimeEntity::class, EpisodeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RoomTypeConverters::class)
abstract class AnimeDatabase : RoomDatabase() {
    abstract fun animeDao(): AnimeDao
    abstract fun episodeDao(): EpisodeDao

    companion object {
        const val DATABASE_NAME = "anime_database"
    }
}
