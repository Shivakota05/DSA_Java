package Functions;

import java.util.Scanner;
//Tell if the given 3 numbers form Pythogorean Triplet or not
public class Is_Pythogorean_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n3 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(isPtriplets(n1, n2, n3));
    }

    static boolean isPtriplets(int n1, int n2, int n3) {
        if (n1 * n1 == n2 * n2 + n3 * n3) {
            return true;
        } else if (n2 * n2 == n1 * n1 + n3 * n3) {
            return true;
        } else {
            return n3 * n3 == n2 * n2 + n1 * n1;
        }
    }
}
