package Arrays1;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.ArrayList;
import java.util.Arrays;

public class Target_array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        int[] ans = new int[index.length];
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            target.add(index[i],nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = target.get(i);
        }
        return ans;
    }
}