package com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon

class MageWeapon: Weapon {
    override fun description() = "A powerful magical wand."
    override fun attackPoints() = 15
    override fun attackType() = "Magical Medium-range"
}