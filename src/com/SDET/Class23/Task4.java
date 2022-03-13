package com.SDET.Class23;

 class Degree {

    void getPrerequ(){

        System.out.println(" To get  Degree you need a high school diploma");

    }
}

class Bachelor extends Degree{

}
class Master extends Degree{

    void getPrerequ() {
        System.out.println(" to get Master yoyu need Bachelors");    }
}
public class Task4{

    public static void main(String[] args) {



        Bachelor bachelor = new Bachelor();
        bachelor.getPrerequ();
        Master master = new Master();
        master.getPrerequ();
    }

}