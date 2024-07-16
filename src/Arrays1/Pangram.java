package Arrays1;

public class Pangram {
    public static void main(String[] args) {
        String str = "tjxfwasabwohqujwowmakpyuuqvgfab";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);

    }
     static boolean checkIfPangram(String sentence) {
        boolean ans = true;
        sentence = sentence.toLowerCase();
         for (char i = 'a'; i < 'z'; i++) {
             if(sentence.indexOf(i)==-1){
                 ans = false;
             }
             else ans = true;
         }
         return ans;
     }
}
