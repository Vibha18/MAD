package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn);
        btn.setOnClickListener {
            val intent= Intent(this,Activity2::class.java);
            startActivity(intent);
        }

        var b2 = findViewById<Button>(R.id.btn2);
        b2.setOnClickListener {
            val intent= Intent(this,scheme2::class.java);
            startActivity(intent);
        }
    }
}