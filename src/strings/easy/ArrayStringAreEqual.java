package strings.easy;

public class ArrayStringAreEqual {
	public static void main(String[] args) {
		String[] word1 = {"a", "cb"};
		String[] word2 = {"ab", "c"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String builder1 = concatString(word1);
		String builder2 = concatString(word2);
		if (builder1.equals(builder2)) return true;
        return false;
    }
	
	public static String concatString(String[] arr) {
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			ans.append(arr[i]);
		}
		return ans.toString();
	}
}
