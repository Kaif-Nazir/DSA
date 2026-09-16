import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class math {

    // Sum = (n * (n + 1)) / 2                                                   1. Sum of first N natural numbers
    // Sum = n²                                                                  2. Sum of first N odd numbers 
    // Sum = n * (n + 1)                                                         3. Sum of first N even numbers
    // Nth odd = 2n - 1                                                          4. Nth odd number
    // Nth even = 2n                                                             5. Nth even number
    // Sum = (n * (n + 1) * (2n + 1)) / 6                                        6. Sum of squares of first N natural numbers
    // Sum = ((n * (n + 1)) / 2)²                                                7. Sum of cubes of first N natural numbers
    // Sum = (n / 2) * (2a + (n - 1) * d)                                        8. Sum of an arithmetic progression (AP)
    // Sum = a * ((r^n - 1) / (r - 1))  // if r != 1                             9. Sum of a geometric progression (GP)
    /* long k = (long)1e9+7;                                                    10. Math.Pow X * 10 ^ y 
        int a = (int)1e9+7;

        System.out.println(k);
        System.out.println(a);
        System.out.println(1e9+7); */

    public static void main(String ... args)    {


    /* int n = 153;                                                            // ArmStrong Num (Sum Of num When Raised To Pow of No. of Digits == Main Num)
    int k = n;
    int pow = (int)(Math.log10(n)+1);
    int res = 0;
    while(n > 0){
        res += (int)Math.pow(n%10 , pow);
        n /= 10;
    }
    System.out.println(res == k ? true : false); */
    /* int n = 36;                                                             // Check Prime Brute
        for(int i = 2; i < n ; i++){
        if(n % i == 0)
        System.out.println("Not Prime");
         */
    /* int n = 6;                                                             // Check Prime Oprimized
       for(int i = 2; i < (int)Math.ceil(Math.sqrt(n)) ; i++){
        if(n % i == 0){
        System.out.println("Not Prime");
        break;    
        }
       } */
        /*while (b != 0) {                                                  // GCD By Euclidean
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);*/
    /* int n = 40;                                                             // All Primes Till 40 Optimize ( Sieve Of Eratosthenes)
        boolean chk[] = new boolean[n+1];
        sieve( n, chk);
        for(int i = 2; i < chk.length ; i++){
            if(!chk[i])
            System.out.println(i + " is Prime ");
        } */
    /* int n = 8;                                                              // Sqrt
        for(int i = 1; i <= n ; i++){
            if(i*i >= n){
                System.out.println(i);
                break;
            }

        } */
    /* int start = 1;
       for( int end = n; start < end ;){

            int mid = start + end >>> 1;
            int potAns = mid*mid;
            
            if(potAns == n){
            System.out.println(mid);
            break;
            }
            else if(potAns < n ){
                start = mid+1;
            }else{
                end = mid;
            }
       }
       System.out.println(start); */
    /* int n = 8;                                                              // Sqrt Precision
    int p = 3;
    System.out.printf("%.3f",sqrtPre(n, 10));
    System.out.println(sqrtPre(n, 10)); */
    /* int n = 8;                                                              // Sqrt Newton Raphson
    System.out.println(newtonRaph(n)); */
    /* int k = 20;                                                             // Factor O(N)
    for(int i = 1 ; i <= 20 ; i++){
        if(k % i == 0)
        System.out.println("Its A Factor " + i);
    } */
    /* int k = 36;                                                             // Factor O(Math.sqrt(n))
    for(int i = 1 ; i <= (int)Math.sqrt(k) ; i++){
        if(k % i == 0){
            if(k/i == i)                // For 6 
            System.out.println(i);
            else
            System.out.println(i + " " + k/i);
        }

    } */
    /* int a = 20;                                                             // Common Factor
    int b = 10;
    for(int i = 1; i <= a ; i++){
        if(a%i == 0 && b%i == 0)
        System.out.println(i);
    } */
    /* int aa = 224;                                                           // Highest Common Fator
    int bb = 105;
    int c = 0;
    for(int i = aa ; i >= 1; i--){
        if(aa % i == 0 && bb % i == 0){
            System.out.println(i);
            break;
        }else c++;
    }
    System.out.println(c); */
    /* int a = 224;                                                            // HCF?GCD BY EUCLIDEAN TH --> gcd(a,b) == gcd(a-b , b) where a>b and when at last is zero the other is gcd
    int b = 105;
    int k = a%b;
    int count = 0;
    for(int i = b ; b >= 1 ; i--){
        if(k%i == 0 && b%i == 0){
            System.out.println(i);
            break;
        }else
        count++;
    }
    System.out.println(count); */
    /* int a = 224;                                                            // GCD by Recursion
       int b = 105;
       System.out.println(gcd(a, b)); */
    /* int a = 17 , b = 19;                                                    // LCM --> Least Number That Divides Both A & B --> a*b/gcd
    int k = gcd(a, b);
    System.out.println((a*b) / k); */
    /* int n = 1989;                                                           // Super Digit (Sum Of All Number Recursion until num becomes < 10) O(LogN)
    // 1 + 9 + 8 + 9 = 27 
    // 2 + 7 == 9
    System.out.println(superDigit(n));         */
    /* int num = 9;                                                            // Super Digit O(1)
    System.out.printf(  "%d", (num % 9 != 0) ? num % 9 : (num != 0 ? 9 : 0));
    System.out.println();
    System.out.println(superDigit(num)); */
    /* int a = 3;                                                              // Swap Tricks
    int b = 5;
    a  = a+b - (b=a);
    System.out.println(a);
    System.out.println(b); */
    /* int count = 0;                                                          // Unique Prime Factors
        Set<Integer> s1 = new HashSet<>();

        int n = 104;

        if(n%2 == 0){

            count++;
            s1.add(2);
            while(n%2==0)
            n /= 2;

        }

        for(int i = 3; i*i <= n ; i+=2){

            if(n%i == 0){
                s1.add(i);
                count++;
                while(n%i == 0){
                    n /= i;
                }
            }
        }
        if(n > 0){
            count++;
            s1.add(n);
        }

        System.out.println(s1);
        System.out.println(count);         */
    
    
}
    static void sieve(int n ,boolean  primes[]){

        for(int i = 2 ; i*i <= n ; i++){
            if(!primes[i]){
                for(int j = 2*i ; j <= n ; j+= i){
                    primes[j] = true;
                }
            }
        }
        
    }
    static double sqrtPre(int n  , int p){

        int start = 1;
        int end = n;

        while(start <= end){

            int mid = start + end >>> 1;
            
            if(mid * mid == n){
                return mid;
            }else if(mid * mid < n){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        double incr = 0.1;
        double root = end + incr;

        for(int i = 0; i < p ; i++){

            while(root * root < n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
    static double newtonRaph(int n){

        // root = (x + n/x) /2

        double x = n;
        double root = 0;

        while(true){

            root = 0.5 * (x+n/x);

            if(Math.abs(root - x) < 0.01){
                return x; 
            }
            x = root;

        }
    }
    static int gcd(int a , int b){

        if(a == 0)
        return b;

        return  gcd(b%a, a);
    }
    public static int superDigit(int n) {
        // Base case: If n is a single-digit number, return it
        if (n < 10) {
            return n;
        }

        // Sum of digits
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Extract last digit and add to sum
            n /= 10;       // Remove last digit
        }
        // Recursively compute super digit
        return superDigit(sum);
    }


}
