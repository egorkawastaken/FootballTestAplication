package com.testaplication.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.testaplication.data.model.AwayTeam
import com.testaplication.data.model.HomeTeam
import com.testaplication.data.model.Stats
import com.testaplication.data.model.Venue

@Entity(tableName = "matches_table")
data class MatchEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val away_team: AwayTeam?,
    val home_team: HomeTeam?,
    val league_id: Int?,
    val match_id: Int?,
    val match_start: String?,
    val season_id: Int?,
    val stats: Stats?,
    val status: String?,
    val status_code: Int?,
    val venue: Venue?,
    val isFavourite: Boolean
)