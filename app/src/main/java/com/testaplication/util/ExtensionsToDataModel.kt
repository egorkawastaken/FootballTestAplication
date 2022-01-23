package com.testaplication.util

import com.testaplication.data.local.MatchEntity
import com.testaplication.domain.model.*

fun Match.toEntity(): MatchEntity {

    return MatchEntity(
        id = this.id,
        away_team = this.away_team?.toDataModel(),
        home_team = this.home_team?.toDataModel(),
        league_id = this.league_id,
        match_id = this.match_id,
        match_start = this.match_start,
        season_id = this.season_id,
        stats = this.stats?.toDataModel(),
        status = this.status,
        status_code = this.status_code,
        venue = this.venue?.toDataModel(),
        isFavourite = this.isFavourite,
    )

}

fun AwayTeam.toDataModel(): com.testaplication.data.model.AwayTeam {

    return com.testaplication.data.model.AwayTeam(
        country = this.country?.toDataModel(),
        logo = this.logo,
        name = this.name,
        short_code = this.short_code,
        team_id = this.team_id
    )

}

fun HomeTeam.toDataModel(): com.testaplication.data.model.HomeTeam {

    return com.testaplication.data.model.HomeTeam(
        country = this.country?.toDataModel(),
        logo = this.logo,
        name = this.name,
        short_code = this.short_code,
        team_id = this.team_id
    )

}

fun Country.toDataModel(): com.testaplication.data.model.Country {

    return com.testaplication.data.model.Country(
        continent = this.continent,
        country_code = this.country_code,
        country_id = this.country_id,
        name = this.name
    )

}

fun Stats.toDataModel(): com.testaplication.data.model.Stats {

    return com.testaplication.data.model.Stats(
        away_score = this.away_score,
        et_score = this.et_score,
        ft_score = this.ft_score,
        home_score = this.home_score,
        ht_score = this.ht_score,
        ps_score = this.ps_score
    )

}

fun Venue.toDataModel(): com.testaplication.data.model.Venue {

    return com.testaplication.data.model.Venue(
        capacity = this.capacity,
        city = this.city,
        country_id = this.country_id,
        name = this.name,
        venue_id = this.venue_id
    )

}