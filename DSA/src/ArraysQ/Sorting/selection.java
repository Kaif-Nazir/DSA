// package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class selection {
    public static void main(String[] args) {
        

        int ar[] = {};
        // 1
        for (int i = 0; i < ar.length; i++) {
            int small = i;
            for (int j = i+1; j < ar.length; j++) {
                
                if(ar[small] > ar[j]){
                    small = j;                              // Select Small At Every Iteration
                }
            }
            int temp = ar[small];
            ar[small] =  ar[i];
            ar[i]     = temp;
        }

        System.out.println(Arrays.toString(ar));

    }


}
