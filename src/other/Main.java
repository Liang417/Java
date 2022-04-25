package other;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] data = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < 4; k++) {
				data[i][k] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			int a = cal(data[i][0], data[i][1], data[i][2], data[i][3]);
			System.out.println("success" + a);
		}
	}

	public static int cal(int k, int l, int x, int f) {
		int morningcount = 0;
		int nightcount = 0;
		int sum = x - k + l;
		if (x - k < 0) {
			morningcount = 1;
			return morningcount;
		} else if (x - k + l > x) {
			nightcount = 1;
			return nightcount;
		} else {
			do {
				System.out.println(sum);
				sum = morningCal(k, sum, f);
				morningcount++;
				if (sum < 0) {
					return morningcount;
				}
				sum = nightCal(l, sum);
				nightcount++;
				if (sum > x) {
					return nightcount;
				}
			} while (sum > 0 || sum < x);
		}
		return 999;
	}

	public static int morningCal(int k, int sum, int f) {
		return sum - (k * (1 - f) / 100);
	}

	public static int nightCal(int l, int sum) {
		return sum + l;
	}
}
