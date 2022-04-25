package problem;

import java.util.Scanner;

public class ft9106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int standard = arr[i];// 標準
			if (arr[i] > max) {// 單一長條
				max = arr[i];
			}
			for (int k = i + 1; k < arr.length; k++) {
				if (standard > arr[k]) {// 下一個比較小的話
					standard = arr[k];
				}
				if (standard * (k - i + 1) > max) {
					max = standard * (k - i + 1);
				}
			}
		}
		System.out.print(max);
	}

}
