package problem;

import java.util.Scanner;

public class Ft10105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int[] table = new int[123];// 建立ascii表
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			table[c]++;
			// 將字元出現次數+1 這邊的table[c] c應該是會自動轉成int,也可以table[(int)c]
		}
		int max = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] > max) {
				max = table[i];
			}
		}
		for (int k = 0; k <= max; max--) {//也可以用字串長度作為範圍=> (k<str.length;k++)效能可能較差
			for (int i = 0; i < table.length; i++) {
				if (table[i] == max) {
					char c = (char) i;
					String s = String.valueOf(c);
					// 為何會錯??????????
//					System.out.print(String.valueOf(c).repeat(table[i]));//丟到評測系統會報錯
					for (int m = 0; m < table[i]; m++) {
						System.out.print(s);
					}
				}
			}
//			max -= 1;
		}
	}
}