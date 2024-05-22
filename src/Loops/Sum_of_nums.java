package Loops;

import java.util.*;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Sum_of_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum + n;
            n = in.nextInt();
        }
        System.out.println(sum);
    }

}
