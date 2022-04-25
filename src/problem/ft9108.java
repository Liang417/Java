package problem;
import java.util.Scanner;

public class ft9108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0, maxCount = 1, sum = 0;
		int index = 0;// 最大長度的最後一個整數索引位置
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
				if (count > maxCount) {
					maxCount = count;
					index = i;
				}
			} else {
				count = 0;
			}
		}
		for (int i = index - maxCount + 1; i <= index; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		if (sum > 0 && index != 0) {
			System.out.print(sum);
		} else {
			System.out.print(-1);
		}
		sc.close();
	}
}
