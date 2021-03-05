package com.example.fastcampus_kotlin.kotlin

class TestAccess {
    var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("테스트")
    }
}

class Reward {
    private var rewardAmount = 1000
}

fun main(args: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")

    testAccess.test()

    println(testAccess.name)
    testAccess.name = "아무개 투"
    println(testAccess.name)

    val reward = Reward()
//    reward.rewardAmount = 2000  // 이렇게 리워드를 내 맘대로 변경할 수가 있다.
}