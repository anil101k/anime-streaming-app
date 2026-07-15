package com.animeflow.data.local.database

import androidx.room.TypeConverter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class RoomTypeConverters {
    private val moshi = Moshi.Builder().build()

    @TypeConverter
    fun fromList(list: List<String>): String {
        val adapter = moshi.adapter<List<String>>(Types.newParameterizedType(
            List::class.java,
            String::class.java
        ))
        return adapter.toJson(list)
    }

    @TypeConverter
    fun toList(json: String): List<String> {
        val adapter = moshi.adapter<List<String>>(Types.newParameterizedType(
            List::class.java,
            String::class.java
        ))
        return adapter.fromJson(json) ?: emptyList()
    }
}
