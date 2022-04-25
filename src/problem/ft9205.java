package problem;

import java.util.Scanner;

public class ft9205 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String IPv4 = "^((2[0-5][0-5]|1[0-9][0-9]|[1-9][0-9]|\\d)\\.){3}(2[0-5][0-5]|1[0-9][0-9]|[1-9][0-9]|\\d)$";
		String IPv6 = "^(([a-fA-F0-9]{1,4}):){7}([a-fA-F0-9]{1,4})$";
		if (input.matches(IPv4)) {
			System.out.print("IPv4");
		} else if (input.matches(IPv6)) {
			System.out.print("IPv6");
		} else {
			System.out.print("不是合法的IP");
		}
		sc.close();
	}
}