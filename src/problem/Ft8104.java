package problem;

import java.util.Scanner;

public class Ft8104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int season = sc.nextInt();
		Double temperature = sc.nextDouble();
		int height = sc.nextInt();
		double delta = 0;
		if(season == 1) {
			delta = -0.6;
		}else {
			delta = -0.36;
		}
		double result = temperature+(height/100)*delta;
		System.out.printf("%.2f", result);
	}
}
  