package com.review.class7;

public class Practice3 {
    String studentName;
    String course;
    int studentID;
    int grades;



    void displayStudentRecord(){

        System.out.println(" The Student name is "+studentName+" and the course student enrolled for is "+ course);
        System.out.println(" The Student ID is "+ studentID+" and the grade student achieved is "+grades);

    }

    public static void main(String[] args) {

        // creating the first object of class to assign first set of values

        Practice3 p1=new Practice3();
        p1.studentName=" Marina";
        p1.course=" SDET";
        p1.studentID=5;
        p1.grades=65;
        p1.displayStudentRecord();

        System.out.println("-----------------------------");
        System.out.println();

        // creating the second object of class to assign second set of values
        Practice3 p2=new Practice3();
        p2.studentName=" Yazina ";
        p2.course=" Science";
        p2.studentID=565;
        p2.grades=100;
        p2.displayStudentRecord();











    }

}
