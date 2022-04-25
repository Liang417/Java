package problem;

import java.util.Scanner;

public class Ft10106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print("0");
				break;
			}
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] - arr[i] > 0) {
					System.out.print(k - i + " ");
					break;
				} else if (k == arr.length - 1) {
					System.out.print("0" + " ");
					break;
				}
			}
		}
	}
}