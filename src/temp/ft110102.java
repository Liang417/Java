package temp;

import java.util.Scanner;

public class ft110102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num % 9 == 0 && num > 0) {
				System.out.println("9");
			} else {
				System.out.println(num % 9);
			}
		sc.close();
	}
}