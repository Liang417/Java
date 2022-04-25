package problem;

import java.util.Scanner;

public class Ft9105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int times = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					times++;
				}
				if (times >= 2) {
					break;
				}
			}
			if (times == 1) {
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
