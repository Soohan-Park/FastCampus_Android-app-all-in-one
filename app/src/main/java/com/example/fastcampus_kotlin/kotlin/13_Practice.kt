package com.example.fastcampus_kotlin.kotlin

fun main(args: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)

    var group3 = intArrayOf(1, 2, 3)
    var group4 = booleanArrayOf(true, false, true)

    // lambda를 활용한 방법 { }
    var group5 = Array(10, { 0 })
    var group6 = Array(size = 5, init = { 1;2;3;4;5 })
}