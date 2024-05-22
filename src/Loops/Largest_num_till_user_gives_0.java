package Loops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Largest_num_till_user_gives_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        while(n>0){
            if(n>max){
                max = n;
            }
            n = in.nextInt();
        }
        System.out.println(max);
    }
}
