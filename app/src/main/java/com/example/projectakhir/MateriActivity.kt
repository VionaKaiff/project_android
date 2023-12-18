package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MateriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var materi_1 : Button
    private lateinit var materi_2 : Button
    private lateinit var materi_3 : Button
    private lateinit var materi_4 : Button
    private lateinit var materi_5 : Button
    private lateinit var materi_6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        materi_1 = findViewById(R.id.materi_1)
        materi_1.setOnClickListener(this)
        materi_2 = findViewById(R.id.materi_2)
        materi_2.setOnClickListener(this)
        materi_3 = findViewById(R.id.materi_3)
        materi_3.setOnClickListener(this)
        materi_4 = findViewById(R.id.materi_4)
        materi_4.setOnClickListener(this)
        materi_5 = findViewById(R.id.materi_5)
        materi_5.setOnClickListener(this)
        materi_6 = findViewById(R.id.materi_6)
        materi_6.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.materi_1 -> run {
                val materi_1 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_1)
            }
        }
        when(v.id){
            R.id.materi_2 -> run {
                val materi_2 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_2)
            }
        }
        when(v.id){
            R.id.materi_3 -> run {
                val materi_3 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_3)
            }
        }
        when(v.id){
            R.id.materi_4 -> run {
                val materi_4 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_4)
            }
        }
        when(v.id){
            R.id.materi_5 -> run {
                val materi_5 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_5)
            }
        }
        when(v.id){
            R.id.materi_6 -> run {
                val materi_6 = Intent(this@MateriActivity, HalamanMateri1Activity::class.java)
                startActivity(materi_6)
            }
        }
    }
}