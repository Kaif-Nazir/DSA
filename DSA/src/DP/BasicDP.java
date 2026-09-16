import java.util.*;


public class BasicDP {

    public static void deepToString(int arr[][]) {
        for (int row[] : arr) {
            System.out.print("[");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("]");
        }
    }

    public static void deepToString(boolean arr[][]) {
        for (boolean row[] : arr) {
            System.out.print("[");
            for (boolean col : row) {
                System.out.print(col + " ");
            }
            System.out.println("]");
        }
    }


    public static void main(String[] args) {

        /*int prices[] = new int[]{1,2,4,3,5};
        int n = prices.length;
        System.out.println(findNumberOfLIS(prices));*/





    }



    /*public static int findSmallestInteger(int[] nums, int value) {
        int[] mp = new int[value];
        for (int x : nums) {
            int v = ((x % value) + value) % value;
            mp[v]++;
        }
        int mex = 0;
         System.out.println(Arrays.toString(mp));
        while (mp[mex % value] > 0) {
            System.out.print(mp[mex%value] + " ");
            mp[mex % value]--;
            mex++;
        }
        System.out.println();
        return mex;
    }*/

//    1D

    /* static int dp(int n , int dpArr[]){                                  // Fibonacci    O(N) Memonization O(N+N)

        if(n < 2){
            return n;
        }
        if(dpArr[n] != -1){
            return dpArr[n];
        }
        return dpArr[n] = dp(n-1 , dpArr ) + dp(n-2, dpArr);
        // return dpArr[n];

    } */                                                               // Fibonacci    O(N) Memonization O(N+N)
    /* static int FiboTabu(int n){                                          // Fibonacci    O(N) Tabulation   O(N)

        int dp[] = new int [n+1];
        dp[1] = 1;

        for(int i = 2 ; i <= n ; i++){

            dp[i]  = dp[i-1]+dp[i-2];

        }
        return dp[n];
    } */                                                               // Fibonacci    O(N) Tabulation   O(N)
    /* static int FiboCal(int n ){                                          // Fibonacci    O(N) Calualtion   O(1)

        int a = 0 , b = 1 , ans = 1;
        for(int i = 3 ; i <= n; i++){

            a = b;
            b = ans;
            ans = a+b;

        }
        return ans;
    } */                                                               // Fibonacci    O(N) Calualtion   O(1)
    /* static int frogJump(int[] jump, int n) {                             // Frog jump    O(2^N)
    // base case: at last stone
    if (n == jump.length - 1) return 0;

    // if out of bounds
    if (n >= jump.length) return Integer.MAX_VALUE;

    // take 1 step
    int oneStep = Math.abs(jump[n] - jump[n+1]) + frogJump(jump, n+1);

    // take 2 steps
    int twoStep = Integer.MAX_VALUE;
    if (n + 2 < jump.length)
        twoStep = Math.abs(jump[n] - jump[n+2]) + frogJump(jump, n+2);

    // return min of both options
    return Math.min(oneStep, twoStep);
   } */                                                               // Frog jump    O(2^N)
    /* static int frogJumpMemo(int[] jump, int n, int[] dp) {               // Frog Jump    O(N) Memo O(N+N)
    // base case: already at last stone
    if (n == jump.length - 1) return 0;

    // already computed
    if (dp[n] != -1) return dp[n];

    // take 1 step
    int oneStep = Math.abs(jump[n] - jump[n+1]) + frogJumpMemo(jump, n+1, dp);

    // take 2 steps if possible
    int twoStep = Integer.MAX_VALUE;
    if (n + 2 < jump.length)
        twoStep = Math.abs(jump[n] - jump[n+2]) + frogJumpMemo(jump, n+2, dp);

     // store the result
    return dp[n] = Math.min(oneStep, twoStep);
    } */                                                               // Frog Jump    O(N) Memo O(N+N)
    /* static int frogJumpTab(int [] jump ){                                // Frog Jump    O(N) Tabulation O(N)

        int dp[] = new int[jump.length];

        for(int i = 1; i < jump.length; i++){

            int one = dp[i-1] + Math.abs(jump[i] - jump[i-1]);
            int two = Integer.MAX_VALUE;
            if(i > 1)
            two = dp[i-2] + Math.abs(jump[i] - jump[i-2]);
            dp[i] = Math.min(one, two);

        }
        System.out.println(Arrays.toString(dp));
    return dp[jump.length-1];
    } */                                                               // Frog Jump    O(N) Tabulation O(N)
    /* static int frogJumpTab(int [] jump ){                                // Frog Jump    O(N) O(1)

        int prev = 0;
        int prev2 = 0;

        for(int i = 1; i < jump.length; i++){

            int one = prev + Math.abs(jump[i] - jump[i-1]);
            int two = Integer.MAX_VALUE;
            if(i > 1)
            two = prev2 + Math.abs(jump[i] - jump[i-2]);

            int currI = Math.min(one, two);
            prev2 = prev;
            prev = currI;

        }
    return prev;
    } */                                                               // Frog Jump    O(N) O(1)
    /* static int countMaxSumOfSubSeqRecur(                                 // AdjMaxSubSeq O(2^N)
    ArrayList<Integer> nums , int ind){


        if(ind == nums.size()-1){
            return nums.get(nums.size()-1);
        }

        if(ind >= nums.size()){
            return 0;
        }

        int pick = nums.get(ind) + countMaxSumOfSubSeqRecur(nums, ind+2);
        int notPick = countMaxSumOfSubSeqRecur(nums, ind+1);

        return Math.max(pick , notPick);

    } */                                                               // AdjMaxSubSeq O(2^N)
    /* static int countMaxSumOfSubSeq(                                      // AdjMaxSubSeq O(N) Memo
    ArrayList<Integer> nums ,
    int ind ,
    int[] dp){

    if(ind == nums.size()-1){
        return nums.get(nums.size()-1);
    }
    if(ind >= nums.size()){
        return 0;
    }

    if(dp[ind] != -1){
        return dp[ind];
    }

    // Include
    int pick = nums.get(ind) + countMaxSumOfSubSeq(nums , ind + 2 , dp);
    // Exclude
    int notPick = countMaxSumOfSubSeq(nums , ind+1 , dp);

    dp[ind] = Math.max(pick , notPick);
    return dp[ind];
    } */                                                               // AdjMaxSubSeq O(N) Memo
    /* static int countMaxSumOfSubSeq(                                      // AdjMaxSubSeq O(N) Tabu
		ArrayList<Integer> nums){

			int dp[] = new int [nums.size()+1];
			dp[0] = nums.get(0);
			int max = 0;

			for(int i = 1; i < nums.size() ; i++ ){


				int pick = nums.get(i);
				if(i > 1)
				pick = dp[i-2] + nums.get(i);
				int notPick = dp[i-1];

				dp[i] = Math.max(pick , notPick);

			}
		return dp[nums.size()-1];
	} */                                                               // AdjMaxSubSeq O(N) Tabu
    /*static int deleteAndEarn(int[] numsFreq , int ind ) {

//        int arr[] = {2,5,7,2};
//        int max = Arrays.stream(arr).max().getAsInt();
//        int freq[] = new int[max+1];
//        for(int n : arr)
//            freq[n]+=n;
//        System.out.println(Arrays.toString(freq));
//        System.out.println(deleteAndEarn(freq , max));


        if(ind <= 0)
            return 0;
        if(ind == 1)
            return numsFreq[1];

        int notPick = deleteAndEarn(numsFreq , ind-1);
        int pick = numsFreq[ind] + deleteAndEarn(numsFreq , ind-2);

        return Math.max(pick , notPick);
    }*/                                                               // DeleteAndEarn Recur TC (2^n) SC (n)     -> N depends on max
    /*static  int deleteAndEarn(int freq[] , int ind , int dp[]){

        if(ind <= 0)
            return 0;
        if(ind == 1)
            return freq[1];

        if(dp[ind] != -1)
            return dp[ind];

        int notPick = deleteAndEarn(freq , ind-1 , dp);
        int pick = freq[ind] + deleteAndEarn(freq , ind-2 , dp);

        return dp[ind] = Math.max(pick , notPick);

    }*/                                                               // DeleteAndEarn Memo  TC (n+k) SC (n + k) -> K is max
    /*static int deleteAndEarn(int nums[]){

        int n = nums.length;

        int max = Arrays.stream(nums).max().getAsInt();
        int freq[] = new int[max+1];
        for(int num : nums)
            freq[num] += num;

        List<Integer> distinct = new ArrayList<>();

        for(int i = 0 ; i < max+1 ; i++){
            if(freq[i] != 0)
                distinct.add(i);
        }
        int dp[] = new int[distinct.size()];
        dp[0] = freq[distinct.get(0)];
        System.out.println(distinct);
        for(int i = 1; i < distinct.size() ; i++){

            int notPick = dp[i-1];
            int pick = 0;
            if(distinct.get(i-1)+1 != distinct.get(i)){
                pick = freq[distinct.get(i)] + dp[i-1];
            }
            else if(i-2 >= 0 && distinct.get(i-2)+1 != distinct.get(i)){
                pick = freq[distinct.get(i)] + dp[i-2];
            }
            else
                pick = freq[distinct.get(i)];

            dp[i] = Math.max(pick , notPick);
        }
    return dp[distinct.size() - 1];
    }*/                                                               // DeleteAndEarn Tab   TC (n+k)   SC (k)   -> N is max
    /*static int deleteAndEarn(int nums[]){

        int n = nums.length;

        int max = Arrays.stream(nums).max().getAsInt();
        int freq[] = new int[max+1];
        for(int num : nums)
            freq[num] += num;

        List<Integer> distinct = new ArrayList<>();

        for(int i = 0 ; i < max+1 ; i++){
            if(freq[i] != 0)
                distinct.add(i);
        }
        int prev1 = freq[distinct.get(0)];
        int prev2 = -1;
        for(int i = 1; i < distinct.size() ; i++){

            int notPick = prev1;
            int pick = 0;
            if(distinct.get(i-1)+1 != distinct.get(i)){
                pick = freq[distinct.get(i)] + prev1;
            }
            else if(i-2 >= 0 && distinct.get(i-2)+1 != distinct.get(i)){
                pick = freq[distinct.get(i)] + prev2;
            }
            else
                pick = freq[distinct.get(i)];

            prev2 = prev1;
            prev1 = Math.max(pick , notPick);
        }
    return prev1;
    }*/                                                               // DeleteAndEarn Space TC (n+k)   SC (1)   -> N is max

//    2D

