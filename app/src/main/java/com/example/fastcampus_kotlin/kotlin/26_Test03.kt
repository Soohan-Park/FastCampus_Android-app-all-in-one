package com.example.fastcampus_kotlin.kotlin


// 과제
// Knight, Monster (부모)
// SuperNight, SuperMonster (자식)

open class KnightCore {
    private var hp: Int
    private var power: Int

    constructor(hp: Int, power: Int) {
        this.hp = hp
        this.power = power
    }

    open fun attack(monster: MonsterCore, damage: Int = power) {
        if (monster.getHealth() <= damage) println("몬스터가 사망하였습니다.")
        else {
            monster.damaged(damage)
            println("몬스터의 체력은 ${monster.getHealth()} 입니다.")
        }
    }

    fun getHealth() = hp

    fun getPower() = power

    fun damaged(damage: Int) {
        hp -= damage
    }
}


open class MonsterCore {
    private var hp: Int
    private var power: Int

    constructor(hp: Int, power: Int) {
        this.hp = hp
        this.power = power
    }

    open fun attack(knight: KnightCore, damage: Int = power) {
        if (knight.getHealth() <= damage) println("기사가 사망하였습니다.")
        else {
            knight.damaged(damage)
            println("기사의 체력은 ${knight.getHealth()} 입니다.")
        }
    }

    fun getHealth() = hp

    fun getPower() = power

    fun damaged(damage: Int) {
        hp -= damage
    }
}


class SuperKnight(hp: Int, power: Int) : KnightCore(hp, power) {
    override fun attack(monster: MonsterCore, damage: Int) {
        super.attack(monster, damage * 2)  // super의 경우 데미지 2배
    }
}


class SuperMonster(hp: Int, power: Int) : MonsterCore(hp, power) {
    override fun attack(knight: KnightCore, damage: Int) {
        super.attack(knight, damage * 2)  // super의 경우 데미지 2배
    }
}


fun main(args: Array<String>) {
    val knight: KnightCore = KnightCore(100, 50)
    val monster: MonsterCore = MonsterCore(100, 50)

    val superKnight: SuperKnight = SuperKnight(100, 50)
    val superMonster: SuperMonster = SuperMonster(200, 10)

    knight.attack(monster, monster.getPower())

    superKnight.attack(superMonster, superKnight.getPower())
    superKnight.attack(superMonster, superKnight.getPower())
}