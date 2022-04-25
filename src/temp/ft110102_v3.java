package temp;

import java.util.Scanner;

public class ft110102_v3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String str = Integer.toString(input);
		int result = 0;
		while (str.length() != 1) {
			for (int i = 0; i < str.length(); i++) {
				result += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			str = String.valueOf(result);
			result = 0;
		}
		System.out.println(str);
		sc.close();
	}
}