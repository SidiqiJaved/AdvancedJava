package com.SDET.Class21;

public class HW2 {

    /*
    Write program: Shape class has a constructor that takes the radius and
     has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
}

class Shapeclass{
    int radius;

    Shapeclass(int radius){
        this.radius=radius;

    }
}
class circleClass extends Shapeclass {
    circleClass(int radius) {

        super(radius);
    }

    void calculate() {
        System.out.println(2 * super.radius * super.radius);

    }

    public static void main(String[] args) {
        circleClass cal=new circleClass(1);
        cal.calculate();
    }
}