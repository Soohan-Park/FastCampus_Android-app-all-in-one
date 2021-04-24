package com.example.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafetyActivity : AppCompatActivity() {

    lateinit var lateCar: Car

    class Car(var number:Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number1: Int = 10
        val number2: Int? = null

        //  Null인 경우, 뒤에 부분이 실행이 되지 않는다. number2가 그대로 number3로 들어간다.
        val number3 = number2?.plus(number1)
        Log.d("number", "number3: " + number3)

        // 삼항연산자 -> 엘비스 연산자
        // ?: 앞에가 Null이 아니라면, 앞에꺼 그대로! Null이라면, 뒤에 것이 들어간다!
        // Null Safety를 위한 도구
        val number4 = number2 ?: 10
        Log.d("number", "number4: " + number4)

        //lateCar = Car(10)  // lateinit 이라는 키워드가 붇은 것은 추후 선언해주지 않고 실행한다면 앱이 크래시된다.
        Log.d("number", "late Car : " + lateCar)

        val number5: Int = number2!! + 10  // !! : 개발자가 Null이 아님을 보장!
    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}