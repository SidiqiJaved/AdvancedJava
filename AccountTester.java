package com.SDET.Class18;

public class AccountTester {

    public static void main(String[] args) {


        Account account = new Account();




        //System.out.println(account.UserName);
        //System.out.println(account.password);
        System.out.println(account.accountNumber);
       // System.out.println(account.balance);

/* accessing a field directly is differnet from acccessing
        the same field with methods having differnet modifier
                */


        // account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printaccountNumber();
    }
}
