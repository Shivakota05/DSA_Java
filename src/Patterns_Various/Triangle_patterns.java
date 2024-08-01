package Patterns_Various;

public class Triangle_patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Simple Triangle Pattern using *");
        st(n);
        System.out.println("Inverse Triangle Pattern using *");
        st1(n);
        System.out.println("Simple Numbers Triangle Pattern ");
        st3(n);
        System.out.println("Inverse Numbers Triangle Pattern ");
        st4(n);
        System.out.println("Alphabets triangle");
        st5(n);
        System.out.println("Rotated triangle");
        st6(n);
        System.out.println("Inverted rotated triangle");
        st7(n);
        /*
          *
         ***
        *****
       *******
         */
        st8(n);
    }
    //simple triangle
    public static void st(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    //inverted triangle
    public static void st1(int n){
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    // simple triangle numbers pattern
    public static void st3(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void st4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void st5(int n){
        for (int i = 1; i <= n; i++) {
            char alpha = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(alpha + " ");
                alpha++;
            }
            System.out.println();
        }
    }
    public static void st6(int n){
//        String c = " ";
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void st7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void st8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i -1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
