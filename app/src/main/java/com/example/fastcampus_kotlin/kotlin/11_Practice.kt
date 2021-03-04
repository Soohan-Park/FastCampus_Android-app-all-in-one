package com.example.fastcampus_kotlin.kotlin

// 11. 흐름 제어 실습

fun main(args: Array<String>) {
    val value: Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> {
            print("")
        }
        false -> {
            print("")
        }
        null -> {
            print("")
        }
    }

    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4
    }

    // when의 다양한 조건식 (1)
    val value4: Int = 10
    when(value4) {
        is Int -> {
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    // when의 다양한 조건식 (2)
    val value5: Int = 87
    when(value5) {
        in 60..70 -> {
            println("value5 in 60~70")
        }
        else -> {
            println("value5 not in 60~70")
        }
    }

}