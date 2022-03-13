package Repls;

public class Repl87 {

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {

        Repl87 bmw = new Repl87();

        bmw.carColor = "Black";
        bmw.carYear = 2019;
        bmw.carMake = "BMW";

        Repl87 toyota = new Repl87();
        toyota.carColor = "White";
        toyota.carYear = 2018;
        toyota.carMake = "Toyota";


        System.out.println("Car color is " + bmw.carColor + " and car year is " + bmw.carYear + " and car model is " + bmw.carMake);
        System.out.println("Car color is " + toyota.carColor + " and car year is " + toyota.carYear + " and car model is " + toyota.carMake);


    }
}