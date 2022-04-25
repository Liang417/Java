package problem;
import java.util.Scanner;

public class St104_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long reverse = 0;
		int temp = n;
		while (true) {
			if (temp / 10 != 0) {
				reverse = reverse * 10 + (temp % 10);
				temp = temp / 10;
			} else {
				reverse = reverse * 10 + (temp % 10);
				break;
			}
		}
		if (reverse > 2147483647 || reverse < -2147483648) {
			reverse = 0;
		}
		System.out.println(reverse);
	}
}