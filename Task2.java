package com.SDET.Class18;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and
    returns reversed String. Method should be available
    to all classes  within your project and accessible
    by class name. it should be accessable by class name also
     */


    public static String reverString(String input){

      //  StringBuilder stringBuilder=new StringBuilder(input);
       // stringBuilder.reverse();
      //  stringBuilder.toString();
      //  return stringBuilder.toString();



// this down line of code is the easiest of the top code
        return new StringBuilder(input).reverse().toString();
        // new StringBuilder(input) is called object creation
        //new StringBuilder(input).reverse() calling a method on that object
        //new StringBuilder(input).reverse().toString(); caling two methods on that object
        //calling two methods on that object and returing the result

    }

    public static void main(String[] args) {

        String name="Sophia";
        System.out.println(Task2.reverString(name));
    }
}
