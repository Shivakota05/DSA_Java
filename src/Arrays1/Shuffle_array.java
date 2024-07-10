package Arrays1;
//https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {1,3,5,2,4,6};
        s_array(arr,3);

    }
    static void s_array(int[] arr,int n){
      int[] newarr = new int[2*n];
      int k = 0;
        for (int i = 0; i < n; i++) {
            newarr[k] = arr[i];
            newarr[k+1] = arr[i+n];
            k+=2;
        }
        System.out.println(Arrays.toString(newarr));
    }
}


