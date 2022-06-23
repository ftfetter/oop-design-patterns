package com.github.ftfetter.oopdesignpatterns.abstractfactory.factory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.armor.WarriorArmor
import com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon.WarriorWeapon

class WarriorFactory: ClassFactory {
    override fun name() = "Warrior"
    override fun armor() = WarriorArmor()
    override fun weapon() = WarriorWeapon()
}