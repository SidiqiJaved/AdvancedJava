package com.SDET.Class20;

public class HumanTester {
    public static void main(String[] args) {



        Student student = new Student();
        student.name="Sarkar";
        System.out.println(student.name);
        student.printName();
        student.studentId="123";
        student.printAge();

        System.out.println("*************");


        Principle principle=new Principle();

        principle.name="Emilia";
        principle.printName();
        principle.specialParkingSpot=true;
        System.out.println(principle.specialParkingSpot);

    }
}
