package com.github.ftfetter.oopdesignpatterns.abstractfactory.products;

public class YellowBankCurrentAccount implements CurrentAccount {

    @Override
    public void whoAmI() {
        System.out.println("I am a CurrentAccount from the YellowBank!");
    }
}
