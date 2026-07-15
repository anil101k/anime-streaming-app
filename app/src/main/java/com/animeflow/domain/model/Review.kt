package com.animeflow.domain.model

data class Review(
    val id: String,
    val animeId: String,
    val userId: String,
    val username: String,
    val rating: Float, // 1-10
    val comment: String,
    val createdAt: String,
    val updatedAt: String,
    val likes: Int = 0
)