    /*static int ninja(int points[][] , int prevDay , int day ){

        if(day < 0) {
            return 0;
        }

        int max = 0;

        for(int task = 0 ; task < 3 ; task++ ){

            int currP = points[day][task] + ninja(points , task ,day-1);
            max = Math.max(max , currP);
        }
        return max;
    }*/                                                               // Ninja Training     Rec    TC (3^n)      SC (n)
    /*static int ninja(int points[][] , int prevDay , int day , int dp[][]){

        if(day < 0) {
            return 0;
        }

        if(dp[day][prevDay] != -1)
            return dp[day][prevDay];

        int max = 0;

        for(int task = 0 ; task < 3 ; task++ ){

            if(prevDay != task) {
                int currP = points[day][task] + ninja(points, task, day - 1, dp);
                max = Math.max(max, currP);
            }
        }
        return dp[day][prevDay] = max;
    }*/                                                               // Ninja Training     Mem    TC (n)        SC (n+M)
    /*static int ninja(int points[][] , int last , int n , int ind){

        int dp[][] = new int[n][4];

        dp[0][0] = Math.max(points[0][1] , points[0][2]);
        dp[0][1] = Math.max(points[0][0] , points[0][2]);
        dp[0][2] = Math.max(points[0][0] , points[0][1]);
        dp[0][3] = Math.max(dp[0][0] , points[0][0]);


        for(int day = 1 ; day < n ; day++) {
            for(int prevDay = 0 ; prevDay < 4 ; prevDay++){
                int max = 0;
                for(int task = 0 ; task < 3 ; task++){
                    if(task != prevDay){
                        int currMax = points[day][task] + dp[day-1][task];
                        max = Math.max(max , currMax);
                    }
                }
                dp[day][prevDay] = max;
            }
        }
    return dp[n-1][3];
    }*/                                                               // Ninja Training     Tab    TC (n)        SC (n)
    /*static int ninja(int points[][]){

        int arr[] = new int[4];
        int n = points.length;

        arr[0] = Math.max(points[0][1] , points[0][2]);
        arr[1] = Math.max(points[0][0] , points[0][2]);
        arr[2] = Math.max(points[0][0] , points[0][1]);
        arr[3] = Math.max(arr[0] , points[0][0]);


        for(int day = 1 ; day < n ; day++) {
            int temp[] = new int[4];
            for(int prevDay = 0 ; prevDay < 4 ; prevDay++){
                int max = 0;
                for(int task = 0 ; task < 3 ; task++){
                    if(task != prevDay){
                        int currMax = points[day][task] + arr[task];
                        max = Math.max(max , currMax);
                    }
                }
                temp[prevDay] = max;
            }
            arr = temp;
        }
    return arr[3];
    }*/                                                               // Ninja Training     Spa    TC (n)        SC (4)
    /*static int calUniquePaths(int row , int col , int rowPointer , int colPointer, String path){

        // Base case: reached destination
        if(rowPointer == row-1 && colPointer == col-1){
            System.out.println("Path: " + path);  // print the path taken
            return 1;
        }

        int right = 0, down = 0;

        // Move right
        if(colPointer < col-1){
            right = calUniquePaths(row , col , rowPointer , colPointer+1, path + "R");
        }

        // Move down
        if(rowPointer < row-1){
            down = calUniquePaths(row , col , rowPointer+1 , colPointer, path + "D");
        }

        return right + down;
    }*/                                                               // Unique Paths       Rec    TC (2^(m+n))  SC (m-1)+(n-1)
    /*static int calUniquePaths(int row , int col , int rowPointer , int colPointer , int dp[][]){

        // Base case: reached destination
        if(rowPointer == row-1 && colPointer == col-1){
            return 1;
        }

        if(dp[rowPointer][colPointer] != -1){
            return dp[rowPointer][colPointer];
        }

        int right = 0, down = 0;

        // Move right
        if(colPointer < col-1){
            right = calUniquePaths(row , col , rowPointer , colPointer+1 , dp);
        }

        // Move down
        if(rowPointer < row-1){
            down = calUniquePaths(row , col , rowPointer+1 , colPointer , dp);
        }
        return dp[rowPointer][colPointer] = (right + down);
    }*/                                                               // Unique Paths       Mem    TC (m*n)      SC (m*n + m+n)
    /*static int calUniquePaths(int row , int col , int rowPointer , int colPointer) {

        int dp[][] = new int[row][col];

        for(int i = row-1 ; i >= 0 ; i--){
            for(int j = col-1 ; j >= 0; j--){

                    if(i == row-1 && j == col-1)
                        dp[i][j] = 1;
                    else{
                        int right = 0 , bottom = 0;

                        if(i < row-1)
                            right = dp[i+1][j];
                        if(j < col-1)
                            bottom = dp[i][j+1];
                        dp[i][j] = right+bottom;
                    }
                    System.out.println(Arrays.deepToString(dp));
            }
        }
    return dp[0][0];
    }*/                                                               // Unique Paths       Tab    TC (m*n)      SC (row+col)
    /*static int calUniquePaths(int row , int col ){

        int prevRowDp[] = new int[col];
        int ans = 0;
        Arrays.fill(prevRowDp , 1);

        for(int i = 1 ; i < row ; i++){
            int prevColDp[] = new int[col];
            prevColDp[0] = 1;

            for(int j = 1 ; j < col ; j++){
                prevColDp[j] = prevColDp[j-1] + prevRowDp[j];
            }
            prevRowDp = prevColDp;
        }
    return prevRowDp[col-1];
        }*/                                                               // Unique Paths       Spa    TC (m*n)      SC (2col)
    /*static int calUniquePaths(int row , int col ){

        int prevRowDp[] = new int[col];
        int ans = 0;
        Arrays.fill(prevRowDp , 1);


        for(int i = 1 ; i < row ; i++){
            for(int j = 1 ; j < col ; j++){
                prevRowDp[j] = prevRowDp[j-1] + prevRowDp[j];
            }
            prevRowDp = prevColDp;
        }
    return prevRowDp[col-1];
    }                                                               // Unique Paths Tab O(m*n) Space O(2*col)*/                                                               // Unique Paths       Spa    TC (m*n)      SC (col)
    /*static int uniquePathsWithObstacles(int maze[][] , int row , int col , int rowPointer , int colPointer){


        if(rowPointer == row - 1 && colPointer == col - 1)
            return 1;

        if(rowPointer == row || colPointer == col)
            return 0;

        if(maze[rowPointer][colPointer] == -1)
            return 0;


        int right = uniquePathsWithObstacles(maze , row , col , rowPointer , colPointer+1);
        int bottom = uniquePathsWithObstacles(maze , row , col , rowPointer+1 , colPointer);

        return  right + bottom;

    }*/                                                               // Unique Paths Obs   Rec    TC (2^m+n)    SC (n)
    /*static int uniquePathsWithObstacles(int maze[][] , int row , int col , int rowPointer , int colPointer , int dp[][]){

        if(rowPointer == row-1 && colPointer == col-1)
            return 1;

        if(rowPointer >= row || colPointer >= col)
            return 0;

        if(dp[rowPointer][colPointer] != -1)
            return dp[rowPointer][colPointer];

        if(maze[rowPointer][colPointer] == -1)
            return 0;


        int right = 0 , bottom = 0;

        right = uniquePathsWithObstacles(maze , row , col , rowPointer , colPointer+1 , dp);
        bottom = uniquePathsWithObstacles(maze , row , col , rowPointer+1 , colPointer , dp);
        return dp[rowPointer][colPointer] = right+bottom;
    }*/                                                               // Unique Paths Obs   Mem    TC (m*n)      SC (m*n + m+n)
    /*static int uniquePathsWithObstacles(int maze [][] , int row , int col){

        int dp[][] = new int[row][col];

        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){

                    if(maze[i][j] == -1)
                        continue;

                    int right = 0 , bottom = 0;

                    if(i == 0 && j == 0){
                        dp[i][j] = 1;
                        continue;
                    }

                    if(j > 0)
                        right = dp[i][j-1];
                    if(i > 0)
                        bottom = dp[i-1][j];

                    dp[i][j] = right+bottom;
            }
        }
    return dp[row-1][col-1];
        }*/                                                               // Unique Paths Obs   Tab    TC (m*n)      SC (row+col)
    /*static int uniquePathsWithObstacles(int maze[][] , int row , int col){

        int dp[] = new int[col];
        dp[0] = 1;

        if(maze[0][0] == -1 || maze[row-1][col-1] == -1)
            return 0;

        for(int i = 0 ; i < row ;i++){
            for (int j = 0; j < col ; j++){

                if(maze[i][j] == -1){
                    dp[j] = 0;
                    continue;
                }

                if(j-1 >= 0)
                    dp[j] = dp[j] + dp[j-1];

            }
        }
    return dp[col-1];
        }*/                                                               // Unique Paths Obs   Spa    TC (m*n)      SC (col)

// SubSeq

