package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sem7_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem7)

        var cs = findViewById<Button>(R.id.cs);
        cs.setOnClickListener {
            val intent = Intent(this, sem7_cs::class.java);
            startActivity(intent);
        }
            var mech = findViewById<Button>(R.id.mech);
            mech.setOnClickListener {
                val intent = Intent(this, sem7_mech::class.java);
                startActivity(intent);
        }
    }
}