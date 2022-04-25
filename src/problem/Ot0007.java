package problem;

import java.util.Scanner;

public class Ot0007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testTimes = sc.nextInt();
		for (int i = 0; i < testTimes; i++) {
			int k = sc.nextInt();
			int arr[] = new int[k];
			int max = 0;
			for (int a = 0; a < k; a++) {
				arr[a] = sc.nextInt();
				if (arr[a] > max) {
					max = arr[a];
				}
			}
			System.out.println(max);
		}
	}
}
