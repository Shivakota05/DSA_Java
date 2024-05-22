package Basic_Programs_Java;

import java.util.Scanner;
//Subtract the Product and Sum of Digits of an Integer
public class Diff_btw_Prod_n_Sum {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            int sum;
            int prod;
            for(sum = 0; n > 0; n /= 10) {
                prod = n % 10;
                sum += prod;
            }

            int diff;
            for(prod = 1; n != 0; n /= 10) {
                diff = n % 10;
                prod *= diff;
            }

            System.out.println(prod);
            diff = prod - sum;
            System.out.println("The difference between product and sum is::" + diff);
        }
    }


