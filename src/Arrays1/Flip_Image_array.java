package Arrays1;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class Flip_Image_array {
    public static void main(String[] args) {
        int[][] actual = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] ans = flipAndInvertImage(actual);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        //int[][] res = new int[image.length][image.length];
        int rows = 3;
        int cols = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][cols - j - 1];
                image[i][cols - j - 1] = temp;
            }
        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols / 2; j++) {
//                if (image[i][j] == 0) {
//                    res[i][j] = 1;
//                } else {
//                    res[i][j] = 0;
//                }
//            }
//        }
        return image;
    }
}

