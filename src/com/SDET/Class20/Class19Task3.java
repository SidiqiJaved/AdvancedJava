package com.SDET.Class20;

public class Class19Task3 {

    /*
    Write a java class that have 4 constructors with 4
     different access levels of constructors(private,public,default,protected)
      and create 4 objects of this class: 1 - inside same class;
      2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */


    private Class19Task3(int a){
        System.out.println("private");
    }
    Class19Task3(double a ){System.out.println("Default");}
    protected Class19Task3(String a){System.out.println("protected");}
    public Class19Task3(boolean a) {System.out.println("public");}

        public static void main(String[] args){

            new Class19Task3(10);
            new Class19Task3("haha");
            new Class19Task3(18.2);
            new Class19Task3(false);


    }
}
