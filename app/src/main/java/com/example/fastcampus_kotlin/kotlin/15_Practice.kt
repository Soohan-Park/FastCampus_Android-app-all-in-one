package com.example.fastcampus_kotlin.kotlin


fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)
    a.add(0, 100)  // 해당 인덱스에 값이 있는 경우, 그 값들을 뒤로 밀어버리고 해당 값을 넣는다!
    println(a)
    a.set(0, 200)
    println(a)
    a.removeAt(1)
    println(a)

    println()

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)  // 없는 값을 삭제하려고 해도, 에러는 발생하지 않는다!

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    c.clear()
    println(c)
}