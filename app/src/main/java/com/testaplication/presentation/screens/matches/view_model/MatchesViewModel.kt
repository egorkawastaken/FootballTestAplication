package com.testaplication.presentation.screens.matches.view_model

import androidx.lifecycle.ViewModel
import com.testaplication.domain.use_cases.MatchUseCases
import com.testaplication.presentation.screens.matches.events.MatchesEvent

class MatchesViewModel(
    val useCases: MatchUseCases
): ViewModel() {

fun onEvent(event: MatchesEvent) {
    when(event) {
        is MatchesEvent.GetFromRemote -> {
            useCases.getMatchesFromRemote
        }
    }
}


}