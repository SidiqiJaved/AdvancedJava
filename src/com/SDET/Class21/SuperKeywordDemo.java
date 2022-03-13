package com.SDET.Class21;


public class SuperKeywordDemo {
    public static void main(String[] args) {


      //  Child child =new  Child();
      //  child.printColor();
     //   child.print();
    }

    class GrandParent {
        String color = " Blue";

        void printInfo() {
            System.out.println(" I am GrandPa");
        }
    }

    class Parent {
        String color = " Black";


    }

    class Child extends Parent {
        String color = " Red";


        void printColor() {
            String color = " Green";

            // it is local varabiles and it will be printed
            System.out.println(color);

            // refers to instance variable
            System.out.println(this.color);

            //referes to parent variable
            System.out.println(super.color);


        }

    }


}
