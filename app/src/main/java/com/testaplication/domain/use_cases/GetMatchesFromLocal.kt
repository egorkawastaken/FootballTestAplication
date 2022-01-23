package com.testaplication.domain.use_cases

import com.testaplication.domain.repository.MatchesRepository

class GetMatchesFromLocal(val repo: MatchesRepository) {

    suspend operator fun invoke() {
        repo.getLocalMatches()
    }

}