package Functions;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);

    }
    static void factorial(int num){
        int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        System.out.println(fact);
    }
}
