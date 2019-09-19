package com.github.ftfetter.oopdesignpatterns.builder.concretebuilder;

import com.github.ftfetter.oopdesignpatterns.builder.product.BlueBankCardAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.BlueBankCurrentAccount;
import com.github.ftfetter.oopdesignpatterns.builder.product.BlueBankCustomer;

import java.math.BigDecimal;

public class BlueBankCustomerBuilder {

    private BlueBankCustomer blueBankCustomer;

    public BlueBankCustomerBuilder() {
        this.blueBankCustomer = new BlueBankCustomer();
    }

    public BlueBankCustomerBuilder withName(String name) {
        blueBankCustomer.setName(name);
        return this;
    }

    public BlueBankCustomerBuilder withCurrentAccount(BlueBankCurrentAccount currentAccount) {
        blueBankCustomer.setCurrentAccount(currentAccount);
        return this;
    }

    public CurrentAccountBuilder withCurrentAccount() {
        return new CurrentAccountBuilder(this);
    }

    public BlueBankCustomerBuilder withCardAccount(BlueBankCardAccount cardAccount) {
        blueBankCustomer.setCardAccount(cardAccount);
        return this;
    }

    public CardAccountBuilder withCardAccount() {
        return new CardAccountBuilder(this);
    }

    public BlueBankCustomer build() {
        return blueBankCustomer;
    }

    public class CurrentAccountBuilder {

        private BlueBankCustomerBuilder blueBankCustomerBuilder;
        private BlueBankCurrentAccount blueBankCurrentAccount;

        public CurrentAccountBuilder(BlueBankCustomerBuilder blueBankCustomerBuilder) {
            this.blueBankCustomerBuilder = blueBankCustomerBuilder;
            this.blueBankCurrentAccount = new BlueBankCurrentAccount();
        }

        public CurrentAccountBuilder withNumber(String number) {
            blueBankCurrentAccount.setNumber(number);
            return this;
        }

        public CurrentAccountBuilder withBalance(BigDecimal balance) {
            blueBankCurrentAccount.setBalance(balance);
            return this;
        }

        public BlueBankCustomerBuilder buildCurrentAccount() {
            blueBankCustomerBuilder.withCurrentAccount(blueBankCurrentAccount);
            return blueBankCustomerBuilder;
        }
    }

    public class CardAccountBuilder {

        private BlueBankCustomerBuilder blueBankCustomerBuilder;
        private BlueBankCardAccount blueBankCardAccount;

        public CardAccountBuilder(BlueBankCustomerBuilder blueBankCustomerBuilder) {
            this.blueBankCustomerBuilder = blueBankCustomerBuilder;
            this.blueBankCardAccount = new BlueBankCardAccount();
        }

        public CardAccountBuilder withNumber(String number) {
            blueBankCardAccount.setNumber(number);
            return this;
        }

        public CardAccountBuilder withCardNumber(String cardNumber) {
            blueBankCardAccount.setCardNumber(cardNumber);
            return this;
        }

        public CardAccountBuilder withLimit(BigDecimal limit) {
            blueBankCardAccount.setLimit(limit);
            return this;
        }

        public BlueBankCustomerBuilder buildCardAccount() {
            blueBankCustomerBuilder.withCardAccount(blueBankCardAccount);
            return blueBankCustomerBuilder;
        }
    }
}