    /*static boolean subSeqSumToTar(int arr[], int ind, int tar, String str) {

        if (tar == 0) {
            System.out.println(str);
            return true; // Found one subsequence
        }

        if (ind == arr.length-1) {
            return arr[arr.length-1] == tar;
        }

        // Try picking current element
        boolean pick = false;
            if(tar-arr[ind] >= 0)
                pick = subSeqSumToTar(arr, ind + 1, tar - arr[ind], str + " " + arr[ind]);

        if(pick)
            return true;

        boolean notPick = subSeqSumToTar(arr, ind + 1, tar, str);

        if(notPick)
            return true;

        return false;
}*/                                                               // SubSeqSumToTar      Rec    TC(2^n) SC(n)
    /*static boolean subSeqSumToTar(int arr[], int ind, int tar, String str , Boolean dp[][]) {

        if (tar == 0) {
            System.out.println(str);
            return true; // Found one subsequence
        }

        if (ind == arr.length-1) {
            return arr[arr.length-1] == tar;
        }

        if(dp[ind][tar] != null){
            return dp[ind][tar];
        }

        boolean pick = false;
            if(tar - arr[ind] >= 0)
                pick = subSeqSumToTar(arr, ind + 1, tar - arr[ind], str + " " + arr[ind] , dp);

        if(pick){
            return dp[ind][tar] = true;
        }

        boolean notPick = subSeqSumToTar(arr, ind + 1, tar, str , dp);
        if(notPick) {
            return dp[ind][tar] = true;
        }

        return dp[ind][tar] = false;

    }*/                                                               // SubSeqSumToTar      Mem    TC(n*tar) SC(n*tar + n)
    /*static boolean subSeqSumToTar(int arr[], int tar) {
        int n = arr.length;
        boolean dp[][] = new boolean[n][tar+1];

        for(int i = 0 ; i < n ; i++)
            dp[i][0] = true;

        if (arr[0] <= tar) dp[0][arr[0]] = true;

        for(int i = 1 ; i < n ; i++) {
            for(int target = 1 ; target <= tar ; target++){

                boolean notTake = dp[i-1][target];
                boolean take = false;
                if(target-arr[i] >= 0)
                    take = dp[i-1][target-arr[i]];

                dp[i][target] = take || notTake;
            }
        }
        return dp[n-1][tar];
    }*/                                                               // SubSeqSumToTar      Tab    TC(n*tar) SC(n*tar)
    /*static boolean subSeqSumToTar(int arr[] , int tar){

        int n = arr.length;
        boolean dp[] = new boolean[tar+1];
        dp[0] = true;

        if(arr[0] <= tar)
            dp[arr[0]] = true;

        for(int i = 1; i < n ; i++){
            boolean temp[] = new boolean[tar+1];
            for(int target = 1; target <= tar ; target++){

                boolean notPick = dp[target];
                boolean pick = false;

                if(target - arr[i] >= 0){
                    pick = dp[target-arr[i]];
                }
                temp[target] = pick || notPick;
                }
                dp = temp;
            }
    return dp[tar];
    }*/                                                               // SubSeqSumToTar      Spa    TC(n*tar) SC(tar)
    /*static int countSubSeqWithSumK(int arr[] , int tar , int ind){

        if(tar == 0)
            return 1;

        if(ind == arr.length-1){
            return tar == arr[ind] ? 1 : 0;
        }

        int take = countSubSeqWithSumK(arr , tar - arr[ind] , ind+1);
        int notTake = countSubSeqWithSumK(arr , tar , ind+1);

        return take + notTake;

    }*/                                                               // CountSubSeqWithSumK Rec    TC(2^n)     SC(n)
    /*static int countSubSeqWithSumK(int arr[] , int tar , int ind , int dp[][]){

         if(tar == 0)
            return 1;

        if(ind == arr.length-1){
            return tar == arr[ind] ? 1 : 0;
        }

        if(dp[ind][tar] != -1){
            return dp[ind][tar];
        }

        int take = 0;

        if(tar >= arr[ind])
           take =  countSubSeqWithSumK(arr , tar - arr[ind] , ind+1 , dp);

        int notTake = countSubSeqWithSumK(arr , tar , ind+1 , dp);

        return dp[ind][tar] = take + notTake;

    }*/                                                               // CountSubSeqWithSumK Mem    TC(n*sum)   SC(n*sum + n)
    /*static int countSubSeqWithSumK(int arr[] , int k){

        int n = arr.length;
        int dp[][] = new int[n][k+1];

        for(int i = 0 ; i < n ; i++)
            dp[i][0] = 1;

        if(arr[0] <= k)
            dp[0][arr[0]] = 1;

        for(int i = 1 ; i < n ; i++){
            for(int sum = 1; sum <= k ; sum++){

                int notPick = dp[i-1][sum];
                int pick = 0;

                if(sum - arr[i] >= 0){
                    pick = dp[i-1][sum-arr[i]];
                }
                dp[i][sum] = pick + notPick;
            }
        }
        deepToString(dp);
    return dp[n-1][k];
    }*/                                                               // CountSubSeqWithSumK Tab    TC(n*sum)   SC(n*sum)
    /*static int countSubSeqWithSumK(int arr[] , int k){

        int n = arr.length;
        int dp[] = new int[k+1];

        dp[0] = 1;
        if(arr[0] <= k)
            dp[arr[0]] = 1;

        for(int i = 1 ; i < n ; i++){
            int temp[] = new int[k+1];
            for(int sum = 0; sum <= k ; sum++){

                int notPick = dp[sum];
                int pick = 0;

                if(sum - arr[i] >= 0){
                    pick = dp[sum-arr[i]];
                }
                temp[sum] = pick + notPick;
            }
            dp = temp;
        }
    return dp[k];
    }*/                                                               // CountSubSeqWithSumK Spa    TC(n*sum)   SC(sum)
    /*static int countPartitions(int n, int diff, int[] arr , int ind , int sum , int totalSum) {

        if(ind == n){
            int s1 = sum;
            int s2 = totalSum - sum;

            if(s1 >= s2 && s1-s2 == diff){
                return 1;
            }
            return 0;
        }

        int pick = countPartitions(n , diff , arr , ind+1 , sum + arr[ind] , totalSum);
        int notPick = countPartitions(n , diff , arr , ind+1 , sum , totalSum);

        return pick + notPick;

    }*/                                                               // CountPartitions     Rec    TC(2^n)     SC(n)
    /*static int countPartitions(int n, int diff, int[] arr , int ind , int sum , int totalSum , int dp[][]) {

        if(ind == n){
            int s1 = sum;
            int s2 = totalSum - sum;

            if(s1 >= s2 && s1-s2 == diff){
                return 1;
            }
            return 0;
        }

        if(dp[ind][sum] != -1)
            return dp[ind][sum];

        int pick = countPartitions(n , diff , arr , ind+1 , sum + arr[ind] , totalSum , dp);
        int notPick = countPartitions(n , diff , arr , ind+1 , sum , totalSum , dp);

        return dp[ind][sum] = pick + notPick;

    }*/                                                               // CountPartitions     Memo   TC(n^2)     SC(n*totalSum + n)
    /*static int countPartitions(int n, int diff, int[] arr , int totalSum) {

        if(totalSum - diff < 0 || (totalSum-diff) % 2 != 0 )
            return 0;

        int tarSum = (totalSum-diff) /2;

        int dp[][] = new int[n][tarSum+1];
        if(arr[0] == 0) dp[0][0] = 2;
        else dp[0][0] = 1;

        if(arr[0] != 0 && arr[0] <= tarSum)
            dp[0][arr[0]] = 1;

        for(int i = 1 ; i < n ; i++){
            for(int tar = 0 ; tar <= tarSum ; tar++){

                int notPick = dp[i-1][tar];
                int pick = 0;

                if(tar - arr[i] >= 0)
                    pick = dp[i-1][tar-arr[i]];

                dp[i][tar] = pick + notPick;
            }
        }
    return dp[n-1][tarSum];
    }*/                                                               // CountPartitions     Tab    TC(n^2)     SC(n*tarSum)
    /*static int countPartitions(int n, int diff, int[] arr , int totalSum) {

        if(totalSum - diff < 0 || (totalSum-diff) % 2 != 0 )
            return 0;

        int tarSum = (totalSum-diff) /2;

        int dp[] = new int[tarSum+1];
        if(arr[0] == 0) dp[0] = 2;
        else dp[0] = 1;

        if(arr[0] != 0 && arr[0] <= tarSum)
            dp[arr[0]] = 1;

        for(int i = 1 ; i < n ; i++){
            int temp[] = new int[tarSum+1];
            for(int tar = 0 ; tar <= tarSum ; tar++){

                int notPick = dp[tar];
                int pick = 0;

                if(tar - arr[i] >= 0)
                    pick = dp[tar-arr[i]];

                temp[tar] = pick + notPick;
            }
            dp = temp;
        }
    return dp[tarSum];
    }*/                                                               // CountPartitions     Space  TC(n^2)     SC(tarSum)
    /*static int knapSack01(int weight[] , int val [] , int maxWeight , int n , int ind){

        if(ind == n-1){
            if(weight[ind] <= maxWeight)
                return val[ind];
            return 0;
        }

        int notTake = knapSack01(weight , val , maxWeight , n , ind+1);
        int take = Integer.MIN_VALUE;
        if(weight[ind] <= maxWeight)
            take = val[ind] + knapSack01(weight , val , maxWeight-weight[ind] , n , ind+1);

        return Math.max(notTake , take);

    }*/                                                               // KnapSack 0 1        Recur  TC(2^n)     SC(n)
    /*static int knapSack01(int weight[] , int val [] , int maxWeight , int n , int ind , int dp[][]){

        if(ind == n-1){
            if(weight[ind] <= maxWeight)
                return val[ind];
            return 0;
        }

        if(dp[ind][maxWeight] != -1)
            return dp[ind][maxWeight];

        int notTake = knapSack01(weight , val , maxWeight , n , ind+1 , dp);
        int take = Integer.MIN_VALUE;
        if(weight[ind] <= maxWeight)
            take = val[ind] + knapSack01(weight , val , maxWeight-weight[ind] , n , ind+1 , dp);

        return dp[ind][maxWeight] = Math.max(notTake , take);

    }*/                                                               // KnapSack 0 1        Memo   TC(n*maxW)  SC(n*maxW + n)
    /*static int knapSack01(int weight[] , int val[] , int maxWeight , int n){


        int dp[][] = new int[n][maxWeight+1];

        for(int w = weight[0] ; w <= maxWeight ; w++)
             dp[0][w] = val[0];

        for(int i = 1 ; i < n ; i++){
            for(int w = 0 ; w <= maxWeight ; w++){

                int notTake = dp[i-1][w];
                int take = Integer.MIN_VALUE;

                if(w >= weight[i])
                    take = val[i] + dp[i-1][w-weight[i]];

                dp[i][w] = Math.max(take , notTake);
            }
        }
        System.out.println(Arrays.deepToString(dp));
    return dp[n-1][maxWeight];
    }*/                                                               // KnapSack 0 1        Tab    TC(n*maxW)  SC(n*maxW)
    /*static int knapSack01(int weight[] , int val[] , int maxWeight , int n){


        int dp[] = new int[maxWeight+1];

        for(int w = weight[0] ; w <= maxWeight ; w++)
             dp[w] = val[0];

        for(int i = 1 ; i < n ; i++){
            int temp[] = new int[maxWeight+1];
            for(int w = 0 ; w <= maxWeight ; w++){

                int notTake = dp[w];
                int take = Integer.MIN_VALUE;

                if(w >= weight[i])
                    take = val[i] + dp[w-weight[i]];

                temp[w] = Math.max(take , notTake);
            }
            dp = temp;
        }
    return dp[maxWeight];
    }*/                                                               // KnapSack 0 1        Space  TC(n*maxW)  SC(maxW)
    /*static int pickCoins(int coins[], int amount, int ind){

        if(amount == 0) return 0;

        if(ind == coins.length) return (int)1e9;

        int min = (int)1e9;

        for(int i = ind; i < coins.length; i++){
            // not pick
            int notPick = pickCoins(coins, amount, i + 1);

            // pick (if coin fits)
            int pick = (coins[i] <= amount) ? 1 + pickCoins(coins, amount - coins[i], i) : (int)1e9;

            min = Math.min(min, Math.min(notPick, pick));
        }

        return min;
    }*/                                                               // CoinsChange1        Recur  TC(Expon)   SC(target)
    /*int pickCoins(int coins[] , int amount , int n ,  int ind){

        if (ind == n-1) {
            if (amount % coins[ind] == 0) return amount / coins[ind];
            return (int) 1e9;
        }


        int notPick = pickCoins(coins , amount , n , ind+1);
        int pick = (int)1e9;
        if(coins[ind] <= amount)
            pick = 1+pickCoins(coins , amount - coins[ind] , n , ind);

        return Math.min(pick , notPick);
    }*/                                                               // CoinsChange1        Recur  TC(Expon)   SC(target)
    /*static int pickCoins(int[] coins, int amount, int ind, int[][] dp) {

        if (amount == 0) return 0;

        if (ind == 0) {
            if (amount % coins[0] == 0) return amount / coins[0];
            return (int) 1e9;
        }

        if (dp[ind][amount] != -1) return dp[ind][amount];

        int notPick = pickCoins(coins, amount, ind - 1, dp);

        int pick = (int) 1e9;
        if (coins[ind] <= amount) {
            pick = 1 + pickCoins(coins, amount - coins[ind], ind, dp);
        }

        return dp[ind][amount] = Math.min(pick, notPick);
    }*/                                                               // CoinsChange1        Memo   TC(n*amo)   SC(n*amount + n)
    /*static int pickCoins(int coins[], int amount){

        int n = coins.length;
        int dp[][] = new int[n][amount+1];

        for(int target = 0 ; target <= amount ; target++){
            if(target%coins[0]  == 0)
                dp[0][target] = target/coins[0];
            else
                dp[0][target] = Integer.MAX_VALUE;
        }

        for(int i = 1; i < coins.length; i++) {
            for (int target = 0; target <= amount; target++) {

                int notPick = dp[i-1][target];
                int pick = Integer.MAX_VALUE;

                if(target >= coins[i]){
                    pick = 1 + dp[i][target-coins[i]];
                }

                dp[i][target] = Math.min(notPick, pick);
            }
        }
        return dp[n-1][amount];
    }*/                                                               // CoinsChange1        Tab    TC(n*amo)   SC(n*amount)
    /*static int pickCoins(int coins[], int amount){

        int n = coins.length;
        int dp[] = new int[amount+1];

        for(int target = 0 ; target <= amount ; target++){
            if(target%coins[0]  == 0)
                dp[target] = target/coins[0];
            else
                dp[target] = Integer.MAX_VALUE;
        }

        for(int i = 1; i < coins.length; i++) {
            int temp[] = new int[amount+1];
            for (int target = 0; target <= amount; target++) {

                int notPick = dp[target];
                int pick = Integer.MAX_VALUE;

                if(target >= coins[i]){
                    pick = 1 + temp[target-coins[i]];
                }

                temp[target] = Math.min(notPick, pick);
            }
            dp = temp;
        }
        return dp[amount] >= Integer.MAX_VALUE || dp[amount] < 0 ? -1 : dp[amount];
    }*/                                                               // CoinsChange1        Space  TC(n*amo)   SC(amount)
    /*static int knapSackUnbound(int val[] , int wt[] , int weight , int n , int ind ){

        if(ind == n-1){
            if(wt[ind] <= weight)
                return val[ind] * (weight/wt[ind]);
            return 0;
        }

        int notPick = knapSackUnbound(val, wt, weight, n, ind + 1);

        int pick = (wt[ind] <= weight)
                ? val[ind] + knapSackUnbound(val, wt, weight - wt[ind], n, ind)
                : (int)-1e9;

        return Math.max(pick , notPick);
    }*/                                                               // UnBoundKnapSack     Recur  TC(2^n)     SC(n)
    /*static int knapSackUnbound(int val[] , int wt[] , int weight , int n , int ind , int dp[][]){

        if (weight == 0) return 0;

        if(ind == n-1){
            if(wt[ind] <= weight)
                return val[ind] * (weight/wt[ind]);
            return 0;
        }

        if(dp[ind][weight] != -1)
            return dp[ind][weight];

        int notPick = knapSackUnbound(val, wt, weight, n, ind + 1 , dp);

        int pick = (wt[ind] <= weight)
                ? val[ind] + knapSackUnbound(val, wt, weight - wt[ind], n, ind , dp)
                : (int)-1e9;

        return dp[ind][weight] = Math.max(pick , notPick);
    }*/                                                               // UnBoundKnapSack     Memo   TC(n*wt)    SC(n*wt + n)
    /*static int knapSackUnbound(int val[] , int wt[] , int weight , int n ){

        int dp[][] = new int[n][weight+1];

        for(int i = 0 ; i <= weight ; i++ ){
                dp[0][i] = val[0] * (i/wt[0]);
            }
        }

        for(int i = 1 ; i < n ; i++){
            for(int tar = 0 ; tar <= weight ; tar++){

                int notPick = dp[i-1][tar];
                int pick = (int)-1e9;
                if(tar >= wt[i]){
                    pick = val[i] + dp[i][tar-wt[i]];
                }
                dp[i][tar] = Math.max(pick , notPick);
            }
        }
    return dp[n-1][weight];
    }*/                                                               // UnBoundKnapSack     Tab    TC(n*wt)    SC(n*wt)
    /*static int knapSackUnbound(int val[] , int wt[] , int weight , int n ){

        int dp[] = new int[weight+1];

        if(wt[0] <= weight)
            for(int i = 0 ; i <= weight ; i++ ){
                if(i%wt[0] == 0){
                    dp[i] = val[0] * (i/wt[0]);
                }
            }

        for(int i = 1 ; i < n ; i++){
            int temp[] = new int[weight+1];
            for(int tar = 0 ; tar <= weight ; tar++){

                int notPick = dp[tar];
                int pick = (int)-1e9;
                if(tar >= wt[i]){
                    pick = val[i] + temp[tar-wt[i]];
                }
                temp[tar] = Math.max(pick , notPick);
            }
            dp = temp;
        }
    return dp[weight];
    }*/                                                               // UnBoundKnapSack     Space  TC(n*wt)    SC(wt)
    /*static int knapSackUnbound(int val[], int wt[], int weight, int n) {
        int dp[] = new int[weight + 1];

        for (int i = 0; i < n; i++) {
            for (int tar = wt[i]; tar <= weight; tar++) {
                dp[tar] = Math.max(dp[tar], val[i] + dp[tar - wt[i]]);
            }
        }

        return dp[weight];
    }*/                                                               // UnBoundKnapSack  MostSpace TC(n*wt)    SC(wt)
    /*static int rodCutting(int prices[] , int n , int currRod , int ind){

        if(currRod == 0)
            return 0;

        if(ind == n-1){
            if(currRod >= ind+1)
                return (currRod/(ind+1))  * prices[ind];
            return 0;
        }

        int notPick = rodCutting(prices , n , currRod , ind+1);
        int pick =  (int)-1e9;
        if(ind+1 <= currRod)
            pick = prices[ind] + rodCutting(prices , n , currRod-(ind+1) , ind);

        return Math.max(notPick , pick);
    }*/                                                               // CuttingRod          Recur  TC(Expo)    SC(n)
    /*static int rodCutting(int prices[] , int n , int currRod , int ind ,int dp[][]){

        if(ind == n-1){
            if(currRod >= ind+1)
                return (currRod/(ind+1))  * prices[ind];
            return 0;
        }

        if(dp[ind][currRod] != -1)
            return dp[ind][currRod];

        int notPick = rodCutting(prices , n , currRod , ind+1 , dp);
        int pick =  (int)-1e9;
        if(ind+1 <= currRod)
            pick = prices[ind] + rodCutting(prices , n , currRod-(ind+1) , ind , dp);

        return dp[ind][currRod] = Math.max(notPick , pick);
    }*/                                                               // CuttingRod          Memo   TC(n^2)     SC(n^2+n)
    /*static int rodCutting(int prices[] , int n){

        int dp[][] = new int[n][n+1];

        for(int i = 0 ; i <= n ; i++){
            dp[0][i] = prices[0]*i;
        }

        for(int i = 1; i < n ; i++){
            for(int tar = 0 ; tar <= n ; tar++){

                int notPick = dp[i-1][tar];
                int pick = (int)-1e9;

                int rodLength = i+1;
                if(rodLength <= tar)
                    pick = prices[i] + dp[i][tar-rodLength];

                dp[i][tar] = Math.max(pick , notPick);
            }
        }
    return dp[n-1][n];
    }*/                                                               // CuttingRod          Tab    TC(n^2)     SC(n^2)

//   3D


