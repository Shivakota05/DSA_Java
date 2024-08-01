package Arrays1;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class LuckyNum_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
        };
        List<Integer> ans = luckyNumbers(mat);
        System.out.println(ans);
    }

    public static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int min_index = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= min) {
                    min = matrix[i][j];
                    min_index = j;
                }
            }
            int max = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][min_index] > max) {
                    max = matrix[j][min_index];
                }
            }
            if (max == min) {
                list.add(max);
            }
        }
        return list;
    }
}


