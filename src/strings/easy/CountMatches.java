package strings.easy;

import java.util.List;

public class CountMatches {
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if(ruleKey.equals("color")) index = 1;
        else if(ruleKey.equals("name")) index = 2;
        for (List<String> arr : items) {
            if(arr.get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}
