package com.testaplication.data.remote

import com.testaplication.data.model.Matches
import com.testaplication.data.repository.MatchesRemoteRepository

class MatchesRemoteRepositoryImpl(
    val api: Api
): MatchesRemoteRepository, BaseRemoteDataSource() {

    override suspend fun getMatches(): Result<Matches> =
        getResult { api.getMatches() }

}