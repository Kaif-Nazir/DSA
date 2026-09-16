package TwoPointerAndSlidingWindow;


import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a , Integer b){
        int bitCountOfA = Integer.bitCount(a);
        int bitCountOfB = Integer.bitCount(b);

        if(bitCountOfA == bitCountOfB)
            return a-b;
        return bitCountOfA-bitCountOfB;

    }

}

public class TwoPointerSlidingWindow {

    public static void main(String[] args) {





    }



    /*

      public int countSpecialNumbers(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        Integer[][][][] dp = new Integer[len + 1][1 << 10][2][2];

        return dfs(0, 0, 1, 0, digits, dp);
    }

    private int dfs(int pos, int mask, int tight, int started, char[] digits, Integer[][][][] dp) {
        if (pos == digits.length)
            return started == 1 ? 1 : 0;

        if (dp[pos][mask][tight][started] != null)
            return dp[pos][mask][tight][started];

        int limit = tight == 1 ? digits[pos] - '0' : 9;
        int res = 0;

        for (int d = 0; d <= limit; d++) {
            int newTight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                res += dfs(pos + 1, mask, newTight, 0, digits, dp);
            } else {
                if ((mask & (1 << d)) == 0) {
                    res += dfs(pos + 1, mask | (1 << d), newTight, 1, digits, dp);
                }
            }
        }

        return dp[pos][mask][tight][started] = res;
    }

      */


    // Basic Constant Window

    /*public static int maxPointsFromCards(int cards[] , int k){

        int leftSum = 0;
        int rightSum = 0;

        int max = 0;

        for(int i = 0 ; i < k ; i++)
            leftSum += cards[i];

        max = leftSum;
        int rightInd = cards.length-1;
        for(int i = k-1 ; i >= 0 ; i--){
            leftSum -= cards[i];
            rightSum += cards[rightInd--];
            max = Math.max(max , leftSum + rightSum);
        }
    return max;
    }*/                                                               // MaxPointsFromCards         O(N)    (1)

    // Longest SubString

    /*static int lengthOfLongestSubstring(String str){


         Map<Character , Integer> indMap = new HashMap<>();
         int max = 0;
         int i = 0;
         int n = str.length();

         for(int j = 0 ; j < n ; j++){

            char currChar = str.charAt(j);

            if(indMap.containsKey(currChar)){
                if(indMap.get(currChar) >= i)
                    i = indMap.get(currChar)+1;
            }
            indMap.put(currChar , j);

            max = Math.max((j-i)+1 , max);
         }
    return max;
    }*/                                                               // LongestSubWithoutRepChar   O(N)        O(1)
    /*public int longestOnes(int[] nums, int k) {

        int max = 0;
        int n = nums.length;
        int zeroes = 0;
        int firP = 0;

        for(int secP = 0 ; secP < n ; secP++){

            int curr = nums[secP];

            if(curr == 0){
                zeroes++;
            }
            if(k < zeroes){
                if(nums[firP] == 0)
                    zeroes--;
                firP++;
            }
            else{
                max = Math.max(secP - firP + 1 , max);
            }
        }
        return max;
    }*/                                                               // MaxConsOnes III            O(N)        O(1)
    /*static int fruitsInBasket(int fruits[]){

        Map<Integer , Integer> freqMap = new HashMap<>();
        int ans = 0;
        int n = fruits.length;
        int firP = 0;


        for(int secP = 0 ; secP < n ; secP++){

           int currFruit = fruits[secP];

           freqMap.put(currFruit , freqMap.getOrDefault(currFruit , 0) + 1);

           if(freqMap.size() < 3){
               ans = Math.max(ans , secP - firP + 1);
           }
           else {
               int prevFruit = fruits[firP];
               freqMap.put(prevFruit , freqMap.get(prevFruit) - 1);
               if(freqMap.get(prevFruit) == 0)
                   freqMap.remove(prevFruit);
               firP++;
           }
        }
    return ans;
    }
*/                                                               // FruitBasket I              O(N)        O(1)
    /*public int numberOfSubstrings(String s) {
         int ans = 0;

        for(int i = 0 ; i < s.length() ; i++){
            Set<Character> s1 = new HashSet<>();
            for(int j = i ; j < s.length() ;j++){

                s1.add(s.charAt(j));

                if(s1.size() == 3){
                    ans++;
                    ans += s.length()-j-1;
                    break;
                }
            }
        }
    return ans;
    }*/                                                               // No.SubStrWithAll3Char      O(n^2)      O(1)
    /* public int numberOfSubstrings(String s) {

        int ans = 0;
        int charFreq[] = new int[3];

        int leftP  = 0;
        int rightP = 0;
        int n      = s.length();

        while(rightP < n){

            char curr = s.charAt(rightP);
            charFreq[curr-'a']++;

            while(charFreq[0] > 0 && charFreq[1] > 0 && charFreq[2] > 0){

                ans += n-rightP;

                char left = s.charAt(leftP);
                charFreq[left-'a']--;

                leftP++;
            }
            rightP++;
        }
    return ans;
    }*/                                                               // No.SubStrWithAll3Char      O(2n)       O(1)
    /*static public int numberOfSubstrings(String s) {
        int len = s.length();
        int[] lastPos = { -1, -1, -1 }; // for 'a', 'b', 'c'
        int total = 0;

        for (int pos = 0; pos < len; pos++) {

            lastPos[s.charAt(pos) - 'a'] = pos;

            // Only count once we’ve seen all three characters
            if (lastPos[0] != -1 && lastPos[1] != -1 && lastPos[2] != -1) {
                int minPos = Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
                total += 1 + minPos;
            }
        }

        return total;
    }*/                                                               // No.SubStrWithAll3Char      O(n)        O(1)
    /*public int characterReplacement(String s, int k) {

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int ans = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(curr));

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                maxFreq = 0;
                for(Character key : freqMap.keySet())
                        maxFreq = Math.max(freqMap.get(key) , maxFreq);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }*/                                                               // LongRepeCharReplace        O(n+n)*k    O(n) k-> Distinct
    /*public int characterReplacement(String s, int k) {

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int ans = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(curr));

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }*/                                                               // LongRepeCharReplace        O(n+n)      O(n)
    /*public int characterReplacement(String s, int k) {

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int ans = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(curr));

            if((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }*/                                                               // LongRepeCharReplace        O(n)        O(n)

