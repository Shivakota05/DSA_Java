package Arrays1;
//https://leetcode.com/problems/number-of-good-pairs/description/
public class goodpairs_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int ans = gp(arr);
        System.out.println(ans);
    }
    public static int gp(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
