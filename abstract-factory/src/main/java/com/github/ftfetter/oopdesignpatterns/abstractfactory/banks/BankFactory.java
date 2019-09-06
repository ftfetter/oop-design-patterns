package com.github.ftfetter.oopdesignpatterns.abstractfactory.banks;

import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CardAccount;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.products.CurrentAccount;

public interface BankFactory {

    CurrentAccount createCurrentAccount();

    CardAccount createCardAccount();
}
