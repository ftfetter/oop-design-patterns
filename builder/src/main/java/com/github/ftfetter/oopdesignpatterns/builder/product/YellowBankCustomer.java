package com.github.ftfetter.oopdesignpatterns.builder.product;

public class YellowBankCustomer {

    private String name;
    private YellowBankCurrentAccount currentAccount;
    private YellowBankCardAccount cardAccount;

    public YellowBankCustomer() {
    }

    public YellowBankCustomer(String name, YellowBankCurrentAccount currentAccount, YellowBankCardAccount cardAccount) {
        this.name = name;
        this.currentAccount = currentAccount;
        this.cardAccount = cardAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public YellowBankCurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(YellowBankCurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public YellowBankCardAccount getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(YellowBankCardAccount cardAccount) {
        this.cardAccount = cardAccount;
    }

    @Override
    public String toString() {
        return "YellowBankCustomer{" +
                "name='" + name + '\'' +
                ", currentAccount=" + currentAccount +
                ", cardAccount=" + cardAccount +
                '}';
    }
}
