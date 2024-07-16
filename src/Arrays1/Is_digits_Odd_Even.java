package Arrays1;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
import java.util.ArrayList;
import java.util.Arrays;

public class Is_digits_Odd_Even {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums){
        int[] res = new int[nums.length];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while(nums[i] > 0) {
                int rem = nums[i] % 10;
                nums[i] /= 10;
                count++;
            }
            res[i] = count;
            if(res[i] % 2 == 0){
                ans++;
            }
        }
      return ans;
    }
}
