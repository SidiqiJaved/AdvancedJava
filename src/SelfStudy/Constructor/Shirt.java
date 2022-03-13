package SelfStudy.Constructor;

public class Shirt {

    public static String color;
    public static char size;

  public static void putOn() {
      System.out.println("Shirt is on");
  }
    public static void takeoff(){
        System.out.println("Shirt is off");
    }

    public static void setColor(String newColor){
      color = newColor;
    }
    public static void setS(char newSize){

      size =  newSize;
    }
}
