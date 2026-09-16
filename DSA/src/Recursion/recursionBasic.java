package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;
import java.util.Vector;
import java.util.HashSet;


public class recursionBasic {
        public static void main (String args[]){

            // System.out.println(fibo(7));
            // fibo(7);
            // System.out.println(fact(5));
            // System.out.println(sum(10));
            // System.out.println(sum(123456789 , 0));
            // System.out.println(chkSort(new int[]{1,2,3,4,5,6,7,8}, 0));
            // System.out.println(revNum(123, 0));
            // System.out.println(numOfZero(100400, 0));
            // System.out.println(helper(100400));
            // sumTriangle(new int[]{1,2,3,4}, 0);
            // System.out.println(max(new int[] {1,2,3}, 0));
            /* AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);
            AtomicInteger min = new AtomicInteger(Integer.MAX_VALUE);
            
            int arr[] = {1,3,5,2,6};

            maxmin(arr, max, min, 0);
    
            System.out.println("Max: " + max.get() + ", Min: " + min.get()); */
            // System.out.println(firstCap("saAdd", 0));
            // System.out.println(strLen("1"));
            // System.out.println(lS(new int[]{0,1,2,3,4,5,6}, 0, 0));
            // System.out.println(mulOcc(new int[]{1,2,3,2,4,2}, 0, 2, new ArrayList<>()));
            // System.out.println(multiOcc(new int[]{1,2,3,2,4,5,2}, 0, 2));
            // triangle(4, 0);
            /* int arr[] = {5,4,3,2,1};
            bubbleSort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr)); */
            /* int arr[] = {5,4,3,2,1};
            selectionSort(arr, 0, arr.length , 0);
            System.out.println(Arrays.toString(arr)); */
            // System.out.println(removeConse("aabbccc", 1, ""));
            // System.out.println(skip("aabbccabc", 'a'));
            // System.out.println(sumNum(4));
            // subset("", "abc");
            // System.out.println(subset("" , "abc"));
            // System.out.println(Arrays.toString(mergeSort(new int[]{5,4,3,2,1})));
            /* int arr[] = {5,5,5,4,4,4,3,2,1,3};
            quickSort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr)); */
            // subsetArr(new ArrayList() , new int[]{1,2,3}, 0);
            /* Set<String> s1 = new HashSet<>();
            subset("", "abbc", s1);
            System.out.println(s1); */
            // System.out.println(subset("", "abbc"));
            /* List<Lst<Integer>> res = new ArrayList<>();
            subset(new ArrayList<>(), new int[]{1,2,2,3}, 0, res);
            System.out.println(res); */

           
        }

