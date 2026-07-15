package com.animeflow.domain.usecase.watchlist

import com.animeflow.domain.repository.AnimeRepository
import com.animeflow.domain.util.Result
import javax.inject.Inject

class AddToWatchlistUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    suspend operator fun invoke(animeId: String): Result<Unit> {
        return if (animeId.isBlank()) {
            Result.Error(IllegalArgumentException("Anime ID cannot be blank"))
        } else {
            repository.addToWatchlist(animeId)
        }
    }
}
