package problem;

import java.util.Scanner;

public class Ft8103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() + sc.nextInt();
		int b = sc.nextInt() + sc.nextInt();
		int c = sc.nextInt() + sc.nextInt();
		if (a >= b && a >= c) {
			System.out.print("A");
		} else if (b > a && b >= c) {
			System.out.print("B");
		}else {
			System.out.print("C");
		}
	}
}
