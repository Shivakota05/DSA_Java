package Conditional_Statements;

import java.util.Scanner;
//Use Arithmetic operators by using two numbers
public class Operatons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        String op = in.next();
        if (op.equals("+")) {
            int sum = n1 + n2;
            System.out.println("The sum is: " + sum);
        }

        if (op.equals("-")) {
            System.out.println("The difference is: " + (n1 - n2));
        }

        if (op.equals("*")) {
            System.out.println("The multiplication is: " + n1 * n2);
        }

        if (op.equals("/")) {
            System.out.println("The division is: " + n1 / n2);
        }

        if (op.equals("%")) {
            System.out.println("The modulo is: " + n1 % n2);
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
