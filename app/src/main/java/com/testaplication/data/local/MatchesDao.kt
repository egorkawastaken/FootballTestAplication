package com.testaplication.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface MatchesDao {

    @Query("SELECT * FROM matches_table")
    fun getAllMatches(): Flow<List<MatchEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatch(matchEntity: MatchEntity)

    @Query("DELETE FROM matches_table")
    suspend fun deleteAll()

}