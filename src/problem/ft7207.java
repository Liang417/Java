package problem;

import java.util.Scanner;

public class ft7207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		int taget = sc.nextInt();
		int deposit = 0;
		int day = 0;
		int achieveDay = 0;
		int sumCost = 0;
		while (true) {
			int cost = sc.nextInt();
			if (cost == -1) {
				break;
			} else {
				day++;
				sumCost += cost;
				if (day % 3 == 0) {// ©u¼úª÷
					deposit += 5000;
				}
				if (day % 6 == 0) {
					income += 5000;
				}
				deposit += income - cost;
				if (deposit > taget && achieveDay == 0) {
					achieveDay = day;
				}
			}
		}
		System.out.println(sumCost);
		System.out.println(deposit);
		if (achieveDay == 0) {
			System.out.print(-1);
		} else {
			System.out.print(achieveDay);
		}
	}
}
