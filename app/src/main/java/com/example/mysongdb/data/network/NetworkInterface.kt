package com.example.mysongdb.data.network

import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkInterface {
    @GET("shows/{x}/episodes")
    suspend fun getSeriesDetails(
        @Path("x")x:Int
    ): EpisodeResponse
}