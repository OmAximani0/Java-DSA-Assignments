package strings;

public class SortingTheSentence {
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}

	public static String sortSentence(String s) {
		String[] strArr = s.split(" ");
		String[] ans = new String[strArr.length];
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			int index = (int)strArr[i].charAt(strArr[i].length()-1)-49;
			ans[index] = strArr[i];
		}
		for (int i = 0; i < ans.length; i++) {
			builder.append(ans[i]);
			if(i != ans.length-1) builder.append(" ");
		}
		
        return builder.toString().replaceAll("[1-9]", "");
    }
}
