package problem;

import java.util.Arrays;
import java.util.Scanner;

public class ft8105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] maxArr = new int[3];// �ΨӦs��C�H��X���̤j�ƭ�
		for (int i = 0; i < 3; i++) {// �C�H��T���A�u���̤j�Ȧs��}�C
			int max = 0;
			for (int k = 0; k < 3; k++) {
				int temp = sc.nextInt();
				if (temp > max) {
					max = temp;
					maxArr[i] = max;
				}
			}
		}
		int max = 0;
		int name = 0;
		for (int i = 0; i < maxArr.length; i++) {
			if (maxArr[i] > max) {
				max = maxArr[i];
				name = i;
			}
		}
		Arrays.sort(maxArr);
		if (max == maxArr[maxArr.length - 2]) {
			System.out.print("�����ӭt");
		} else {
			char temp = (char) (65 + name);
			System.out.print(temp);
		}
	}
}