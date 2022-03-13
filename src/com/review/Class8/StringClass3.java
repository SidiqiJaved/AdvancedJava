package com.review.Class8;

public class StringClass3 {

    public static void main(String[] args) {



        String batch = "Batch 12";
        String course = "SDET";

        String company = "    Syntax   Teach";
        System.out.println(company.trim());
        String name ="Nasir gopi Krishan kashtabai ramarkishnan";
        System.out.println(name.replaceAll(" " , "" ));

        if ("Batch 12".equals(batch) && "SDET".equals(course)){
            System.out.println(" You will get the link to M'S Lecture");
        }else {
            System.out.println(" Watch my youtube channel");
        }
    if ("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){
        System.out.println("Now all types of inputs are accepted");
    }

    }
}
