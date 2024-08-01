package Arrays1;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class Plus_one {
    public static void main(String[] args) {
        int[] mat = {1,2,9,9};
        System.out.println(Arrays.toString(plusone(mat)));
    }
    public static int[] plusone(int[] digits){
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0 ;
                return digits;
            }
        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        ans[1] = 0;
        return ans;
    }
}
