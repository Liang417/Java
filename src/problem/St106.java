package problem;

import java.util.Scanner;

public class St106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int d = sc.nextInt();
			cal(m, f, d);
		}
	}

	public static void cal(int m, int f, int d) {
		for (int i = 0; i < d; i++) {
			int temp_m = m;
			m = 2 * m + f;
			f = temp_m;
		}
		System.out.println(m + " " + f);
	}
}
