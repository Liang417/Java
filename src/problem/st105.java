package problem;
import java.util.Scanner;

public class st105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int input = sc.nextInt();
			boolean a = true;
			if (input == 1) {
				a = false;
			}
			for (int k = 2; k <= Math.sqrt(input); k++) {
				if (input % k == 0) {
					a = false;
					break;
				}
			}
			System.out.println(a);
		}
		sc.close();
	}
}
