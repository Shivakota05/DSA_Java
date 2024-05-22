package Functions;

import java.util.Scanner;

public class Primes_btw_2nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        for(int i = n1; i <= n2; ++i) {
            if (primes(i)) {
                System.out.print("" + i + " ");
            }
        }
    }

    static boolean primes(int num) {
        if (num <= 1) {
            return false;
        } else {
            int count;
            for(count = 2; count * count <= num; ++count) {
                if (num % count == 0) {
                    return false;
                }
            }

            return count * count > num;
        }
    }
}
