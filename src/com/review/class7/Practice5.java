package com.review.class7;

import java.util.Locale;

public class Practice5 {

    String weekDay(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "Monday":
                return "It is lazy day";
            case "Tuesday":
                return "Producative";
            case "Wendsday":
                return "Fine";
            case "Thursday":
                return "Good day";
            case "Friday":
                return "Pray Day";
            case "Saturday":
                return "Off Day";
            case "Sunday":
                return "Sundaaaaaay";
            default:
                return " Not a Valid option";


        }


    }

    public static void main(String[] args) {




            Practice5 p=new Practice5();
            String  output = p.weekDay("Friday");
            System.out.println(output);




            }
        }






