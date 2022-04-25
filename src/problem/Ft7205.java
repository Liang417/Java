package problem;

import java.util.Scanner;

public class Ft7205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int temp = 0;
		while (true) {
			int a = sc.nextInt();
			if(a == 0) {
				sum+=a;
				break;
			}else if(a < 0) {
				sum-=temp;
				temp=0;
			}else {
				temp = a;
				sum+=a;
			}
		}
		System.out.print(sum);
		sc.close();
	}
}
