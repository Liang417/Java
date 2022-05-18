package leetcode;

import java.math.BigInteger;

public class Add_Binary {
	public static void main(String[] args) {
		System.out.print(addBinary("11", "1"));

	}

	public static String addBinary(String a, String b) {
		BigInteger a1 = new BigInteger(a);
		BigInteger b1 = new BigInteger(a);
		char[] arr = ('0' + String.valueOf(a1.add(b1))).toCharArray();
//		for(char i :arr) {
//			System.out.println(i);
//		}
		System.out.println(String.valueOf(a1.add(b1)));
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == '2') {
				arr[i] = '0';
				arr[i - 1]++;
			} else if (arr[i] == '3') {
				arr[i] = '1';
				arr[i - 1]++;
			}
		}
		if (arr[0] == '0') {
			return String.valueOf(arr, 1, arr.length - 1);
		} else {
			return String.valueOf(arr);
		}
	}
}
