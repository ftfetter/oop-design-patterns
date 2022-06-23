package com.github.ftfetter.oopdesignpatterns.abstractfactory.factory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.armor.MageArmor
import com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon.MageWeapon

class MageFactory: ClassFactory {
    override fun name() = "Mage"
    override fun armor() = MageArmor()
    override fun weapon() = MageWeapon()
}