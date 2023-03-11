package com.example.trackify.database

import androidx.room.PrimaryKey

data class Info(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val weight : String
)
