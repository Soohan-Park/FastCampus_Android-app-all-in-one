package com.example.fastcampus_kotlin.kotlin

// 04. Function

// 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//  함수 내용
//  return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result = first + second
    return result
}


// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    var result: Int = first + second
    return result
}


// 반환값이 없는 함수 만들기
// Unit: 자바의 void와 동일하다.
fun printPlus(first: Int, second: Int): Unit {
    var result: Int = first + second
    print(result)
}


fun printPlus2(first: Int, second: Int) {  // Unit 생략
    var result: Int = first + second
    print(result)
}


// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second


// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    println(plus(5, 10))
    println(plus(second = 10, first = 5))  // 이렇게, 명시적으로 매개변수 지정 가능.

    println(plusFive(10, 20))
    println(plusFive(10))

    plusMany(1, 2, 3)
    plusMany(1)
}