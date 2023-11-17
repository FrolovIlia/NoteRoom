package com.example.noteroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertStudent(studentTable: StudentTable)

    @Query("SELECT * FROM 'StudentTable'")
    fun getAllStudents(): List<StudentTable>

}