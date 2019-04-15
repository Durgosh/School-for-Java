package com.example.demo.model;

public class BankAccount {
    String ibam;
    String ownerName;
    double balance;
    //these will be the same in Json

    public String getIbam() {
        return ibam;
    }

    public void setIbam(String ibam) {
        this.ibam = ibam;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ibam='" + ibam + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
