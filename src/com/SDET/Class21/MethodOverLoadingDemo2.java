package com.SDET.Class21;

public class MethodOverLoadingDemo2 {


    void printInfo(String name, int age, double weight) {
        System.out.println("M1");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, String name, double weight) {
        System.out.println("M2");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, double weight, String name) {
        System.out.println("M3");
        System.out.println(name + " " + age + " " + weight);

    }

    void printInfo(double weight, String name, int age) {
        System.out.println("M4");
        System.out.println(name + " " + age + " " + weight);

    }

    void printInfo(String name, double weight, int age) {
        System.out.println("M5");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo2 m = new MethodOverLoadingDemo2();
        m.printInfo("Zulfiya", 16, 28.0);
        m.printInfo(16, "Zulfiya", 28.0);
        m.printInfo(16, 28.0, "Zulfiya");
        m.printInfo(28, 16, "Zulfiya");


    }
}
