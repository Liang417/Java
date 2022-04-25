package problem;

import java.util.Scanner;

public class Ft7208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		cal(b1,b2);
	}

	public static void cal(int b1, int b2) {
		int count = 1;
		do {
			b2 = (b2-b1)/2;
			count++;
		}while(b1 != b2);
		System.out.println(count);
	}
}
