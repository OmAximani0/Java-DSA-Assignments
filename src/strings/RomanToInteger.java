package strings;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		String s = "MCMXCIV";
//		s = "LVIII";
//		s = "III";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int ans = map.get(s.charAt(s.length()-1));
		int lastVal = ans;
		
		for(int i = s.length()-2; i >= 0; i--) {
			if(map.get(s.charAt(i)) < lastVal) {
				ans -= map.get(s.charAt(i));
				lastVal = map.get(s.charAt(i));
			} else {
				ans += map.get(s.charAt(i));
				lastVal = map.get(s.charAt(i));
			}
		}
		
        return ans;
    }
}
