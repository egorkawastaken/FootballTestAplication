package com.testaplication.domain.use_cases

import com.testaplication.domain.model.Match
import com.testaplication.domain.repository.MatchesRepository

class AddMatchToLocal(val repo: MatchesRepository) {

    suspend operator fun invoke(match: Match) {
        repo.insertMatchToDb(match = match)
    }

}