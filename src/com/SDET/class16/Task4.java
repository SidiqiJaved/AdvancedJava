package com.SDET.class16;

import SelfStudy.Arrays.Arrays;

public class Task4 {
    public static void main(String[] args) {

        StringBuilder StringBuilder=new StringBuilder("Sunday is never fun");

        System.out.println(StringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        System.out.println(s);
        s=str.toString();
        System.out.println(s);




        String newStr="";
        String s2=StringBuilder.toString();
        String[]strArr=s2.split(" ");
        //System.out.println(Arrays.toString(strArr));

        for (int i=strArr.length-1; i>=0; i--){
            newStr+=strArr[i]+" ";
        }
        System.out.println(newStr);
    }
}
