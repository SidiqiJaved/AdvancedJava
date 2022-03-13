package com.SDET.Class23;

public class AlisParent {
    String girlName=" Salma ";
    double money=1000000;
    void marry (){
        System.out.println(" Ali should marry "+ girlName);
    }
}

class Ali extends AlisParent{

    String girlName=" Taylor Swift";
    void marry(){
        System.out.println(" but Dad i want to marry "+ girlName);

    }
}
