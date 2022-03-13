package com.SDET.Class20;

public class Task9 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */


    public static void main(String[] args) {

       // MathTeacher mathTeacher = new MathTeacher();
        // mathTeacher.name = "Michael";


        class TeacherA {

            String name;
            int age;
            double weight;

            void printName() {
                System.out.println(name);
            }

        }

        class MathTeacher extends TeacherA {
            boolean canTeachGem = true;

            void teachCalculus() {
                System.out.println(" Teaching calculus");
            }
        }

        class ChemistryTeacher extends TeacherA {
            boolean canTechBio = true;

            void teachOrganicChemistry() {
                System.out.println(" teaching organic Chemistry");
            }
        }

        class PianoTeacher extends TeacherA {

            boolean playGiutar = false;

            void teachPiano() {
                System.out.println(" Teaches Piano on Weekends");
            }
        }
    }
}