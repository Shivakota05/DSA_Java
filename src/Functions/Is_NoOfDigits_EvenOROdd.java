package Functions;

import java.util.Scanner;
//Display whether the number of digits in a number are even or odd
public class Is_NoOfDigits_EvenOROdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        digits(nums);
    }

    static void digits(int num) {
        if (num < 0) {
            num *= -1;
        }

        int count;
        for(count = 0; num > 0; num /= 10) {
            ++count;
        }

        if (count % 2 == 0) {
            System.out.println("even no. of digits");
        } else {
            System.out.println("odd no. of digits");
        }

    }
}
