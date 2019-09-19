package com.github.ftfetter.oopdesignpatterns.builder.product;

import java.math.BigDecimal;

public class YellowBankCardAccount {

    private String number;
    private String cardNumber;
    private BigDecimal limit;

    public YellowBankCardAccount() {
    }

    public YellowBankCardAccount(String number, String cardNumber, BigDecimal limit) {
        this.number = number;
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "YellowBankCardAccount{" +
                "number='" + number + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", limit=" + limit +
                '}';
    }
}
