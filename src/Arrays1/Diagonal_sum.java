package Arrays1;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class Diagonal_sum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = msum(arr);
        System.out.println(ans);
    }
    public static int msum(int[][] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i][i];
            ans += nums[i][nums.length-1-i];
        }
        if(nums.length % 2 == 0) {
            return ans;
        }
        else{
            return ans -= nums[nums.length/2][nums.length/2];
        }
    }
}
