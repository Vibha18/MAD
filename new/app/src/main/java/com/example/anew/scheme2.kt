package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class scheme2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheme2)
        var btnsgpa = findViewById<Button>(R.id.btnsgpa);
        btnsgpa.setOnClickListener {
            val intent = Intent(this, scheme3::class.java);
            startActivity(intent);
        }
        var btncgpa = findViewById<Button>(R.id.btncgpa);
        btncgpa.setOnClickListener {
            val intent = Intent(this, cgpa2::class.java);
            startActivity(intent);
        }
    }
}