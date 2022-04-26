package strings.easy;

public class ImplimentStr {
	public static void main(String[] args) {
		String haystack = "hello";
		haystack = "aaaaa";
		String needle = "ll";
		needle = "bba";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }
}
