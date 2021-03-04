package com.example.fastcampus_kotlin.kotlin

class Prob01 {
    fun plus(first: Double, second: Double): Double = first + second
    fun minus(first: Double, second: Double): Double = first - second
    fun multi(first: Double, second: Double): Double = first * second
    fun divid(first: Double, second: Double): Double = first / second

    fun plus(first: Int, second: Int): Int = first + second
    fun minus(first: Int, second: Int): Int = first - second
    fun multi(first: Int, second: Int): Int = first * second
    fun divid(first: Int, second: Int): Double = (first / second).toDouble()
}


class Prob02 {
    private var name: String
    private var birth: String
    private var balance: Int

    constructor(name: String, birth:String, balance:Int=0) {
        this.name = name
        this.birth = birth
        this.balance = balance
    }

    fun getBal(): Int {
        return this.balance
    }

    fun deposit(amount: Int): Boolean {
        this.balance += amount
        return true
    }

    fun withdraw(amount: Int): Boolean {
        if (this.balance < amount) {
            return false
        }
        else {
            this.balance -= amount
            return true
        }
    }
}


class Prob03() {
    var channerList: Map<Int, String>
    var currentChannel: Int
    var powerStatus: Boolean

//    var 변수 = 초기값
//        set(value) { // 이 set 함수는 위의 변수에 값이 할당 될 때 호출된다!
//            변수 = value  // => 이것처럼 하면, 무한 루프에 빠지게 된다! (a에 다시 값이 할당되기 때문에 set()이 다시 호출된다.)
//            field = value  // => 이렇게 재할당 해주어야 한다.
//        }
//        get() {  // 값이 호출될 때 실행되는 함수
//            // set과 동일하다.
//            // return field 등등
//        }

    init {
        this.channerList = mutableMapOf(1 to "SBS", 2 to "KBS", 3 to "MBC")
        this.currentChannel = 1
        this.powerStatus = false
    }

    fun power(status: String) {
        when(status) {
            "on" -> {
                if (powerStatus) println("TV 전원이 이미 켜져 있습니다.")
                else println("TV 전원을 켰습니다. 현재 채널은 ${channerList[currentChannel]}입니다.")
            }
            "off" -> {
                if (!powerStatus) println("TV 전원이 이미 꺼져 있습니다.")
                else println("TV 전원을 껐습니다.")
            }
            else -> {
                println("잘못 된 명령입니다.")
            }
        }
    }

    fun channelUp() {
        if(currentChannel < channerList.size) {
            currentChannel++
            println("채널을 올렸습니다. 현재 채널은 ${channerList[currentChannel]}입니다.")
        }
        else {
            println("마지막 채널입니다.")
        }
    }

    fun channelDown() {
        if (currentChannel > 1) {
            currentChannel--
            println("채널을 내렸습니다. 현재 채널은 ${channerList[currentChannel]}입니다.")
        }
        else {
            println("첫 채널입니다.")
        }
    }
}


fun main(args: Array<String>) {
    val p1 = Prob01()
    val p2 = Prob02("박수한", "1995-07-25", 100000000)
    val p3 = Prob03()

    println(p1.plus(1.0, 2.0))
    println(p1.minus(2, 3))
    // ...

    println(p2.getBal())
    println(p2.withdraw(1))
    println(p2.getBal())
    // ...

    p3.power("on")
    p3.channelDown()
    p3.channelUp()
    // ...
}