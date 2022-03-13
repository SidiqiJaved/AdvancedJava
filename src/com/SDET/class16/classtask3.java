package com.SDET.class16;

public class classtask3 {
    public static void main(String[] args) {

        String a = "You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?";

        //String class method to count the numbers of charactes in a class
        System.out.println(a.length());

        // length property that we can use to check the number of elements in an arry

        System.out.println(a.split("[?]").length);

        int[] arr = {10, 10};
        System.out.println(arr.length);


       // String[] method ( int[] numbers){
           // String[] stringArr = new String[numbers.length];
       // }
    }
}