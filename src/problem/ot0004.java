package problem;
import java.util.Scanner;

public class ot0004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tall = sc.nextDouble();
		double weight = sc.nextDouble();
		double bmi = weight / (tall * tall / 100 / 100);
		System.out.printf("%.1f ", bmi);
		if (bmi < 18.5) {
			System.out.print("�L��");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.print("���`");
		} else if (bmi >= 24 && bmi < 27) {
			System.out.print("�L��");
		} else if (bmi >= 27 && bmi < 30) {
			System.out.print("���תέD");
		} else if (bmi >= 30 && bmi < 35) {
			System.out.print("���תέD");
		} else
			System.out.print("�L�תέD");
		sc.close();
	}
}