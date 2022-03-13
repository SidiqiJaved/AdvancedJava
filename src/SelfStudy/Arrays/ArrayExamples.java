package SelfStudy.Arrays;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int [] arr=new int [5];

        for (int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }
        for (int i =0; i<arr.length * 10;  i++ ){

            System.out.println("0" + arr[i]+"0");

        }
    }
}
