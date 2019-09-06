package com.github.ftfetter.oopdesignpatterns.abstractfactory.products;

public class BlueBankCurrentAccount implements CurrentAccount {

    @Override
    public void whoAmI() {
        System.out.println("I am a CurrentAccount from the BlueBank!");
    }
}
