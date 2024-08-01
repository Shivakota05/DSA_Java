package Patterns_Various;

import java.util.Scanner;

public class Half_diamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        hd(n);
    }
    public static void hd(int n){
        for (int i = 0; i < 2 * n; i++) {
            int c = (i > n) ? 2 * n -i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
