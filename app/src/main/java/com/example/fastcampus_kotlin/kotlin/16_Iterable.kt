package com.example.fastcampus_kotlin.kotlin

// 16. Iterable

fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    for (item in a) {
        println(item)
    }

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index: " + index + " value: " + item)
    }

    // 반복하는 방법 (3)
    a.forEach {
        println(it)
    }

    // 반복하는 방법 (4) - 자동 할당 되는 `it`을 사용하지 않을 때!
    a.forEach { item ->
        println(item)
    }

    // 반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        println("index: $index value: $item")
    }

    // 반복하는 방법 (6)
    for (i in 0 until a.size) {  // 0부터 a.size-1까지 반복한다. - Python에서 `for i in range(len(a))` 와 동일
        println(a.get(i))
    }

    // 반복하는 방법 (7)
    for (i in 0 until a.size step 2) {  // Python에서 `for i in range(0, len(a), 2)`와 동일
        println(a.get(i))
    }

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo 0) {  // 8부터 0까지 반복한다. `for i in range(len(a)-1, -1, -1) in Python
        println(a.get(i))
    }

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo 0 step 2) {
        println(a.get(i))
    }

    // 반복하는 방법 (10)
    for (i in 0..a.size) { // until과는 다르게 마지막 숫자까지 포함된다.
        println(a.get(i))
    }

    //// while

    // 반복하는 방법 (11)
    var b = 0
    var c = 4
    while (b < c) {
        b++
        println("b")
    }

    // 반복하는 방법 (12)
    var d = 0
    var e = 4
    do {
        println("hello")
    } while (d < e)
}