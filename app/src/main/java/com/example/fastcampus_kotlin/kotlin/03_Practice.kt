package com.example.fastcampus_kotlin.kotlin

var a = 1 + 2 + 3 + 4 + 5  // 연산의 결과값을 변수에 넣어줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null - 존재하지 않는다.
//var abc : Int = null  // Null Safe
var def : Int? = null  // 자료형 뒤에 ? 가 있으면, Null을 가질 수 있는 자료형이 된다! (기본적으로 자료형이 지정되어 있는 경우, Null을 가질 수 없다!)

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
}