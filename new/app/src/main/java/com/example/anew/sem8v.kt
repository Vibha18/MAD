//sem8v
package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.math.roundToInt

class sem8v : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem8v)
        var r=findViewById<View>(R.id.sgpa) as EditText
        r.keyListener=null
    }
    fun call(v: View?) {
        var n1: Int = 10
        var n2: Int = 10
        var flag = 0
        var i31 = findViewById<View>(R.id.s31) as EditText

        var i32 = findViewById<View>(R.id.s32) as EditText

        if (i31.text.isNullOrEmpty() || i32.text.isNullOrEmpty()   ) {
            var e = findViewById<View>(R.id.sgpa) as EditText
            e.setText("Data insufficient")
        } else {
            var s1 = i31.text.toString().toInt()
            var s2 = i32.text.toString().toInt()
            if (s1 == 100)
                n1=10
            else if(s1>54)
                n1 = ((s1 / 10) + 1).toInt()
            else if(s1>49)
                n1=5
            else if(s1>39)
                n1=4
            else
                n1=0

            if (s2 == 100)
                n2=10
            else if(s2>54)
                n2 = ((s2/ 10) + 1).toInt()
            else if(s2>49)
                n2=5
            else if(s2>39)
                n2=4
            else
                n2=0



            if (i31 != null) {
                val minValue = 0 // Set the minimum value here
                val maxValue = 100 // Set the maximum value here

                if (s1 < minValue) {
                    // Input is less than the minimum value
                    i31.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s1 > maxValue) {
                    // Input is greater than the maximum value
                    i31.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (i32 != null) {
                val minValue = 0 // Set the minimum value here
                val maxValue = 100 // Set the maximum value here

                if (s2 < minValue) {
                    // Input is less than the minimum value
                    i32.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s2 > maxValue) {
                    // Input is greater than the maximum value
                    i32.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (flag == 0) {
                var a =
                    ((n1 * 1) + (n2 * 15)) / 16.0
                //var ans = a.toString()
                var ans = ((a * 100).roundToInt() / 100.0).toString()
                var e = findViewById<View>(R.id.sgpa) as EditText
                e.setText(ans)

            } else {
                var e = findViewById<View>(R.id.sgpa) as EditText
                e.setText("Wrong Input")
            }

        }
    }

    fun reset(v: View?) {
        val et1: EditText = findViewById(R.id.s31)
        et1.text.clear()
        val et2: EditText = findViewById(R.id.s32)
        et2.text.clear()

        val ets: EditText = findViewById(R.id.sgpa)
        ets.text.clear()
    }
}