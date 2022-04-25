package problem;
import java.util.Scanner;

public class ot0008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp = 0;
		int result = 0;
		while (true) {
			temp = input % 10;
			result = result * 10 + temp;
			if (input / 10 == 0) {
				break;
			}
			input = input / 10;
		}
		System.out.println(result);
	}
}
