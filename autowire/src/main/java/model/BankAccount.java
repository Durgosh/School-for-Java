package model;

public class BankAccount {
    private String iBan;
    private String ownerName;
    private double balance;


    public String getiBan() {
        return iBan;
    }

    public void setiBan(String iBan) {
        this.iBan = iBan;
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
                "iBan='" + iBan + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
