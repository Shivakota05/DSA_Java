package Conditional_Statements;

import java.util.Scanner;

public class Is_Num_EvenOROdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 != 0) {
            System.out.println("ODD NUMBER");
        } else {
            System.out.println("EVEN NUMBER");
        }
    }
}

