package strings;

public class MaxRepeatingSubstring {
	public static void main(String[] args) {
		String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
		String word = "aaaba";
		System.out.println(maxRepeating(sequence, word));
	}
	
	public static int maxRepeating(String sequence, String word) {
		int ans = 0;
		StringBuilder sb = new StringBuilder(word);
		while(sequence.indexOf(sb.toString()) != -1) {
			ans++;
			sb.append(word);
		}
		return ans;
    }
}
