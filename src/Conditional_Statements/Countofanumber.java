package Conditional_Statements;

import java.util.Scanner;

public class Countofanumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}

