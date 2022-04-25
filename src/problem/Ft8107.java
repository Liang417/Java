package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Ft8107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[0];// 儲存輸入的分數
		int[] id = new int[0];// 儲存學號
		int count = 0;// 用來辦別輸入個幾次分數
		while (true) {
			int input = sc.nextInt();
			if (input == -1) {
				break;
			} else {
				score = Arrays.copyOf(score, score.length + 1);// 將源陣列長度+1複製並回傳
				id = Arrays.copyOf(id, id.length + 1);
				score[count] = input;// 寫入分數
				id[count] = ++count;// 寫入學號
			}
		}
		int pattern = sc.nextInt();
		if (pattern == 1) {// 小到大
			for (int k = 0; k < score.length; k++) {
				for (int i = 0; i < score.length - 1; i++) {
					if (score[i] > score[i + 1]) {
						int temp = score[i + 1];
						score[i + 1] = score[i];
						score[i] = temp;
						int temp2 = id[i + 1];
						id[i + 1] = id[i];
						id[i] = temp2;
					}
				}
			}
		} else if (pattern == 2) {// 大到小
			for (int k = 0; k < score.length; k++) {
				for (int i = 0; i < score.length - 1; i++) {
					if (score[i] < score[i + 1]) {
						int temp = score[i + 1];
						score[i + 1] = score[i];
						score[i] = temp;
						int temp2 = id[i + 1];
						id[i + 1] = id[i];
						id[i] = temp2;
					}
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(id[i] + "." + score[i]);
		}
	}
}
