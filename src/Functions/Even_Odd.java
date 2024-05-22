package Functions;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Even = True and Odd=False");
        System.out.println(EvenorOdd(n));
    }

    static boolean EvenorOdd(int num) {
        return num % 2 == 0;
    }
}

