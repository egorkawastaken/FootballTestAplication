package com.testaplication.data.local

import androidx.room.TypeConverter
import com.testaplication.data.model.AwayTeam
import com.testaplication.util.fromGson
import com.testaplication.util.toGson

class MatchesTypeConverters {

    @TypeConverter
    fun fromAwayTeam(awayTeam: AwayTeam?): String? =
        awayTeam?.toGson()

    @TypeConverter
    fun toAwayTeam(awayTeam: String?): AwayTeam? =
        awayTeam?.fromGson(AwayTeam::class.java)

}