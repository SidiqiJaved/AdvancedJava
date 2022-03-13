package com.SDET.Class15;

import java.sql.SQLOutput;

public class StringDemo2 {
    public static void main(String[] args) {


        System.out.println(" Trim method");


        String input=" I am writing this to remove the sapce at the end    ";

    System.out.println(input.trim());


    String userName="Sophia";
    String password="Sophia1234";
    if ("Sophia".equals(userName)&& "Sophia1234".equals(password)){

        System.out.println("Welcome Back");
    }else {
        System.out.println("UserName and passowrd are not correct");
    }
    if ("Sophia".equalsIgnoreCase(userName) && "Sophia1234".equals(password)){
        System.out.println("Welcome Back");
    }else {
        System.out.println("Username of Password is not correct");
    }
    }
}
