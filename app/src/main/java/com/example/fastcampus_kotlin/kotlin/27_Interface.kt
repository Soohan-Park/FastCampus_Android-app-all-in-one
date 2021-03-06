package com.example.fastcampus_kotlin.kotlin

// 27. 인터페이스
// - 인터페이스는 약속! -> 니가 이 것을 구현하면 너도 이 타입이다!
// - 인터페이스를 구현하는 클래스는 인터페이스 내 함수들에 대해 구체적인 기능을 만들어줘야 한다!
// - 인터페이스는 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다!
// - 지침서 -> 니가 이것을 구현하고 싶다면, 반드시 아래 기능을 구현해라!
// - 인터페이스를 구현한 클래스는 해당 인터페이스 타입을 가질 수 있다!
// - 인터페이스는 협업할 때 유용하다! (A가 S클래스를 작업하고 있을 때, B가 인터페이스를 통해 S클래스에 반드시 생길 함수를 보고 미리 작성해둘 수 있다.)
// - 공통적으로 필요한 부분이 있다면, 인터페이스에서도 구현할 수 있다! (또한, 구현한 경우 구현할 클래스에서 해당 부분을 구현할 필요는 없다)

// - 상속과 다른 점
//  상속은 조상을 찾아가는 느낌
//  인터페이스는 종의 특징

interface  PersonInterface {
    fun eat() {
        println("먹는다")
    }
    abstract fun sleep()  // 반드시 구현해야한다는 키워드
}

class Student() : PersonInterface {  // interface는 이렇게 구현
    override fun sleep() {
        TODO("Not yet implemented")
    }
}

class SoccerPlayer : PersonInterface {
    override fun sleep() {
        TODO("Not yet implemented")
    }
}


fun main(args: Array<String>) {
    val student: Student = Student()
    student.eat()

}