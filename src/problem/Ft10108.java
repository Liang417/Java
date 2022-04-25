package problem;
import java.util.Scanner;

public class Ft10108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int boxNum = sc.nextInt();
		int[] keyNum = new int[boxNum];
		for (int i = 0; i < keyNum.length; i++) {
			keyNum[i] = sc.nextInt();
		}
		int[][] key = new int[boxNum][];
		for (int i = 0; i < keyNum.length; i++) {
			key[i] = new int[keyNum[i]];
			for (int k = 0; k < key[i].length; k++) {
				key[i][k] = sc.nextInt();
			}
		}
		boolean[] box = new boolean[boxNum];
		open(key, box, 0);

		boolean allOpen = true;
		for (int i = 0; i < box.length; i++) {
			if (box[i] == false) {
				allOpen = false;
			}
		}
		if (allOpen == true) {
			System.out.print("可以");
		} else {
			System.out.print("不行");
		}
	}

	public static void open(int[][] key, boolean[] box, int openIndex) {
		if (box[openIndex]) {
			return;
		} else {
			box[openIndex] = true;
			for (int k = 0; k < key[openIndex].length; k++) {
				int num = key[openIndex][k];
				int n = num - 1;
				if(n >= box.length) {
					continue;
				}
				open(key, box, n);
			}
		}
	}
}
