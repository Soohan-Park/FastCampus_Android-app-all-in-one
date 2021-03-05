package com.example.fastcampus_kotlin.kotlin

// 전역 변수
var number100: Int = 100

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()

    println(test.name)
    println(number100)
}


class Test(var name: String) {
    // 클래스 변수
    val a = 1

    fun testFun() {
        // 지역 변수
        val b = 10

        number100 = 10
    }
}