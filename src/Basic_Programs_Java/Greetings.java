package Basic_Programs_Java;

import java.util.Scanner;
//Take a name from user and Display Hello with the input String.
public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello " + name);
    }
}
