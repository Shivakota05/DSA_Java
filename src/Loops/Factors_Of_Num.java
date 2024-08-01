package Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Factors_Of_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        for (int i = 1; i <= num; i++) {
//            if( num%i == 0){
//                System.out.println(i+" ");
//            }
//        }
        prime_factors(13);
    }
    static void prime_factors(int n){
        int i = 2;
        while(i * i <= n) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            i++;
        }
            if(n > 1){
                System.out.println(n);
            }

    }
}
