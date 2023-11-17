package com.example.noteroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_insertion: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn_insertion = findViewById(R.id.btn_insertion)
//        val db = DBHandler.getDB(this)
//
//
//        btn_insertion.setOnClickListener {
//
//            db.studentDao.insertStudent(StudentTable("Ilia", "ilia_frolov@list.ru", 1))
//
//
//
//            println(db.studentDao.getAllStudents())
//
//        }


    }
}