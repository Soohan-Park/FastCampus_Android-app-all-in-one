package com.example.fastcampus_kotlin.kotlin

// 18. Class

// OOP -> Object Oriented Programming (객체 지향 프로그래밍)

// 객체란?
// - 이름이 있는 모든 것

// 절차 지향 프로그래밍 문제 해결 방법
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다!

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다!
// - 선수, 심판, 경기장, 관중 => 축구 게임

// 객체를 만드는 방법
// - 프로그램이 지원해주지 않을 때, 객체를 직접 만들어야 한다.
// - 반드시 설명서가 있어야 한다!

// 클래스(설명서) 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법 (2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 (3) - (1) 방법의 확장.
class Car1(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 (4) -> (2) 방법의 확장.
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String, body: String) {
    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("${destination}으로 목적지가 설정되었습니다.")
    }


}


class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // 객체를 만들게 되면, 이 부분이 바로 무조건 실행된다.
    init {
        println("RunableCar2가 만들어졌습니다.")
    }

    fun ride() = println("탑승 하였습니다")
    fun drive() = println("달립니다!")
    fun navi(destination: String) = println("${destination}으로 목적지가 설정되었습니다.")
}


// 오버로딩
// - 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {
    fun test(a: Int) {

    }

    fun test(a: Int, b: Int) {

    }
}

fun main(args: Array<String>) {
    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // 클래스 -> 인스턴스화 -> 인스턴스(객체)
    val bigCar = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar : RunableCar = RunableCar("Simple Body", "good body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    // 인스턴스가 가지고 있는 멤버 변수에 접근하는 방법
    val runableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.engine)
}