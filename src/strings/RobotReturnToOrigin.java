package strings;

import java.util.Arrays;

public class RobotReturnToOrigin {
	public static void main(String[] args) {
		String moves = "DURDLDRRLL";
		System.out.println(judgeCircle(moves));
	}
	
	public static boolean judgeCircle(String moves) {
		int[] position = {0, 0};
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
				case 'U':
					position[1] += 1;
					break;
				case 'D':
					position[1] -= 1;
					break;
				case 'R':
					position[0] += 1;
					break;
				case 'L':
					position[0] -= 1;
					break;
			}
		}
		System.out.println(Arrays.toString(position));
		return position[0] == 0 && position[1] == 0;
    }
}
