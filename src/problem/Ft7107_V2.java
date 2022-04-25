package problem;
import java.util.Scanner;

public class Ft7107_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int velocity = sc.nextInt();
		int time = sc.nextInt();
		int distance = sc.nextInt();
		int temp = velocity;
		int sum = 0;
		for (int i = 1; i < time; i++) {
			if (i == 1) {
				sum = velocity;
			}
			temp = (int) (temp * 0.9);
			sum += temp;
		}
		int days = 0;
		while (distance > 0) {
			distance -= sum;
			days++;
		}
		System.out.print(days);
	}
}
