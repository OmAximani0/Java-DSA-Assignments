package strings.easy;

public class LongPressedName {

	public static void main(String[] args) {
		String name = "saeed";
		String typed = "ssaaedd";
		System.out.println(isLongPressedName(name, typed));
	}

	public static boolean isLongPressedName(String name, String typed) {
		if(name.charAt(0) != typed.charAt(0)) return false;
        int i = 1, j = 1;
        while(i < typed.length()) {
            if(j < name.length() && name.charAt(j) == typed.charAt(i)) {
                i++;
                j++;
            }
            else if(typed.charAt(i) == name.charAt(j-1)) i++;
            else return false;
        }
        
        return name.length() == j;
    }
}
