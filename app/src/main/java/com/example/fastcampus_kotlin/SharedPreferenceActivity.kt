package com.example.fastcampus_kotlin

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference
//        val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)

        // Mode
        // - MODE_PRIVATE : 생성한 App.에서만 사용가능
        // - NODE_WORLD_READABLE : 다른 App.에서 사용 가능 => Read-only
        // - MODE_WORLD_WRITABLE : 다른 App.에서 사용 가능 => R/W
        // - MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        // - MODE_APPEND : 기존 preference에 신규로 추가

//        val editor: SharedPreferences.Editor = sharedPreference.edit()
//        editor.putString("hello", "안녕하세요")
//        editor.commit()

        // sp1 -> SharedPreference
        // (KEY, VALUE) -> ("hello", "안녕하세요")
        // sp2 -> SharedPreference
        // (KEY, VALUE) -> ("hello", "안녕하세요11")

        // SharedPreference에 값을 불러오는 방법
//        val button = findViewById<Button>(R.id.sharedPrefButton)
//        button.setOnClickListener {
//            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
//            val value = sharedPreference.getString("hello", "데이터 없음")
//
//            Log.d("key-value", "Value: " + value)
//        }

        val saveBtn = findViewById<Button>(R.id.sp_save_btn)
        val loadBtn = findViewById<Button>(R.id.sp_load_btn)
        val deleteBtn = findViewById<Button>(R.id.sp_delete_btn)
        val deleteAllBtn = findViewById<Button>(R.id.sp_delete_all_btn)

        saveBtn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPreference.edit()
            editor.apply {
                this.putString("hello", "안녕하세요")
                this.putString("goodbye", "안녕히가세요")
            }
        }
        loadBtn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "데이터 없음")
            val value2 = sharedPreference.getString("goodbye", "데이터 없음")

            Log.d("key-value", "Value1: " + value1)
            Log.d("key-value", "Value2: " + value2)
        }
        deleteBtn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPreference.edit()
            editor.apply {
                this.remove("hello")
            }
        }
        deleteAllBtn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPreference.edit()
            editor.apply {
                this.clear()
            }
        }
    }
}