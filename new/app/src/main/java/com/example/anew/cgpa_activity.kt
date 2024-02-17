package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.QUEUE_FLUSH
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.EditText
import java.util.Locale
import kotlin.math.roundToInt

class cgpa_activity : AppCompatActivity(), TextToSpeech.OnInitListener{
    var tts:TextToSpeech?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cgpa)
        tts=TextToSpeech(this,this)
        var r=findViewById<View>(R.id.res) as EditText
        r.keyListener=null
    }
    fun cgpa(v: View?) {
        var flag=0
        var s31 :Float?=null
        var s32 :Float?=null
        var s33 :Float?=null
        var s34 :Float?=null
        var s35 :Float?=null
        var s36 :Float?=null
        var s37 :Float?=null
        var s38 :Float?=null



        val es1: EditText = findViewById(R.id.s1)
        if (!es1.text.isNullOrEmpty()) {
         s31 = es1.text.toString().toFloat() }
        val es2: EditText = findViewById(R.id.s2)
        if (!es2.text.isNullOrEmpty()) {
         s32 = es2.text.toString().toFloat() }
        val es3: EditText = findViewById(R.id.s3)
        if (!es3.text.isNullOrEmpty()) {
             s33 = es3.text.toString().toFloat() }
        val es4: EditText = findViewById(R.id.s4)
        if (!es4.text.isNullOrEmpty()) {
             s34 = es4.text.toString().toFloat() }
        val es5: EditText = findViewById(R.id.s5)
        if (!es5.text.isNullOrEmpty()) {
             s35 = es5.text.toString().toFloat() }
        val es6: EditText = findViewById(R.id.s6)
        if (!es6.text.isNullOrEmpty()) {
             s36 = es6.text.toString().toFloat() }
        val es7: EditText = findViewById(R.id.s7)
        if (!es7.text.isNullOrEmpty()) {
             s37 = es7.text.toString().toFloat() }
        val es8: EditText = findViewById(R.id.s8)
        if (!es8.text.isNullOrEmpty()) {
             s38 = es8.text.toString().toFloat() }
        //val esres: EditText = findViewById(R.id.res)
        if (es1.text.isNullOrEmpty() && es2.text.isNullOrEmpty() && es3.text.isNullOrEmpty() &&es4.text.isNullOrEmpty() &&es5.text.isNullOrEmpty() &&es6.text.isNullOrEmpty() &&es7.text.isNullOrEmpty() &&es8.text.isNullOrEmpty() )
        {
            var e = findViewById<View>(R.id.res) as EditText
            e.setText("Data insufficient")
        }
        else {
            val minValue = 0 // Set the minimum value here
            val maxValue = 10// Set the maximum value here
            if (!es1.text.isNullOrEmpty()) {
                if (s31!! < minValue) {
                    es1.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s31 > maxValue) {
                    es1.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es2.text.isNullOrEmpty()) {
                if (s32!! < minValue) {
                    es2.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s32 > maxValue) {
                    es2.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es3.text.isNullOrEmpty()) {
                if (s33!! < minValue) {
                    es3.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s33 > maxValue) {
                    es3.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es4.text.isNullOrEmpty()) {
                if (s34!! < minValue) {
                    es4.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s34 > maxValue) {
                    es4.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es5.text.isNullOrEmpty()) {
                if (s35!! < minValue) {
                    es5.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s35 > maxValue) {
                    es5.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es6.text.isNullOrEmpty()) {
                if (s36!! < minValue) {
                    es6.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s36 > maxValue) {
                    es6.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es7.text.isNullOrEmpty()) {
                if (s37!! < minValue) {
                    es7.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s37 > maxValue) {
                    es7.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }
            if (!es8.text.isNullOrEmpty()) {
                if (s38!! < minValue) {
                    es8.error = "Input must be at least $minValue"
                    flag = 1
                } else if (s38 > maxValue) {
                    es8.error = "Input must be at most $maxValue"
                    flag = 1
                }
            }

            var num = 0.0;
            var den = 0.0;
            if (!es1.text.isNullOrEmpty()) {
                var i31 = findViewById<View>(R.id.s1) as EditText
                var ss1 = i31.text.toString().toFloat()
                num = num + (ss1 * 20);
                den = den + 20;
            }
            if (!es2.text.isNullOrEmpty()) {
                var i32 = findViewById<View>(R.id.s2) as EditText
                var ss2 = i32.text.toString().toFloat()
                num = num + (ss2 * 20);
                den = den + 20;
            }
            if (!es3.text.isNullOrEmpty()) {
                var i33 = findViewById<View>(R.id.s3) as EditText
                var ss3 = i33.text.toString().toFloat()
                num = num + (ss3 * 24);
                den = den + 24;
            }
            if (!es4.text.isNullOrEmpty()) {
                var i34 = findViewById<View>(R.id.s4) as EditText
                var ss4 = i34.text.toString().toFloat()
                num = num + (ss4 * 24);
                den = den + 24;
            }
            if (!es5.text.isNullOrEmpty()) {
                var i35 = findViewById<View>(R.id.s5) as EditText
                var ss5 = i35.text.toString().toFloat()
                num = num + (ss5 * 25);
                den = den + 25;
            }
            if (!es6.text.isNullOrEmpty()) {
                var i36 = findViewById<View>(R.id.s6) as EditText
                var ss6 = i36.text.toString().toFloat()
                num = num + (ss6 * 24);
                den = den + 24;
            }
            if (!es7.text.isNullOrEmpty()) {
                var i37 = findViewById<View>(R.id.s7) as EditText
                var ss7 = i37.text.toString().toFloat()
                num = num + (ss7 * 20);
                den = den + 20;
            }
            if (!es8.text.isNullOrEmpty()) {
                var i38 = findViewById<View>(R.id.s8) as EditText
                var ss8 = i38.text.toString().toFloat()
                num = num + (ss8 * 18);
                den = den + 18;
            }
            if (flag == 0) {
                var e = findViewById<View>(R.id.res) as EditText

                var a = num / den
                //var ans=a.toString()
                var ans = ((a * 100).roundToInt() / 100.0).toString()

                e.setText(ans)
            } else {
                var e = findViewById<View>(R.id.res) as EditText
                e.setText("Wrong Input")
            }
        }
    }
    fun reset(v:View?)
    {
        val et1: EditText = findViewById(R.id.s1)
        et1.text.clear()
        val et2: EditText = findViewById(R.id.s2)
        et2.text.clear()
        val et3: EditText = findViewById(R.id.s3)
        et3.text.clear()
        val et4: EditText = findViewById(R.id.s4)
        et4.text.clear()
        val et5: EditText = findViewById(R.id.s5)
        et5.text.clear()
        val et6: EditText = findViewById(R.id.s6)
        et6.text.clear()
        val et7: EditText = findViewById(R.id.s7)
        et7.text.clear()
        val et8: EditText = findViewById(R.id.s8)
        et8.text.clear()
        val et9: EditText = findViewById(R.id.res)
        et9.text.clear()
    }
    fun speak(v: View?)
    {
        var e=findViewById<View>(R.id.res) as EditText
        var txt=e.text.toString()
        tts!!.speak(txt,TextToSpeech.QUEUE_FLUSH,null,"")
    }
    override fun onInit(status: Int) {

        tts!!.setLanguage(Locale.ENGLISH)
    }
}