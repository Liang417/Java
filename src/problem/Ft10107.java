package problem;
import java.util.Scanner;

public class Ft10107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] apple = new int[sc.nextInt()];
		int sumA = 0;// 小寶
		int sumB = 0;// 大寶
		for (int i = 0; i < apple.length; i++) {
			apple[i] = sc.nextInt();
		}
		int take1 = 0;
		int take2 = apple.length - 1;
		for (int i = 1; i <= apple.length; i++) {
			if (i % 2 != 0) {// 小寶拿
				if (apple[take1] > apple[take2]) {//選多的堆拿
					sumA+=apple[take1];
					take1++;
				}else {
					sumA+=apple[take2];
					take2--;
				}
			}else {//大寶拿
				if (apple[take1] > apple[take2]) {//選多的堆拿
					sumB+=apple[take1];
					take1++;
				}else {
					sumB+=apple[take2];
					take2--;
				}
			}
		}
		if (sumA > sumB)
		{
			System.out.print("小寶");
		} else {
			System.out.print("大寶");
		}
	}
}
