package problem;

import java.util.Scanner;

public class Ft7104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean a = true;
		boolean b = true;
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int k = 0; k < n; k++) {
				arr[k] = sc.nextInt();
			}
			for (int k = 0; k < n - 1; k++) {
				a = (arr[k] * -1) < 0;
				b = (arr[k + 1] * -1) < 0;
				if (a == b) {
					System.out.println("false");
					break;
				}else {
					System.out.println("true");
					break;
				}
			}

		}
	}
}
