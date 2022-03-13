package com.SDET.class19;

public class Car {

    String name;
    String make;
    String color;
    String type;
    Car(String name, String make, String color, String type){


        name=name;
        make=make;
        color=color;
        type=type;

        /*
        if we have sane kicak abd usbtabce variables java always prefer local varaibles
        if you want to instruct java to use instance variables we use the "This" keyword
         */


       this.name=name;
       this.make=make;
       this.color=color;
       this.type=type;

    }
    Car(){

    }
    void PrintCar(){
        String name="Tesla";

        System.out.println(name);

        System.out.println(this.name);
    }
}
