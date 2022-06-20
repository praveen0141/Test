package com.example.mysongdb.domain.repository

import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import com.example.mysongdb.domain.Result
import kotlinx.coroutines.flow.Flow

interface getShows {
    fun getShows(name: String): Flow<Result<ShowsResponse>>

}