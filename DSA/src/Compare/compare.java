
// By Class

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;


class MyComparator implements Comparator<Integer>{                              // # 1 By Class        

    @Override
    public int compare(Integer i1 , Integer i2){
        return i2 - i1;
        // Jo Pehle Usse Pehle
        // 3 , 5
        // 5 , 3
    }

}

public class compare {
    public static void main(String[] args) {
        

    /*  Integer arr[] = {5,6,7,8,1,2,3,4,9};                                 // # 1 By Class
        Arrays.sort(arr , new MyComparator());
        System.out.println(Arrays.toString(arr)); */
    /*  Integer arr [] = {5,6,7,1,2,3,8,9,4,};                               // # 2 In Arrays.sort Method
       Arrays.sort(arr , new Comparator<Integer>() {

        public int compare(Integer i1 , Integer i2){
                return i2 - i1;
        }

       });
       System.out.println(Arrays.toString(arr)); */
       
        Integer arr[][] = {{0,5},
                           {0,2},
                           {0,3},
                           {0,4}};

        Arrays.sort(arr , (a , b) -> (b[1] - a[1]));
        
        /* for(Integer row[] : arr)
        Arrays.sort(row);
        System.out.println(Arrays.toString(arr));*/
        System.out.println(Arrays.deepToString(arr));

    /*  Integer arr[] = {5,6,7,1,2,3,8,9,4,};                                // # 3 Lamda Expression
        Arrays.sort( arr , (a,b) -> (b - a));
        System.out.println(Arrays.toString(arr)); */
    /*  int[][] arr = {{1,3} , {15 ,119} , {2,6} , {8,10}};                  // # 4 2-D Array
    Arrays.sort(arr , new Comparator<int[]>() {

        public int compare (int i1[] , int i2[]){
            return i1[0] - i2[0];
        }

    });
    System.out.println(Arrays.deepToString(arr)); */
    /*  int[][] arr = {{1,3} , {15 ,19} , {2,6} , {8,10} };                  // # 5 2-D Array By Lamda
        
    // Arrays.sort(arr , (a , b) -> (a[0] - b[0]));
    Arrays.sort(arr , (a , b) -> Integer.compare(a[0] , b[0]));
    System.out.println(Arrays.deepToString(arr)); */

}

}
