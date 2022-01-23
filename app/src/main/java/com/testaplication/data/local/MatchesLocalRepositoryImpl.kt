package com.testaplication.data.local

import com.testaplication.data.repository.MatchesLocalRepository
import kotlinx.coroutines.flow.Flow

class MatchesLocalRepositoryImpl(
    val database: MatchesDataBase
): MatchesLocalRepository {

    override fun getAllMatches(): Flow<List<MatchEntity>> =
        database.getDao().getAllMatches()


    override suspend fun deleteAll() {
        database.getDao().deleteAll()

    }

    override suspend fun insertMatch(matchEntity: MatchEntity) {
        database.getDao().insertMatch(matchEntity = matchEntity)

    }


}