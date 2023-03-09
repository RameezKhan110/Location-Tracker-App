package com.example.trackify

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface InfoDao {
    @Insert
    fun insertName(info: Info)

    @Update
    fun updateIndo(info: Info)
}