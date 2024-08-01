package Basic_Programs_Java;

public class armstrong {
    public static void main(String[] args) {
         int num = 1634;
         int len = n_digits(num);
        arm(num,len);

    }
    public static int n_digits(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num = num / 10;
        }
        return len;
    }
    public static void arm(int num,int len){
       int  s = 0;
       int temp = num;
       while(temp!=0){
           int rem = temp % 10;
           s = s + (int)Math.pow(rem,len);
           temp /= 10;
       }
       if( s != num){
           System.out.println("no");
       }
       else{
           System.out.println("yes");
       }
    }
}
