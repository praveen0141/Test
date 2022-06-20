package com.example.mysongdb.data.repository

import android.util.Log
import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import com.example.mysongdb.data.network.ShowsNetworkInterface
import com.example.mysongdb.domain.Result
import com.example.mysongdb.domain.repository.getShows
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class getShowsDataImpl(private val api: ShowsNetworkInterface) :getShows{
    override fun getShows(name: String): Flow<Result<ShowsResponse>> =

        flow<Result<ShowsResponse>> {
            emit(Result.Loading())

            try {
                val data = api.getShowDetails(y = name.toInt())
                emit(Result.Success(data=data))
            } catch (e: Exception) {
                Log.d("aaaaaaaa",e.message.toString())
                emit(Result.Error(e.message))
            }
        }

}