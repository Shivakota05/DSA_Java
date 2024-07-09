package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/richest-customer-wealth/
public class Richest_customer_bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        maximumWealth(arr);
    }

    public static void maximumWealth(int[][] accounts) {
        int[] rsum = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                rsum[i] = rsum[i] + accounts[i][j];
            }
        }
        int max = rsum[0];
        for (int i = 0; i < rsum.length; i++) {
            if(rsum[i]> max){
                max = rsum[i];
            }
        }
        System.out.println(max);
    }
}
