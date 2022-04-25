package problem;

import java.util.Scanner;

public class st207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				arr[i] = "1";
			} else {
				for (int j = 0; j < arr[i - 1].length(); j++) {
					int count = 0;
					for (int k = j; k < arr[i - 1].length(); k++) {
						if (arr[i - 1].charAt(j) == arr[i - 1].charAt(k)) {
							count++;
						} else {
							break;
						}
					}
					if (arr[i] == null) {
						arr[i] = String.valueOf(count) + String.valueOf(arr[i - 1].charAt(j));
					} else {
						arr[i] += String.valueOf(count) + String.valueOf(arr[i - 1].charAt(j));
					}

					if (count > 1) {
						j += count - 1;
					}
				}
			}
		}
		System.out.print(arr[n - 1]);
	}
}
