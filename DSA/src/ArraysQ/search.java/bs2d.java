import java.util.Arrays;

public class bs2d {
    public static void main(String[] args) {

        
        int ar[][] = {{10,20,30,40},
                      {12,24,36,45},
                      {13,26,39,52},
                      {14,28,42,56} };
        int arr[][] = {{1 , 2 , 3 , 4},{5 , 6 , 7 , 8},{9 , 10, 11,12},{13, 14, 15, 16}};
        int target = 8;
        // System.out.println(Arrays.toString(rowcol(ar, target)));
        // System.out.println(Arrays.toString(rowcolS(arr, target)));
        int chk [][] = {{1,1}};
        System.out.println(Arrays.toString(rowcolS(chk, 3)));
    }

static int[] rowcol(int arr[][]  ,int target){
        
        int row = 0;
        int col = arr.length-1;

        while(row < arr.length && col >= 0){

            if(arr[row][col] == target){
                return new int[]{row,col};
            }else if (arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int []{-1,-1};
    }
static int[] rowcolS(int arr[][], int target){

    int start = 0;
    int end = arr.length*arr[0].length;

    while(start <= end){
        int mid = start  + (end - start)/2;
        int row = mid/arr[0].length ; 
        int col = mid%arr[0].length ;   
        // System.out.println(row);
        // System.out.println(col);
        if(row >= arr.length || col >= arr[0].length)break;
        if(arr[row][col] == target){
            return new int[]{row,col};
        }
        if(arr[row][col] < target){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }

    return new int []{-1,-1};
}

}