package other;
import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 2; i <= input; i++) {
			boolean a = true;
			for (int k = 2; k <= Math.sqrt(i); k++) {
				if (i % k == 0) {
					a = false;
					break;
				}
			}
			if (a) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
