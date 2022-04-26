package string.medium;

import java.util.Arrays;

public class JumpGame7 {

	public static void main(String[] args) {
		String s = "01000110110";
		int minJump = 2;
		int maxJump = 3;
		System.out.println(canReach(s, minJump, maxJump));
	}
	
//	public static boolean canReach(String s, int minJump, int maxJump) {
//		int i = 0;
//		int j = 0;
//        while(i<s.length()-1) {
//        	if(s.charAt(j+minJump) == '0') j = minJump;
//        	else if(s.charAt(j+maxJump) == '0') j = maxJump;
//        	else return false;
//        	
//        	if(i + minJump <= j && j <= Math.min(i + maxJump, s.length() - 1)) {
//            	i = j;
//            } else {
//            	return false;
//            }
//        }
//		return true;
//	}
	
	public static boolean canReach(String s, int minJump, int maxJump) {
		if(s.matches("[0]+")) return true;
		if(s.charAt(s.length()-1) == '1') return false;
		System.out.println(Arrays.toString(s.split("[0]+")));
		for(String tmp: s.split("[0]+")) {
			if(tmp.length() > minJump || tmp.length() > maxJump) {
				return false;
			}
		}
		return true;
//		int i = 0;
//        while(i<s.length()-1) {
//        	int j = s.indexOf("0", i+1);
//            if(i + minJump <= j && j <= Math.min(i + maxJump, s.length() - 1)) {
//            	i = j;
//            } else {
//            	return false;
//            }
//        }
//		return true;
	}

}
