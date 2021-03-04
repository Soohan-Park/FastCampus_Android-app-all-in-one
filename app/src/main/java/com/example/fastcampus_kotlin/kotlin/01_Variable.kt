package com.example.fastcampus_kotlin.kotlin

// 01. Variable

// 변수를 선언하는 방법
// var/val 변수명(상자) = 값 (넣고 싶은 것)

// var : 내 마음대로 원하는 것을 넣을 수 있는 상자
// val : 한번 넣으면 바꿀 수 없는 상자 (const 같은!)

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20



fun main(args:Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)

    // fix = 500 >> "Val cannot be ressigned" ERROR HAS OCCURRED.
}