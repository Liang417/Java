package problem;
import java.util.Scanner;

public class Ft7105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int now = sc.nextInt();
		int target = sc.nextInt();
		int months = 0;
		do {
			if (now > target) {
				now -= 4;
				months++;
			} else {
				now += 15;
				months++;
			}
		} while (now != target);
		System.out.print(months);
		sc.close();
	}
}