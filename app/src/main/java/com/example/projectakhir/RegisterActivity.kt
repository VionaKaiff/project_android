package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var register_button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        register_button = findViewById(R.id.register)
        register_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.register -> run {
                val register = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(register)
            }
        }
    }
}