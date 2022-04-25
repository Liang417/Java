package problem;

import java.util.Scanner;

public class st208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;// 總共5天的名單
		int[] list = new int[10];
		for (int i = 0; i < n; i++) {
			int absentNum = sc.nextInt();
			if (absentNum == -1) {
				continue;
			}
			for (int k = 0; k < absentNum; k++) {
				list[sc.nextInt() - 1]++;
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(i+1 + "." + list[i]);
		}
	}
}
