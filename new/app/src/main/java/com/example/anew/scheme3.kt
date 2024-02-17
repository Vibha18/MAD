package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class scheme3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheme3)

        var s1_btn = findViewById<Button>(R.id.s1_btn);
        s1_btn.setOnClickListener {
            val intent = Intent(this, s1_s2v::class.java);
            startActivity(intent);
        }
        var s2_btn = findViewById<Button>(R.id.s2_btn);
        s2_btn.setOnClickListener {
            val intent = Intent(this, s1_s2v::class.java);
            startActivity(intent);
        }
        var s3_btn = findViewById<Button>(R.id.s3_btn);
        s3_btn.setOnClickListener {
            val intent = Intent(this,sem3v::class.java);
            startActivity(intent);
        }
        var s4_btn = findViewById<Button>(R.id.s4_btn);
        s4_btn.setOnClickListener {
            val intent = Intent(this, sem4v::class.java);
            startActivity(intent);
        }
        var s5_btn = findViewById<Button>(R.id.s5_btn);
        s5_btn.setOnClickListener {
            val intent = Intent(this, sem5v::class.java);
            startActivity(intent);
        }
        var s_6btn = findViewById<Button>(R.id.s6_btn);
        s_6btn.setOnClickListener {
            val intent = Intent(this, sem6v::class.java);
            startActivity(intent);
        }
        var s_7btn = findViewById<Button>(R.id.s7_btn);
        s_7btn.setOnClickListener {
            val intent = Intent(this, sem7v::class.java);
            startActivity(intent);
        }
        var s_8btn = findViewById<Button>(R.id.s8_btn);
        s_8btn.setOnClickListener {
            val intent = Intent(this, sem8v::class.java);
            startActivity(intent);
        }



    }
}