package Functions;

import java.util.Scanner;

public class Isprime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            Isp(n);
        }

        static void Isp(int num) {
            int count = 0;

            for(int i = 1; i < num * num; ++i) {
                if (num % i == 0) {
                    ++count;
                }
            }

            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }

        }
    }
