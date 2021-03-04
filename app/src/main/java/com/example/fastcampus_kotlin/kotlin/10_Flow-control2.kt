package com.example.fastcampus_kotlin.kotlin

// 10. 흐름 제어



fun main(args: Array<String>) {
    val value: Int = 3

    // When -  switch 문과 동일한 역할.
    when (value) {
        1 -> {
            print("value is 1")
        }
        2 -> {
            print("value is 2")
        }
        3 -> {
            print("value is 3")
        }
        else -> {
            print("I dont know value")
        }
    }

    // 이렇게 바로 값을 전달하는 것도 가능하다!
    val value2 = when(value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
}