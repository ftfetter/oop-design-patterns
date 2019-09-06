package com.github.ftfetter.oopdesignpatterns.abstractfactory.products;

public class YellowBankCardAccount implements CardAccount {

    @Override
    public void whoAmI() {
        System.out.println("I am a CardAccount from the YellowBank!");
    }
}
