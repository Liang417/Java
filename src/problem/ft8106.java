package problem;
import java.util.Scanner;

public class ft8106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sum(n));
	}
	public static int sum(int n) {
		if (n == 1) {
			return n;
		}else {
			return n*sum(n-1)+1;
		}
	}
}