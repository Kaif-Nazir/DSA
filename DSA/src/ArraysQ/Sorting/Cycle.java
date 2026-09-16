// package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {

        
        /* // int ar [] = {10,2,8,6,4};
        int ar [] = {3,5,7,0,2,6,1,4};
        // index = element -1;


        for (int i = 0; i < ar.length;) {
            int correct = ar[i];
            if(ar[i] != ar[correct]){
                int temp = ar[i];
                ar[i]    = ar[correct];
                ar[correct] = temp;
            }else{
                i++; 
            }
        }
        System.out.println(Arrays.toString(ar)); */

        /* int nums [] = {3,0,1};
        // int nums [] = {3,5,7,0,2,6,1,4};
        // ans = 8
        for(int i = 0 ; i <nums.length ;){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]    = nums[correct];
                nums[correct] = temp;
            }else{
                i++; 
            }
        }

        for(int i = 0 ; i < nums.length ;i++){

            if(nums[i] != i){
                // System.out.println(i);
                break;
            }

        } */
        int arr [] = {2,0,2,1,1,0};
       int nums [] ={3,4,-1,1};
       //    System.out.println(missing2(nums));
       // System.out.println(Arrays.toString(cs(nums)));
       // System.out.println(dupli(nums));
    //    System.out.println(findDuplicates(nums));
    List <Integer> l1 = new ArrayList<>();
    for(int i = 0 ; i < nums.length ;){
        // 7,8,7,11,12,9
        int correct = nums[i]-1;
        System.out.println (Arrays.toString(nums));
        if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i]  = nums[correct];
            nums[correct] = temp;
        /* }else if ( i > nums[i]){
            l1.add(nums[i]); */
        }
        else{
            i++;
        }
    }
    System.out.println(Arrays.toString(nums));
    int ans [] = new int[1];
    for (int i = 0; i < nums.length; i++) {
            if(i + 1 != nums[i]){
                /* l1.add(nums[i]);
                l1.add(i+1); */
                ans [0] = i+1;
                break;
            }
       }
       System.out.println(ans[0]);
    
    

}

static int[]  cycle(int nums[]){
    for (int i = 0; i < nums.length;) {
        int cp = nums[i]-1;
        if(nums[i] <= nums.length && nums[cp] != nums[i]){
            int temp = nums[i];
            nums[i]  = nums[cp];
            nums[cp]  = temp;
        }else{
            i++;
        }
    }
    return nums;
}    
static List<Integer> missing2(int nums[]){

        cycle(nums);
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i+1){
                l1.add(i+1);
            }
        }
        return l1;
    }

static int[] cs(int nums [] ){

    for(int i = 0; i < nums.length;){

            int current = nums[i];
            if(nums[i] <= nums.length && nums[i] != nums[current]){
                int temp      = nums[i];
                nums[i] = nums[current];
                nums[current ] = temp;
            }else{
                i++;
            }
    }
    return nums;

}    
static int dupli(int nums[]){
    for(int i = 0; i < nums.length;){

        int current = nums[i];
        if(nums[i] != nums[current]){
            int temp        = nums[i];
            nums[i]         = nums[current];
            nums[current ]  = temp;
        }else if(i > nums[current]){
         return nums[i];  
        }
        else{
            i++;
        }
    }
    return -1;
}
public static List<Integer> findDuplicates(int[] nums) {
        
    List <Integer> l1 = new ArrayList<>();
    for(int i = 0 ; i < nums.length ;){
        // 0,4,3,2,7,8,2,3,1
        int correct = nums[i]-1;
        if(nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i]  = nums[correct];
            nums[correct] = temp;
        /* }else if ( i > nums[i]){
            l1.add(nums[i]);
            i++; */
        }
        else{
            i++;
        }
    }
    // System.gc();
    return l1;
}


}
