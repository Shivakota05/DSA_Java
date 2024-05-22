package Basic_Programs_Java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();//Taking num from keyboard from user
        System.out.println(num);
        String msg = in.next();//Taking msg from keyboard by user
        System.out.println(msg);
    }
}
