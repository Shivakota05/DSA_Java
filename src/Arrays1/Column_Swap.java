package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Column_Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols / 2; j++){
                // Swap elements
                int temp = array[i][j];
                array[i][j] = array[i][cols - 1 - j];
                array[i][cols - 1 - j] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
