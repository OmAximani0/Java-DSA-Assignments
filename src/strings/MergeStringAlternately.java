package strings;

public class MergeStringAlternately {

	public static void main(String[] args) {
		String word1 = "ab", word2 = "pqrs";
		System.out.println(mergeAlternately(word1, word2));
	}
	
	public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        boolean isWord1Long = word1.length() > word2.length();
        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if(isWord1Long) {
            sb.append(word1.substring(i));
        } else {
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }

}
