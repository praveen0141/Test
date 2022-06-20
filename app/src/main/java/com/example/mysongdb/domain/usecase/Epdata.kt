package com.example.mysongdb.domain.usecase

import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import com.example.mysongdb.domain.Result
import com.example.mysongdb.domain.repository.getEpisodes
import kotlinx.coroutines.flow.Flow

class episodeUseCase(private val getEpisode:getEpisodes) {
     fun getEpisodeDetails(name: String): Flow<Result<EpisodeResponse>> {
      return getEpisode.getepisodes()
     }

}