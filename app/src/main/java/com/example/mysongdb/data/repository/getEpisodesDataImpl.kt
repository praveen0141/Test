package com.example.mysongdb.data.repository

import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.data.network.NetworkInterface
import com.example.mysongdb.domain.repository.getEpisodes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import com.example.mysongdb.domain.Result as Result

class getEpisodesDataImpl (private val api: NetworkInterface):getEpisodes {
    override fun getepisodes(): Flow<Result<EpisodeResponse>> =
        flow<Result<EpisodeResponse>> {
            emit(Result.Loading())

            try {
                val data = api.getSeriesDetails(x = 1)
                emit(Result.Success(data=data))
            } catch (e: Exception) {

                emit(Result.Error(e.message))
            }
        }
    }

