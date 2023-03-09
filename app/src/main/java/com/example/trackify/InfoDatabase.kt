package com.example.trackify

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class InfoDatabase : RoomDatabase() {

    abstract fun infoDao() : InfoDao

    companion object{

        private var INSTANCE : InfoDatabase? = null
        fun getDatabase(context: Context) : InfoDatabase{
            if(INSTANCE == null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context, InfoDatabase::class.java, "my_tracks").build()
                }
            }
            return INSTANCE!!
        }
    }
}