package Arrays1;

import java.util.Arrays;

public class running_arraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           // for (int j = i+1; j < nums.length ; j++) {
             //   ans[i] = nums[i] + nums[i-1];
           // }
                ans[i] = nums[i]+nums[i-1];
        }
        return ans;
    }
}
