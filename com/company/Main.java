package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Balance balance = new Balance();

        System.out.println("กด 1 เพื่อฝากเงิน \nกด 2 เพื่อถอนเงิน \nกด 3 เพื่อดูยอดเงินคงเหลือ");
        System.out.println("----------------------------------------");
        System.out.print("เลือกบริการของท่าน");
        String sv = sc.nextLine();
        if(sv.equals("1")){
            Deposit deposit = new Deposit();
            System.out.println("กด 1 เพื่อฝากบัญชีประจำ \nกด 2 เพื่อฝากบัญชีออมทรัพย์");
            System.out.print("เลือกบริการของท่าน");
            String dp = sc.nextLine();
            if(dp.equals("1")){
                System.out.print("ใส่จำนวนเงิน");
                double money = sc.nextDouble();
                deposit.fixed_dp(money);
            } if (dp.equals("2")){
                    System.out.print("ใส่จำนวนเงิน");
                    double money = sc.nextDouble();
                    deposit.saving_dp(money);
                }
                  } else if (sv.equals("2")){
                Withdraw withdraw = new withdraw();
                System.out.println("กด 1 เพื่อฝากบัญชีประจำ \nกด 2 เพื่อฝากบัญชีออมทรัพย์");
                System.out.print("เลือกบริการของท่าน");
                String wd = sc.nextLine();
                if (wd.equals("1")){
                    System.out.print("ใส่จำนวนเงิน");
                    double money = sc.nextDouble();
                    withdraw.fixed_wd(money);
                }else if (wd.equals("2")){
                    System.out.print("ใส่จำนวนเงิน");
                    double money = sc.nextDouble();
                    withdraw.saving_ed(money);
                }
                  }else if (sv.equals("3"))

                System.out.println("กด 1 เพื่อฝากบัญชีประจำ \nกด 2 เพื่อฝากบัญชีออมทรัพย์");
                System.out.print("เลือกบริการของท่าน");
                String bl = sc.nextLine();
                if (bl.equals("1")){
                balance.fixed_bl();
            }else if (bl.equals("2")){
                    balance.saving_bl();
                }
        }
    }
}
