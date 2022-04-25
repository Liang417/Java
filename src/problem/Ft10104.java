package problem;

import java.util.Scanner;

public class Ft10104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] strScore = new String[sc.nextInt()];
		for (int i = 0; i < strScore.length; i++) {
			strScore[i] = sc.next();
			if (strScore[i].equals("E")) {
				strScore = removeError(strScore, i);
				i -= 2;
			}
		}
		int[] intScore = new int[strScore.length];
		int sum = 0;
		for (int i = 0; i < strScore.length; i++) {
			if (strScore[i].equals("+")) {
				intScore[i] = intScore[i - 2] + intScore[i - 1];
			} else if (strScore[i].equals("-")) {
				intScore[i] = intScore[i - 2] - intScore[i - 1];
			} else if (strScore[i].equals("D")) {
				intScore[i] = intScore[i - 1] * 2;
			} else {
				intScore[i] = Integer.parseInt(strScore[i]);
			}
		}
		for (int i = 0; i < intScore.length; i++) {
			sum += intScore[i];
		}
		System.out.print(sum);
//		for (int i = 0; i < strScore.length; i++) {
//			System.out.print(strScore[i] + " ");
//		}
	}

	public static String[] removeError(String[] strScore, int removeIndex) {
		String[] newArr = new String[strScore.length - 2];
		System.arraycopy(strScore, 0, newArr, 0, removeIndex - 1);
		return newArr;
	}
}