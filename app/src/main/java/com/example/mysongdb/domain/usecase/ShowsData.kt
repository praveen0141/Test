package com.example.mysongdb.domain.usecase

import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import com.example.mysongdb.domain.Result
import com.example.mysongdb.domain.repository.getShows
import kotlinx.coroutines.flow.Flow

class showsUseCase(private val getShow: getShows) {
    fun getShowsDetails(name: String): Flow<Result<ShowsResponse>> {
        return getShow.getShows(name = name)
    }

}