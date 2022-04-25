package temp;

import java.util.Scanner;

public class ft110102_v2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp = 0;
		int temp2 = 0;
		do {
			temp = input % 10;
			temp2 = input / 10;
			input = temp + temp2;
		} while (input > 9);
		System.out.print(input);
		sc.close();
	}
}
