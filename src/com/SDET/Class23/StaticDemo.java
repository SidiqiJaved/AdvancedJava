package com.SDET.Class23;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StaticDemo {

    }
class Cat {
    static int NoOfLegs=4;
String name;

Cat(String name){
    this.name=name;
}

public void printInfo() {
System.out.println(name+NoOfLegs);

}

public static void Print(){

    // we cant access the instance fields directly inside static methods

    //System.out.println(name+NoOfLegs);
}

    public static void main(String[] args) {

    Cat cat=new Cat("Setlla");
    Cat.Print();

    Cat cat1=new Cat("PAtela");
    Cat.Print();
    }
}