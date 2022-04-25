package problem;

import java.util.Scanner;

public class st107 {

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

	public static int function(int num1, int num2) {
		if (num1 > num2) {
			int mod = num1 % num2;
			if (mod == 0) {
				return num2;
			}
			while (mod != 0) {
				num1 = mod;
				mod = num2 % num1;
				if (mod == 0) {
					return num1;
				} else {
					num2 = mod;
					mod = num1 % num2;
					if (mod == 0) {
						return num2;
					}
				}
			}
		} else {
			int mod = num2 % num1;
			if (mod == 0) {
				return num1;
			}
			while (mod != 0) {
				num2 = mod;
				mod = num1 % num2;
				if (mod == 0) {
					return num2;
				} else {
					num1 = mod;
					mod = num2 % num1;
					if (mod == 0) {
						return num1;
					}
				}
			}
		}
		return 123;
	}
}