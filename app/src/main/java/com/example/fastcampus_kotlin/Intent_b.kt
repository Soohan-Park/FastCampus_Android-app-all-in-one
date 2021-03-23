package com.example.fastcampus_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent_b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_b)



        val result: Button = findViewById(R.id.result)
        result.setOnClickListener {
            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)

            Log.d("number", number1.toString())
            Log.d("number", number2.toString())

            val res = number1 + number2
            val resIntent = Intent()
            resIntent.apply {
                this.putExtra("result", res)
            }

            setResult(RESULT_OK, resIntent)

            finish()  // Activity 종료
        }
    }
}