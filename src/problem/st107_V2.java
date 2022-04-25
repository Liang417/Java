package problem;

import java.util.Scanner;

public class st107_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gcd = 0;
		String str = "";
		while (true) {
			int temp = sc.nextInt();
			if (temp == -1) {
				break;
			}
			if (gcd == 0) {
				gcd = temp;
			} else {
				gcd = function(gcd, temp);
			}
		}
		int maxGcd = gcd;
		str = maxGcd + "=1^1";
		for (int i = 2; i <= gcd; i++) {
			int count = 0;
			while (gcd != 0) {
				if (gcd % i == 0) {
					count++;
					gcd = gcd / i;
				} else {
					break;
				}
			}

			if (count != 0) {
				str += "*" + i + "^" + count;
			}
		}
		System.out.print(str);
		sc.close();
	}

	public static int function(int input1, int input2) {
		int max = 0;
		for (int i = 1; i <= Math.min(input1, input2); i++) {
			if (input1 % i == 0 && input2 % i == 0) {
				max = i;
			}
		}
		return max;
	}
}
