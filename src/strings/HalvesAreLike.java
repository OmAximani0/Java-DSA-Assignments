package strings;

public class HalvesAreLike {
	
	public static void main(String[] args) {
		String s = "textbook";
		System.out.println(halvesAreAlike(s));
	}
	
	public static boolean halvesAreAlike(String s) {
		int mid = (s.length()-1)/2;
		if(countVowels(s, 0, mid) == countVowels(s, mid+1, s.length()-1)) return true;
        return false;
    }
	
	public static int countVowels(String s, int start, int end) {
		int count = 0;
		for(;start<=end;start++) {
			char i = s.charAt(start);
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U') count++; 
		}
		return count;
	}
}
