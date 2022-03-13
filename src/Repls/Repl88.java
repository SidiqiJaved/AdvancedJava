package Repls;

public class Repl88 {
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(name +" can bark");
    }
    void run(){
        System.out.println(name +" can run");
    }

    void play(){
        System.out.println(name + " can play");
    }

    public static void main (String []args){


        Repl88 Husky = new Repl88 ();
    Husky.name="Husky";
    Husky.bark();
    Husky.run();
    Husky.play();

    Repl88 bull = new Repl88();

    bull.name="Bulldog";
    bull.bark();
    bull.run();
    bull.play();

    Repl88 Lab = new Repl88();

    Lab.name="Labrador";
    Lab.bark();
    Lab.run();
    Lab.play();


}

}
