package com.SDET.class16;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class task4inAnotherWay {
    public static void main(String[] args) {

        String s= "Sunday is great";
        String []strArray=s.split(" ");
        for (int i=0; i < strArray.length ; i++){
            System.out.println(strArray[i]);
        }


    }
}
