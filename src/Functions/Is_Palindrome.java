package Functions;

import java.util.Scanner;

public class Is_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        isp(s);
    }

    static void isp(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; --i) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("no");
        }
    }
}
