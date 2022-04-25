package problem;

import java.util.Scanner;

public class st206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] serial = new int[n];
		int[] score = new int[n];
		for (int i = 0; i < score.length; i++) {
			serial[i] = sc.nextInt();// 學號
			score[i] = sc.nextInt();// 分數
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n - 1; i++) {
				if (score[i + 1] > score[i]) {
					int temp = score[i + 1];
					score[i + 1] = score[i];
					score[i] = temp;
					int temp2 = serial[i + 1];
					serial[i + 1] = serial[i];
					serial[i] = temp2;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(serial[i] + "." + score[i]);
		}
		sc.close();
	}
}