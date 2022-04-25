package problem;

import java.util.Scanner;

public class Ft9104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			result = result * 10 + a;
			sum += result;
		}
		System.out.print(sum);
	}
}
