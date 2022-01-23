package com.testaplication.data.repository

import com.testaplication.data.model.Matches
import com.testaplication.data.remote.Result


interface MatchesRemoteRepository {

    suspend fun getMatches(): Result<Matches>

}