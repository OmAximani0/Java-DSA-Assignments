package strings;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "ab_a";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		if(s.length() == 1) return true;
		s = s.toLowerCase();
		s = s.replaceAll("[^a-zA-Z\\d\\s:]", "");
		int start = 0;
		int end = s.length() - 1;
		while(start < end) {
			if(s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			} else return false;
		}
        return true;
    }
}
