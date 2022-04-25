package other;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// �ϥΪ̿�J���N"�r��"�æs�J�r��A-1�ɵ����æL�X����
		Scanner scanner = new Scanner(System.in);
		String[] strs = new String[2];
		String[] dictionary = new String[2];
		int[] dictionaryNum = new int[2];
		int dicCount = 0;
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("-1")) {
				break;
			}
			if (dicCount == dictionary.length) {
				dictionary = StringDoubleArr(dictionary);
				dictionaryNum = IntDoubleArr(dictionaryNum);
			}
			int index = FindStringIndex(input, dictionary, dicCount);
			if (index == -1) {
				dictionary[dicCount] = input;
				index = dicCount++;		
			}
			dictionaryNum[index]++;
		}

		for (int i = 0; i < dicCount; i++) {
			System.out.print("�r��" + dictionary[i] + "�X�{" + dictionaryNum[i] + "��");
			System.out.println(" ");
		}
	}

	public static String[] StringDoubleArr(String[] arr) {
		String[] newArr = new String[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static int[] IntDoubleArr(int[] arr) {
		int[] newArr = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static int FindStringIndex(String input, String[] dictionary, int dicCount) {
		for (int i = 0; i < dicCount; i++) {
			if (input.equals(dictionary[i])) {
				return i;
			}
		}
		return -1;
	}

}