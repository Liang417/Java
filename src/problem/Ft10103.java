package problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ft10103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex1 = "[qwertyuiop]";
		String regex2 = "[asdfghjkl]";
		String regex3 = "[zxcvbnm]";

		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);

		StringBuilder sb = new StringBuilder();
		int set = sc.nextInt();
		for (int i = 0; i < set; i++) {
			int length = sc.nextInt();// uesless
		}
		for (int i = 0; i < set; i++) {
			String input = sc.next();
			Matcher m1 = p1.matcher(input);
			Matcher m2 = p2.matcher(input);
			Matcher m3 = p3.matcher(input);
			for (int k = 0; k < input.length(); k++) {
				if (m1.find() == false) {
					break;
				} else if (k == input.length() - 1) {
					sb.append(input + " ");
				}
			}
			for (int k = 0; k < input.length(); k++) {
				if (m2.find() == false) {
					break;
				} else if (k == input.length() - 1) {
					sb.append(input + " ");
				}
			}
			for (int k = 0; k < input.length(); k++) {
				if (m3.find() == false) {
					break;
				} else if (k == input.length() - 1) {
					sb.append(input + " ");
				}
			}
		}
		if (sb.length() != 0) {
			sb.deleteCharAt(sb.length()-1);
			System.out.print(sb);
		} else {
			System.out.print(false);
		}
	}
}