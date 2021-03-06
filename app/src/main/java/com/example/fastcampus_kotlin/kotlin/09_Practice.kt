package com.example.fastcampus_kotlin.kotlin


fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b+c == 110) {
        println("b + c is 110")
    } else {
        println("b + c is not 110")
    }

    // 엘비스 연산자
    val number: Int? = null
    val number2 = number ?: 10

}