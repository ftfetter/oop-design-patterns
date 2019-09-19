package com.github.ftfetter.oopdesignpatterns.builder.concretebuilder;

import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCardAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCurrentAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.YellowBankCustomer;

import java.math.BigDecimal;

public class YellowBankCustomerBuilder {

    private YellowBankCustomer yellowBankCustomer;

    public YellowBankCustomerBuilder() {
        this.yellowBankCustomer = new YellowBankCustomer();
    }

    public YellowBankCustomerBuilder withName(String name) {
        yellowBankCustomer.setName(name);
        return this;
    }

    public YellowBankCustomerBuilder withCurrentAccount(YellowBankCurrentAccount currentAccount) {
        yellowBankCustomer.setCurrentAccount(currentAccount);
        return this;
    }

    public CurrentAccountBuilder withCurrentAccount() {
        return new CurrentAccountBuilder(this);
    }

    public YellowBankCustomerBuilder withCardAccount(YellowBankCardAccount cardAccount) {
        yellowBankCustomer.setCardAccount(cardAccount);
        return this;
    }

    public CardAccountBuilder withCardAccount() {
        return new CardAccountBuilder(this);
    }

    public YellowBankCustomer build() {
        return yellowBankCustomer;
    }

    public class CurrentAccountBuilder {

        private YellowBankCustomerBuilder yellowBankCustomerBuilder;
        private YellowBankCurrentAccount yellowBankCurrentAccount;

        public CurrentAccountBuilder(YellowBankCustomerBuilder yellowBankCustomerBuilder) {
            this.yellowBankCustomerBuilder = yellowBankCustomerBuilder;
            this.yellowBankCurrentAccount = new YellowBankCurrentAccount();
        }

        public CurrentAccountBuilder withNumber(String number) {
            yellowBankCurrentAccount.setNumber(number);
            return this;
        }

        public CurrentAccountBuilder withBalance(BigDecimal balance) {
            yellowBankCurrentAccount.setBalance(balance);
            return this;
        }

        public YellowBankCustomerBuilder buildCurrentAccount() {
            yellowBankCustomerBuilder.withCurrentAccount(yellowBankCurrentAccount);
            return yellowBankCustomerBuilder;
        }
    }

    public class CardAccountBuilder {

        private YellowBankCustomerBuilder yellowBankCustomerBuilder;
        private YellowBankCardAccount yellowBankCardAccount;

        public CardAccountBuilder(YellowBankCustomerBuilder yellowBankCustomerBuilder) {
            this.yellowBankCustomerBuilder = yellowBankCustomerBuilder;
            this.yellowBankCardAccount = new YellowBankCardAccount();
        }

        public CardAccountBuilder withNumber(String number) {
            yellowBankCardAccount.setNumber(number);
            return this;
        }

        public CardAccountBuilder withCardNumber(String cardNumber) {
            yellowBankCardAccount.setCardNumber(cardNumber);
            return this;
        }

        public CardAccountBuilder withLimit(BigDecimal limit) {
            yellowBankCardAccount.setLimit(limit);
            return this;
        }

        public YellowBankCustomerBuilder buildCardAccount() {
            yellowBankCustomerBuilder.withCardAccount(yellowBankCardAccount);
            return yellowBankCustomerBuilder;
        }
    }
}
