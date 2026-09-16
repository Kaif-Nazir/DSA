// package Sorting;

import java.util.Arrays;

public class insertion {
   public static void main(String[] args) {

    
    int ar [] = {3,5,7,9,2,8,4,1};
    int k = 0;

    for (int i = 0; i < ar.length-1; i++) {
        for (int j = i+1; j > 0; j--) {
            
            System.out.println( i +" " +  k++ + "  "+Arrays.toString(ar));
            if(ar[j] < ar[j-1]){
                int temp = ar[j-1];
                ar[j-1]  = ar[j];
                ar[j]    = temp;
            }else{
                break;
            }
        }
    }
   } 
}
