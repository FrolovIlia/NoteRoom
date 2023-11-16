package com.example.noteroom

import android.content.Context
import androidx.room.Room

class DBHandler {

    fun getDB(context: Context): StudentDB{

        return Room.databaseBuilder(context, StudentDB::class.java, "StudentDB").allowMainThreadQueries().build()
    }
}