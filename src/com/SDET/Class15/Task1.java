package com.SDET.Class15;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {


        String userName="Sophia";
        String password="123123123";
        String confirmedPassword="123123123";

        if (!userName.isEmpty() && password.isEmpty()){

            System.out.println("Username and Password can not be empty");

        }else {
            if (password.length()<8){
                System.out.println("Passowrd is short");
            }else {
                if (password.contains(userName)){
                    System.out.println("Password can not contain user name");

                }else {
                    if(password.equals(confirmedPassword)){
                        System.out.println("Your username and password has been created");
                    }else {
                        System.out.println("Passwords do not match");
                    }
                }
            }
        }


    }
}
