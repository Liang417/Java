package other;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
//		***請特別注意轉型問題!!!***
		double temp = (double)m / f(n, k);
		if (temp > m / f(n, k)) {
			System.out.print((int)temp + 1);
		} else {
			System.out.print(m / f(n, k));
		}
	}

	public static int f(int n, int k) {
		int sum = n;
		int temp = sum;
		for (int i = 1; i < k; i++) {
			temp = (int) (temp * 0.9);
			sum += temp;
		}
		return sum;
	}
}