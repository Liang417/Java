package problem;

import java.util.Scanner;

public class Ft9107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n + 1];
		String[] newArr = new String[0];
		for (int i = 0; i <= n; i++) {
			arr[i] = Integer.toString(i);
		}
		for (int i = 0; i <= n; i++) {
			if (arr[i].indexOf("1") >= 0) {
				continue;
			} else {
				newArr = copy(newArr, arr[i]);
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			if (i == newArr.length - 1) {
				System.out.print(newArr[i]);
			} else {
				System.out.print(newArr[i] + " ");
			}
		}
		sc.close();
	}

	public static String[] copy(String[] arr, String a) {
		String[] newArr = new String[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = a;
		return newArr;
	}
}