    /*static int cherryPick(int[][] grid, int row, int col, int rowInd, int col1, int col2) {

        if (col1 < 0 || col2 < 0 || col1 >= col || col2 >= col)
            return 0;

        if (rowInd == row - 1) {
            if (col1 == col2)
                return grid[rowInd][col1];
            else
                return grid[rowInd][col1] + grid[rowInd][col2];
        }

        int max = 0;

        for (int dir1 = -1; dir1 <= 1; dir1++) {
            for (int dir2 = -1; dir2 <= 1; dir2++) {
                int currCherries = grid[rowInd][col1];
                if (col1 != col2) currCherries += grid[rowInd][col2];

                int temp = currCherries + cherryPick(grid, row, col, rowInd + 1, col1 + dir1, col2 + dir2);
                max = Math.max(max, temp);
            }
        }

        return max;
    }*/                                                               // CherryPickup BothSides recur   TC(O(3^n+3^n) SC(O(N))
    /*static int cherryPick(int[][] grid, int row, int col, int rowInd, int col1, int col2 , int dp[][][]) {

        if(col1 < 0 || col2 < 0 || col1 >= col || col2 >= col)
            return 0;

        if(rowInd == row - 1) {
            if(col1 == col2)
                return grid[rowInd][col1];
            else
                return grid[rowInd][col1] + grid[rowInd][col2];
        }

        if(dp[rowInd][col1][col2] != -1)
            return dp[rowInd][col1][col2];

        int max = 0;

        for(int dir1 = -1; dir1 <= 1; dir1++) {
            for(int dir2 = -1; dir2 <= 1; dir2++) {
                int currCherries = grid[rowInd][col1];
                if(col1 != col2) currCherries += grid[rowInd][col2];

                int temp = currCherries + cherryPick(grid, row, col, rowInd + 1, col1 + dir1, col2 + dir2 , dp);
                max = Math.max(max, temp);
            }
        }
        return dp[rowInd][col1][col2] = max;
    }*/                                                               // CherryPickup BothSides Memo    TC(O(n*m^2*9) SC(O(n*m^2 + n))
    /*static int cherryPick(int[][] grid, int row, int col) {

        int dp[][][] = new int[row][col][col];

        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < col ; j++){
                if(i == j)
                    dp[row-1][i][j] = grid[row-1][i];
                else{
                    dp[row-1][i][j] = grid[row-1][i] + grid[row-1][j];
                }
            }
        }

        for (int rowInd = row-2 ; rowInd >= 0 ; rowInd-- ) {
            for (int colInd1 = 0; colInd1 < col; colInd1++) {
                for(int colInd2 = 0 ; colInd2 < col ; colInd2++){
                    int max = 0;


                    for (int dir1 = -1; dir1 <= 1; dir1++) {
                        for (int dir2 = -1; dir2 <= 1; dir2++) {

                            int newC1 = colInd1 + dir1;
                            int newC2 = colInd2 + dir2;

                            if (newC1 < 0 || newC1 >= col || newC2 < 0 || newC2 >= col)
                                continue;


                            int cherry = (colInd1 == colInd2) ? grid[rowInd][colInd1] :
                                    grid[rowInd][colInd1] + grid[rowInd][colInd2];

                            cherry += dp[rowInd+1][newC1][newC2];

                            max = Math.max(cherry , max);
                        }
                    }
                    dp[rowInd][colInd1][colInd2] = max;
                }
            }
        }
        return dp[0][0][col-1];
    }*/                                                               // CherryPickup BothSides Tabu    TC(O(n*m^2*9) SC(O(n*m^2))
    /*static int cherryPick(int[][] grid, int row, int col) {

        int dp[][] = new int[col][col];

        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < col ; j++){
                if(i == j)
                    dp[i][j] = grid[row-1][i];
                else{
                    dp[i][j] = grid[row-1][i] + grid[row-1][j];
                }
            }
        }

        for (int rowInd = row-2 ; rowInd >= 0 ; rowInd-- ) {
            int temp[][] = new int[col][col];
            for (int colInd1 = 0; colInd1 < col; colInd1++) {
                for(int colInd2 = 0 ; colInd2 < col ; colInd2++){
                    int max = 0;

                    for (int dir1 = -1; dir1 <= 1; dir1++) {
                        for (int dir2 = -1; dir2 <= 1; dir2++) {

                            int newC1 = colInd1 + dir1;
                            int newC2 = colInd2 + dir2;

                            if (newC1 < 0 || newC1 >= col || newC2 < 0 || newC2 >= col)
                                continue;

                            int cherry = (colInd1 == colInd2) ? grid[rowInd][colInd1] :
                                    grid[rowInd][colInd1] + grid[rowInd][colInd2];

                            cherry += dp[newC1][newC2];

                            max = Math.max(cherry , max);
                        }
                    }
                    temp[colInd1][colInd2] = max;
                }
            }
            dp = temp;
        }
        return dp[0][col-1];
    }*/                                                               // CherryPickup BothSides Space   TC(n*m^2*9) SC(O(m^2)

//   4D

