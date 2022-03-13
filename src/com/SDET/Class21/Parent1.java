package com.SDET.Class21;

public class Parent1 {

    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}

class Child1 extends Parent1{

    String name ="Child";
    void printNmae(){
        String name="Sophia"; // priority is always given to local variable

        System.out.println(name);

       System.out.println(this.name);  // with this command java ignore local variabl
        // and goes for this.child prints Child

        System.out.println(super.name);
        // with word super it will print value of the parent class

    }
}

class ParentTester{

    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printNmae();
    }
}