import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class link {
    static double dist(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }
    public static void main(String[] args) {

        HashMap<Integer , Integer> m1 = new HashMap<>();

        m1.put(1, 2);
        m1.put(null, 2);
        m1.put(null, 4);
        System.out.println(m1);



        }
        static void print(int  n){

            if(n == 0)
            return;

            print(n-1);
            System.out.println(n);


        }
        static void print1(int  n){

            System.out.print((n % 10) + " ");

            if(n % 10 != 0)
            print1(n/10);

            System.out.print(" " + n%10);

        }
    }
        