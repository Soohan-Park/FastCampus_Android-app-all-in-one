package com.example.fastcampus_kotlin.kotlin

// 14. Collection
// - list, set, map

fun main(args: Array<String>) {
    // Immutable Collections => 값을 변경할 수 없는 콜렉션.
    // List (중복을 허용한다)
    var numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // Set (중복을 혀용하지 않는다 / 순서가 없다)
    var numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    // Map (key-value 방식으로 관리한다)
    var numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.get("one"))


    // Mutable Collection => 값 변경이 가능한 콜렉션.
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(5)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)
}