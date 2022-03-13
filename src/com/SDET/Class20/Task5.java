package com.SDET.Class20;

public class Task5 {
    /*
    Write a Student class  that have instance variables name and address.
     Create a constructor
     that will initialize those variables.
     Print name & address of given st\\
     */



    String name;
    String address;

    public Task5(String name, String address) {
        this.name = name;
        this.address = address;
    }


    void displayInfo(){

        System.out.println(this.name+ " "+ this.address);
    }

}