        /* static void subset(List<Integer> unpro, int[] pro, int index, List<List<Integer>> result) {
            // Base case: Store the subset
            if (index == pro.length) {
                result.add(new ArrayList<>(unpro));
                return;
            }
    
            // Include the current element
            unpro.add(pro[index]);
            subset(unpro, pro, index + 1, result);
            unpro.remove(unpro.size() - 1);
            
            // Skip all duplicate elements
            while (index + 1 < pro.length && pro[index] == pro[index + 1]) {
                index++;
            }
            
            // Exclude the current element
            subset(unpro, pro, index + 1, result);
        } */
        /* static Set<String> subset(String unpro, String pro) {
            
            Set<String> res = new HashSet<>();

            if (pro.isEmpty()) {
                res.add(unpro); // Store only unique subsets
                return res;
            }
    
            char curr = pro.charAt(0);
            
            // Include the current character
            res.addAll(subset(unpro + curr, pro.substring(1)));
            
            // Exclude the current character
            res.addAll(subset(unpro, pro.substring(1)));

            return res;
        } */
        /* static void subsetArr(List<Integer> unpro , int pro[] , int ind){

            if(ind == pro.length){
                System.out.println(unpro);
                return;
            }

            // Include
            unpro.add(pro[ind]);
            subsetArr(unpro, pro, ind+1);

            // Exclude

            unpro.remove(unpro.size()-1);
            subsetArr(unpro, pro, ind+1);


        } */
        /* static void quickSort(int arr[] , int start , int end){

            if(start >= end)
            return;

            int left = start;
            int right = end;
            int mid = left + (right - left) /2;
            int pivot = arr[mid];

            while(left <= right){

                while( arr[left] < pivot)left++;
                while( arr[right] > pivot)right--;

                if(left <= right){
                    // arr[left] = arr[left]+arr[right] - (arr[right--] = arr[left++]);
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            quickSort(arr, start, right);            
            quickSort(arr, left, end);            

        } */
        /* static int[] mergeSort(int arr[]){

            if(arr.length == 1)
            return arr;

            int mid = arr.length/2;

            int left[] = mergeSort(Arrays.copyOfRange(arr ,0, mid));
            int right[] = mergeSort(Arrays.copyOfRange(arr , mid , arr.length));

            return merge(left , right);

        }
        static int[] merge(int left[] , int right[] ){


            int indL = 0;
            int indR = 0;
            int indT = 0;
            int temp[] = new int[left.length + right.length];

            while(indL < left.length && indR < right.length){

                if(left[indL] > right[indR]){
                    temp[indT] = right[indR++];
                }else
                    temp[indT] = left[indL++];
                
                indT++;
            }
            while(indL < left.length){
                temp[indT++] = left[indL++];
            }
            while(indR < right.length){
                temp[indT++] = right[indR++];
            }
            return temp;

        } */
        /* static List<String> ans = new ArrayList<>();
        static List<String> subset(String unpro , String pro){

            if(pro.isEmpty()){
                List<String> l1 = new ArrayList<>();
                l1.add(unpro);
                return l1;
            }

            char curr = pro.charAt(0);

            List<String> left = subset(unpro + curr, pro.substring(1));
            List<String> right = subset(unpro, pro.substring(1));

            left.addAll(right);
            return left;

        } */
        /* static void subset(String unpro , String pro){ 

            if(pro.isEmpty()){
                System.out.print(unpro + " ");
                return;
            }
            char curr = pro.charAt(0);

            subset(unpro + curr, pro.substring(1));
            subset(unpro, pro.substring(1));

        } */
        /* static int sumNum(int n){

            if(n == 0)return 0;

            return n + sumNum(n-1);

        } */
        /* static String skip(String s , char tar){

            if(s.isEmpty())
            return "";

            char curr = s.charAt(0);

            if(curr == tar)
                return  skip(s.substring(1), tar);
            else
                return  curr + skip(s.substring(1), tar);

        } */
        /* static String removeConse(String str , int ind , String s){

            if(ind == str.length())return s+=str.charAt(ind-1);

            if(str.charAt(ind)!=str.charAt(ind-1))
            s += str.charAt(ind-1);
            return removeConse(str, ind+1, s);
        } */
        /* static void selectionSort(int arr[], int ind, int k, int temp) {
            if (k <= 0) return;
        
            if (ind < k) {
                if (arr[ind] > arr[temp]) {
                    temp = ind;
                }
                selectionSort(arr, ind + 1, k, temp);
            } else {
                int temp1 = arr[temp];
                arr[temp] = arr[k-1];
                arr[k-1] = temp1;
                System.out.println(Arrays.toString(arr));
                selectionSort(arr, 0, k - 1, 0);
            }
        } */
        /* static void bubbleSort(int arr[] , int ind , int k){

            if(k == 0)return;

        if(ind < k){
            if(arr[ind] > arr[ind+1]){
                int temp = arr[ind];
                arr[ind] = arr[ind+1];
                arr[ind+1] = temp;
                bubbleSort(arr, ind+1, k);
            }
        }else
            bubbleSort(arr, 0, k-1);


        } */
        /* static void triangle(int row , int col){

            if(row == 0)
            return;

            if(row > col){
                System.out.print("*");
                triangle(row, col+1);
            }else{
                System.out.println();
                triangle(row-1, 0);
            }
        } */
        /* static ArrayList<Integer> multiOcc(int arr[] , int ind , int tar){

            ArrayList<Integer> l1 = new ArrayList<>();
            
            if(ind == arr.length)
            return l1;


            if(arr[ind] == tar)
            l1.add(ind);

            ArrayList<Integer> re = multiOcc(arr, ind+1, tar);
            re.addAll(l1);
            return re;

        } */
        /* static ArrayList<Integer> mulOcc(int arr[] , int ind , int tar , ArrayList<Integer> l1){

            if(ind == arr.length)return l1;

            if(arr[ind] == tar)
            l1.add(ind);

            return mulOcc(arr, ind+1, tar, l1);


        } */
        /* static int lS(int arr[] , int ind , int tar){

            if(ind == arr.length)return -1;

            if(arr[ind] == tar)
            return ind;
            return lS(arr , ind+1, tar);

        } */
        /* static int count = 0;
        static int strLen(String str){

            if(str.isEmpty())
            return count;

            count++;
            return strLen(str.substring(1));

        } */
        /* static int ans = -1;
        static int firstCap(String s , int ind){

            if(ind == s.length())return -1;
            if(Character.isUpperCase(s.charAt(ind))){
                return ind;
            }
            return firstCap(s, ind+1);
        } */
        /* static int max = 0 , min = Integer.MAX_VALUE; 
        static void maxmin(int arr[] , int ind){

            if(ind == arr.length)return;
            max = Math.max(max, arr[ind]);
            min = Math.min(min, arr[ind]);
            maxmin(arr, ind+1);

        } */
        /* static void maxmin(int arr[], AtomicInteger max, AtomicInteger min, int ind) {
            if (ind == arr.length) return;
    
            max.set(Math.max(max.get(), arr[ind])); // Update max
            min.set(Math.min(min.get(), arr[ind])); // Update min
    
            maxmin(arr, max, min, ind + 1); // Recursive call
        } */
        /* static int max(int a[] , int n){

            if(n == a.length-1)return a[n];

            return Math.max(a[n] , max(a, n+1));

        } */
        /* static void sumTriangle(int arr[] , int ind){

            
            if(arr.length == 0)return;
            
            System.out.println(Arrays.toString(arr));
            
            int temp [] = new int[arr.length-1];
            fill(temp , arr ,0);
            sumTriangle(temp, 0);


        }
        static void fill(int arr[] , int num[] , int ind){

            if(ind == arr.length)return;

            arr[ind] = num[ind]+num[ind+1];
            fill(arr, num, ind+1);

        } */
        /* static int helper(int n ){
            int ans = 0;
            return numOfZero( n , ans);
        }
        static int numOfZero(int i , int ans){

            if(i == 0)return ans;

            return numOfZero(i/10 , ans += i%10==0 ? 1 : 0);

        } */
        /* static int revNum(int n , int ans){

            if(n == 0)return ans;

            return revNum(n/10 , (ans*10)+(n%10));

        } */
        /* static boolean chkSort(int arr[] , int ind ){

            if(ind == arr.length-1)return true;

            return arr[ind] < arr[ind+1] && chkSort(arr, ind+1);

        } */
        /* static int fibo(int n){

            if(n < 2)return n;
            return fibo(n-1) + fibo(n-2) ;
        } */
        /* static int a = 0 , b = 1 , c;
        static void fibo(int n ){

            if(n == 0)return;
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
            fibo(n-1);

        } */
        /* static int fact(int n){

            if(n <= 1)return n;

            return n * fact(n-1);

        } */
        /* static int sum(int n ){

            if(n <= 1)return n;
            
            return n + sum(n-1);

        } */
        /* static int sum(int n , int res){

            if(n == 0)return res;

            return sum(n/10 ,  res+=(n%10));

        } */



    }
