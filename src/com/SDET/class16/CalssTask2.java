package com.SDET.class16;

public class CalssTask2 {
    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters,
         numbers and special characters.
         Find out how many Alphanumeric characters are there in the String.
         */


        String s="2341231!@#4353sdfsadf23466";
        System.out.println(s.replaceAll("[^A-Za-z0-9]" , "").length());
        System.out.println(s.replaceAll("[A-Za-z0-9]" , "").length());

    }
}