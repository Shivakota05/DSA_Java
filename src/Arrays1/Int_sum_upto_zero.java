package Arrays1;
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class Int_sum_upto_zero {
    public static void main(String[] args) {
        int[] ans = sumZero(5);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sumZero(int n){
        int[] zero = new int[n];
        int num = 1;
        for(int i = 0; i <= n/2 ; i++){
                    zero[i] = num;
                    zero[n-i-1] = -num;
                    num++;
        }
        if(n % 2 != 0){
            zero[n/2] = 0;
        }
        return zero;
    }
}
