package temp;

import java.util.Scanner;

public class ft110101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		String newStr = "";
		int mod = n % input.length();
		if (mod == 0) {
			System.out.print(input);
		} else {
			for (int i = input.length() - mod; i < input.length(); i++) {
				newStr += arr[i];
			}
			for (int i = 0; i < mod-1; i++) {
				newStr+=arr[i];
			}			
			System.out.print(newStr);
		}
		sc.close();
	}
}
