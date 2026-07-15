package com.animeflow.domain.model

data class User(
    val id: String,
    val email: String,
    val username: String,
    val profileImageUrl: String = "",
    val bio: String = "",
    val createdAt: String,
    val updatedAt: String
)

data class AuthCredentials(
    val email: String,
    val password: String
)

data class AuthToken(
    val accessToken: String,
    val refreshToken: String,
    val expiresIn: Long
)
