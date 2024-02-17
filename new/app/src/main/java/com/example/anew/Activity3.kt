package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        var s1_btn = findViewById<Button>(R.id.s1_btn);
        s1_btn.setOnClickListener {
            val intent = Intent(this, s1_s2::class.java);
            startActivity(intent);
        }
        var s2_btn = findViewById<Button>(R.id.s2_btn);
        s2_btn.setOnClickListener {
            val intent = Intent(this, s1_s2::class.java);
            startActivity(intent);
        }
        var s3_btn = findViewById<Button>(R.id.s3_btn);
        s3_btn.setOnClickListener {
            val intent = Intent(this, sem3_activity::class.java);
            startActivity(intent);
        }
        var s4_btn = findViewById<Button>(R.id.s4_btn);
        s4_btn.setOnClickListener {
            val intent = Intent(this, sem4_activity::class.java);
            startActivity(intent);
        }
        var s5_btn = findViewById<Button>(R.id.s5_btn);
        s5_btn.setOnClickListener {
            val intent = Intent(this, sem5_activity::class.java);
            startActivity(intent);
        }
        var s_6btn = findViewById<Button>(R.id.s6_btn);
        s_6btn.setOnClickListener {
            val intent = Intent(this, sem6_activity::class.java);
            startActivity(intent);
        }
        var s_7btn = findViewById<Button>(R.id.s7_btn);
        s_7btn.setOnClickListener {
            val intent = Intent(this, sem7_activity::class.java);
            startActivity(intent);
        }
        var s_8btn = findViewById<Button>(R.id.s8_btn);
        s_8btn.setOnClickListener {
            val intent = Intent(this, sem8_activity::class.java);
            startActivity(intent);
        }


    }
}
