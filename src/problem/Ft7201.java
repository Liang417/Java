package problem;

import java.util.Scanner;

public class Ft7201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		double t = sc.nextDouble();
		double total = t * 30;
		double result = (total / c) * 100;
		System.out.print((int) result);

	}
}