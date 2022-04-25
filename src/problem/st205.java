package problem;
import java.util.Scanner;

public class st205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		int count = 0;
		while (true) {
			int input = sc.nextInt();
			if (input == -1) {
				break;
			}
			if (arr.length == count) {
				arr = doubleArr(arr);
			}
			arr[count++] = input;
		}
		arr = reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	public static int[] reverse(int[] arr) {
		int[] newarr = new int[arr.length];
		int temp = arr.length;
		for (int i = 0; i < arr.length; i++) {
			newarr[i] = arr[temp-1];
			temp--;
		}
		return newarr;
	}

	public static int[] doubleArr(int[] arr) {
		int[] newarr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}
}