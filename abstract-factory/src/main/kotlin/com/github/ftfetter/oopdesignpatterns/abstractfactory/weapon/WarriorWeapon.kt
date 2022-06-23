package com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon

class WarriorWeapon: Weapon {
    override fun description() = "A sword with a sharp blade."
    override fun attackPoints() = 10
    override fun attackType() = "Physical Close-range"
}