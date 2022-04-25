package problem;

import java.util.Scanner;

public class ft8106_V2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			sum = (i * sum) + 1;
		}
		System.out.print(sum);
	}
}