package com.SDET.Class23;

public class DogTester {
    public static void main(String[] args) {


    Dog dog=new Dog();
        System.out.println(dog);

        Dog dog1=new Dog("Tommy","Green","shepered",45,4);
       dog1.changeInfo("Mykl", "Black");

        System.out.println(dog1);


    }
}
