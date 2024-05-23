package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_row_col_sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int[][] arr= new int[n+1][m+1];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("The Row Sum is::");
        rowsum(arr);
        System.out.println();
        System.out.print("The Column Sum is::");
        colsum(arr);
    }
    static void rowsum(int[][] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int rsum = 0;
            for (int j = 0; j < arr[i].length-1; j++) {
                rsum += arr[i][j];
            }
            System.out.print(rsum+" ");
        }
    }
    static void colsum(int[][] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int csum = 0;
            for (int j = 0; j < arr[i].length - 1; j++) {
                    csum += arr[j][i];

            }
            System.out.print(csum+" ");
        }
    }

}
