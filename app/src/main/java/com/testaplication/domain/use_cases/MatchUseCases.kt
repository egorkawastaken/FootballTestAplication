package com.testaplication.domain.use_cases

data class MatchUseCases(
    val getMatchesFromLocal: GetMatchesFromLocal,
    val getMatchesFromRemote: GetMatchesFromRemote,
    val getMoreInfo: GetMoreInfo,
    val addToFavourite: AddToFavourite
)