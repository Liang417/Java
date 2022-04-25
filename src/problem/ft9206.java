package problem;

import java.util.Scanner;

public class ft9206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// n*n皚
		int[][] arr = new int[n][n];
		int sum = 0;// 羆璶籠加糷计
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				arr[i][k] = sc.nextInt();// 瓷加加糷计
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int columnMax = 0;
				int rowMax = 0;
				for (int k = 0; k < n; k++) {
					if (arr[i][k] > columnMax) {
						columnMax = arr[i][k];
					}
					if (arr[k][j] > rowMax) {
						rowMax = arr[k][j];
					}
					int temp = Math.min(rowMax, columnMax);
					if (k == n - 1 && temp > arr[i][j]) {
						sum += temp - arr[i][j];
					}
				}
			}
		}
		System.out.print(sum);
	}
}

