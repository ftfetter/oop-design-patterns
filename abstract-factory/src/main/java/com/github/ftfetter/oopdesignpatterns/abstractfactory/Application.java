package com.github.ftfetter.oopdesignpatterns.abstractfactory;

import com.github.ftfetter.oopdesignpatterns.abstractfactory.banks.BankFactory;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.banks.BlueBankFactory;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.banks.YellowBankFactory;
import com.github.ftfetter.oopdesignpatterns.abstractfactory.type.BankType;

public class Application {

    public static void main(String[] args) throws Exception {
        getBank(BankType.YELLOW_BANK)
                .createCardAccount()
                .whoAmI();

        getBank(BankType.BLUE_BANK)
                .createCurrentAccount()
                .whoAmI();
    }

    private static BankFactory getBank(BankType bankType) throws Exception {
        switch (bankType) {
            case YELLOW_BANK: return new YellowBankFactory();
            case BLUE_BANK: return new BlueBankFactory();
            default: throw new Exception("Bank not found!");
        }
    }
}
