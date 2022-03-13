package com.SDET.Class23;

public class CarTester {
    public static void main(String[] args) {


        BMW bmw = new BMW();
        bmw.park();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.park();

        Car car = new BMW();
        car = new Tesla();
        car = new Suzuki();

        car.start();

        Object str = new String( "Javaaa");
        System.out.println(str);


    }
}