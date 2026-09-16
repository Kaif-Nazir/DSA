import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static void main(String[] args) {


        /*int n = 13;
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);*/
        /*int i = 5;
        int j = 10;
        i ^= j;
        int count = 0;
        while(i != 0){

            count++;
            i = i & (i-1);

        }
        System.out.println(count);*/
        /*int nums[] = {2,2,3,2};
        int ans = 0;
        for(int i = 0; i < 4 ; ++i){
            int sum = 0 ;
            for(final int num : nums){

                sum += num >> i & 1;

            }
            System.out.print(sum);
            sum %= 3;
            System.out.println(" " + (sum << i));
            ans |= sum << i;

        }*/
        Queue<Integer> k = new ArrayDeque<>();
        k.add(1);
        k.add(2);
        System.out.println(k.peek());

        String str = "";
        

    }

}