package strings.easy;

public class ToLowerCase {
	public static void main(String[] args) {
		String s = "LOVELY";
		System.out.println(toLowerCase(s));
	}
	
	public static String toLowerCase(String s) {
		for (int i = 0; i < s.length(); i++) {
			
			if((int)s.charAt(i) <= 90) {
				s = s.replace(s.charAt(i),(char) (s.charAt(i)+32));
			}
		}
        return s;
    }
}
