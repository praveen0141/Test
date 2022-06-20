package com.example.mysongdb.data.network

import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ShowsNetworkInterface {
    @GET("shows/{y}")
    suspend fun getShowDetails(
        @Path("y")y:Int
    ): ShowsResponse
}