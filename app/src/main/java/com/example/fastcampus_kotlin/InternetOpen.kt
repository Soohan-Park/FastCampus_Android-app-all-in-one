package com.example.fastcampus_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener

class InternetOpen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_open)

        val inputUrl: EditText = findViewById(R.id.url)
        val gotoBtn: Button = findViewById(R.id.gotoUrlBtn)

        gotoBtn.setOnClickListener { v ->
            var URLString = inputUrl.text.toString()

            if (!URLString.contains("https://")) URLString = "https://" + URLString

            val URL = Uri.parse(URLString)

            startActivity(Intent(Intent.ACTION_VIEW, URL))
        }

        // EditText에서 텍스트에 변화가 있을 때를 감지하는 리스너
        inputUrl.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit_text", "beforeTextChanged: " + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit_text", "onTextChanged: " + s)
                Log.d("edit_text", "onTextChanged: " + start)
                Log.d("edit_text", "onTextChanged: " + before)
                Log.d("edit_text", "onTextChanged: " + count)
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("edit_text", "afterTextChanged: " + s)
            }
        })
    }

}