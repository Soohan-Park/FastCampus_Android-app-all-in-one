package com.example.fastcampus_kotlin.kotlin


fun main(args: Array<String>) {
    prob01()
    println()
    prob02(87)
    println()
    prob03(27)
    println()
    prob04()
    println()
}


// Prob. 01
fun prob01() {
    val first = mutableListOf<Int>()
    val second = mutableListOf<Boolean>()

    for (i in 0..9) {
        first.add(i)
        if (i % 2 == 0) {
            second.add(true)
        } else {
            second.add(false)
        }
    }

    println(first)
    println(second)
}


// Prob. 02
fun prob02(score:Int=0) {
    when(score) {
        in 80..90 -> println('A')
        in 70..79 -> println('B')
        in 60..69 -> println('C')
        else -> println('F')
    }
}

// Prob. 03
fun prob03(target:Int) = println(target/10 + target%10)

// Prob. 04
fun prob04() {
    for (i in 1 until 10) {
        for (j in 1..9) {
            println("$i x $j = ${i*j}")
        }
    }
}
