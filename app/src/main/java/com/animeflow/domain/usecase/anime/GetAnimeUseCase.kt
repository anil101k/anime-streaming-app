package com.animeflow.domain.usecase.anime

import com.animeflow.domain.model.Anime
import com.animeflow.domain.repository.AnimeRepository
import com.animeflow.domain.util.Result
import javax.inject.Inject

class GetAnimeUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    suspend operator fun invoke(page: Int = 1, pageSize: Int = 20): Result<List<Anime>> {
        return repository.getAnimeList(page, pageSize)
    }
}
