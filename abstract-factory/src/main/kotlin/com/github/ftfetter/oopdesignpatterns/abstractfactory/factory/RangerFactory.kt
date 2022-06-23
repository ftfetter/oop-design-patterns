package com.github.ftfetter.oopdesignpatterns.abstractfactory.factory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.armor.RangerArmor
import com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon.RangerWeapon

class RangerFactory: ClassFactory {
    override fun name() = "Ranger"
    override fun armor() = RangerArmor()
    override fun weapon() = RangerWeapon()
}