package com.example.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)

        val name:String? = intent.getStringExtra("name")
        val num: String? = intent.getStringExtra("num")
        val imgId:Int = intent.getIntExtra("imgId", 0)

        findViewById<TextView>(R.id.contacts_info_name).setText(name)
        findViewById<TextView>(R.id.contacts_info_num).setText(num)
        findViewById<ImageView>(R.id.contacts_info_img).setImageResource(imgId)

        val closeBtn = findViewById<ImageView>(R.id.contacts_info_closeBtn)
        closeBtn.setOnClickListener {
            onBackPressed()  // 뒤로가기와 동일한 효과!
        }
    }
}