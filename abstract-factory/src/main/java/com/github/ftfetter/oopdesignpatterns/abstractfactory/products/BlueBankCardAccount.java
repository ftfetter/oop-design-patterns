package com.github.ftfetter.oopdesignpatterns.abstractfactory.products;

public class BlueBankCardAccount implements CardAccount {

    @Override
    public void whoAmI() {
        System.out.println("I am a CardAccount from the BlueBank!");
    }
}
