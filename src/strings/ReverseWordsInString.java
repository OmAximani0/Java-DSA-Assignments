package strings;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		s = "God Ding";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		String[] arr = s.split(" ");
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			StringBuilder tempBuilder = new StringBuilder(arr[i]);
			builder.append(tempBuilder.reverse());
			if(i != arr.length-1) builder.append(" "); 
		}
        return builder.toString();
    }
}
