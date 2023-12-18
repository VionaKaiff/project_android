package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ReferensiActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var referensi_1 : Button
    private lateinit var referensi_2 : Button
    private lateinit var referensi_3 : Button
    private lateinit var referensi_4 : Button
    private lateinit var referensi_5 : Button
    private lateinit var referensi_6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referensi)

        referensi_1 = findViewById(R.id.referensi_1)
        referensi_1.setOnClickListener(this)
        referensi_2 = findViewById(R.id.referensi_2)
        referensi_2.setOnClickListener(this)
        referensi_3 = findViewById(R.id.referensi_3)
        referensi_3.setOnClickListener(this)
        referensi_4 = findViewById(R.id.referensi_4)
        referensi_4.setOnClickListener(this)
        referensi_5 = findViewById(R.id.referensi_5)
        referensi_5.setOnClickListener(this)
        referensi_6 = findViewById(R.id.referensi_6)
        referensi_6.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.referensi_1 -> run {
                val referensi_1 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_1)
            }
        }
        when(v.id){
            R.id.referensi_2 -> run {
                val referensi_2 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_2)
            }
        }
        when(v.id){
            R.id.referensi_3 -> run {
                val referensi_3 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_3)
            }
        }
        when(v.id){
            R.id.referensi_4 -> run {
                val referensi_4 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_4)
            }
        }
        when(v.id){
            R.id.referensi_5 -> run {
                val referensi_5 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_5)
            }
        }
        when(v.id){
            R.id.referensi_6 -> run {
                val referensi_6 = Intent(this@ReferensiActivity, HalamanReferensi1Activity::class.java)
                startActivity(referensi_6)
            }
        }
    }
}