    /*static int cherryPickup(int grid[][] , int row , int rowInd1 , int colInd1 , int rowInd2 , int colInd2){


        if(rowInd1 >= row || rowInd2 >= row ||
           colInd1 >= row || colInd2 >= row ||
           grid[rowInd1][colInd1] == -1     ||
           grid[rowInd2][colInd2] == -1
        )
            return Integer.MIN_VALUE;

        if(rowInd1 == row-1 && colInd1 == row-1){
            return grid[rowInd1][colInd1];
        }
        if(rowInd2 == row-1 && colInd2 == row-1){
            return grid[rowInd2][colInd2];
        }

        int cherry;

        if(rowInd1 == rowInd2 && colInd1 == colInd2)
            cherry = grid[rowInd1][colInd1];
        else{
            cherry = grid[rowInd1][colInd1] + grid[rowInd2][colInd2];
        }

        cherry += Math.max(
                Math.max(
                cherryPickup(grid , row , rowInd1+1, colInd1, rowInd2+1 , colInd2),
                cherryPickup(grid , row , rowInd1+1, colInd1 , rowInd2 , colInd2+1)),
                Math.max(
                cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2+1 , colInd2),
                cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2 , colInd2+1)));

        return cherry;
    }*/                                                               // CherryPickup SingleSide Rec    TC(4^2n) SC(O(N))
    /*static int cherryPickup(int grid[][] , int row , int rowInd1 , int colInd1 , int rowInd2 , int colInd2){

        if(rowInd1 >= row || rowInd2 >= row ||
                colInd1 >= row || colInd2 >= row ||
                grid[rowInd1][colInd1] == -1     ||
                grid[rowInd2][colInd2] == -1
        )
            return Integer.MIN_VALUE;


        if(rowInd1 == row-1 && colInd1 == row-1){
            return grid[rowInd1][colInd1];
        }
        if(rowInd2 == row-1 && colInd2 == row-1){
            return grid[rowInd2][colInd2];
        }

        int cherry;

        if(rowInd1 == rowInd2 && colInd1 == colInd2)
            cherry = grid[rowInd1][colInd1];
        else{
            cherry = grid[rowInd1][colInd1] + grid[rowInd2][colInd2];
        }

        int bothRight = cherry + cherryPickup(grid , row , rowInd1+1, colInd1, rowInd2+1 , colInd2);
        int bothDown  = cherry + cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2 , colInd2+1);
        int oneRightoneDown = cherry + cherryPickup(grid , row , rowInd1+1, colInd1 , rowInd2 , colInd2+1);
        int oneDownoneRight = cherry + cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2+1 , colInd2);

        return Math.max(Math.max(bothDown , bothRight) , Math.max(oneDownoneRight , oneRightoneDown));
    }*/                                                               // CherryPickup SingleSide RecMoreElaborated TC(4^2n) SC(O(N))
    /*static int cherryPickup(int grid[][] , int row , int rowInd1 , int colInd1 , int rowInd2 , int colInd2 , int dp[][][][]){


        if(rowInd1 >= row || rowInd2 >= row ||
           colInd1 >= row || colInd2 >= row ||
           grid[rowInd1][colInd1] == -1     ||
           grid[rowInd2][colInd2] == -1
        )
            return Integer.MIN_VALUE;

        if(rowInd1 == row-1 && colInd1 == row-1){
            return grid[rowInd1][colInd1];
        }
        if(rowInd2 == row-1 && colInd2 == row-1){
            return grid[rowInd2][colInd2];
        }

        if(dp[rowInd1][rowInd2][colInd1][colInd2] != -1){
            return dp[rowInd1][rowInd2][colInd1][colInd2];
        }

        int cherry;

        if(rowInd1 == rowInd2 && colInd1 == colInd2)
            cherry = grid[rowInd1][colInd1];
        else{
            cherry = grid[rowInd1][colInd1] + grid[rowInd2][colInd2];
        }

        cherry += Math.max(
                Math.max(
                cherryPickup(grid , row , rowInd1+1, colInd1, rowInd2+1 , colInd2 , dp),
                cherryPickup(grid , row , rowInd1+1, colInd1 , rowInd2 , colInd2+1 ,dp)),
                Math.max(
                cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2+1 , colInd2 , dp),
                cherryPickup(grid , row , rowInd1, colInd1+1 , rowInd2 , colInd2+1 , dp)));

        return dp[rowInd1][rowInd2][colInd1][colInd2] = cherry;
    }*/                                                               // CherryPickup SingleSide Mem    TC(n^4) SC( n^4 + O(N))
    /*static int cherryPickup(int grid[][] , int row ){

        int dp[][][][] = new int[row][row][row][row];

        int col = row;

        for(int rowInd1 = row-1 ; rowInd1 >= 0 ; rowInd1--){
            for(int colInd1 = col-1 ; colInd1 >= 0 ; colInd1--){
                for(int rowInd2 = row-1 ; rowInd2 >= 0 ; rowInd2--){
                    for(int colInd2 = col-1 ; colInd2 >= 0 ; colInd2--){

                        if(grid[rowInd1][colInd1] == -1 || grid[rowInd2][colInd2] == -1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = Integer.MIN_VALUE;
                            continue;
                        }

                        if(rowInd1 == row-1 && colInd1 == col-1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = grid[rowInd1][colInd1];
                            continue;
                        }

                        int cherry = grid[rowInd1][colInd1];
                        if(rowInd1 != rowInd2 && colInd1 != colInd2)
                            cherry += grid[rowInd2][colInd2];

                        int max = Integer.MIN_VALUE;

                        if(rowInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2+1][colInd2] , max);

                        if(rowInd1+1 < row && colInd2+1 < col)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2][colInd2+1] , max);

                        if(colInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2+1][colInd2] , max);

                        if(colInd1+1 < row && colInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2][colInd2+1] , max);


                        dp[rowInd1][colInd1][rowInd2][colInd2] = max + cherry;
                    }
                }
            }
        }
    return Math.max(0 , dp[0][0][0][0]);
    }/*static int cherryPickup(int grid[][] , int row ){

        int dp[][][][] = new int[row][row][row][row];

        int col = row;

        for(int rowInd1 = row-1 ; rowInd1 >= 0 ; rowInd1--){
            for(int colInd1 = col-1 ; colInd1 >= 0 ; colInd1--){
                for(int rowInd2 = row-1 ; rowInd2 >= 0 ; rowInd2--){
                    for(int colInd2 = col-1 ; colInd2 >= 0 ; colInd2--){

                        if(grid[rowInd1][colInd1] == -1 || grid[rowInd2][colInd2] == -1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = Integer.MIN_VALUE;
                            continue;
                        }

                        if(rowInd1 == row-1 && colInd1 == col-1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = grid[rowInd1][colInd1];
                            continue;
                        }

                        int cherry = grid[rowInd1][colInd1];
                        if(rowInd1 != rowInd2 && colInd1 != colInd2)
                            cherry += grid[rowInd2][colInd2];

                        int max = Integer.MIN_VALUE;

                        if(rowInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2+1][colInd2] , max);

                        if(rowInd1+1 < row && colInd2+1 < col)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2][colInd2+1] , max);

                        if(colInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2+1][colInd2] , max);

                        if(colInd1+1 < row && colInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2][colInd2+1] , max);


                        dp[rowInd1][colInd1][rowInd2][colInd2] = max + cherry;
                    }
                }
            }
        }
    return Math.max(0 , dp[0][0][0][0]);
    }*/                                                               // CherryPickup SingleSide Tab    TC(n^4) SC(n^4)
    /*static int cherryPickup(int grid[][] , int row ){

        int dp[][][][] = new int[row][row][row][row];

        int col = row;

        // r1+c1 = r2+c2;
        // c2 = r1+c1-r2;
        // c2 is not direct dependant

        for(int rowInd1 = row-1 ; rowInd1 >= 0 ; rowInd1--){
            for(int colInd1 = col-1 ; colInd1 >= 0 ; colInd1--){
                for(int rowInd2 = row-1 ; rowInd2 >= 0 ; rowInd2--){

                        int colInd2 = (rowInd1+colInd1)-rowInd2;

                        if(colInd2 > col || col < 0)
                            continue;

                        if(grid[rowInd1][colInd1] == -1 || grid[rowInd2][colInd2] == -1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = Integer.MIN_VALUE;
                            continue;
                        }

                        if(rowInd1 == row-1 && colInd1 == col-1){
                            dp[rowInd1][colInd1][rowInd2][colInd2] = grid[rowInd1][colInd1];
                            continue;
                        }

                        int cherry = grid[rowInd1][colInd1];
                        if(rowInd1 != rowInd2 && colInd1 != colInd2)
                            cherry += grid[rowInd2][colInd2];

                        int max = Integer.MIN_VALUE;

                        if(rowInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2+1][colInd2] , max);

                        if(rowInd1+1 < row && colInd2+1 < col)
                            max = Math.max(dp[rowInd1+1][colInd1][rowInd2][colInd2+1] , max);

                        if(colInd1+1 < row && rowInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2+1][colInd2] , max);

                        if(colInd1+1 < row && colInd2+1 < row)
                            max = Math.max(dp[rowInd1][colInd1+1][rowInd2][colInd2+1] , max);


                        dp[rowInd1][colInd1][rowInd2][colInd2] = max + cherry;
                    }
            }
        }
    return Math.max(0 , dp[0][0][0][0]);*/                                                               // CherryPickup SingleSide Opt    TC(n^3) SC(n^4)


    // String

