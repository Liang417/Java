package problem;

import java.util.Scanner;

public class Ft9101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = new int[m];
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				arr[i][k] = sc.nextInt();
			}

		}

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < n; k++) {
				if (k == n - 1) {
					System.out.println(arr[k][i]);
				} else {
					System.out.print(arr[k][i] + " ");
				}
			}
		}
	}
}
