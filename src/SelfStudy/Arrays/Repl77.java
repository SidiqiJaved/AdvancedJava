package SelfStudy.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repl77 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int [] arr=new int[5];

        for (int  i= 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i= arr.length -1; i>=0; i--){

            System.out.println(arr[i]);
            System.out.println();
        }
    }
}
