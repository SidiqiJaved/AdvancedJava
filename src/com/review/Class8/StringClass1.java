package com.review.Class8;

import java.util.Locale;

public class StringClass1 {
    public static void main(String[] args) {

        String batch=" SDET batch 12";  // first way
        String employee=" EMILILIA";

        String batch12 = new String(" my way"); // second or longer way to write


        System.out.println(batch);

        System.out.println(batch.toUpperCase());
        System.out.println(employee.toLowerCase());

        String empplyeeName=" Sai gopi krishna goala kashtabai venkata ranana";
        System.out.println(empplyeeName.length());

    }
}
