package com.testaplication.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MatchEntity::class], version = 1, exportSchema = false)
abstract class MatchesDataBase: RoomDatabase() {

    abstract fun getDao(): MatchesDao

    companion object {

        fun getDataBase(context: Context): MatchesDataBase {
            return Room.databaseBuilder(
                context,
                MatchesDataBase::class.java,
                "matches_database"
            ).build()
        }

    }

}