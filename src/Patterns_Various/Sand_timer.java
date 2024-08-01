package Patterns_Various;

public class Sand_timer {
    public static void main(String[] args) {
       st(6);
    }
    public static void st(int n){
        for (int i = 1; i < 2 * n -1; i++) {
            int c = i<n ? n-i: i-n+1 ;
            int s = i<n ? i-1: 2*n-i-2;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("*"+" ");
            }
                System.out.println();
        }
    }
}