    /*static int longestCommonSubSeq(String s1 , String s2 , int ind1 , int ind2){

        if(ind1 == s1.length() || ind2 == s2.length())
            return 0;

        char c1 = s1.charAt(ind1);
        char c2 = s2.charAt(ind2);

        int match = 0;
        int notMatch = 0;

        if(c1 == c2){
            match = 1 + longestCommonSubSeq(s1 , s2 , ind1 + 1, ind2 + 1);
        }
        else{
            notMatch = Math.max(longestCommonSubSeq(s1 , s2 , ind1+1, ind2) , longestCommonSubSeq(s1 , s2 , ind1, ind2+1));
        }
        return Math.max(match , notMatch);
    }*/                                                               // LongComSubSeq  Rec      TC(2^(n+m)) SC(n+m)
    /*static int longestCommonSubSeq(String s1 , String s2 , int ind1 , int ind2 , int dp[][]){

        if(ind1 == s1.length() || ind2 == s2.length())
            return 0;

        if(dp[ind1][ind2] != -1)
            return dp[ind1][ind2];

        char c1 = s1.charAt(ind1);
        char c2 = s2.charAt(ind2);

        int match = 0;
        int notMatch = 0;

        if(c1 == c2){
            match = 1 + longestCommonSubSeq(s1 , s2 , ind1 + 1, ind2 + 1 , dp);
        }
        else{
            notMatch = Math.max(longestCommonSubSeq(s1 , s2 , ind1+1, ind2 , dp) , longestCommonSubSeq(s1 , s2 , ind1, ind2+1 , dp));
        }
        return dp[ind1][ind2] = Math.max(match , notMatch);
    }*/                                                               // LongComSubSeq  Mem      TC(n*m)     SC((n*m) + (n+m))
    /*static int longestCommonSubSeq(String s1 , String s2){

        int n = s1.length();
        int m = s2.length();



        // No Shifting
//        int[][] dp = new int[n][m];
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(s1.charAt(i) == s2.charAt(j)){
//                    dp[i][j] = 1 + (i>0 && j>0 ? dp[i-1][j-1] : 0);
//                } else {
//                    dp[i][j] = Math.max(
//                            i>0 ? dp[i-1][j] : 0,
//                            j>0 ? dp[i][j-1] : 0
//                    );
//                }
//            }
//        }
//        return dp[n-1][m-1];

        // Shifting Index Filling Base Case
//        int dp[][] = new int[n+1][m+1];
//
//        for(int i = 0 ; i <= n ; i++)dp[0][i] = 0;
//        for(int i = 0 ; i <= m ; i++)dp[i][0] = 0;
//
//        for(int i = 1; i <= n ; i++){
//            char c1 = s1.charAt(i-1);
//            for(int j = 1; j <= m ; j++){
//
//            char c2 = s2.charAt(j-1);
//            int match = 0 , notMatch = 0;
//            if(c1 == c2)
//                match  = 1 + dp[i-1][j-1];
//            else
//                notMatch = Math.max(dp[i-1][j] , dp[i][j-1]);
//
//            dp[i][j] = Math.max(match , notMatch);
//            }
//        }
//        return dp[n][m];

        // Shifting Index
        int dp[][] = new int[n+1][m+1];

        for(int i = 1 ; i <= n ; i++){
            int c1 = s1.charAt(i-1);
            for(int j = 1 ; j <= m ; j++){

            int c2 = s2.charAt(j-1);

            if(c1 == c2)
                dp[i][j] = 1 + dp[i-1][j-1];
            else
                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);

            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][m];

}*/                                                               // LongComSubSeq  Tab      TC(n*m)     SC((n*m))
    /*static int longestCommonSubSeq(String s1 , String s2){

        int n = s1.length();
        int m = s2.length();

        int curr[] = new int[m+1];
        int prev[] = new int[m+1];

        for(int i = 1; i <= n ; i++){
            char c1 = s1.charAt(i-1);
            for(int j = 1; j <= m ; j++){

                char c2 = s2.charAt(j-1);

                if(c1 == c2){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(prev[j] , curr[j-1]);
                }
            }
            prev = curr.clone();
        }
    return curr[m];
    }*/                                                               // LongComSubSeq  Spa      TC(n*m)     SC((2m))
    /*static int longestCommonSubSeq(String s1 , String s2){

        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i = 1 ; i <= n ; i++){
            int c1 = s1.charAt(i-1);
            for(int j = 1 ; j <= m ; j++){

            int c2 = s2.charAt(j-1);

            if(c1 == c2){
                dp[i][j] = 1 + dp[i-1][j-1];
            }
            else
                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);

            }
        }
        int i = n , j = m;
        String str = "";
        while(i > 0 && j > 0){

            if(s1.charAt(i-1) == s2.charAt(j-1)){
                str = s1.charAt(i-1) + str;
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.println(str);
        return dp[n][m];

    }*/                                                               // PrintLongComSubSeq      TC(n*m)     SC((n*m + k)) k->Length
    /*static int maxLen = 0;
    static void longestCommonSubString(String s1 , String s2 , int i , int j ,int count){

        if(i >= s1.length() || j >= s2.length())
            return;

        if(s1.charAt(i) == s2.charAt(j)){
            longestCommonSubString(s1 , s2 , i+1 , j+1 , count+1);
            maxLen = Math.max(maxLen , count+1);
        }

        longestCommonSubString(s1 , s2 , i+1 , j , 0);
        longestCommonSubString(s1 , s2 , i , j+1 , 0);

    }*/                                                               // LonComSubStr   Rec      TC(2^n+m)     SC((n+m))
    /*static int longestCommonSubString(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int max = 0;

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        System.out.println(max);
        return max;
    }*/                                                               // LonComSubStr   Tab      TC(n*m)       SC((n*m))
    /*static String printLongestCommonSubString(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int max = 0;
        int fir = -1;
        int sec = -1;

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    if(max < dp[i][j]){
                        max = dp[i][j];
                        fir = i-1;
                        sec = j-1;
                    }
                }
            }
        }
        String str = "";

        while(fir >= 0 && sec >= 0 && s1.charAt(fir) == s2.charAt(sec)){

            str = s1.charAt(fir) + str;
            fir--;
            sec--;
        }
        return str;
    }*/                                                               // PrLonComSubStr Tab      TC(n*m)       SC((n*m))
    /*public static int longestRepeatingSubstring(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        int maxLen = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) { // j > i ensures different positions
                if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        deepToString(dp);
        return maxLen;
    }*/                                                               // LongRepSubStr  Tab      TC(n*m)       SC((n*m))

    /*static public String shortestCommonSupersequence(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];


        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){

                if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        int i = n;
        int j = m;

        while(i > 0 && j > 0){

            if(str1.charAt(i-1) == str2.charAt(j-1)){
                sb.insert(0 , str1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j] > dp[i][j-1]){
                    sb.insert(0 , str1.charAt(i-1));
                    i--;
                }else{
                    sb.insert(0 , str2.charAt(j-1));
                    j--;
                }
            }
        }
        while(i > 0){
            sb.insert(0 , str1.charAt(i-1));
            i--;
        }
        while(j > 0){
            sb.insert(0 , str2.charAt(j-1));
            j--;
        }
        return sb.toString();
    }*/                                                               // PrSuperSeq     Tab      TC(n*m)       SC(n*m)
    /*static int distinctSubSeq(String s , String t , int i , int j){


        if(j == t.length())
            return 1;

        if(i == s.length())
            return 0;


        if(s.charAt(i) == t.charAt(j))
            return  distinctSubSeq(s , t , i+1 , j+1) + distinctSubSeq(s , t , i+1 , j);

        return  distinctSubSeq(s , t , i+1 , j);


    }*/                                                               // DistinctSubSeq Rec      TC(2^n)       SC(n)
    /*static int distinctSubSeq(String s , String t , int i , int j , int dp[][]){

        if(j == t.length())
            return 1;

        if(i == s.length())
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];


        if(s.charAt(i) == t.charAt(j))
            return dp[i][j] = distinctSubSeq(s , t , i+1 , j+1 , dp) + distinctSubSeq(s , t , i+1 , j , dp);

        return dp[i][j] = distinctSubSeq(s , t , i+1 , j , dp);

    }*/                                                               // DistinctSubSeq Mem      TC(n*m)       SC(n*m + n)
    /*static int distinctSubSeq(String s, String t) {

        int n = s.length();
        int m = t.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        deepToString(dp);
        return dp[n][m];
    }*/                                                               // DistinctSubSeq Tab      TC(n*m)       SC(n*m)
    /*public int numDistinct(String s, String t) {

        int n = s.length();
        int m = t.length();

        int dp[] = new int[m + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int temp[] = new int[m+1];
            temp[0] = 1;
            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1))
                    temp[j] = dp[j - 1] + dp[j];
                else
                    temp[j] = dp[j];
            }
            dp = temp;
        }
        return dp[m];
    }*/                                                               // DistinctSubSeq Spa      TC(n*m)       SC(m)
    /*static int editDist(String w1, String w2, int i, int j) {

        if (i == w1.length()) return w2.length() - j; // insert remaining chars of w2
        if (j == w2.length()) return w1.length() - i; // delete remaining chars of w1


        if (w1.charAt(i) == w2.charAt(j)) {
            return editDist(w1, w2, i + 1, j + 1);
        } else {
            int insertOp = editDist(w1, w2, i, j + 1);   // insert w2[j] into w1
            int deleteOp = editDist(w1, w2, i + 1, j);   // delete w1[i]
            int replaceOp = editDist(w1, w2, i + 1, j + 1); // replace w1[i] with w2[j]

            return 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
        }
    }*/                                                               // Edit Dist      Rec      TC(3^min(m,n) SC(m+n)
    /*static int editDist(String w1, String w2, int dp[][], int i, int j) {

        // Base cases
        if (i == 0) return j;  // w1 is empty → insert all j chars of w2
        if (j == 0) return i;  // w2 is empty → delete all i chars of w1

        if (dp[i][j] != -1) return dp[i][j];

        if (w1.charAt(i - 1) == w2.charAt(j - 1)) {
            dp[i][j] = editDist(w1, w2, dp, i - 1, j - 1);
        } else {
            int insertOp  = editDist(w1, w2, dp, i, j - 1);   // insert w2[j-1]
            int deleteOp  = editDist(w1, w2, dp, i - 1, j);   // delete w1[i-1]
            int replaceOp = editDist(w1, w2, dp, i - 1, j - 1); // replace w1[i-1] → w2[j-1]
            dp[i][j] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
        }

        return dp[i][j];
    }*/                                                               // Edit Dist      Mem      TC(m*n)       SC(m*n + m+n)
    /*public static int editDist(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];

        for(int i = 0 ; i <= m ; i++)
            dp[0][i] = i;
        for(int i = 0 ; i <= n ; i++)
            dp[i][0] = i;

        deepToString(dp);

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= m ; j++){

                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else{
                    int insertOp = dp[i][j-1];
                    int deleteOp = dp[i-1][j];
                    int replaceOp = dp[i-1][j-1];

                    dp[i][j] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
                }
            }
        }
        return dp[n][m];
    }*/                                                               // Edit Dist      Tab      TC(m*n)       SC(m*n)
    /*public static int editDist(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();
        int dp[]= new int[m + 1];


        for (int j = 0; j <= m; j++)
            dp[j] = j;

        for (int i = 1; i <= n; i++) {
            int temp[] = new int[m + 1];
            temp[0] = i;
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    temp[j] = dp[j - 1];  // chars match → take diagonal
                else {
                    int insertOp = temp[j - 1];   // insert
                    int deleteOp = dp[j];         // delete
                    int replaceOp = dp[j - 1];    // replace
                    temp[j] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
                }
            }
            dp = temp;  // move current row to previous row
        }

        return dp[m];
    }*/                                                               // Edit Dist      Spa      TC(m*n)       SC(m)
    /*static boolean match(String s, String p , int i , int j){

        if (i < 0 && j < 0) return true;
        if (j < 0) return false;
        if (i < 0) { // string empty, check if pattern has only '*'
            for (int k = 0; k <= j; k++)
                if (p.charAt(k) != '*') return false;
            return true;
        }

        boolean chk = false;

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
            chk |= match(s , p , i-1 , j-1);
        }
        else if(p.charAt(j) == '*'){
            chk |= match(s ,p ,i ,j-1);
            chk |= match(s ,p ,i-1 ,j);
        }
        return chk;
    }*/                                                               // WildCard       Recur    TC(2^n)       SC(n+m)
    /*static boolean match(String s, String p , int i , int j , Boolean dp[][]){

        if (i == 0 && j == 0) return true;
        if (j == 0) return false;
        if (i == 0 && j > 0) {
            for (int k = 1; k <= j; k++)
                if (p.charAt(k-1) != '*') return false;
            return true;
        }

        if(dp[i][j] != null)
            return dp[i][j];

        boolean chk = false;

        if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
            chk |= match(s , p , i-1 , j-1 , dp);
        }
        else if(p.charAt(j-1) == '*'){
            chk |= match(s ,p ,i ,j-1 , dp);
            chk |= match(s ,p ,i-1 ,j , dp);
        }
        return dp[i][j] = chk;
    }*/                                                               // WildCard       Memo     TC(n*m)       SC(n*m + n+m)
    /*public static boolean isMatch(String s, String p) {

        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;

//        for(int j = 1 ; j <= m ; j++){
//            boolean flag = true;
//            for (int k = 1; k <= j; k++){
//                if (p.charAt(k-1) != '*'){
//                    flag = false;
//                    break;
//                }
//            }
//            dp[0][j] = flag;
//        }
        for(int j = 1 ; j <= m ; j++){
            if (p.charAt(j-1) == '*'){
                dp[0][j] = true;
            }else
                break;
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){

                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] |= dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] |= dp[i-1][j];
                    dp[i][j] |= dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }*/                                                               // WildCard       Tab      TC(n*m)       SC(n*m)
    /*public boolean isMatch(String s, String p) {

        int n = s.length();
        int m = p.length();

        boolean dp[] = new boolean[m+1];


        dp[0] = true;

        for(int j = 1 ; j <= m ; j++){
            if (p.charAt(j-1) == '*'){
                dp[j] = true;
            }else
                break;
        }

        for(int i = 1 ; i <= n ; i++){
            boolean temp[] = new boolean[m+1];
            for(int j = 1 ; j <= m ; j++){

                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    temp[j] |= dp[j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    temp[j] |= dp[j];
                    temp[j] |= temp[j-1];
                }
            }
            dp = temp;
        }
        return dp[m];
    }*/                                                               // WildCard       Space    TC(n*m)       SC(m)

