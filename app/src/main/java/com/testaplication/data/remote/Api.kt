package com.testaplication.data.remote

import com.testaplication.data.model.Matches
import com.testaplication.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/soccer/matches")
    suspend fun getMatches(
        @Query("apikey")
        apiKey: String = Constants.API_KEY,
        @Query("season_id")
        seasonId: String = "1477",
        @Query("date_from")
        dateFrom: String = "2020-11-09"
    ): Response<Matches>

}