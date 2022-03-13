package com.review.class7;

public class ObjectAndClassPractice {

    String empName="Baba";
    int empID= 564;
    String group;

    void emplyeeDetails(){
        System.out.println("This method shows the details of the employee");
    }
    void employeeGroup(){
        System.out.println("This method shows the group of the employee");

    }
    public static void main(String[] args) {

        ObjectAndClassPractice obj=new ObjectAndClassPractice();

        obj.employeeGroup();
        obj.emplyeeDetails();


    }
}
