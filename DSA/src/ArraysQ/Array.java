// package ArraysQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Array {
    public static void main(String[] args) {

        /* int move1 [] = {1,0,2,0,0,3};                                //# R1 MOVE TO END
        int pointer = 0;
        for (int i = 0; i < move1.length; i++) {
        if(move1[i] != 0){
        move1[pointer] = move1[i];
        pointer++;
        }
        }
        while(pointer<move1.length){
        move1[pointer] = 0;
        pointer++;
        }
        for (int i : move1) {
        System.out.print(i + " ");
        } */
        /* int ar [] = {1,0,2,3,3,0,0,3,2,6};
         int tar = 0;
         for (int i = 0; i < 1; i++) {
        for (int j = 0; j < ar.length-i-1; j++) {
            if(ar[j] == tar){
                int temp = ar[j+1];
                ar[j+1] = ar[j];
                ar[j] = temp; 
            }
        }
        
        }
        for (int i : ar) {
        System.out.print(i + " ");
        } */
        /* int [] ar = {1,1,2,3,2,4,5};                                 //# R2 REMOVE DUPLICATES
        System.out.println("Before Removing Duplicates");
        for (int i : ar) {
        System.out.print(i+ " ");
        }
        Arrays.sort(ar);
        int dup [] = new int[ar.length];
        int pointer = 0;
        for (int i = 1; i < ar.length; i++) {
        if(ar[i] != ar[i-1] ){
            dup[pointer++] = ar[i-1];
        }
        }
        dup[pointer++] = ar[ar.length-1];
        int [] res = Arrays.copyOf(dup, pointer);
        System.out.println("\nAfter Removing Duplicates");
        for (int i : res) {
        System.out.print(i + " ");
        } */
        /* int arr[] = {1,2,3,4,5,6};                                   //# R3 SECOND LARGEST MAX
        int largest = arr[0];                    //Reference
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Your Array : ");
        for (int i : arr) {
            System.out.print( i +  " ");
        }
        if(secondLargest == -1){
            System.out.println("\nNo Second Largest Element");
        }else{
            System.out.println("\nSecond Largest Element is : " + secondLargest);
        } */
        /* int pr[] = {1,2,3,4,5,6,7,8,9};                              //# R4 PRIME AND NON-PRIME
        int factor = 0;
        for(int i = 0;i<pr.length;i++){
            factor = 0;
            for(int j = 1;j<=pr[i] ;j++){
                if(pr[i] % j == 0){
                    factor++;
                }
            }
            if(factor == 2){
                System.out.println("Prime No.     : " + pr[i]);
            }else{
                System.out.println("Non Prime No. : " + pr[i]);
            }
        } */
        /* int ar [] = {1,1,2,2,3,4,4,5,6,6};                           //# R5 FREQUENCY OF EACH ELEMENTS
        Arrays.sort(ar);
        for(int i = 0 ;i<ar.length;i++){
           System.out.println(i);
            int count = 1;
            while(  i+1 < ar.length && ar[i] == ar[i+1]){       //Must Follow Order 
                count++;
                i++;
            }
            if(count > 0){
                // System.out.println("Element : "+ar[i] + " Frequency : " + count);
            }
        
        } */
        /* int ar[] = {1,1,2,2,3,3,3,4,6,8,8};                          //# R6 FREQUENCY OF DUP ELEMENTS
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            while(i+1 <ar.length && ar[i] == ar[i+1]){
                count++;
                i++;
            }
            if(count > 1){
                System.out.println("Element : "+ar[i] + " Frequency : "+ count);
            }
        } */
        /* int ar[] = {1,2,3,8,9,4,5,6,7,8};                            //# R7 Sliding Window
        int k = 2;                                   // MAX Sum of Given Num of Sub Array
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += ar[i];
        }
        maxSum = windowSum;
        for (int i = k; i < ar.length; i++) {
            windowSum += ar[i];
            windowSum -= ar[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum); */
        /* int a[] = {1,2,0,5,6,7,8,2};                                 //# R8 Contiguous Increasing SubArray 
        System.out.println("Your Array -->");
        for (int i : a) {
        System.out.print(i +  " ");
        }
        ArrayList<Integer> maxArr = new ArrayList<>();
        ArrayList<Integer> subArr = new ArrayList<>();
        subArr.add(a[0]);
        for (int i = 1; i < a.length; i++) {
        
        if(a[i] > a[i-1]){
            subArr.add(a[i]);
        }else{
            if(maxArr.size() < subArr.size()){
                maxArr = new ArrayList<>(subArr);
            }
            subArr.clear();
            subArr.add(a[i]);
        }
        }
        if(maxArr.size()<subArr.size()){
        maxArr = new ArrayList<>(subArr);
        }
        System.out.println();
        System.out.println(maxArr); */
        /* int a[] = {5,6,3,0,7,8,9,1,2};                               //# R9 Contiguous Decreasing Sub Array
        ArrayList<Integer>  minArr = new ArrayList<>();
        ArrayList<Integer>  subArr = new ArrayList<>();
        
        subArr.add(a[0]);
        for(int i = 1 ;i<a.length;i++){
        
        if(a[i] < a[i-1]){
            subArr.add(a[i]);
        }else{    
            if(minArr.size() < subArr.size()){
            minArr = new ArrayList<>(subArr);
            }
            subArr.clear();
            subArr.add(a[i]);
        
        }
        }    
        if(minArr.size() < subArr.size()){
        minArr = new ArrayList<>(subArr);
        }
        System.out.println(minArr); */
        /* int frc[][] = {{1,2,3,4},{1,2,3,4}}; //2X4                   //# R10 2D Matrix Multi
    int src[][] = {{1,2,3},{1,2,3},{4,3,1},{4,3,1}}; //4X3
    int twoDMulti [][] = new int[2][3];
    int k = src.length;
    for (int i = 0; i < twoDMulti.length; i++) {
        for (int j = 0; j < twoDMulti[i].length; j++) {
           int multi = 0;
           while(k < 4){
            multi = frc[i][k] * src[k][j] + multi;
            k++;
           }
           twoDMulti[i][j] = multi;
           k = 0;
        }
    }
    for (int i = 0; i < twoDMulti.length; i++) {
        for (int j = 0; j < twoDMulti[i].length; j++) {
            System.out.print(twoDMulti[i][j] + " ");
        }
        System.out.println();
    } */
        // int matrix[][] = {{1,1,0,1},{1,0,1,1},{0,0,0,1},{1,0,1,0}};
        // int image[][] = {{1,2,3},{4,5,6},{7,8,9}};
        /* int rows = matrix.length;                                    // Vertical
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
        int top = 0;
        int bottom = rows - 1;
        
        // Swap elements from left to right of the row
        while (top <= bottom) {
            int temp = matrix[top][i];
            matrix[top][i] = matrix[bottom][i];
            matrix[bottom][i] = temp;
            
            top++;
            bottom--;
        }
    } for(int [] row : matrix){
        System.out.println(Arrays.toString(row));
    } 
    */
        /* for(int i = 0; i < image.length ; i++){                      // Vertical  
        for (int j = 0; j < image[0].length/2; j++) {
            
            int temp = image[j][i];
            image[j][i] = image[image.length - 1 -j][i];
            image[image.length - 1 -j][i] = temp;
        }
    } 
    for(int [] row : matrix){
        System.out.println(Arrays.toString(row));
    }     
    */
        /* for(int row [] : matrix){                                    // Horizontal Invert

        int left = 0 , right = row.length-1;

        while(left <= right){

            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }

    }
        for(int [] row : matrix){
        System.out.println(Arrays.toString(row));
    } 
    */
}


}
