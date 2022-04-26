package temp;

import java.util.Scanner;

public class ft110101_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sets = sc.nextInt();
		for (int k = 0; k < sets; k++) {
			String input = sc.nextLine();
			sc.nextLine();
			int n = sc.nextInt();
			char[] arr = input.toCharArray();
			String newStr = "";
			int mod = n % input.length();
			if (mod == 0) {
				System.out.print(input);
			} else {
				for (int i = input.length() - mod; i < input.length(); i++) {
					newStr += arr[i];
				}
				for (int i = 0; i < input.length() - mod; i++) {
					newStr += arr[i];
				}
			}
			System.out.print(newStr);
		}
	}
}
