package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var materi_button : Button
    private lateinit var referensi_button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        materi_button = findViewById(R.id.materi)
        materi_button.setOnClickListener(this)
        referensi_button = findViewById(R.id.referensi)
        referensi_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.materi -> run {
                val materi = Intent(this@HomeActivity, MateriActivity::class.java)
                startActivity(materi)
            }
        }
        when(v.id){
            R.id.referensi -> run {
                val referensi = Intent(this@HomeActivity, ReferensiActivity::class.java)
                startActivity(referensi)
            }
        }
    }
}