    /*public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }*/                                                               // CountSubArrWithSum K       O(N)         O(N)
    /*public int numSubarraysWithSum(int[] nums, int goal) {

        return subArrSum(nums , goal) - subArrSum(nums , goal-1);

    }
    static int subArrSum(int nums[] , int goal){

        if(goal < 0)
            return 0;

        int firP = 0;
        int count = 0;
        int n = nums.length;

        for(int secP = 0 , currSum = 0; secP < n ; secP++){

            currSum += nums[secP];

            while(firP <= secP && currSum > goal){
                currSum -= nums[firP];
                firP++;
            }
            count += (secP - firP + 1);
        }
        return count;
    }*/                                                               // CountSubArrWithSum Goal    O(2N)        O(1)
    /*public int numberOfSubarrays(int[] nums, int k) {

        return subArrSum(nums , k) - subArrSum(nums , k-1);

    }
    static int subArrSum(int nums[] , int goal){

        if(goal < 0)
            return 0;

        int firP = 0;
        int count = 0;
        int n = nums.length;

        for(int secP = 0 , currSum = 0; secP < n ; secP++){

            currSum += nums[secP]%2;

            while(firP <= secP && currSum > goal){
                currSum -= nums[firP]%2;
                firP++;
            }
            count += (secP - firP + 1);
        }
        return count;
    }*/                                                               // CountSubArrWithOddSum k    O(2N)        O(1)
    /*public int subarraysWithKDistinct(int[] nums, int k) {

        return subArrSum(nums , k) - subArrSum(nums , k-1);

    }
    static int subArrSum(int nums[] , int k){

        if(k < 0)
            return 0;

        int ans = 0;
        int firP = 0;
        Map<Integer , Integer > freqMap = new HashMap<>();

        for(int secP = 0; secP < nums.length ; secP++){

            freqMap.put(nums[secP], freqMap.getOrDefault(nums[secP], 0) + 1);
            while(!freqMap.isEmpty() && freqMap.size() > k){
                int prev = nums[firP];
                freqMap.put(prev , freqMap.get(prev)-1);
                if(freqMap.get(prev) == 0)
                    freqMap.remove(prev);
                firP++;
            }
            ans += (secP - firP + 1);
        }
        return ans;
    }*/                                                               // CountSubArrWithKFreq       O(2N)        O(n)
    /*public String minWindow(String s, String t) {

        int firLength = s.length();
        int secLength = t.length();

        Map<Character , Integer> freqMap = new HashMap<>();
        int counter = 0;

        for(char curr : t.toCharArray())
            freqMap.put(curr , freqMap.getOrDefault(curr , 0) + 1);

        int firP = 0;
        int secP = 0;
        int minFirP = (int)1e9;
        int minSecP = (int)1e9;
        int minSize = (int)1e9;


        while(secP < firLength){

            char curr = s.charAt(secP);

            if(freqMap.containsKey(curr) && freqMap.get(curr) > 0){
                counter++;
            }
            freqMap.put(curr , freqMap.getOrDefault(curr , 0) - 1);

            while(counter == secLength){
                if(minSize > (secP - firP + 1)){
                    minFirP = firP;
                    minSecP = secP;
                    minSize = secP - firP + 1;
                }
                char prev = s.charAt(firP);
                freqMap.put(prev , freqMap.get(prev) + 1);
                if(freqMap.get(prev) > 0)
                    counter--;

                firP++;
            }
            secP++;
        }
        if(minSize != (int)(1e9)){
            return s.substring(minFirP , minSecP+1);
        }
        return "";
    }*/                                                               // Minimum Window Substring   O(2N)        O(n)

}
