package com.github.ftfetter.oopdesignpatterns.abstractfactory.factory

import com.github.ftfetter.oopdesignpatterns.abstractfactory.armor.Armor
import com.github.ftfetter.oopdesignpatterns.abstractfactory.weapon.Weapon

interface ClassFactory {
    fun name(): String
    fun armor(): Armor
    fun weapon(): Weapon
}