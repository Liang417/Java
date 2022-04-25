package problem;
import java.util.Scanner;

public class Ft10102_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		int[] cardArr = new int[cardNum];

		for (int i = 0; i < cardArr.length; i++) {
			cardArr[i] = i + 1;
		}
		for (int i = 0; i < cardNum; i++) {
			int index = getIndex(cardArr, sc.nextInt());
			if (index == -1) {
				continue;
			} else {
				cardArr = deleteCard(cardArr, index);
			}
		}
		if (cardArr.length == 0) {
			System.out.print("0");
		} else {
			for (int i = 0; i < cardArr.length; i++) {
				if (i == cardArr.length - 1) {
					System.out.print(cardArr[cardArr.length - 1]);
				} else {
					System.out.print(cardArr[i] + " ");
				}
			}
		}
	}

	public static int getIndex(int[] arr, int a) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				index = i;
			}
		}
		return index;
	}

	public static int[] deleteCard(int[] arr, int index) {
		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		for (int k = index; k < newArr.length; k++) {
			newArr[k] = arr[k + 1];
		}
		return newArr;
	}
}
