package com.SDET.Class20;

public class Task6 {

    String booKName;
    double price;

    public Task6(){
        System.out.println("NO arugment constructor");
    }

    public Task6(String booKName, double price) {
        this.booKName = booKName;
        this.price = price;

        System.out.println("Two argument consturctor");
    }
}
