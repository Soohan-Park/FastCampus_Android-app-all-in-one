package com.example.fastcampus_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent_a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_a)

        val change_activity: Button = findViewById(R.id.change_activity)

        change_activity.setOnClickListener { v ->
            // 요청서를 만들기만 한 것!
            // 어디에서 어디로 이동한다는 것을 바탕으로 Intent를 생성해야 함.
            // 이때, 목적지 클래스명 뒤에, ::class.java를 넣어주어야 한다.
            // Context를 넣어줄때, this만 넣어도 되지만, 예외가 발생하는 경우가 있다.
            // 따라서, thos@Intent_a로 context를 명확하게 해주는 것이 좋다.
            val intent1 = Intent(this@Intent_a, Intent_b::class.java)

            intent1.putExtra("number1", 1)
            intent1.putExtra("number2", 2)

            startActivity(intent)

            val intent2 = Intent(this@Intent_a, Intent_b::class.java)
            // apply 사용하는 것을 추천!!
            // apply: 앞에 있는 intent를 this로 할당해서 거기에 적용하기 위해 사용하는 구문
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 2)
            }
            startActivity(intent2)  // 전달만 하는 요청
            startActivityForResult(intent2, 200)// 값을 받는 요청, requestCode 는 일종의 이름이다!!!


            // 암시적 인텐트 - 버튼 클릭 시 특정 웹페이지 열기
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))  // Intent.ACTION_VIEW >> 뒤에 매개변수로 오는 것을 보여줘라!
            startActivity(intent3)

        }
    }

    // Intent의 결과로 들어오는 경우 실행되는 함수!!
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 200) {
            Log.d("number", requestCode.toString())
            Log.d("number", resultCode.toString())
            Log.d("number", data?.getIntExtra("result", 0).toString())
        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}