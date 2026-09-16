import java.util.Arrays;
import java.util.HashSet;

public class bit {
    public static void main(String[] args) {
        
        /* System.out.println(0&0);   0                                                // For & Operator Anynone False;
        System.out.println(1&0);      0
        System.out.println(0&1);      0
        System.out.println(1&1);      1    */
        /* System.out.println(0|0);   0                                                // For | Operator Anyone True
        System.out.println(1|0);      1
        System.out.println(0|1);      1
        System.out.println(1|1);      1  */
        /* System.out.println(~5);     //-6                                            // For ~ Operator Complement
        System.out.println(~7); */       //-8                                            //    ~x = -(x + 1)
        /* System.out.println(0^0);    // 0                                            // For ^ Operator Only One False or Only One True (ExOr)
        System.out.println(1^0);       // 1   
        System.out.println(0^1);       // 1
        System.out.println(1^1);       // 0 */
        // Observation
        /* int a = 100;
        System.out.println(a^1);           // ~a Complement If Even Increase If Odd Decrese
        System.out.println(a^0);           // a
        System.out.println(a^a);           // 0 */
        /* System.out.println(10 << 1);                                                // For Shift Operator 
        System.out.println(10 >> 1); */                                                // << Multiply By 2  , >> Divide By 2
        /* for(int i = 0 ; i <= 10 ; i++){                                             // Even using &
            if((i & 1) == 0)
            System.out.println(i);
        } */
        /* for(int i  = 0 ; i <= 10 ; i++){                                            // Even Using Integer.numberOfTrailingZeros(i)
            if(Integer.numberOfTrailingZeros(i) != 0){
                System.out.print(i + " ");
            }
        } */
        /* int nums[] = {2,3,4,1,2,1,3,6,4};                                           // Single Occurence Of Number
        int unique = 0;
        for(int i : nums){
            
            unique ^= i;
        }
        System.out.println(unique); */
        /* int i = 0b10110110;                                                         // Find Bit  
        int k = 5;
        System.out.println((1 & (i >> (k-1)))); */
        /* int i = 0b10110110;                                                         // Set Bit   (Set to 1)          
        int k = 4; 
        // Create a bitmask where only the k-th bit is 1
        int bitmask = i << (k - 1);
        // Use bitwise OR to set the k-th bit in i to 1
        i = i | bitmask;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));  */
        /* int i = 0b10110110;                                                         // Reset Bit (Set to 0)
        int n = 5;
        System.out.println((0 & (i >> (n-1)) )); */
        /* int i = 6;                                                                  // Magic Number
        // 1 1 0 Multiply By index to Power 5
        // 1 * 5 Power 3 , 1 * 5 Power 2 , 1 * Power 1
        // 125 + 25 = 150 
        int base = 5;
        int ans = 0;
        while( i > 0 ){

            int last = i & 1;
            i >>= 1;
            // System.out.print(i + " ");
            ans += last * base;
            base *= 5;
        }
        System.out.println(ans); */
        /* int i = 10;                                                                 // Bit Count Including Trailing Zeroes
        System.out.println((int)(Math.log(i) / Math.log(2) + 1));
        System.out.println((int)(Math.log10(i) + 1));
        System.out.println((int)(Math.log(i) / Math.log(10) + 1)); */
        /* int n = 6;                                                                  // Sum Of Nth row Of Pascal Triangle 
    //    System.out.println(Math.pow(2, n));
    // int ans = 2;    
    // for(int i = 1; i < n ; i++){
    //     ans *= 2;
    // }
    // System.out.println(ans);
       // System.out.println(1<<(n-1));       // 1 * 2 Pow (n-1) */
        /* // int powOf2 =  -32;                                                       // Check If Number Is Pow Of 2
        // Always Has One Set Bit
        // System.out.println( Integer.bitCount(powOf2) == 1 ?  "True" : "False"); 
        // System.out.println((powOf2 & (powOf2-1)) == 0 ?  "True" : "False");
        // System.out.println(Integer.bitCount(powOf2)); */
        /* double base = 3.0;                                                          // Math.Pow
        int pow = 6;
        
        if(pow < 0){
            pow *= -1;
            base = 1 / base;
        }
        
        double ans = 1;
        
        while(pow != 0){
            if((pow & 1) != 0){
                ans *= base;
            } 
            base *= base;
            pow >>= 1;
        }
        System.out.println(ans);
    } */
        /* int n  = 7;                                                                 // Count Of Set Bit
        // int count = 0;
        // for(int i = 0 ; i < 32 ; i++){

        //     if((n & 1) == 1){ 
        //         count++;
        //     }
        //     System.out.print(n + " ");
        //     n >>=  1;
        // }
        // System.out.println(count);
        int count = 0;
        while(n > 0){
            count++;
            n &= (n-1);                                                                // Take Least Significant Bit and Remove It
        }
        System.out.println(count); */
        /* int n  = 6;                                                                 // XOR At ith place from 0
        // int ans = 0;
        // for(int i = 1 ; i <= 10 ; i++){
        //     System.out.println(i-1+" th XOR is --> " +  ans );
        //     ans ^= i;
        // }
        int mod = n%4;
        switch (mod){
            case 0 :
            System.out.println(n);
            break;
            case 1 :
            System.out.println(1);
            break;
            case 2 :
            System.out.println(n+1);
            break;
            default :
            System.out.println(0);
        } */
        /* int start = 3;                                                              // XOR From Range
        int end = 9;
        int xor = 0;
        // for(int i = 1; i <= end ; i++){
        //     xor ^= i;
        // }
        // for(int i = 1 ; i < start ; i++){
        //     xor ^= i;
        // }
        // System.out.println(xor);
        
        System.out.println(xor(end) ^ xor(start-1)); */
        /* String s = "1";
        int k = 6;
        System.out.println(Integer.toBinaryString(Integer.parseInt(s)));
        System.out.println(s + k);
        s = String.format("%5s", s).replace(' ','0');
        System.out.println(s);
        s = String.format("%3s", s).replace(' ', '0');
        System.out.println(s); */
        /* int msb = 0,n = 10, temp = 1;                                                       // Toggle All Bits
        

        while (temp <= n) {
            n = n ^ temp;  // Toggle the bit
            temp = temp << 1; // Move to the next bit
        }
        System.out.println(n); */
    
        int k = 1;
        System.out.println(k&(k-1));
    }
    static int xor (int end){
        int mod = end%4;
        switch (mod){
            case 0 :
            mod = end;
            break;
            case 1 :
            mod = 1;
            break;
            case 2 :
            mod = end+1;
            break;
            default :
            mod = 0;
        }
        return mod;
    }
}
