package entities;

import exceptions.BusinessException;

import java.util.InputMismatchException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > getBalance()) {
            throw new BusinessException("Withdraw error: not enough balance.");
        }
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("Withdraw error: the amount is higher than withdraw limit.");
        }
        if (amount < 0) {
            throw new BusinessException("You can't withdraw a negative value.");
        }
    }

    @Override
    public String toString() {
        return "entities.Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
