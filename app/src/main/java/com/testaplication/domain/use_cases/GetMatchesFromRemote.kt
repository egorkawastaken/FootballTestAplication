package com.testaplication.domain.use_cases

import com.testaplication.domain.repository.MatchesRepository

class GetMatchesFromRemote(val repo: MatchesRepository) {

    suspend operator fun invoke() {
        repo.getRemoteMatches()
    }

}