package problem;
import java.util.Scanner;

public class Ft7203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int increase = 0;
		int reduce = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				int temp = (arr[k] - arr[i]);
				int tempAbs = Math.abs(temp);
				if (tempAbs > 1000) {
					continue;
				} else if (temp > 0) {
					increase++;
				} else if (temp < 0) {
					reduce++;
				}
			}
		}
		if (increase > reduce) {
			System.out.print("變得會花");
		} else if (increase == reduce) {
			System.out.print("沒變");
		} else {
			System.out.print("變得節省");
		}
		sc.close();
	}
}