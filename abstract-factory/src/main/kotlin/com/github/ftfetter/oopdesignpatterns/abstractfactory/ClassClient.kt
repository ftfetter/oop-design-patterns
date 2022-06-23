package com.github.ftfetter.oopdesignpatterns.abstractfactory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.factory.ClassFactory

class ClassClient(private val factory: ClassFactory) {

    fun printSheet() {
        println("------------------")
        println("Class: ${factory.name()}")
        factory.armor().run {
            println(":: Armor ::")
            println("Description: ${this.description()}")
            println("Can take ${this.defensePoints()} points of damage.")
        }
        factory.weapon().run {
            println(":: Weapon ::")
            println("Description: ${this.description()}")
            println("Can deal ${this.attackPoints()} points of ${this.attackType()} damage.")
        }
        println("------------------")
    }
}