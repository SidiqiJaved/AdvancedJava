package com.SDET.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String s = new String("Asghar is great");
        s.concat("hahah");
        System.out.println(s.replace(" ", ""));
        System.out.println(s);


        StringBuilder stringBuilder = new StringBuilder("Asghar Is great");
        stringBuilder.append(" hahah ");
        System.out.println(stringBuilder);


        }

    }


