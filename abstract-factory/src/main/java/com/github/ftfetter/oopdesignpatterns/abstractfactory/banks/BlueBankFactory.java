package com.github.ftfetter.oopdesignpatterns.abstractfactory.banks;

import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.BlueBankCardAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.BlueBankCurrentAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CardAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CurrentAccount;

public class BlueBankFactory implements BankFactory {

    @Override
    public CurrentAccount createCurrentAccount() {
        return new BlueBankCurrentAccount();
    }

    @Override
    public CardAccount createCardAccount() {
        return new BlueBankCardAccount();
    }
}
