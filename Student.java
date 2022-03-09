package com.SDET.Class18;

public class Student {

    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment
 the numberOfStudents for each object
Print out  total number of students

     */

    String StudentName;
    String StudentID;
    static int numberOfStudents;


    public static void main(String[] args) {


        Student student1=new Student();

        student1.StudentName=" Basir ";
        student1.StudentID=" z2A189";
      Student.numberOfStudents ++;

        Student student2=new Student();

        student2.StudentName=" Mykl ";
        student2.StudentID=" z2A190 ";
        Student.numberOfStudents++;

        Student student3 =new Student();

        student3.StudentName=" CeCe ";
        student3.StudentID=" z2A191 ";
        Student.numberOfStudents++;

        System.out.println("Student Name:" + student1.StudentName + "Student ID:"+student1.StudentID);
        System.out.println("Student Name:" + student2.StudentName + "Student ID:"+student2.StudentID);
        System.out.println("Student Name:" + student3.StudentName + "Student ID:"+student3.StudentID);


        System.out.println("Total number of students is " + numberOfStudents);


    }

}
