package com.review.class7;

public class Practice2 {

    String getRecord(){

        String department="QA";
        String empName="Sarkar";
        String details=" Worker "+empName+" Belongs to "+department;
        System.out.println(details);
        return details;

    }

    public static void main(String[] args) {

        Practice2 obj=new Practice2();
            obj.getRecord();


    }

}
