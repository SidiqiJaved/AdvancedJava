package SelfStudy.Arrays;
import java.util.*;
public class Arrays {
    public static void main(String[] args)
    {

Scanner scan=new Scanner(System.in);

        System.out.println(" Write the name of the week in array");

        String [] arr=new String[7];



        for (int i=0; i<=arr.length -1; i++){
            System.out.println("Please enter day " + (i + 1) + " of the week");
            arr[i] = scan.nextLine();


        }
        for (int i=0; i< arr.length; i++){

            System.out.println(arr[i]);
        }




    }

}