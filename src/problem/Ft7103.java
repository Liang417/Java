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
				System.out.print("有運動且有成效");
			} else if (lazydays > 2 && time < 100) {
				System.out.print("偷懶");
			} else if (lazydays < 2 & time >= 100) {
				System.out.print("過度運動");
			} else {
				System.out.print("有運動");
			}
		}
	}
}
