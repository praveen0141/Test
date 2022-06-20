package com.example.mysongdb.domain.repository

import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.domain.Result
import kotlinx.coroutines.flow.Flow

interface getEpisodes {
    fun getepisodes(): Flow<Result<EpisodeResponse>>
}