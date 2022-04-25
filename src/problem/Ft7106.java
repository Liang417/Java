package problem;

import java.util.Scanner;

public class Ft7106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int arr[] = new int[number];
		boolean a = true;
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 2; i <arr.length; i++) {
			if(arr[i] != arr[i-1]*arr[i-2]) {
				a = false;
			}
		}
		System.out.println(a);
	}
}
