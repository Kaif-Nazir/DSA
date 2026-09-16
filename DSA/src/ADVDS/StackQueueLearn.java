package StackAndQueue;

import java.security.PrivilegedAction;
import java.sql.SQLOutput;
import java.util.*;

public class StackQueueLearn {

    public static void main(String[] args) {


//        int n[] = {4,3,5,5,9,2,8,4,7,2,3,8,3,5,4,7,9};

        int n = 1234;
        StringBuilder sb = new StringBuilder(5);
        Deque<Integer> d1 = new ArrayDeque<>();

        /*d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.addFirst(4);
        System.out.println(d1.peek());
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());
        System.out.println(d1.pollLast());

        Queue<Integer> q1 = new ArrayDeque<>();*/




    }


    /*class MinStack {

    Stack<int[]> s1;

    public MinStack() {
        s1 = new Stack<>();
    }

    public void push(int val) {
        int min = val;
        if(!s1.isEmpty()){
            min = Math.min(min , s1.peek()[1]);
        }
        s1.push(new int[]{val , min});
    }

    public void pop() {
        s1.pop();
    }

    public int top() {
        return s1.peek()[0];
    }

    public int getMin() {
        return s1.peek()[1];
    }
}*/                                                                       // MinStack Opt    TC(1)   SC(n)
    /*public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> s1 = new Stack<>();
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[m];
        Map<Integer , Integer> nextGreater = new HashMap<>();

        for(int i = m-1 ; i >= 0; i--){

            while(!s1.isEmpty() && nums2[i] > s1.peek())
                s1.pop();
            ans[i] = s1.isEmpty() ? -1 : s1.peek();

            s1.push(nums2[i]);
            nextGreater.put(nums2[i] , ans[i]);
        }
        for(int i = 0 ; i < n ; i++){
            nums1[i] = nextGreater.get(nums1[i]);
        }
        return nums1;
    }*/                                                                       // NextGreatEle-1  TC(2n)  SC(3n)
    /*static public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int ans [] = new int[n];
        Stack<Integer> s1 = new Stack<>();

        for(int i = (2*n)-1 ; i >= 0  ; i--){

            if(i < n){
                while(!s1.isEmpty() && s1.peek() <= nums[i])
                    s1.pop();
                ans[i] = !s1.isEmpty() ? s1.peek() : -1;
                s1.push(nums[i]);
            }
            else{
                while(!s1.isEmpty() && s1.peek() <= nums[i%n])
                    s1.pop();
                s1.push(nums[i%n]);
            }
        }
        return ans;
    }*/                                                                       // NextGreatEle-2  TC(2n)  SC(n)
    /*static public int[] prevSmallerElement(int[] nums) {

        Stack<Integer> s1 = new Stack<>();
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0 ; i < n ; i++){

            if(!s1.isEmpty() && nums[i] < s1.peek())
                s1.pop();
            ans[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(nums[i]);
        }
        return ans;
    }*/                                                                       // PreSmallElement TC(2n)  SC(n)
    /*static int rainwater2(int nums[]){

        int n = nums.length;
        int i = 0;
        int j = n-1;
        int leftMax = nums[0];
        int rightMax = nums[j];
        int total = 0;

        while(i < j){

            if(leftMax < rightMax){

                i++;
                leftMax = Math.max(leftMax , nums[i]);
                total += leftMax-nums[i];

            }
            else{

                j--;
                rightMax = Math.max(rightMax , nums[j]);
                total += rightMax-nums[j];

            }
        }
        return total;
    }*/                                                                       // RainWater II    TC(n)   SC(1)
    /*static public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        Stack<Integer> s1 = new Stack<>();
        int pre[] = new int[n];
        int suf[] = new int[n];

        int ans = 0;

        for(int i = 0 ; i < n ; i++){
            while(!s1.empty()  && arr[i] <= arr[s1.peek()])
                s1.pop();
            pre[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }
        s1.clear();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!s1.empty() && arr[i] < arr[s1.peek()])
                s1.pop();
            suf[i] = s1.isEmpty() ? n : s1.peek();
            s1.push(i);
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(suf));
        for(int i = 0 ; i < n ; i++){

            int leftCon = pre[i];
            int rightCon = suf[i];


            ans += ((i-leftCon) * (rightCon-i) * arr[i]);

        }
        return ans;
    }*/                                                                       // SumMinSubArray  TC(5n)  SC(3n)
    /*static private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    // Function to find indices of Next Greater Elements
    static private int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    // Function to find indices of Previous Smaller or Equal Elements
    static private int[] findPSEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

    // Function to find indices of Previous Greater or Equal Elements
    static private int[] findPGEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

    // Function to compute sum of subarray minimums
    static private long sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }

    // Function to compute sum of subarray maximums
    static private long sumSubarrayMaxs(int[] arr) {
        int n = arr.length;
        int[] nge = findNGE(arr);
        int[] pgee = findPGEE(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = 1L * left * right;
            sum += freq * arr[i];
        }
        return sum;
    }*/                                                                       // RangeSubArray   TC(10n) SC(6n)
    /*static int countMax(int heights[] ){

        int n = heights.length;
        Stack<Integer> s1 = new Stack<>();
        int preMin[] = new int[n];
        int sufMin[] = new int[n];
        int max = 0;

        for(int i = 0 ; i < n ; i++){

            int curr = heights[i];

            while(!s1.isEmpty() && curr <= heights[s1.peek()])
                s1.pop();
            preMin[i] = !s1.isEmpty() ? s1.peek() : -1;
            s1.push(i);

        }
        s1.clear();
        for(int i = n-1 ; i >= 0 ; i--){

            int curr = heights[i];

            while(!s1.isEmpty() && curr <= heights[s1.peek()])
                s1.pop();
            sufMin[i] = !s1.isEmpty() ? s1.peek() : n;
            s1.push(i);

        }
        for(int i = 0 ; i < n ; i++){

            int leftCon = preMin[i];
            int rightCon = sufMin[i];
            int total = (rightCon - leftCon) - 1;
            max = Math.max(max , total*heights[i]);
        }
        return max;
    }*/                                                                       // LargestRect     TC(3n)  SC(3n)
    /*static int countMax(int heights[] ){

        int n = heights.length;
        Stack<Integer> s1 = new Stack<>();
        int preMin[] = new int[n];
        int max = 0;

        for(int i = 0 ; i < n ; i++){

            int curr = heights[i];

            while(!s1.isEmpty() && curr <= heights[s1.peek()]){
                int prevH = s1.peek();
                max = Math.max((i - preMin[prevH] - 1)*heights[prevH] , max);
                s1.pop();
            }
            preMin[i] = !s1.isEmpty() ? s1.peek() : -1;
            s1.push(i);
        }
        while(!s1.isEmpty()){
            int prevH = s1.pop();
            max = Math.max((n - preMin[prevH] - 1)*heights[prevH] , max);
        }
        return max;
    }*/                                                                       // LargestRect     TC(2n)  SC(n)

}
