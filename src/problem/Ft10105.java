package problem;

import java.util.Scanner;

public class Ft10105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int[] table = new int[123];// �إ�ascii��
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			table[c]++;
			// �N�r���X�{����+1 �o�䪺table[c] c���ӬO�|�۰��নint,�]�i�Htable[(int)c]
		}
		int max = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] > max) {
				max = table[i];
			}
		}
		for (int k = 0; k <= max; max--) {//�]�i�H�Φr����ק@���d��=> (k<str.length;k++)�į�i����t
			for (int i = 0; i < table.length; i++) {
				if (table[i] == max) {
					char c = (char) i;
					String s = String.valueOf(c);
					// ����|��??????????
//					System.out.print(String.valueOf(c).repeat(table[i]));//�������t�η|����
					for (int m = 0; m < table[i]; m++) {
						System.out.print(s);
					}
				}
			}
//			max -= 1;
		}
	}
}