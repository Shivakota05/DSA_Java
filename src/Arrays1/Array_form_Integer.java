package Arrays1;
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_form_Integer {
    public static void main(String[] args) {
        int[] arr = {2,7,4};
        int k = 181;
        ArrayList<Integer> list = addToArrayForm(arr,k);
        System.out.println(list);
    }
    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        for(int i = n-1;i >= 0;i--){
            num[i] = num[i] + k % 10 + c;
            list.add(num[i]%10);
            c = num[i] / 10;
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
