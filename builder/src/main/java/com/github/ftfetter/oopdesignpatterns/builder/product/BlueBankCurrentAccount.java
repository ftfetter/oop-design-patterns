package com.github.ftfetter.oopdesignpatterns.builder.product;

import java.math.BigDecimal;

public class BlueBankCurrentAccount {

    private String number;
    private BigDecimal balance;

    public BlueBankCurrentAccount() {
    }

    public BlueBankCurrentAccount(String number, BigDecimal balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BlueBankCurrentAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
