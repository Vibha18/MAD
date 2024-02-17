package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class s1_s2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s1_s2)
        var btn = findViewById<Button>(R.id.para);
        btn.setOnClickListener {
            val intent= Intent(this,sem2_activity::class.java);
            startActivity(intent);
        }
        var btn1 = findViewById<Button>(R.id.cara);
        btn1.setOnClickListener {
            val intent= Intent(this,sem1_activity::class.java);
            startActivity(intent);
        }
    }
}