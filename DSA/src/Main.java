import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static void main(String[] args) {

        int n = 123;

        for(int i = 2 ; i*i <= n ; i++){
            if(n%i == 0){
                System.out.println("Prime");
                break;
            }

        }


    }

}
/**
 *     ******    *
 *          *    *
 *     ***********
 *     *    *
 *     *    ******
 */