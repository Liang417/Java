package problem;
import java.util.Scanner;

public class Ft9204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int strLength = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int a = 0;
		for (int i = 0; i <= strLength; i++) {
			a = s.lastIndexOf(" ");
		}
		int b = s.length()-a-1;
		System.out.print(b);
		sc.close();
	}
}
