package strings.easy;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
//		String[] arr = s.stripTrailing().split(" ");
//		return arr[arr.length-1].length();
		int ans = 0;
		for(int i=s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') ans++;
			if(s.charAt(i) == ' ' && ans > 0) break;
		}
		
		return ans;
	}
}
