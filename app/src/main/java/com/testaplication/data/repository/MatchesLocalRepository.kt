package com.testaplication.data.repository

import com.testaplication.data.local.MatchEntity
import kotlinx.coroutines.flow.Flow


interface MatchesLocalRepository {

    fun getAllMatches(): Flow<List<MatchEntity>>

    suspend fun deleteAll()

    suspend fun insertMatch(matchEntity: MatchEntity)


}