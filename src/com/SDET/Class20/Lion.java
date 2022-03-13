package com.SDET.Class20;

public class Lion extends Animal{


    boolean hunter=true;
    void roar(){
        System.out.println(name+ " is roaring color "+ color+" Hunter" + hunter);


    }

    public static void main(String[] args) {

        Lion lion= new Lion();
        lion.name="Alex";
        lion.color="Yellow";
        lion.sleep();
        lion.roar();


    }


}
