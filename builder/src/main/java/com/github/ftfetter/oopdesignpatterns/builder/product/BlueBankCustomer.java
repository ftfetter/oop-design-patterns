package com.github.ftfetter.oopdesignpatterns.builder.product;

public class BlueBankCustomer {

    private String name;
    private BlueBankCurrentAccount currentAccount;
    private BlueBankCardAccount cardAccount;

    public BlueBankCustomer() {
    }

    public BlueBankCustomer(String name, BlueBankCurrentAccount currentAccount, BlueBankCardAccount cardAccount) {
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

    public BlueBankCurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(BlueBankCurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public BlueBankCardAccount getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(BlueBankCardAccount cardAccount) {
        this.cardAccount = cardAccount;
    }

    @Override
    public String toString() {
        return "BlueBankCustomer{" +
                "name='" + name + '\'' +
                ", currentAccount=" + currentAccount +
                ", cardAccount=" + cardAccount +
                '}';
    }
}
