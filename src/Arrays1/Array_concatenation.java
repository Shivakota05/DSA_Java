package Arrays1;
//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class Array_concatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums){
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
