package Functions;

import java.util.Scanner;

public class Sum_of_N_Natural_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sum(num));
    }

    static int sum(int n) {
        int sum = 0;

        for(int i = 1; i <= n; ++i) {
            sum += i;
        }

        return sum;
    }
}
