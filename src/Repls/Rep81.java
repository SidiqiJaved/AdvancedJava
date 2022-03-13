package Repls;

public class Rep81 {
    public static void main(String[] args) {

        int[] ar ={51, 4,8};

        int max=0;
        for (int i=0; i<ar.length; i++){
            if (ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}
