package Loops;

import java.util.Scanner;

public class SumofDigits_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum;
        for(sum = 0; n > 0; n /= 10) {
            int rem = n % 10;
            sum += rem;
        }

        System.out.println(sum);
    }
}
