package problem;

import java.util.Scanner;

public class ft7108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int g = sc.nextInt();
		int max = 1000;
		int count = 0;
		while (true) {
			int input = sc.nextInt();
			if (input == -1) {
				break;
			} else {
				count++;
				if (count % 2 == 0) {
					c -= 20;
					if (c < 50) {
						c = 50;
					}
				}
				if (input * c > max) {
					input = max / c;
				}
				int temp = c * input / 100;
				max += temp * g;
			}
		}
		System.out.print(max);
	}
}
