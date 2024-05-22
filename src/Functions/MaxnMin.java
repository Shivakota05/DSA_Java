package Functions;

import java.util.Scanner;

public class MaxnMin {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            int ans1 = maxi(n1, n2, n3);
            System.out.print("The max is::" + ans1);
            System.out.println();
            int ans2 = mini(n1, n2, n3);
            System.out.print("The min is::" + ans2);
        }

        static int maxi(int n1, int n2, int n3) {
            int max = n1;
            if (n2 > n1) {
                max = n2;
            }

            if (n3 > max) {
                max = n3;
            }

            return max;
        }

        static int mini(int n1, int n2, int n3) {
            int min = n1;
            if (n2 < n1) {
                min = n2;
            }

            if (n3 < min) {
                min = n3;
            }

            return min;
        }
    }

