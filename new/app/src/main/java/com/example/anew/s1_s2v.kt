package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class s1_s2v : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s1_s2v)

        var btn = findViewById<Button>(R.id.p);
        btn.setOnClickListener {
            val intent= Intent(this,sem2v::class.java);
            startActivity(intent);
        }
        var btn1 = findViewById<Button>(R.id.c);
        btn1.setOnClickListener {
            val intent= Intent(this,sem1v::class.java);
            startActivity(intent);
        }
    }
}