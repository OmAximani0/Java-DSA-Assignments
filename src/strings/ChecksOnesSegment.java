package strings;

public class ChecksOnesSegment {

	public static void main(String[] args) {
		String s = "1001";
		System.out.println(checkOnesSegment(s));
	}
	
	public static boolean checkOnesSegment(String s) {
		return !s.contains("01");
    }

}
