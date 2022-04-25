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
			System.out.println("���O�X�k��IP");
		}
	}

	public static boolean IsIPv4(String strArr) {
		String[] splitArr = strArr.split("\\."); // ��"."���O�s�J�}�C
		boolean checkIfIPv4 = true;
		if (splitArr.length != 4) {
			return false; // �ˬdIPv4�a�}�O�_��4��
		} else {
			for (int i = 0; i < splitArr.length; i++) {
				checkIfIPv4 = true;
				char[] charArr = splitArr[i].toCharArray();
				if (charArr[0] == '0' && charArr.length != 1) {
					checkIfIPv4 = false;
					break;
					// �ˬd�}�Y�O0�P�_
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
		String[] splitArr = strArr.split(":"); // ��"."���O�s�J�}�C
		boolean checkIfIPv6 = true;
		if (splitArr.length != 8) {
			return false; // �ˬdIPv6�a�}�O�_��8��
		} else {
			for (int i = 0; i < splitArr.length; i++) {
				if (splitArr[i].length() > 4 || splitArr[i].length() < 1) {
					checkIfIPv6 = false;
					break;
				} // �ˬdIPv6�a�}�U�ռƬO�_����1-4�d��ȭn�D
				checkIfIPv6 = true;
				char[] charArr = splitArr[i].toCharArray();
				for (int j = 0; j < charArr.length; j++) {
					int asciiValue = charArr[j];
					if (!(48 <= asciiValue && asciiValue <= 57)) { // �O���O�Ʀr
						if (!(65 <= asciiValue && asciiValue <= 90)) { // �O���O�j�g�r��
							if (!(97 <= asciiValue && asciiValue <= 122)) { // �O���O�p�g�r��
								checkIfIPv6 = false;
								break;
							} // �T�̬ҫD�A�P�_false�פ�禡
						}
					}
				}
			}
		}
		return checkIfIPv6;
	}
}