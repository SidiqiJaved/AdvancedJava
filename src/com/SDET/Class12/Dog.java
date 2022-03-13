package com.SDET.Class12;

import javax.imageio.stream.ImageInputStream;

public class Dog {

    String name;
    String color;
    String breed;
    char gender;
    int age;
    double weight;

    void bark()
    {
        System.out.println(" Dog barks");
    }
    void smelling() {
        System.out.println("Dogs are great at smelling");

    }
        public static void main (String []args){

            Dog GhabGhab =new Dog();

            GhabGhab.name="Ghaaab ";
            GhabGhab.age=12;
            GhabGhab.breed="Afghan";
            GhabGhab.gender='X';


            System.out.println(GhabGhab.name);
            GhabGhab.bark();
            GhabGhab.smelling();
    }
}
