package Arrays1;
//https://leetcode.com/problems/find-the-highest-altitude/
public class Highest_altitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
    public static  int largestAltitude(int[] gain) {
        int[] alti = new int[gain.length+1];
        alti[0] = 0;
        for (int i = 1; i <= gain.length; i++) {
            alti[i] = gain[i-1]+alti[i-1];
        }
        int max = alti[0];
        for(int i =1;i < alti.length;i++){
            if(alti[i]>=max){
                max = alti[i];
            }
        }
        return max;
    }
}
