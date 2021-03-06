package com.example.fastcampus_kotlin.kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1) = first * second * third


fun main(args: Array<String>) {
    val res1 = plusThree(1, 2, 3)
    val res2 = minusThree(10, 1, 2)
    val res3 = multiplyThree(2,2,2)
    val res4 = multiplyThree()

    println(res1)
    println(res2)
    println(res3)
    println(res4)

    val res5 = showMyPlus(4, 5)
    println(res5)
}


// 내부 함수
// - 함수 안에 들어있는 함수
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    return plus(first, second)
}