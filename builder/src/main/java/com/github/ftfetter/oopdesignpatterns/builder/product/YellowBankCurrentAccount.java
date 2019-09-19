package com.github.ftfetter.oopdesignpatterns.builder.product;

import java.math.BigDecimal;

public class YellowBankCurrentAccount {

    private String number;
    private BigDecimal balance;

    public YellowBankCurrentAccount() {
    }

    public YellowBankCurrentAccount(String number, BigDecimal balance) {
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
        return "YellowBankCurrentAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
