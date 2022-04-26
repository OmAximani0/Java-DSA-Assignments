package strings.easy;

public class AlphabetToInteger {

	public static void main(String[] args) {
		String s = "1326#";
//		freqAlphabets(s);
		System.out.println(freqAlphabets(s));
	}
	
	public static String freqAlphabets(String s) {
		StringBuilder builder = new StringBuilder();
		int n = s.length()-1;
		for(int i=n;i>=0;i--) {
			if(s.charAt(i) == '#') {
				int curInxValue = Integer.valueOf(s.substring(i-2, i));
				builder.append((char)(curInxValue + 96));
				i-=2;
			}
			else {
				int curInxValue = Integer.valueOf(s.substring(i,i+1));
				builder.append((char)(curInxValue + 96));
			}
		}
		return builder.reverse().toString();
    }

}
