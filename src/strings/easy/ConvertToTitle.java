package strings.easy;

public class ConvertToTitle {
	public static void main(String[] args) {
		System.out.println(convertToTitle(26));
	}
	
	public static String convertToTitle(int columnNumber) {
		columnNumber--;
		StringBuilder builder = new StringBuilder();
		while(columnNumber >= 0) {
			char temp = (char) (columnNumber%26+65);
			builder.append(temp);
			columnNumber /= 26;
			columnNumber--;
		}
        return builder.reverse().toString();
    }
}
