package problem;
import java.util.Scanner;

public class Ft7107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int velocity = sc.nextInt();
		int time = sc.nextInt();
		int distance = sc.nextInt();
		int days = 0;
		int count = 0;
		for (int i = 1; i <= time; i++) {
			count += f(i, velocity);
		}
		double temp = ((double) distance / (double) count);
		days = distance / count;
		if (temp > days) {
			days += 1;
		}
		System.out.print(days);
	}

	public static int f(int hours, int velocity) {
		int a = hours;
		int n = velocity;
		if (a == 1) {
			return n;
		}
		return (int) (f(a - 1, n) * 0.9);
	}
}