package problem;
import java.util.Scanner;

public class Ft7103 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int lazydays = 0;
			int time = 0;
			for (int i = 0; i < 7; i++) {
				int input = sc.nextInt();
				if (input != 0) {
					time += input;
				} else {
					lazydays++;
				}
			}
			if (lazydays == 2 && time >= 100) {
				System.out.print("���B�ʥB������");
			} else if (lazydays > 2 && time < 100) {
				System.out.print("���i");
			} else if (lazydays < 2 & time >= 100) {
				System.out.print("�L�׹B��");
			} else {
				System.out.print("���B��");
			}
		}
	}
}
