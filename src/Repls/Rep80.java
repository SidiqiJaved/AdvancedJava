package Repls;

public class Rep80 {
    public static void main(String[] args) {

        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for (double [] doubles: a){
            for (double ardouble : doubles){
                System.out.print(ardouble + " ");
            }
            System.out.println();
        }

    }
}
