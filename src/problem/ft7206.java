package problem;

import java.util.Scanner;

public class ft7206 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];//­ì°}¦C
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] newArr = new int[arr.length - 1];//®t°}¦C
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i + 1] - arr[i];
		}
		int temp = newArr[1] - newArr[0];
		for (int i = 0; i < newArr.length-1; i++) {
			if (newArr[i + 1] - newArr[i] != temp) {
				System.out.print(false);
				break;
			}else {
				if(i==newArr.length-2) {
					System.out.print(true);
				}
			}
		}
		sc.close();
	}
}