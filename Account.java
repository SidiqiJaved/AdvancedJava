package com.SDET.Class18;

import javax.imageio.stream.ImageInputStream;

public class Account {

    private String UserName;
    private String password;
    public String accountNumber;
    private double balance=15000;


    private void printUserName(){
        System.out.println(UserName);
    }
protected void printPassword(){
    System.out.println(password);

}
void printBalance(){
    System.out.println(balance);
}
public void printaccountNumber() {
    System.out.println(accountNumber);

}
    public static void main (String[]args){

        Account account = new Account();

        System.out.println(account.UserName);
        System.out.println(account.password);
        System.out.println(account.accountNumber);
        System.out.println(account.balance);



        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printaccountNumber();


    }

}

