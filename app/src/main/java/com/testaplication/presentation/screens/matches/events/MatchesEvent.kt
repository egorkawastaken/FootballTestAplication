package com.testaplication.presentation.screens.matches.events

sealed class MatchesEvent {
    object GetFromRemote: MatchesEvent()
}
