//sem3v


package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.math.roundToInt

class sem3v : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem3v)
        var r=findViewById<View>(R.id.sgpa) as EditText
        r.keyListener=null
    }

    fun call(v: View?) {
        var n1: Int = 10
        var n2: Int = 10
        var n3: Int = 10
        var n4: Int = 10
        var n5: Int = 10
        var n6: Int = 10
        var n7: Int = 10
        var n8: Int = 10

        var i31 = findViewById<View>(R.id.s31) as EditText

        var i32 = findViewById<View>(R.id.s32) as EditText

        var i33 = findViewById<View>(R.id.s33) as EditText

        var i34 = findViewById<View>(R.id.s34) as EditText

        var i35 = findViewById<View>(R.id.s35) as EditText

        var i36 = findViewById<View>(R.id.s36) as EditText

        var i37 = findViewById<View>(R.id.s37) as EditText

        var i38 = findViewById<View>(R.id.s38) as EditText

        var flag = 0
        if (i31.text.isNullOrEmpty() || i32.text.isNullOrEmpty() || i33.text.isNullOrEmpty() || i34.text.isNullOrEmpty() || i35.text.isNullOrEmpty() || i36.text.isNullOrEmpty() || i37.text.isNullOrEmpty() || i38.text.isNullOrEmpty()) {
            var e = findViewById<View>(R.id.sgpa) as EditText
            e.setText("Data insufficient")
        } else {
            var s1 = i31.text.toString().toInt()
            var s2 = i32.text.toString().toInt()
            var s3 = i33.text.toString().toInt()
            var s4 = i34.text.toString().toInt()
            var s5 = i35.text.toString().toInt()
            var s6 = i36.text.toString().toInt()
            var s7 = i37.text.toString().toInt()
            var s8 = i38.text.toString().toInt()
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

            if (s3 == 100)
                n3=10
            else if(s3>54)
                n3=((s3/ 10) + 1).toInt()
            else if(s3>49)
                n3=5
            else if(s3>39)
                n3=4
            else
                n3=0

            if (s4 == 100)
                n4=10
            else if(s4>54)
                n4=((s4/ 10) + 1).toInt()
            else if(s4>49)
                n4=5
            else if(s4>39)
                n4=4
            else
                n4=0

            if (s5 == 100)
                n5=10
            else if(s5>54)
                n5=((s5/ 10) + 1).toInt()
            else if(s5>49)
                n5=5
            else if(s5>39)
                n5=4
            else
                n5=0

            if (s6 == 100)
                n6=10
            else if(s6>54)
                n6=((s6/ 10) + 1).toInt()
            else if(s6>49)
                n6=5
            else if(s6>39)
                n6=4
            else
                n6=0

            if (s7 == 100)
                n7=10
            else if(s7>54)
                n7=((s7/ 10) + 1).toInt()
            else if(s7>49)
                n7=5
            else if(s7>39)
                n7=4
            else
                n7=0

            if (s8 == 100)
                n8=10
            else if(s8>54)
                n8=((s8/ 10) + 1).toInt()
            else if(s8>49)
                n8=5
            else if(s8>39)
                n8=4
            else
                n8=0

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
            if (i33 != null) {
                val minValue = 0 // Set the minimum value here
                val maxValue = 100 // Set the maximum value here

                if (s3 < minValue) {
                    // Input is less than the minimum value
                    i33.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s3 > maxValue) {
                    // Input is greater than the maximum value
                    i33.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (i34 != null) {
                val minValue = 0 // Set the minimum value here
                val maxValue = 100 // Set the maximum value here

                if (s4 < minValue) {
                    // Input is less than the minimum value
                    i34.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s4 > maxValue) {
                    // Input is greater than the maximum value
                    i34.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (i35 != null) {
                val minValue = 0
                val maxValue = 100

                if (s5 < minValue) {
                    i35.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s5 > maxValue) {
                    i35.error = "Input must be at most $maxValue"
                    flag = 1
                }

            }
            if (i36 != null) {
                val minValue = 0
                val maxValue = 100

                if (s6 < minValue) {
                    i36.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s6 > maxValue) {
                    i36.error = "Input must be at most $maxValue"
                    flag = 1
                }

            }
            if (i37 != null) {
                val minValue = 0
                val maxValue = 100

                if (s7 < minValue) {
                    i37.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s7 > maxValue) {
                    i37.error = "Input must be at most $maxValue"
                    flag = 1
                }

            }
            if (i38 != null) {
                val minValue = 0
                val maxValue = 100

                if (s8 < minValue) {
                    i38.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s8 > maxValue) {
                    i38.error = "Input must be at most $maxValue"
                    flag = 1
                }

            }

            if (flag == 0) {
                var a =
                    ((n1 * 3) + (n2 * 4) + (n3 * 4) + (n4 * 3) + (n5 * 1) + (n6 * 1) + (n7 * 1) + (n8 * 1)) / 18.0
                // var ans = a.toString()
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
        val et3: EditText = findViewById(R.id.s33)
        et3.text.clear()
        val et4: EditText = findViewById(R.id.s34)
        et4.text.clear()
        val et5: EditText = findViewById(R.id.s35)
        et5.text.clear()
        val et6: EditText = findViewById(R.id.s36)
        et6.text.clear()
        val et7: EditText = findViewById(R.id.s37)
        et7.text.clear()
        val et8: EditText = findViewById(R.id.s38)
        et8.text.clear()
        val ets: EditText = findViewById(R.id.sgpa)
        ets.text.clear()
    }

}