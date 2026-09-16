// package Sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        

        int ar [] = {10,10,20,10};
        int k = 1;
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1 ; j < ar.length-i; j++) {
                // Arrays.sort(ar);
                if(ar[j-1] > ar[j]){
                    int temp = ar[j-1];
                    ar[j-1]    = ar[j];
                    ar[j]    = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ar));
    }
}
