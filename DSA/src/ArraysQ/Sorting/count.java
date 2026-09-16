// package #ArraysQ.Sorting;

import java.util.Arrays;

public class count {
    public static void main(String[] args) {

        int ar[] = {1,0,2,0,3};
        countsort(ar);
    }

    static void countsort(int nums[]){

        int max = nums[0];
        for(int e : nums){
            if(e > max){
                max = e;
            }
        }
        int frequency [] = new int[max+1];

        /* for (int i = 0; i < nums.length; i++) {
            frequency[nums[i]]++;
        } */
       for (int i : nums) {
        frequency[i]++;
       }
        int ind = 0;
        for (int i = 0; i < frequency.length;) {
            if(frequency[i] > 0){
                nums[ind++] = i;
                frequency[i]--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
