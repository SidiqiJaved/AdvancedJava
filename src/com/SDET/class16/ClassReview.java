package com.SDET.class16;

public class ClassReview {

    public static void main(String[] args) {

        System.out.println("zoom");

        String str="Sophia    M #6467996994 231";

        System.out.print(str.charAt(0));
        System.out.print(str.charAt(4));
        System.out.print(str.charAt(5));
        System.out.println();

        System.out.println(str.length()); // length and number of alphabits

        System.out.println(str.charAt(str.length()-1)); // returns the last alphabit of the sentense or word
        System.out.println("***********");


        System.out.println(str.indexOf('A'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println("");

        System.out.println(str.substring(str.indexOf("#")+1));

        System.out.println(str.substring(12,23));
        //System.out.println(str.indexOf("#")+1, str.indexOf("#")+1+10));



    }
}
