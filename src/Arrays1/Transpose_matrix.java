package Arrays1;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/description/
public class Transpose_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans = transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] transpose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
