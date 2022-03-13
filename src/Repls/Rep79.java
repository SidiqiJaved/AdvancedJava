package Repls;

public class Rep79 {
            public static void main(String[] args) {

                double [] [] ar={
                        {1.4, 2.0, 3.3, 2.0},
                        {4.0, 1.5, 6.1, 1.0},
                        {1.2, 3.1, 4.0, 1.6}

                };
                for (double [] doubles : ar){
                    for (double arDouble : doubles){
                        System.out.print(arDouble + " ");
                    }
                    System.out.println();
                }

            }
        }


