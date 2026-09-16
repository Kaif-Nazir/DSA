// package ArraysQ.search.java;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class presuff {
    public static void main(String[] args) {
    

    }
        
/* static int [] prefixsum(int []nums){                           // Single Running Sum Space (O(n))
    int prefix[] = new int[nums.length];
    prefix[0] = nums[0];

    for (int i = 1; i < prefix.length; i++) {

        prefix[i] = prefix[i-1] + nums[i];
    }
    System.out.println(Arrays.toString(prefix));
    return prefix;
} */
/* static int [] prefixsum(int []nums)                            // Single Running Sum Space (O(1))

    for (int i = 1; i < nums.length; i++) {
        nums[i] = nums[i-1] + nums[i];
    }
    return nums;
} */
/* static int  queryps(int nums[] , int start , int end){         // Start & End Sum of Sub Array
    int ans = 0;
    for (int i = 1; i < nums.length; i++) {
        nums[i] = nums[i-1] + nums[i];
    }
    System.out.println(Arrays.toString(nums));
    if(start != 0){
    ans = nums[end] - nums[start-1];
}else{
    ans = nums[end];

    }
    return ans;
} */
/* static boolean twoEqualSub(int nums[]){                        // Equal Sum of Two Sub Arrays
    
    for(int i = 1 ; i < nums.length ; i++){
        nums[i] = nums[i-1] + nums[i];
    }
    for(int i = 0 ; i < nums.length-1 ; i++){
        if(nums[i] == nums[nums.length-1] - nums[i]){
            return true;
        }
    }

    return false;
} */
/* static boolean twoEqualSub(int nums[]){                        // Equal Sum With Suffix and Prefix
    
    int pre[] = new int[nums.length];
    int suff[] = new int[nums.length];
    pre[0] = nums[0];
    suff[nums.length-1] = nums[nums.length-1];
    for(int i = 1 ; i < nums.length ; i++){
        pre[i] = nums[i] + pre[i-1];
    }
    for(int i = nums.length-2 ; i >= 0 ; i--){
        suff[i] += nums[i] + suff[i+1];
    }
    System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(pre));
    System.out.println(Arrays.toString(suff));
    for (int i = 0; i < suff.length-1; i++) {
            if(pre[i] == suff[i+1]){
                return true;
        }
    }
    return false;
} */
/* public static int[] productExceptSelf(int[] nums) {
    int n = nums.length, product = 1;
    int[] output = new int[n];
    output[0] = 1;
    for(int i = 1 ; i < nums.length ; i++){
        product *= nums[i-1];
        output[i] = product;
    }
    // 2,3,4,6 
    // 1,2,6,24
    product = 1;
    for(int i = nums.length -2 ; i >= 0; i--){
        product *= nums[i+1];
        output[i] *= product;
    }
    return output;
} */
/* public static int[][] constructProductMatrix(int[][] grid) {
    
    int n = grid.length , m = grid[0].length;
    int mod = 12345;
    int ans [][] = new int[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0 ; j < m ; j++){
            ans[i][j] = 1;
        }
    }
    long product = 1;
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            ans[i][j] = (int)(product%mod);
            product = (product * grid[i][j])%mod;
        }
    }
    product = 1;
    for(int i = n-1 ; i >= 0 ; i--){
        for(int j = m-1; j >= 0 ; j--){
           ans[i][j] = (int)(ans[i][j]*product%mod); 
            product = (int)(product*grid[i][j]%mod);
        }
    }
    return ans;
    } */
/* public static int[][] constructProductMatrix(int[][] arr) {
    int r = arr.length, c = arr[0].length;
    long p = 1;
    int[] temp = new int[r * c];
    int[] pre = new int[r * c];
    int ind = 0, x = 0;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            temp[ind++] = arr[i][j];
        }
    }
    // System.out.println(Arrays.toString(temp));
    for (int i = 0; i < ind; i++) {
        p *= (long) (temp[i]);
        p %= 12345l;
        pre[x++] = (int) p;
    }
    // System.out.println(Arrays.toString(pre));
    p = 1;
    for (int i = ind - 1; i > 0; i--) {
        int res = (int) ((pre[i - 1] * p) % 12345l);
        pre[i] = res;
        // System.out.print(res + " ");
        p *= (long) (temp[i]);
        p %= 12345l;
    }
    // System.out.println(Arrays.toString(pre));
    pre[0] = (int) (p);
    System.out.println(Arrays.toString(pre));
    ind = 0;
    int[][] prod = new int[r][c];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            prod[i][j] = pre[ind++];
        }
    }
    // System.out.println(Arrays.deepToString(prod));
    return prod;
} */

}
