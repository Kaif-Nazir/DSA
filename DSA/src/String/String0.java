
// package String;
import java.math.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class String0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* String r = "FIIF";                                  //# R1  Palindrome
        String pal = "";
        for (int i = r.length()-1; i >= 0; i--) {
        pal += r.charAt(i);
        }
        System.out.println(pal); */
        /* String s = "abababa";
        if( s.length() < 2)System.out.println("Palindrome");
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.println("Not Palidrome");
                break;
            }else if ( i == s.length()/2-1){
                System.out.println("Palindrome");
            }
        } */
        /* String []co = {"raj","12","23","ka","as"};          //# R2  Differ Numbers and Alphabets in String[]
        int alph = 0;
        int num = 0;
        for (int i = 0; i < co.length; i++) {
        if(co[i].matches("[a-zA-Z]+")){
        alph++;
        }else{
        num++;
        }
        }
        System.out.println(alph);
        System.out.println(num);
        
        } */
        /* int length = 8;                                     //# R3  Generate Random Pass
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char []  password =   new char[length];
        for(int i = 0;i<length;i++){
        int rand = (int) (Math.random() *   passwordSet.length());
        password[i] =  passwordSet.charAt(rand);
        }
        System.out.println(password); */
        /* String s = "54321";                                 //# R4  String To Int Traditional
        int n = 0;
        
        for (int i = 0; i < s.length(); i++) {
        n = n * 10 + s.charAt(i) - 48;
        }
        System.out.println(n); */
        /* String s = "54321";                                 //# R5  String To Int System
        Integer k = Integer.parseInt(s);
        System.out.println(k); */
        // System.out.println(balanced("{()}"));
        /* double d = 12.34567;                                //# R6 Format Upto Decimal Points
    System.out.println(d);
    DecimalFormat df = new DecimalFormat("#.###");
    System.out.println(String.format("%.3f" , d));
    System.err.println(df.format(d));
    System.out.printf("%.3f",d); */
        /* Scanner sc = new Scanner(System.in);                //# R7 Infinite Lines Using String And HasNextLine

    int line = 1;
    
    while(sc.hasNextLine()){
        String s = sc.nextLine();
        System.out.println(line++ + " " + s);
    } */
        /* String s = "  hello  world  ";                      //# R8 Remove in between Spaces And Convert To Array 
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words)); */
        /* String s = "ABRACADABRA";                           //# R9 Longest Repeated Substring

        String arr[] = new String[s.length()];

        // Prefix

        for(int i = 0 ; i < s.length() ; i++){
            arr[i] = s.substring(i);
        }

        // Longest & Repeating

        String ans = "";
        int max = 0;
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length-1; i++){
            int k = 0;
            while(k < arr[i].length() && k < arr[i+1].length() && arr[i].charAt(k) == arr[i+1].charAt(k) ){
                k++;
            }
            if(max < k){
                max = k;
                s = arr[i].substring(0,k);
            }
        }
        System.out.println(s); */

    }
/* static boolean balanced(String s){

        while(true){
           
            System.out.print(originallength  + " ");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");

            int modifiedlength = s.length();
            if(originallength == modifiedlength){
                break;
            }
        }
        return s.length() == 0 ? true : false;
    } */
}