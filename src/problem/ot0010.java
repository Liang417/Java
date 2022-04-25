package problem;
import java.util.Scanner;

public class ot0010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int max = 0;
		for (int i = 1; i <= Math.min(input1, input2); i++) {
			if (input1 % i == 0 && input2 % i == 0) {
				max = i;
			}
		}
		System.out.print(max);
		sc.close();
	}
}