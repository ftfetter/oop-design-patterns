package com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon

class RangerWeapon: Weapon {
    override fun description() = "A wooden bow made by elves."
    override fun attackPoints() = 10
    override fun attackType() = "Physical Long-range"
}