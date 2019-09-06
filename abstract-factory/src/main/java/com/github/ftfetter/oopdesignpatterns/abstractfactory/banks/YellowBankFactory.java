package com.github.ftfetter.oopdesignpatterns.abstractfactory.banks;

import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CardAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CurrentAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.YellowBankCardAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.YellowBankCurrentAccount;

public class YellowBankFactory implements BankFactory {

    @Override
    public CurrentAccount createCurrentAccount() {
        return new YellowBankCurrentAccount();
    }

    @Override
    public CardAccount createCardAccount() {
        return new YellowBankCardAccount();
    }
}
