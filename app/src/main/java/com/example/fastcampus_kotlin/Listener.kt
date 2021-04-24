package com.example.fastcampus_kotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Listener : AppCompatActivity() {

    var count = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // 뷰를 액티비티로 가져오는 방법
        // 1. 직접 찾아서 가져온다
        val textView: TextView = findViewById(R.id.helloww)  //xml 파일들 중 hello란 이름으로 되어 있는 TextView 인스턴스를 가져올 수 있다.
        // 2. xml을 import해서 가져온다...?

        var image: ImageView = findViewById(R.id.imageww)

        // 1) 람다 방식
        textView.setOnClickListener {
            Log.d("click", "Clicked!!")
        }

        // 2) 익명 함수 방식
        textView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "Clicked!!")
            }
        })

        // 3) 객체 저장 후 실행하는 방식
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Clicked!!")
                textView.setText("안녕하세요~!!")

                image.setImageResource(R.drawable.bitcoin)  // R은 리소스를 의미, 즉, 리소스 밑에 drawable 밑에 bitcoin 활용
                count += 10

                Log.d("number", count.toString())
            }
        }
        textView.setOnClickListener(click)

        //////////

        // 뷰를 조작하는 함수들
        // setText
        // textView.setText("안녕하세요~!!")

        // ImageSetResource
        // var image: ImageView = findViewById(R.id.imageww)
        // image.setImageResource(R.drawable.bitcoin)  // R은 리소스를 의미, 즉, 리소스 밑에 drawable 밑에 bitcoin 활용

        // !!!
        // 정적인 View를 그릴 때는 xml에서!
        // 동적인 View를 그릴 때는 Activity에서!!
    }
}