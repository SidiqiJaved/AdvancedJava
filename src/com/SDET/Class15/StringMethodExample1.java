package com.SDET.Class15;

import javax.swing.*;

public class StringMethodExample1 {

    public static void main(String[] args) {



        String s="Mohammad Mohammad";

        if(s.length()<=12){
            // less than or equal to 12 characters in his /her name

            System.out.println("User name created");
        }else {
            // this much long name is not allow

            System.out.println("User name is not allowed");
            String name="     Sarkar    ";

            System.out.println(name.trim()); // removes the space before and after the word


            String input="   space of this the word space will not be trimmed and before the word i write ..   ";


            System.out.println(input.trim());



            String name1="Run  Moreed";

            System.out.println(name1.startsWith("Run"));

            System.out.println(name1.toLowerCase().startsWith("Run"));

            System.out.println(name1.endsWith("Moreed"));

            System.out.println(name1.contains("ee")); // name moreed has two ee


        }
    }
}
