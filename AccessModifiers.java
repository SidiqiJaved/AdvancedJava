package com.SDET.Class18;

import java.sql.SQLOutput;

public class AccessModifiers {

    private String name=" Sophia Sidiqi";
    int age=3; // default access
    protected double weight=12;
    public String Eyecolor="Hazel";


    public static void main(String[] args) {




        AccessModifiers input=new AccessModifiers();

        System.out.println(input.name);
        System.out.println(input.age);
        System.out.println(input.weight);
        System.out.println(input.Eyecolor);




    }

}
