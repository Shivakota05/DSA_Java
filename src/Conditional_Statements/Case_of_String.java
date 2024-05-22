package Conditional_Statements;

import java.util.Scanner;

public class Case_of_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower");
        } else {
            System.out.println("Upper");
        }

    }
}
