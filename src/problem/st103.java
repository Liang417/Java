package problem;
import java.util.Scanner;

public class st103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		boolean a = true;
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[1] / arr[0];
//		***count-1***­nª`·N
		for (int k = 0; k < count-1; k++) {
			if ((arr[k + 1] / arr[k]) != temp) {
				a = false;
				break;
			}
		}
		System.out.print(a);
	}
}