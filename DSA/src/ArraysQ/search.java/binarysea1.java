import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.math.*;

public class binarysea1 {
    public static void main(String[] args) {

        /*
         * int a[] = {-18,-8,-4,-0,2,4,6,9,12,54}; // --> FOR ASCENDING <--
         * int tar = -4;
         * int start = 0;
         * int end = a.length-1;
         */
        /*
         * while(start <= end){ // Binary Searh While
         * 
         * // int mid = (start+end) /2;
         * int mid = start + (end-start)/2; //For Big Arrays
         * if(tar > a[mid]){
         * start = mid+1;
         * }else if ( tar < a[mid]){
         * end = mid-1;
         * }else{
         * System.out.println(mid);
         * break;
         * }
         * }
         */
        /*
         * for (; start <= end;) { // Binary Search For
         * 
         * int mid = start + (end-start)/2;
         * if(tar > a[mid]){
         * start = mid+1;
         * }else if (tar < a[mid]){
         * end = mid-1;
         * }else{
         * System.out.println(mid);
         * break;
         * }
         * }
         */
        /*
         * int a[] = {90,80,70,60,50,30,10}; // --> For Descending <--
         * int tar = 30;
         * int start = 0;
         * int end = a.length-1;
         * 
         * while(start <= end){
         * 
         * int mid = start + (end - start)/2;
         * 
         * if(tar > a[mid]){
         * end = mid-1;
         * }
         * else if (tar < a[mid]){
         * start = mid+1;
         * }else{
         * System.out.println(mid);
         * break;
         * }
         * }
         */
        /*
         * int a[] = {9,6,4,1}; // Order Agnostic
         * int tar = 1;
         * System.out.println(orderAgnosticBS(a, tar));
         */

        /*
         * int a[] = {2,3,5,9,14,16,18}; // R1 Top Ceiling Problem
         * int tar = 17;
         * int start = 0;
         * int end = a.length-1;
         * boolean w = true;
         * while(start <= end){
         * System.out.println(start);
         * int mid = start + (end - start)/2;
         * if(a[mid] == tar){
         * System.out.println(a[mid]);
         * w = false;
         * break;
         * }
         * if(a[mid] > tar){
         * end = mid-1;
         * }else{
         * start = mid+1;
         * }
         * }
         * if(w)
         * System.out.println(a[start]);
         */
        /*
         * int a[] = {2,3,5,14,16,18}; // R2 Floor (Bottom Ceiling)
         * int start = 0;
         * int end = a.length-1;
         * int target = 14;
         * boolean chk = true;
         * while(start <= end){
         * int mid = start + (end-start)/2;
         * if(a[mid] == target){
         * chk = false;
         * System.out.println(mid);
         * break;
         * }
         * if(a[mid] > target){
         * end = mid-1;
         * }else{
         * start = mid+1;
         * }
         * }
         * if(chk){
         * System.out.println(a[end]);
         * }
         */
        /*
         * int [] num = {4,5,5,5,6,7,7,7}; // R3 First And Last Occurence
         * int target = 7;
         * boolean chk = true;
         * int start = 0, end = num.length-1;
         * int first = -1;
         * int last = -1;
         * 
         * while(start <= end){
         * int mid = (start+end) /2;
         * if(num[mid] == target){
         * first = mid;
         * if(chk){
         * end = mid-1;
         * }
         * }if(num[mid] > target){
         * end = mid-1;
         * }else if(num[mid] < target){
         * start = mid+1;
         * }
         * }
         * System.out.println(first);
         * chk = false;
         * start = 0 ; end = num.length-1;
         * while(start <= end){
         * 
         * int mid = start + (end-start)/2;
         * if(num[mid] == target){
         * last = mid;
         * if(chk){
         * // end = mid-1;
         * }else{
         * start = mid+1;
         * }
         * }else if (num[mid] > target){
         * end = mid-1;
         * }else if (num[mid] < target){
         * start = mid+1;
         * }
         * }
         * System.out.println(last);
         */
        /*
         * int a [] = {3,5,7,9,10,90,100,130,140,160,170}; // R4 Target Of Infinte Array
         * int tar = 130;
         * int start = 0;
         * int end = 1;
         * 
         * while(tar > a[end]){
         * start = end;
         * end = end*2;
         * }
         * while(start<= end){
         * 
         * // previous + (previous + 1 - (previous start before editing))*2 for taking
         * logn colpexity
         * int mid = start + (end - start )/2;
         * if(a[mid] == tar){
         * System.out.println(mid);
         * break;
         * }else if(a[mid] > tar){
         * end = mid-1;
         * }else if (a[mid] < tar){
         * start = mid+1;
         * }
         * 
         * }
         */

        /*
         * int a [] = {1,3,5,4,1};
         * int start = 0;
         * int end = a.length-1;
         * int target = 4;
         * int ans = -1;
         * boolean chk = a[(start+end )/2] > target;
         * while(start <= end){
         * int mid = start + (end -start)/2;
         * 
         * if(chk){
         * if (a[mid] > target){
         * end = mid-1;
         * }else if (a[mid] < target){
         * start = mid+1;
         * }else{
         * ans = mid;
         * break;
         * }
         * }else{
         * if (a[mid] > target){
         * start = mid+1;
         * }else if (a[mid] < target){
         * end = mid-1;
         * }else{
         * ans = mid;
         * break;
         * }
         * }
         * }
         */

        int asc[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int dsc[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int mix[] = { 1, 2, 3, 4, 5, 6, 7, 3, 2, 1 };
        char floor[] = { 'c', 'f', 'j', 'l', 'o' };
        long startTime = System.nanoTime();

        int nums[] = { 12, 6, 4, 2, 1 };
        int target = 4;
        int start = 0;
        int end = nums.length - 1;
        int chk[] = { 1, 1 };
        System.out.println(dsc(chk, 2));
        // System.out.println(dsc(asc,7));
        // System.out.println(smallest(floor, 'g'));
        // System.out.println(nextGreatestLetter(floor, 'j'));
        // System.out.println(firstlast(mix, 2 , true));
        // System.out.println(firstlast(mix, 5 , false));
        // System.out.println(findTargetInInfiniteArray(asc ,170));
        // System.out.println(peakElement(mix));
        // System.out.println(search(nums,target));
        // System.out.println(numOfRotation(nums));

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000 + " ms");

    }

    public static int dsc(int[] ar, int tar) {
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar[mid] == tar) {
                return mid;
            }
            if (ar[0] < ar[ar.length - 1]) {
                if (ar[mid] > tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (ar[mid] > tar) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static char smallest(char ch[], char tar) {

        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ch[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (start >= ch.length)
            return ch[0];
        return ch[start];
    }

    /*
     * public char nextGreatestLetter(char[] letters, char target) {
     * int start = 0, end = letters.length-1;
     * 
     * while(start <= end){
     * int mid = (start+end) /2;
     * if(letters[mid] > target){
     * end = mid-1;
     * }else{
     * start = mid+1;
     * }
     * }
     * if(start >= letters.length){
     * return letters[0];
     * }
     * return letters[start];
     * }
     */
    public static int firstlast(int[] nums, int target, boolean chk) {
        // 1,5,2 --> 1
        // 0,1,2 --> 1
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (chk) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static int infnite(int nums[], int tar) {

        int start = 0;
        int end = 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (tar > nums[end]) {
                int nstart = end + 1;
                end = end + (end - start + 1) * 2;
                start = nstart;
            }
            System.out.println(mid);
            if (tar > nums[mid]) {
                start = mid + 1;
            } else if (tar < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static int findTargetInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range exponentially until target is within range
        while (true) {
            try {
                if (arr[end] >= target) {
                    break;
                } else {
                    start = end;
                    end = end * 2;
                }
            } catch (Exception e) {
                end = (start + end) / 2;
                if (end <= start)
                    break;
            }
        }

        return binarySearch(arr, target, start, end);
    }

    public static int peakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int Order(int[] ar, int tar, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar[mid] == tar) {
                return mid;
            }
            if (ar[0] < ar[end]) {
                if (ar[mid] > tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (ar[mid] > tar) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ar[start - 1];

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            try {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } catch (Exception e) {
                // Adjust end if mid is out of bounds
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static int search(int[] nums, int target) {

        if (nums.length == 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
        }
        int start = 0;
        int end = nums.length - 1;
        int max = max(nums);
        System.out.println(max);
        if (nums[max] == target)
            return max;
        int first = bs(nums, target, start, max);
        if (first == -1) {
            int second = bs(nums, target, max + 1, end);
            return second;
        } else {
            return first;
        }
    }

    public static int max(int nums[]) {
        // 3,4,5,6,7,1,2
        // 5,6,7,8,9,10,11,1,2,3,4
        // 1,3,5
        // 1,2,3,4,5,6
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums.length == 3) {
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                } else {
                    return mid;
                }
            }

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int bs(int ar[], int tar, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar[mid] == tar) {
                return mid;
            }
            if (ar[start] < ar[end]) {
                if (ar[mid] > tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (ar[mid] > tar) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int numOfRotation(int nums[]) {

        int rotations = max(nums);

        return rotations + 1;
    }

}
