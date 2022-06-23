package com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon

interface Weapon {
    fun description(): String
    fun attackPoints(): Int
    fun attackType(): String
}