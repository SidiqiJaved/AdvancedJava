package com.SDET.class19;

public class Camel {


    private String name;
    private int age;
    private double weight;


    // no argument/zero argument constructor

    Camel(){

        /* write some important lines of the code that you want to
        excute when the object of a class is created
        for example. you might want to fetch info from
        internet or from your hard disk to give intial values of the feild
                 */

    }

    Camel (String camelName, int camelAge, double camelWeight){
        name=camelName;
        age=camelAge;
        weight=camelWeight;
    }

void printCamelName(){
        System.out.println("Name " + name);
    }

    void setName(String camelName){
        name=camelName;
}

}
