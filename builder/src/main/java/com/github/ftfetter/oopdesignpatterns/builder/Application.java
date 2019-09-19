package com.github.ftfetter.oopdesignpatterns.builder;

import com.github.ftfetter.oopdesignpatterns.builder.concretebuilder.BlueBankCustomerBuilder;
import com.github.ftfetter.oopdesignpatterns.builder.concretebuilder.YellowBankCustomerBuilder;
import com.github.ftfetter.oopdesignpatterns.builder.product.BlueBankCustomer;
import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCardAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCurrentAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCustomer;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        BlueBankCustomerBuilder blueBuilder = new BlueBankCustomerBuilder();
        BlueBankCustomer blueCustomer = blueBuilder.withName("TEST_BLUE")
                .withCardAccount()
                .withNumber("cardAccountNumber")
                .withCardNumber("cardNumber")
                .withLimit(BigDecimal.ONE)
                .buildCardAccount()
                .withCurrentAccount()
                .withNumber("currentAccountNumber")
                .withBalance(BigDecimal.ONE)
                .buildCurrentAccount()
                .build();

        YellowBankCustomerBuilder yellowBuilder = new YellowBankCustomerBuilder();
        YellowBankCustomer yellowCustomer = yellowBuilder.withName("TEST_YELLOW")
                .withCardAccount(new YellowBankCardAccount("cardAccountNumber","cardNumber",BigDecimal.ONE))
                .withCurrentAccount(new YellowBankCurrentAccount("currentAccountNumber",BigDecimal.ONE))
                .build();

        System.out.println(blueCustomer.toString());
        System.out.println("----");
        System.out.println(yellowCustomer.toString());
    }
}
