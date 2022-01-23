package com.testaplication.data.repository

import com.testaplication.data.remote.Result
import com.testaplication.data.remote.succeeded
import com.testaplication.domain.model.Match
import com.testaplication.domain.repository.MatchesRepository
import com.testaplication.util.toEntity

class MatchesRepositoryImpl(
    val local: MatchesLocalRepository,
    val remote: MatchesRemoteRepository
) : MatchesRepository {

    override suspend fun getRemoteMatches() {

        val result = remote.getMatches()

        when (result) {
            is Result.Success -> {
                if (result.succeeded) {
                    val matches = result.data
                    matches.data?.forEach { (key, value) ->

                    }
                }
            }
            else -> {
                result as Result.Error
            }
        }
    }

    override fun getLocalMatches() {
        local.getAllMatches()
    }

    override suspend fun deleteLocalMatches() {
        local.deleteAll()
    }

    override suspend fun insertMatchToDb(match: Match) {
        local.insertMatch(matchEntity = match.toEntity())
    }

}

fun main() {
    val mapa = mapOf<Int,String>(1 to "one", 2 to "two", 3 to "three")

    mapa.values.forEach{ value ->
        println("$value")
    }
}