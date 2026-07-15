package com.animeflow.domain.usecase.anime

import com.animeflow.domain.model.Anime
import com.animeflow.domain.repository.AnimeRepository
import com.animeflow.domain.util.Result
import javax.inject.Inject

class GetAnimeByIdUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    suspend operator fun invoke(id: String): Result<Anime> {
        return if (id.isBlank()) {
            Result.Error(IllegalArgumentException("Anime ID cannot be blank"))
        } else {
            repository.getAnimeById(id)
        }
    }
}
