package strings;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 1) return strs[0];
		int maxLen = strs[0].length();
		String str = strs[0];
		for(String tmp : strs) {
			if(maxLen < tmp.length()) str = tmp;
		}
		while(!isLongestPrefix(strs, str)) 
			str = str.substring(0, str.length()-1);
        return str;
    }
	
	/*
	 * A better runtime performer from - 
	 * https://leetcode.com/problems/longest-common-prefix/discuss/1969272/java-Solution-oror-Easy-To-Understand-oror-Shortest-trick
	 * 
		public static String longestCommonPrefix(String[] strs) {
			if(strs.length == 1) return strs[0];
			String str = strs[0];
			
			for(int i=0; i< strs.length; i++) {
				while(strs[i].indexOf(str) != 0) {
					str = str.substring(0, str.length() - 1);
				}
			}
			return str;
		}
	*/
	
	public static boolean isLongestPrefix(String[] arr, String prefix) {
		for(String str: arr) {
			if(!str.startsWith(prefix)) return false;
		}
		return true;
	}
}
