package Arrays1;
//https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.ArrayList;
import java.util.List;

public class Items_match_condition {
    public static void main(String[] args) {
        // items = {["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]};
        //rulekey = color
        //ruleValue = silver

    }
    public static  int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        for (int i = 0; i < items.size(); i++){
                if(ruleKey.equals("color")){
                    String ans = items.get(i).get(1);
                    if(ans.equals("ruleValue")){
                        count++;
                    }
                }
            }
        for (int i = 0; i < items.size(); i++){
            if(ruleKey.equals("type")){
                String ans = items.get(i).get(0);
                if(ans.equals("ruleValue")){
                    count++;
                }
            }
        }
        for (int i = 0; i < items.size(); i++){
            if(ruleKey.equals("name")){
                String ans = items.get(i).get(2);
                if(ans.equals("ruleValue")){
                    count++;
                }
            }
        }
        return count;
    }
}
