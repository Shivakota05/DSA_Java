package Basic_Programs_Java;

import java.util.Scanner;

public class Inr_to_Usd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount in INR");
        float inr = (float)in.nextInt();
        double usd = (double)inr / 83.465;
        System.out.println("the usd :" + usd);
    }
}
