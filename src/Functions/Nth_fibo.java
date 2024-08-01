package Functions;

import java.util.Arrays;

public class Nth_fibo {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(n_fibo(num));
    }
    static int n_fibo(int num){
        int[] fibo = new int[num+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= num; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[num];
    }
}
