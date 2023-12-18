package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_masuk : Button
    private lateinit var btn_daftar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_masuk = findViewById(R.id.btn_masuk)
        btn_masuk.setOnClickListener(this)
        btn_daftar = findViewById(R.id.btn_daftar)
        btn_daftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_masuk -> run {
                val masuk = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(masuk)
            }
        }
        when(v.id){
            R.id.btn_daftar -> run {
                val daftar = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(daftar)
            }
        }
    }
}