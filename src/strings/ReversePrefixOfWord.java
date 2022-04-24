package strings;

public class ReversePrefixOfWord {
	public static void main(String[] args) {
		String word = "abcdefd";
		char ch = 'd';
		System.out.println(reversePrefix(word, ch));
	}
	
	public static String reversePrefix(String word, char ch) {
		StringBuilder sb = new StringBuilder();
		int idx = word.indexOf(ch)+1;
        sb.append(word.substring(0, idx));
        sb.reverse();
        return "";
    }
}
