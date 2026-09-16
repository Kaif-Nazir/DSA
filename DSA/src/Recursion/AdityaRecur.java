package Recursion;

import java.util.*;


public class AdityaRecur {
    public static void main(String[] args) {

        System.out.println('+' + '1');

    }

    static void print(Set<?> a){}

    /*static void sort(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int temp = st.pop();
        sort(st);
        insert(st , temp);

    }
    static void insert(Stack<Integer> st , int val){śśś
        if(st.isEmpty() ||  st.peek()<val){
            st.push(val);
            return;
        }
        int temp = st.pop();
        insert(st , val);
        st.push(temp);
    }*/                                                                                       // Stack Sort
    /*static void reverse(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();
        reverse(stack);
        insert(stack , temp);
    }

    static void insert(Stack<Integer> stack, int temp) {

        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);

    }*/                                                                                       // Reverse
    /*public static void towerOfHanoi(int n, char source,
                             char helper, char destination) {

        if (n == 0)
            return;

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println(
                "Move disk " + n +
                        " from " + source +
                        " to " + destination
        );

        towerOfHanoi(n - 1, helper, source, destination);
    }*/                                                                                       // Tower Of Hanoi
    /*static void printSubSeq(String pro , String str , int ind , Set<String> uni){

        if(ind == str.length()){
            if(!uni.contains(pro)) {
                System.out.println(pro);
                uni.add(pro);
            }
            return;
        }

        printSubSeq(pro+str.charAt(ind) , str , ind+1 , uni);
        printSubSeq(pro, str , ind+1 , uni);

    }*/                                                                                       // SubSeq Uni
    /*static void permute(int nums[] ,List<Integer> inter , boolean mark[]){

        if(inter.size() == nums.length){
            System.out.println(inter);
            return;
        }

        for(int currInd = 0 ; currInd < nums.length ; currInd++){

            if(!mark[currInd]){
                inter.add(nums[currInd]);
                mark[currInd] = true;
                permute(nums , inter , mark);
                inter.remove(inter.size()-1);
                mark[currInd] = false;
            }
        }
    }*/                                                                                       // Permu Extra Space
    /*static void permut(int nums[] , int ind){


        if(ind == nums.length){
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int currInd = ind ; currInd < nums.length ; currInd++){

            swap(nums , currInd , ind);
            permut(nums , ind+1);
            swap(nums , currInd , ind);

        }


    }

    private static void swap(int[] nums, int currInd, int ind) {

        int temp = nums[currInd];
        nums[currInd] = nums[ind];
        nums[ind] = temp;

    }*/

}
