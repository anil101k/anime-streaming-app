package com.animeflow.domain.usecase.anime

import com.animeflow.domain.model.Anime
import com.animeflow.domain.repository.AnimeRepository
import com.animeflow.domain.util.Result
import javax.inject.Inject

class SearchAnimeUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    suspend operator fun invoke(query: String, page: Int = 1): Result<List<Anime>> {
        return if (query.isBlank()) {
            Result.Error(IllegalArgumentException("Search query cannot be blank"))
        } else {
            repository.searchAnime(query, page)
        }
    }
}
