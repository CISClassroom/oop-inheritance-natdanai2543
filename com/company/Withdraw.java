package com.company;

public class Withdraw {
    Balance balance = new Balance();
    public void fixed_wd(double money) {
        balance.money_fixed -= money;
        balance.fixed_bl();
    }

    public void saving_ed(double money) {
        balance.money_fixed -= money;
        balance.saving_bl();
    }
}
