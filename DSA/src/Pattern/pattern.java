// package #Pattern
// DONE BY KAIF
// www.linkedin.com/in/mohammad-kaif-nazir-30b823280
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pattern {
    public static void main(String[] args) {

    // p1(6);
    // p2(6);
    // p3(6);
    // p4(6);
    // p5(6);
    // p6(6);
    // p7(6);
    // p8(5);
    // p9(6);
    // p10(6);
    // p11(6);
    // p12(6);
    // p13(6);
    // p14(6);
    // p15(6);
    // p16(5);
    // p17(4);
    // p18(6);
    // p19(6);
    // p20(6);
    // p21(6);
    // p22(6);
    // p23(4);
    // p24(6);
    // p25(6);
    // p26(6);
    // p27(4);                         *****
    // p28(5);
    // p29(6);
    // p30(6);
    // p31(4);
    // p32(5);
    // p33(6);
    // p34(6);
    // p35(4);
    
}
/* static void p1(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p2(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p3(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p4(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
} */
/* static void p5(int n){

    int chk  = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            // chk = i;
            chk++;
        }else{
            // chk = (n*2)-i ; 
            chk--;
        }
        for (int j = 1; j <= chk; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // for (int i = n-1; i >= 1; i--) {
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
} */
/* static void p6(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p7(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= n-i+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p8(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (i*2)-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p9(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= n*2-(i*2-1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p10(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
} */
/* static void p11(int n){

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= n-i+1; j++) {
            System.out.print(" *");
        }
        System.out.println();
    }
} */
/* static void p12(int n){

    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2 - i;    
        }
        for (int j = 1; j <= chk-1; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= n-chk+1; j++) {
            System.out.print(" *");
        }
        System.out.println();
    }
    // for (int i = n; i >= 1; i--) {
    //     for (int j = 1; j <= i-1; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= n-i+1; j++) {
    //         System.out.print(" *");
    //     }
    //     System.out.println();
    // }
} */
/* static void p13(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2*i-1; j++) {
           
            if(j == 1 || j == i*2-1 || i == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
} */
/* static void p14(int n){
    for (int i = 1; i <= n; i++) {
        
        
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2*i-1; j++) {
           
            if(j == 1 || j == i*2-1 || i == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
} */
/* static void p15(int n){
    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2-i;
        }
        for(int j= 1 ; j <= n-chk ; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= chk*2-1 ;j++){
            if(j == 1 || j == chk*2-1){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
    }
} */
/* static void p16(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        int val = 1;
        for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val* (i-j)/(j+1);
        }
        System.out.println();
    }
} */
/* static void p17(int n){
    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2-i;
        }
        for (int j = 1; j <= n-chk; j++) {
            System.out.print(" ");
        }
        for (int j = chk; j >= 1; j--) {
                System.out.print(j);
        }
        for (int j = 2; j <= chk; j++) {
                System.out.print(j);
        }
        System.out.println();
    }
} */
/* static void p18(int n){
    int chk = 0;
    for (int i = 1; i <= n*2; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2-i+1;
        }
        for (int j = 0; j <= n-chk; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= chk-1; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j <= n-chk; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
} */
/* static void p19(int n){
    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2-i;
        }
        for (int j = 1; j <= chk; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= n-chk; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= chk; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p20(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
           
            if(j == 1 || j == n || i == n  || i == 1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
} */
/* static void p21(int n){
    int k = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
        }
        System.out.println();
    }
} */
/* static void p22(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if((i+j) % 2 ==0){    
            System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
} */
/* static void p23(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" "); // Two spaces for better alignment
        }

        for (int j = 1; j <= i; j++) {
            if(j == 1 || i == j || j == n){
                System.out.print(" *");
            }else{
                System.out.print("  ");
            } 
        }
        // for (int j = 1; j <= n - i; j++) {
        //     System.out.print(" "); 
        // }
        for (int j = 1; j <= 2*(n - i); j++) {
            System.out.print(" "); 
        }

        for (int j = 1; j <= i; j++) {
            if(j == 1 || i == j || j == n){
                System.out.print(" *");
            }else{
                System.out.print("  ");
            } 
            
        }
        System.out.println();
    }

} */
/* static void p24(int n){
    int chk = 0;
    for (int i = 1; i <= n*2; i++) {
        if( i <= n){
            chk = i;
        }else{
            chk = n*2 - i;
        }
        for (int j = 1; j <= chk; j++) {
            if(j == 1 || chk == j || j == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            } 
        }
        for (int j = 1; j <= n - chk; j++) {
            System.out.print(" "); // Two spaces for better alignment
        }
        // for (int j = 1; j <= n - i; j++) {
        //     System.out.print(" "); 
        // }
        for (int j = 1; j <= (n - chk); j++) {
            System.out.print(" "); 
        }

        for (int j = 1; j <= chk; j++) {
            if(j == 1 || chk == j || j == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            } 
            
        }
        System.out.println();
    }
    
} */
/* static void p25(int n){
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= n-i ; j++){
            System.out.print(" ");
        }
        for (int j = 1; j <= n; j++) {
            if(i == 1 || j == 1 || i == n || j == n){    
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
} */
/* static void p26(int n){
    int k = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i+1; j++) {
                System.out.print(i+ " ");
        }
        System.out.println();
    }
} */
/* static void p27(int n){
    int k = 1;
    int sum = 1;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    Integer [] rs = new Integer[n];
    
    for (int i = 0; i < rs.length; i++) {
            rs[i] = sum;
            sum += i+1;
    }
    Arrays.sort(rs,Collections.reverseOrder());
    int con = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 2; j < i*2; j++) {
                System.out.print(" ");
    
        }
        for (int j = 1; j <= n-i+1; j++) {
            System.out.print(k++ + " ");
        }
        if(k <= 10){
        System.out.print( " ");
        }
        for(int j = 1; j <= n-i+1 ; j++){
            System.out.print(rs[con]++ + " ");
        }
        con++;
        System.out.println();
    }
} */
/* static void p28(int n){
    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if(i <= n){
            chk = i;
        }else{
            chk = n*2 - i;
        }
        for (int j = 1; j < n-chk+1; j++) {
                System.out.print(" ");
        }
        for (int j = 1; j <= chk; j++) {
                System.out.print(" *");
        }
        System.out.println();
    }
} */
/* static void p29(int n){
    int chk = 0;
    for (int i = 1; i <= n*2-1; i++) {
        if( i <= n){
            chk = i;
        }else{
            chk = n*2 - i;
        }
        for (int j = 1; j <= chk; j++) {
                System.out.print("*");
        }
        for (int j = 1; j <= n-chk; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= chk; j++) {
                System.out.print("*");
        }
        System.out.println();
    }
} */
/* static void p30(int n){
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
        }
        for (int j = i; j >= 1; j--) {
                System.out.print(j);
        }
        for (int j = 2; j <= i; j++) {
                System.out.print(j);
        }
        System.out.println();
    }
} */
/* static void p31(int n){
    
//    for (int i = 0; i < n*2-1; i++) {                          // # 1  Descending
//      for (int j = 0; j < n*2-1; j++) {
//          int num = n - (Math.min(Math.min(i,j) , Math.min(n*2-j-2, n*2-i-2)));
//          System.out.print(num +" ");
//      }
//           System.out.println();
//    }

//    for (int i = 0; i <= n*2; i++) {                          // # 2 Ascending
//     for (int j = 0; j <= n*2; j++) {
//         int num =  Math.min(Math.min(i, j), Math.min(n*2-i, n*2-j));
//         System.out.print(num + " ");
//     }
//          System.out.println();
//    }

} */
/* static void p32(int n){

    char [] ch = new char[n];
    char let = (char)('A'+ n-1);
    for (int i = ch.length-1; i >= 0; i--) {
        ch[ch.length-i-1] = let;
        let--;
    }
    int con = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(ch[con]++);
        }
        con++;
        System.out.println();
    }
} */
/* static void p33(int n){
    char ch = 'a';
    for (int i = 1 , ref =1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((ref % 2 == 1) ? ch : Character.toUpperCase(ch));
            // if(ref % 2 == 1){
            //     System.out.print(ch);
            // }else{
            //     System.out.print(Character.toUpperCase(ch));
            // }
            ch++;
            ref++;
        }
        System.out.println();
    }

   
//    char ch = 'a';
//    char chc = 'A';
//     for (int i = 1 , ref = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             if(ref % 2 == 1){    
//             System.out.print(ch++);
//             chc++;
//             }else{
//             System.out.print(chc++);
//             ch++;
//             }
//             ref++;
//         }
//         System.out.println();
//     }
} */
/* static void p34(int n){
   
   char ch [] = new char[n];
   char let = 'A';
   for (int i = ch.length-1; i >= 0; i--) {
            ch[i] = let++;
   }
    for (int i = 1 , con = 0; i <= n; i++) {
        for (int j = 1; j <= n-i+1; j++) {
                System.out.print(ch[con]--);
        }
        con++;
        System.out.println();
    }
} */
/* static void p35(int n){
   
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for(int j = 1; j<= n-i; j++){
        System.out.print("  ");
        }
        for (int j = i; j >= 1; j--) {
                System.out.print(j);
        }
        System.out.println();
    }
} */

}