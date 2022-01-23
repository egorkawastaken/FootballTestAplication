package com.testaplication.di

import com.testaplication.domain.use_cases.AddToFavourite
import com.testaplication.domain.use_cases.GetMatchesFromLocal
import com.testaplication.domain.use_cases.GetMoreInfo
import com.testaplication.domain.use_cases.MatchUseCases
import org.koin.dsl.module

val domainModule = module {

    factory {
        GetMatchesFromLocal(repo = get())
    }

    factory {
        GetMoreInfo(repo = get())
    }

    factory {
        AddToFavourite(repo = get())
    }

    factory {
        MatchUseCases(
            getMatchesFromLocal = get(),
            getMoreInfo = get(),
            addToFavourite = get()
        )
    }

}