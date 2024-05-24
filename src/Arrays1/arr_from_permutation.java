package Arrays1;
//https://leetcode.com/problems/build-array-from-permutation/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arr_from_permutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        //perm_arr(arr);
        int[] nas = buildArray(arr);
        System.out.println(Arrays.toString(nas));
    }
//    static void perm_arr(int[] arr){
//        int[] arr1 = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i]=arr[arr[i]];
//        }
//        System.out.println(Arrays.toString(arr1));
//    }
    static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
