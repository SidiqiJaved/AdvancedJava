package com.SDET.class17;

import javax.swing.plaf.basic.BasicHTML;

public class SyntaxExample {

    String empID;
    double salary;
    static String CEO=" Submair";

    public static void main(String[] args) {

        SyntaxExample AsgharclassObj= new SyntaxExample();

        AsgharclassObj.empID="312274";
        AsgharclassObj.salary=65654;

        System.out.println("Asghar's Employee id is :" +AsgharclassObj.empID);
        System.out.println(AsgharclassObj.salary);


        SyntaxExample MoazzamclassObj= new SyntaxExample();
        MoazzamclassObj.empID="356";
        MoazzamclassObj.salary=986124852;

        System.out.println(MoazzamclassObj.empID);
        System.out.println(MoazzamclassObj.salary);
    }

}

