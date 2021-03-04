package com.example.fastcampus_kotlin.kotlin


// 12. 배열

fun main(args: Array<String>) {
    // 배열을 생성하는 방법 (1)
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1)

    // 배열을 생성하는 방법 (2)
    var group2 = arrayOf(1, 2, 3, 4.5, "Hello")

    // 배열의 값을 꺼내는 방법
    group1.get(0)
    group1[0]

    // 배열의 값을 바꾸는 방법
    group1.set(0, 100)
    group1[0] = 200
}