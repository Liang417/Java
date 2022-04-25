package problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ft9103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		Pattern p1 = Pattern.compile("[A-z]");
		Pattern p2 = Pattern.compile("\\s");
		Pattern p3 = Pattern.compile("\\d");
		Pattern p4 = Pattern.compile("[^\\s\\w]");
		Matcher m1 = p1.matcher(input);
		Matcher m2 = p2.matcher(input);
		Matcher m3 = p3.matcher(input);
		Matcher m4 = p4.matcher(input);
		int count = 0;
		while (m1.find()) {
			count++;
		}
		System.out.println(count);
		count = 0;
		while (m2.find()) {
			count++;
		}
		System.out.println(count);
		count = 0;
		while (m3.find()) {
			count++;
		}
		System.out.println(count);
		count = 0;
		while (m4.find()) {
			count++;
		}
		System.out.println(count);
	}
}
