package problem;
import java.util.Scanner;

public class St104_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		int temp = n;
		while (true) {
			if (temp / 10 != 0) {
				reverse = reverse * 10 + (temp % 10);
				temp = temp / 10;
			} else {
				try {
					reverse = Math.addExact(Math.multiplyExact(reverse, 10), (temp % 10));
				} catch (ArithmeticException e) {
					reverse = 0;
					break;
				}
				break;
			}
		}
		System.out.println(reverse);
	}
}