    // Stocks

    /*static int maxProfit(int prices[] , int ind , boolean buy){

        if(ind == prices.length)
                return 0;

        int take = 0;
        int notTake = 0;

        if(buy){
            take = -prices[ind] + maxProfit(prices , ind+1 , false);
            notTake = maxProfit(prices , ind+1 , true);
        }
        else{
            take = prices[ind] + maxProfit(prices , ind+1 , true);
            notTake = maxProfit(prices , ind+1 , false);
        }
        return Math.max(take , notTake);
    }*/                                                               //BuySell II      Recur    TC(2^n)       SC(n)
    /*static int maxProfit(int prices[] , int ind , int buy , int dp[][]){

        if(ind == prices.length)
                return 0;

        if(dp[ind][buy] != -1)
            return dp[ind][buy];

        int take = 0;
        int notTake = 0;

        if(buy == 1){
            take = -prices[ind] + maxProfit(prices , ind+1 , 0 , dp);
            notTake = maxProfit(prices , ind+1 , 1 , dp);
        }
        else{
            take = prices[ind] + maxProfit(prices , ind+1 , 1 , dp);
            notTake = maxProfit(prices , ind+1 , 0 , dp);
        }
        return dp[ind][buy] = Math.max(take , notTake);
    }*/                                                               //BuySell II      Memo     TC(n*2)       SC(2n + n)
    /*static int maxProfit(int prices[]){

        int n = prices.length;
        int dp[][] = new int[n+1][2];


        for(int ind = n-1 ; ind >= 0 ; ind--){
            for(int buy = 0 ; buy <= 1 ; buy++){

                int profit = 0;

                if(buy == 1){
                    profit = Math.max(-prices[ind] + dp[ind+1][0] , dp[ind+1][1]);
                }
                else{
                    profit = Math.max(prices[ind] + dp[ind+1][1] , dp[ind+1][0]);
                }
                dp[ind][buy] = profit;
            }
        }
        deepToString(dp);
//        for(int ind = n-1 ; ind >= 0 ; ind--){
//            dp[ind][1] = Math.max(-prices[ind] + dp[ind+1][0] , dp[ind+1][1]);
//            dp[ind][0] = Math.max(prices[ind] + dp[ind+1][1] , dp[ind+1][0]);
//        }
        return dp[0][1];
    }*/                                                               //BuySell II      Tab      TC(n)         SC(2n)
    /*static int maxProfit(int prices[]){

        int n = prices.length;
        int buy = 0;
        int sell = 0;

        for(int ind = n-1 ; ind >= 0 ; ind--){
            int curB = Math.max(-prices[ind] + sell , buy);
            int curS = Math.max(prices[ind] + buy , sell);
            buy = curB;
            sell = curS;
        }
        return buy;
    }*/                                                               //BuySell II      Space    TC(n)         SC(1)
    /*static int maxProfit(int prices[] , int ind , int buy , int count){

        if(count == 0)
            return 0;

        if(ind == prices.length)
            return 0;

        int profit = 0;

        if(buy == 1){
            profit = Math.max(-prices[ind]+maxProfit(prices ,ind+1 ,0 , count) ,
                    maxProfit(prices ,ind+1 ,1 , count));
        }
        else{
            profit = Math.max(prices[ind]+maxProfit(prices ,ind+1 ,1 , count-1),
                    maxProfit(prices ,ind+1 ,0 , count));
        }
        return profit;
    }*/                                                               //BuySell III     Recur    TC(2^n)       SC(n)
    /*static int maxProfit(int prices[] , int ind , int buy , int count , int dp[][][]){

        if(count == 0)
            return 0;

        if(ind == prices.length)
            return 0;


        if(dp[ind][buy][count] != -1)
            return dp[ind][buy][count];

        int profit = 0;

        if(buy == 1){
            profit = Math.max(-prices[ind]+maxProfit(prices ,ind+1 ,0 , count , dp) ,
                    maxProfit(prices ,ind+1 ,1 , count , dp));
        }
        else{
            profit = Math.max(prices[ind]+maxProfit(prices ,ind+1 ,1 , count-1 , dp),
                    maxProfit(prices ,ind+1 ,0 , count , dp));
        }
        return dp[ind][buy][count] = profit;
    }*/                                                               //BuySell III     Memo     TC(n*2*2)     SC(n*2*2 + n)
    /*static int maxProfit(int prices[]){

        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];

        for(int i = n-1 ; i >= 0  ; i--){
            for(int buy = 0 ; buy <= 1 ; buy++){
                for(int count = 1 ; count <= 2 ; count++ ){

                    int profit = 0;

                    if(buy == 1){
                        profit = Math.max(-prices[i]+dp[i+1][0][count] , dp[i+1][1][count]);
                    }else{
                        profit = Math.max(prices[i]+dp[i+1][1][count-1] , dp[i+1][0][count]);
                    }
                    dp[i][buy][count] = profit;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
    return dp[0][1][2];
    }*/                                                               //BuySell III     Tab      TC(n*2*2)     SC(n*2*2)
    /*static int maxProfit(int prices[]){

        int n = prices.length;
        int dp[][] = new int[2][3];

        for(int i = n-1 ; i >= 0  ; i--) {
            int temp[][] = new int[2][3];
            for (int buy = 0; buy <= 1; buy++) {
                for (int count = 1; count <= 2; count++) {
                    int profit = 0;

                    if (buy == 1) {
                        profit = Math.max(-prices[i] + dp[0][count], dp[1][count]);
                    } else {
                        profit = Math.max(prices[i] + dp[1][count - 1], dp[0][count]);
                    }
                    temp[buy][count] = profit;
                }
            }
            dp = temp;
        }
        return dp[1][2];
}*/                                                               //BuySell III     Space    TC(n*2*2)     SC(2*2)
    /*static int maxProfit(int prices[] , int ind , int buy , int dp[][]){

        if(ind >= prices.length)
            return 0;

        if(dp[ind][buy] != -1)
            return dp[ind][buy];

        int take = 0;
        int notTake = 0;

        if(buy == 1){
            take = -prices[ind] + maxProfit(prices , ind+1 , 0 , dp);
            notTake = maxProfit(prices , ind+1 , 1 , dp);
        }
        else{
            take = prices[ind] + maxProfit(prices , ind+2 , 1 , dp);
            notTake = maxProfit(prices , ind+1 , 0 , dp);
        }
        return dp[ind][buy] = Math.max(take , notTake);
    }*/                                                               //BuySell Cool    Memo     TC(n*2)       SC(n*2 + n)
    /*public int maxProfit(int[] prices) {

        int n = prices.length;
        int dp[][] = new int[n+2][2];


        for(int i = n-1; i >= 0 ; i--){
            for(int buy = 0 ; buy <= 1 ;buy++){

                int profit = 0;

                if(buy == 1){
                    profit = Math.max(-prices[i] + dp[i+1][0] , dp[i+1][1]);
                }
                else{
                    profit = Math.max(prices[i] + dp[i+2][1] , dp[i+1][0]);
                }
                dp[i][buy] = profit;
            }
        }
        return dp[0][1];
    }*/                                                               //BuySell Cool    Tab      TC(n*2)       SC(n*2)

    // Longest Increasing SubSeq

