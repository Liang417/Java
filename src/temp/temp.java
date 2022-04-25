package temp;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isIPv4, isIPv6, bothFalse;

		String inputIP = sc.nextLine();
		isIPv4 = IsIPv4(inputIP);
		isIPv6 = IsIPv6(inputIP);

		if (isIPv4 == true) {
			System.out.println("IPv4");
		} else if (isIPv6 == true) {
			System.out.println("IPv6");
		} else {
			System.out.println("不是合法的IP");
		}
	}

	public static boolean IsIPv4(String strArr) {
		String[] splitArr = strArr.split("\\."); // 按"."分別存入陣列
		boolean checkIfIPv4 = true;
		if (splitArr.length != 4) {
			return false; // 檢查IPv4地址是否有4組
		} else {
			for (int i = 0; i < splitArr.length; i++) {
				checkIfIPv4 = true;
				char[] charArr = splitArr[i].toCharArray();
				if (charArr[0] == '0' && charArr.length != 1) {
					checkIfIPv4 = false;
					break;
					// 檢查開頭是0與否
				}
				for (int j = 0; j < charArr.length; j++) {
					int asciiValue = charArr[j];
					if (!(48 <= asciiValue && asciiValue <= 57)) {
						// if (48 > asciiValue || asciiValue > 57) {
						checkIfIPv4 = false;
						return checkIfIPv4;
					}
				}
			}
			return checkIfIPv4;
		}
	}

	public static boolean IsIPv6(String strArr) {
		String[] splitArr = strArr.split(":"); // 按"."分別存入陣列
		boolean checkIfIPv6 = true;
		if (splitArr.length != 8) {
			return false; // 檢查IPv6地址是否有8組
		} else {
			for (int i = 0; i < splitArr.length; i++) {
				if (splitArr[i].length() > 4 || splitArr[i].length() < 1) {
					checkIfIPv6 = false;
					break;
				} // 檢查IPv6地址各組數是否滿足1-4範圍值要求
				checkIfIPv6 = true;
				char[] charArr = splitArr[i].toCharArray();
				for (int j = 0; j < charArr.length; j++) {
					int asciiValue = charArr[j];
					if (!(48 <= asciiValue && asciiValue <= 57)) { // 是不是數字
						if (!(65 <= asciiValue && asciiValue <= 90)) { // 是不是大寫字母
							if (!(97 <= asciiValue && asciiValue <= 122)) { // 是不是小寫字母
								checkIfIPv6 = false;
								break;
							} // 三者皆非，判斷false終止函式
						}
					}
				}
			}
		}
		return checkIfIPv6;
	}
}