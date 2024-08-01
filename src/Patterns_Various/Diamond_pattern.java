package Patterns_Various;

public class Diamond_pattern {
    public static void main(String[] args) {
        dp(5);
    }
    public static void dp(int n){
        for (int i = 0; i < 2 * n; i++) {
            int s = i > n ? i-n : n-i;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            int c = i > n ? 2 * n - i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
