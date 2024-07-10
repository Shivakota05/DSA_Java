package Arrays1;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.Arrays;

public class kids_vth_max_chocos {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        boolean[] ans = candies(candies,3);
        System.out.println(Arrays.toString(ans));

    }
    public static boolean[] candies(int[] candies,int extracandies){
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extracandies;
            if(candies[i] >= max(candies)){
                result[i] = true;
            }
            else{
                result[i] = false;
            }
        }
        return result;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
}
