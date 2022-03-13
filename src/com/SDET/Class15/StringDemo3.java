package com.SDET.Class15;

public class StringDemo3 {
    public static void main(String[] args) {

        String name="How @ are you ? guys @";
        System.out.println(name.indexOf("Are"));

        System.out.println(name.indexOf("@"));
        System.out.println(name.lastIndexOf("%"));

        System.out.println(name.indexOf("Hourse"));

        System.out.println(name.indexOf("@", 8+1));
        System.out.println(name.indexOf("@", name.indexOf("@")+1));

    }
}
