package problem;

import java.util.Scanner;

public class ft7204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();// 幾組資料
		for (int i = 0; i < set; i++) {
			int numCount = sc.nextInt();
			int[] arr = new int[numCount];// 每組資料各有幾個數字
			for (int k = 0; k < arr.length; k++) {
				arr[k] = sc.nextInt();
			}
			boolean a  = true;
			for (int k = 0; k < arr.length - 1; k++) {
				int firstNum = arr[k] % 2;
				int secondNum = arr[k + 1] % 2;
				if(firstNum == secondNum) {
					a = false;
					break;
				}
			}
			System.out.println(a);
		}
	}

}
