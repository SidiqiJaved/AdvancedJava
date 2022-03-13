package Repls;
import java.util.Scanner;

public class Repl95 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String prin=scan.nextLine();
       String print=prin.substring(0,3);

        System.out.println("The first 3 letters of " +prin+" is " + print);


    }
}
