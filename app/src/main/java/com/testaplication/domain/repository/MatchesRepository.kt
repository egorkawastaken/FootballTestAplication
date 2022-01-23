package com.testaplication.domain.repository

import com.testaplication.domain.model.Match


interface MatchesRepository {

    suspend fun getRemoteMatches()

    fun getLocalMatches()

    suspend fun deleteLocalMatches()

    suspend fun insertMatchToDb(match: Match)

}