package com.example.fastcampus_kotlin.kotlin

// 29. 제너릭
// - 목적: 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에서 컴파일 시에 타입을 체크해주는 기능
// - 제너릭은 만들기 어렵고, 만들 일이 거의 없기 때문에 사용하는 방법만 숙지!

fun main(args: Array<String>) {
    // 제너릭을 사용하지 않는 경우 (형 변환을 해주어야 한다)
    val list1 = listOf(1, 2, 3, '가')
    val b: String = list1[2].toString() // 형 변환 (타입이 바뀐다)

    // 제너릭을 사용하는 경우 (타입을 보장받을 수 있어서 안전하다)
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2]  // String 이라는 것을 보장받음 (by Generic)

    // 강한 타입을 체크할 수 있다
    val list3 = listOf(1, 2, 3, 4, "가", 3.0)
    // val list4 = listOf<Int>(1, 2, 3, "가")

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1, 2, 3, "가")
}
