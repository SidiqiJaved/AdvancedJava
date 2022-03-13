package SelfStudy.Arrays;

import com.sun.java.browser.plugin2.DOM;

public class repl79Array2D {
    public static void main(String[] args) {


        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (double[] doubles : a) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "  ");
            }
            System.out.println();
        }
    }
}