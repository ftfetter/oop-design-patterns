package com.github.ftfetter.oopdesignpatterns.abstractfactory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.factory.MageFactory
import com.github.ftfetter.oopdesignpatterns.abstractfactory.factory.RangerFactory
import com.github.ftfetter.oopdesignpatterns.abstractfactory.factory.WarriorFactory

fun main() {
    val mage = ClassClient(MageFactory())
    mage.printSheet()

    val ranger = ClassClient(RangerFactory())
    ranger.printSheet()

    val warrior = ClassClient(WarriorFactory())
    warrior.printSheet()
}