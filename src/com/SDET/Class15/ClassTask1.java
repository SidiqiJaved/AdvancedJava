package com.SDET.Class15;

public class ClassTask1 {
    public static void main(String[] args) {

        /*
        Write a program that reads two people's first
	names and if they are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel Boy or Girl? boy
Suggested baby name: DANRY
Example Output:Mom’s first name? Mary
Dad’s first name? DanielBoy or Girl? girl
Suggested baby name: MAIEL
         */

        String father="Daniel";
        String mother="Mary";
        String expectation="Boy";

        String firstPart="Daniel";
        String secondPart="boy";

        if (expectation.equalsIgnoreCase(" ")){
            firstPart=father.substring(0,father.length()/2);

        }else if (expectation.equalsIgnoreCase("girl")){
            firstPart=mother.substring(0, mother.length()/2);
            secondPart=father.substring(father.length()/2);

        }
        System.out.println(firstPart+secondPart);
    }
}
