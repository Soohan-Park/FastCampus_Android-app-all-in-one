package com.example.fastcampus_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val ment = resources.getString(R.string.hello)
        Log.d("mentt", "ment: " + ment)

        val ment2 = getString(R.string.hello)
        Log.d("mentt", "ment: " + ment2)

        val color = getColor(R.color.purple_700)
        Log.d("mentt", "color : " + color)

        val button = findViewById<Button>(R.id.button)
        button.setBackgroundColor(getColor(R.color.textview_color))

    }
}