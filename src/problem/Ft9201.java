package problem;
import java.util.Scanner;

public class Ft9201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int[] newArr = new int[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == arr[i]) {
					count++;
					if (count > 1) {
						break;
					}
				}
			}
			if (count == 1) {
				newArr = expendArr(newArr, arr[i]);
			}
		}
		if (newArr.length == 0) {
			System.out.print("找不到非重複元素");
		} else {
			for (int i = 0; i < newArr.length; i++) {
				if (i == newArr.length - 1) {
					System.out.print(newArr[i]);
				} else {
					System.out.print(newArr[i] + " ");
				}
			}
		}
	}

	public static int[] expendArr(int[] arr, int noRepeatNum) {
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = noRepeatNum;
		return newArr;
	}
}
