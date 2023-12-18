package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var daftar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        daftar = findViewById(R.id.daftar)
        daftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.daftar -> run {
                val daftar = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(daftar)
            }
        }
    }
}