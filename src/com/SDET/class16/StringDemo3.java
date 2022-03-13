package com.SDET.class16;

import java.sql.SQLOutput;

public class StringDemo3 {
    public static void main(String[] args) {

        String str="123456!@#!@#123AaZzEasfJKHdsdafsadfsadfFEAS";
        System.out.println(str); // the original code

        System.out.println(str.replaceAll("[0-9]", ""));
        System.out.println(str.replaceAll("[a-z]", ""));
        System.out.println(str.replaceAll("[A-Z]", ""));
        System.out.println(str.replaceAll("[!-/]", ""));
        System.out.println(str.replaceAll("[aZ]", ""));
        System.out.println(str.replaceAll("[A-Za-z]", ""));
        System.out.println(str.replaceAll("[A-Za0-z-]", ""));
        System.out.println(str.replaceAll("[A-Za-z0-9_]", ""));

    }}