    /*static int longIncSubSeq(int nums[] , int ind , int prev){

        if(ind == nums.length-1)
            if(prev != -1 && nums[ind] > nums[prev])
                return 1;
            else
                return 0;

        int take = 0;
        int notTake = 0;

        notTake = longIncSubSeq(nums , ind+1 , prev);
        if(prev == -1 || nums[prev] < nums[ind])
            take = 1 + longIncSubSeq(nums , ind+1 , ind);

        return Math.max(take , notTake);
    }*/                                                              // LongIncSubSeq   Recur    TC(2^n)       SC(n)
    /*static int longIncSubSeq(int nums[] , int ind , int prev , int dp[][]){

        if(ind == nums.length-1)
            if(prev != -1 && nums[ind] > nums[prev])
                return 1;
            else
                return 0;

        if(dp[ind][prev+1] != -1){
            return dp[ind][prev+1];
        }

        int take = 0;
        int notTake = 0;

        notTake = longIncSubSeq(nums , ind+1 , prev , dp);

        if(prev == -1 || nums[prev] < nums[ind])
            take = 1 + longIncSubSeq(nums , ind+1 , ind , dp);

        return dp[ind][prev+1] = Math.max(take , notTake);
    }*/                                                              // LongIncSubSeq   Memo     TC(n*n)       SC(n*n + n)
    /*static int longIncSubSeq(int nums[]) {

        int n = nums.length;
        int dp[][] = new int[n + 1][n + 1];

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int prev = ind - 1; prev >= -1; prev--) {

                int notTake = dp[ind + 1][prev + 1];

                int take = 0;
                if (prev == -1 || nums[ind] > nums[prev]) {
                    take = 1 + dp[ind + 1][ind + 1];
                }
                dp[ind][prev + 1] = Math.max(take, notTake);
            }
        }
        return dp[0][0];
    }*/                                                              // LongIncSubSeq   Tab      TC(n*n)       SC(n*n)
    /*static int longIncSubSeq(int nums[]) {

        int n = nums.length;
        int curr[] = new int[n + 1];
        int next[] = new int[n + 1];

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int prev = ind - 1; prev >= -1; prev--) {

                int notTake = next[prev + 1];

                int take = 0;
                if (prev == -1 || nums[ind] > nums[prev]) {
                    take = 1 + next[ind + 1];
                }
                curr[prev + 1] = Math.max(take, notTake);
            }
            next = curr;
        }
        return next[0];
    }*/                                                              // LongIncSubSeq   Space    TC(n*n)       SC(2n)
    /*static public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int dp[] = new int[n];
        int maxLen = 1;
        Arrays.fill(dp , 1);

        for(int i = 1 ; i < n ; i++){
            for(int prev = 0 ; prev < i ; prev++){

                if(nums[prev] < nums[i]){
                    dp[i] = Math.max(1 + dp[prev] , dp[i]);
                    maxLen = Math.max(maxLen , dp[i]);
                }
            }
        }
        return maxLen;
    }*/                                                              // LongIncSubSeq   Space    TC(n*n)       SC(n)
    /*static public String lengthOfLIS(int[] nums) {

        int n = nums.length;
        int dp[] = new int[n];
        int hash[] = new int[n];
        int maxLen = 1;
        int maxInd = 0;
        Arrays.fill(dp , 1);

        for(int i = 1 ; i < n ; i++){
            hash[i] = i;
            for(int prev = 0 ; prev < i ; prev++){

                if(nums[prev] < nums[i]){
                    if(1 + dp[prev] > dp[i]){
                        dp[i] = 1 + dp[prev];
                        hash[i] = prev;
                    }

                }
            }
            if(maxLen < dp[i]){
                maxLen = dp[i];
                maxInd = i;
            }
        }

        String str = nums[maxInd]+" ";


        while(hash[maxInd] != maxInd){
            str = nums[hash[maxInd]] +" "+ str;
            maxInd = hash[maxInd];
        }

        return str;
    }*/                                                              // PrLongIncSubSeq Tab      TC(n*n)       SC(2n)
    /*public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);

        for(int i = 1 ; i < n ; i++){

            int num = nums[i];

            if(num > ans.get(ans.size()-1)){
                ans.add(num);
            }
            else{
                int ind = bs(ans , num);
                ans.set(ind , num);
            }
        }
        return ans.size();
    }
    static int bs(List<Integer> ans , int tar){

        int start = 0;
        int end = ans.size()-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(ans.get(mid) < tar)
                start = mid+1;
            else
                end = mid-1;
        }
        return start;
    }*/                                                              // LongIncSubSeq   Space    TC(nlogn)     SC(n)
    /*public static List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;
        int dp[] = new int[n];
        int hash[] = new int[n];
        int maxLen = 1;
        int maxInd = 0;
        Arrays.sort(nums);
        Arrays.fill(dp , 1);

        for(int i = 0 ; i < n ; i++){
            hash[i] = i;
            for(int prev = 0 ; prev < i ; prev++){

                if(nums[i] % nums[prev] == 0){
                    if(1 + dp[prev] > dp[i]){
                        dp[i] = 1 + dp[prev];
                        hash[i] = prev;
                    }

                }
            }
            if(maxLen < dp[i]){
                maxLen = dp[i];
                maxInd = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[maxInd]);
        while(hash[maxInd] != maxInd){
            ans.add(nums[hash[maxInd]]);
            maxInd = hash[maxInd];
        }
        return ans;
    }*/                                                              // LarDivSubSet    Tab      TC(n^2)       SC(2n)
    /*public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;


        for(int i = 0 ; i < n ; i++){
            for(int prev = 0 ; prev < i ; prev++){

                if(canForm(words[i] , words[prev])){
                    dp[i] = Math.max(dp[i] , 1 + dp[prev]);
                }
            }
            maxLen = Math.max(dp[i] , maxLen);
        }
        return maxLen;
    }
    private boolean canForm(String longer, String shorter) {

        if (longer.length() != shorter.length() + 1) return false;

        int i = 0, j = 0;
        while (i < longer.length()) {
            if (j < shorter.length() && longer.charAt(i) == shorter.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == shorter.length();
    }*/                                                              // LongStrChain    Tab      TC(n^2*len)   SC(n)
    /*static int longBitonicSubSeq(int nums[]){

        int n = nums.length;
        int dpPre[] = new int[n];
        int dpSuf[] = new int[n];
        int ans = 0;

        for(int i = 0 ; i < n ; i++){
            dpPre[i] = dpSuf[i] = 1;
        }

        for(int i = 1 ; i < n ; i++){
            for(int prev = 0 ; prev < i ; prev++){
                if(nums[prev] < nums[i]){
                    dpPre[i] = Math.max(dpPre[i] , dpPre[prev]+1);
                }
            }
            ans = Math.max(dpPre[i] , ans);
        }
        for(int i = n-1 ; i >= 0 ; i--){
            for(int prev = i+1 ; prev < n ; prev++){
                if(nums[prev] < nums[i]){
                    dpSuf[i] = Math.max(dpSuf[i] , dpSuf[prev]+1);
                }
            }
            ans = Math.max(dpSuf[i] , ans);
        }

        for(int i = 0 ; i < n-1 ; i++){
            ans = Math.max(ans , dpPre[i]+dpSuf[i]-1);
        }

        return ans;
    }*/                                                              // LongBitonic     Tab      TC(n^2)       SC(2n)
    /*public static int findNumberOfLIS(int[] nums) {

        int n = nums.length;
        int dp[] = new int[n];
        int count[] = new int[n];

        Arrays.fill(dp , 1);
        int max = 1;

        for(int i = 0 ; i < n ; i++){
            int currCount = 0;
            for(int prev = 0 ; prev < i ; prev++){

                if(nums[prev] < nums[i]) {
                    if (dp[i] < 1 + dp[prev]) {
                        dp[i] = 1 + dp[prev];
                        currCount = count[prev];
                    }
                    else if (dp[i] == 1 + dp[prev]) {
                        currCount += count[prev];
                    }
                }
            }
            count[i] = Math.max(currCount , 1);
            if(max < dp[i]){
                max = dp[i];
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
            if(dp[i] == max)
                ans+=count[i];

        return ans;
    }*/                                                              // NumOfLongSub    Tab      TC(n^2)       SC(2n)

    // Digit DP

    /*static int countOfOne(int a){

        String n = String.valueOf(a);

        return calculate(n , 0 , true , 0 );

    }
    static int calculate(String n , int ind , boolean tight , int countOfOne){

        if(ind == n.length())
            return countOfOne;

        int leftBound = 0;
        int rightBound = tight ? n.charAt(ind)-'0' : 9;

        int res = 0;

        for(int dig = leftBound ; dig <= rightBound ; dig++){
            res += calculate(n , ind+1, tight &&(dig==rightBound) , countOfOne + ((dig==1) ? 1 : 0));
        }
        return res;
    }*/                                                              // CountOfOne      Rec      TC(10^len)    SC(len)
    /*static int countOfOne(int a) {
        String n = String.valueOf(a);
        int len = n.length();
        int[][][] dp = new int[len][2][len + 1];

        for (int[][] outRow : dp) {
            for (int[] inRow : outRow)
                Arrays.fill(inRow, -1);
        }

        int ans = calculate(n, 0, 1, 0, dp);
        System.out.println(Arrays.deepToString(dp));
        return ans;
    }

    static int calculate(String n, int ind, int tight, int countOfOne, int[][][] dp) {
        if (ind == n.length()) return countOfOne;

        if (dp[ind][tight][countOfOne] != -1)
            return dp[ind][tight][countOfOne];

        int limit = tight == 1 ? (n.charAt(ind) - '0') : 9;
        int res = 0;

        for (int dig = 0; dig <= limit; dig++) {
            int newTight = (tight == 1 && dig == limit) ? 1 : 0;
            res += calculate(n, ind + 1, newTight, countOfOne + (dig == 1 ? 1 : 0), dp);
        }

        return dp[ind][tight][countOfOne] = res;
    }*/                                                              // CountOfOne      Mem      TC(len^2)     SC(len^2 + len)
    /*static int nonAdjVal(int a, int b) {
        return count(b) - count(a - 1);
    }

    static int count(int n) {
        if (n < 0) return 0;
        String s = String.valueOf(n);
        return calculate(s, 0, true, 10, true);
    }

    static int calculate(String s, int ind, boolean tight, int prev, boolean leadingZero) {
        if (ind == s.length()) return 1;

        int limit = tight ? (s.charAt(ind) - '0') : 9;
        int res = 0;

        for (int dig = 0; dig <= limit; dig++) {
            if (dig == prev && !leadingZero) continue;

            boolean newTight = tight && (dig == limit);
            boolean newLeadingZero = leadingZero && (dig == 0);

            res += calculate(s, ind + 1, newTight, dig, newLeadingZero);
        }
        return res;
    }*/                                                              // NonAdjVal

    /*static boolean wordBreak(String s, List<String> dict, int strInd) {
        if (strInd == s.length())
            return true;

        for (String word : dict) {
            if (s.startsWith(word, strInd)) {
                if (wordBreak(s, dict, strInd + word.length()))
                    return true;
            }
        }
        return false;
    }*/                                                              // WordBreak       Rec       TC(2^n)      SC(n)
    /*static boolean wordBreak(String s, List<String> dict, int strInd , Boolean dp[]) {
        if (strInd == s.length())
            return true;

        if(dp[strInd] != null)
            return dp[strInd];

        for (String word : dict) {
            if (s.startsWith(word, strInd)) {
                if (wordBreak(s, dict, strInd + word.length() , dp))
                    return dp[strInd] = true;
            }
        }
        return dp[strInd] = false;
    }*/                                                              // WordBreak       Mem       TC(n×diSi×L) SC(n + n) L -> MaxWordLength
    /*static boolean wordBreak(String s , List<String> wordDict){

        int n = s.length();
        boolean dp[] = new boolean[n+1];

        dp[0] = true;

        for (int i = 0; i < n; i++) {
            if (!dp[i]) continue; // skip if prefix till i can't be made

            for (String word : wordDict) {
                int len = word.length();
                int end = i + len;
                if (end <= n && s.substring(i, end).equals(word)) {
                    dp[end] = true;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    return dp[n];
    }*/                                                              // WordBreak       Tab       TC(n×diSi×L) SC(n)     L -> MaxWordLength
    /*static boolean wordBreakOptimized(String s, List<String> dictList) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty string is always reachable

        // Convert dictionary to HashSet for O(1) lookup
        Set<String> dict = new HashSet<>(dictList);

        // Precompute maximum word length to limit substring checks
        int maxWordLen = 0;
        for (String word : dict) maxWordLen = Math.max(maxWordLen, word.length());

        for (int i = 0; i < n; i++) {
            if (!dp[i]) continue; // skip unreachable positions

            // Only check substrings up to maxWordLen
            for (int len = 1; len <= maxWordLen && i + len <= n; len++) {
                // Instead of substring, use regionMatches to avoid creating new string
                if (dict.contains(s.substring(i, i + len))) {
                    dp[i + len] = true;
                }
            }
        }

        return dp[n];
    }*/                                                              // WordBreak       Spa       TC(n×L)      SC(n+m)   L -> MaxWordLength



}